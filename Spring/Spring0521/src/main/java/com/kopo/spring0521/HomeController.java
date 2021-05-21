package com.kopo.spring0521;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kopo.spring0521.DBCommon;
import com.kopo.spring0521.Student;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "main";
	}

	@RequestMapping(value = "/create_table", method = RequestMethod.GET) // 테이블 생성
	public String createTable(Locale locale, Model model) {
		DBCommon<Student> db = new DBCommon<Student>("c:\\tomcat\\student0521.db", "student");
		db.createTable(new Student());
		model.addAttribute("message", "테이블이 생성되었습니다.");
		return "message";
	}

	@RequestMapping(value = "/insert", method = RequestMethod.GET) // 데이터 삽입
	public String insert(Locale locale, Model model) {
		return "insert";
	}


	@RequestMapping(value = "/insert_action", method = RequestMethod.GET) //데이터 삽입
	public String insertMethod(Locale locale, Model model,
			@RequestParam("name") String name,
			@RequestParam("midScore") String sMidScore, 
			@RequestParam("finScore") String sFinScore) {
		
		DBCommon<Student> db = new DBCommon<Student>("c:\\tomcat\\student0521.db", "student");
		int midScore = Integer.parseInt(sMidScore);
		int finScore = Integer.parseInt(sFinScore);
		SimpleDateFormat now = new SimpleDateFormat("yyyy-MM-dd");
		String date = now.format(Calendar.getInstance().getTime());
		db.insertData(new Student(name, midScore,finScore, date));
		model.addAttribute("message", "데이터를 삽입하였습니다.");
		return "message";
	}


	@RequestMapping(value = "/list", method = RequestMethod.GET) // 테이블 조회 + 수정버튼 
	public String listMethod(Locale locale, Model model) {
		DBCommon<Student> db = new DBCommon<Student>("c:\\tomcat\\student0521.db", "student");
		ArrayList<Student> student = db.selectArrayList(new Student());
		String htmlString = "";
		for (int i = 0; i < student.size(); i++) {
			htmlString = htmlString + "<tr>";
			htmlString = htmlString + "<td>" + student.get(i).idx + "</td>";
			htmlString = htmlString + "<td>" + student.get(i).name + "</td>";
			htmlString = htmlString + "<td>" + student.get(i).midScore + "</td>";
			htmlString = htmlString + "<td>" + student.get(i).finScore + "</td>";
			htmlString = htmlString + "<td>" + student.get(i).date + "</td>";
			htmlString = htmlString + "<td>" + "<a href='update?idx=" + student.get(i).idx + "'>수정하기</a>" + "</td>";
			htmlString = htmlString + "<td>" + "<a href='delete?idx=" + student.get(i).idx + "'>삭제하기</a>" + "</td>";
			htmlString = htmlString + "</tr>";
		}
		model.addAttribute("stdInfo", htmlString);
		return "list";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET) // 데이터 수정
	public String update(Locale locale, Model model,@RequestParam("idx") int idx) {
		DBCommon<Student> db = new DBCommon<Student>("c:\\tomcat\\student0521.db", "student");
		Student selectStudent = db.detailsData(new Student(), idx);
		if(selectStudent !=null) {
		model.addAttribute("idx", selectStudent.idx);
		model.addAttribute("std_name", selectStudent.name);
		model.addAttribute("std_midScore", selectStudent.midScore);
		model.addAttribute("std_finScore", selectStudent.finScore);
		}
		return "update";
	}
	
	
	@RequestMapping(value = "/update_action", method = RequestMethod.GET) //데이터 수정
	public String updateMethod(Locale locale, Model model,
			@RequestParam("idx") int idx,
			@RequestParam("std_name") String name,
			@RequestParam("std_midScore") String upMidScore, 
			@RequestParam("std_finScore") String upFinScore) {
		
		DBCommon<Student> db = new DBCommon<Student>("c:\\tomcat\\student0521.db", "student");
		
		int midScore = Integer.parseInt(upMidScore);  
		int finScore = Integer.parseInt(upFinScore);
		SimpleDateFormat now = new SimpleDateFormat("yyyy-MM-dd");
		String date = now.format(Calendar.getInstance().getTime());
		
		db.updateData(new Student(idx, name, midScore, finScore, date)); //idx가 포함된 생성자를 통해 업데이트 해주기
		model.addAttribute("message", "데이터가 수정되었습니다.");
		return "message";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET) // 데이터 삭제
	public String delete(Locale locale, Model model,@RequestParam("idx") int idx) {
		DBCommon<Student> db = new DBCommon<Student>("c:\\tomcat\\student0521.db", "student");
		Student deleteStudent = db.detailsData(new Student(), idx);
		db.deleteData(deleteStudent);
		model.addAttribute("message", "데이터가 삭제되었습니다.");
		return "message";
		}
		
	}
	


