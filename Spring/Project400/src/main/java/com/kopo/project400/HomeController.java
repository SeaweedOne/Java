package com.kopo.project400;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kopo.project400.DBCommon;
import com.kopo.project400.Student;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "main";
	}
	
	
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String listMethod(Locale locale, Model model) {		
		return "list";
	}
	
	
	@RequestMapping(value = "/selectData", method = RequestMethod.GET)
	public String select(Locale locale, Model model) {
		DBCommon<Student> db = new DBCommon<Student>("c:\\tomcat\\createTable0518.db", "student");
		db.selectData(new Student());
		return "list";
	}
	
	
	@RequestMapping(value = "/create_table", method = RequestMethod.GET)
	public String createTable(Locale locale, Model model) {		
		DBCommon<Student> db = new DBCommon<Student>("c:\\tomcat\\createTable0518.db", "student");
		db.createTable(new Student());
		model.addAttribute("message", "테이블이 생성되었습니다.");
		return "message";
	}
	
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert(Locale locale, Model model) {
		return "insert";
	}
	
	@RequestMapping(value = "/insert_action", method = RequestMethod.GET)
	public String insertMethod(Locale locale, Model model
			, @RequestParam("name") String name
			, @RequestParam("score") int score
			, @RequestParam("date") String date) {		
		DBCommon<Student> db = new DBCommon<Student>("c:\\tomcat\\createTable0518.db", "student");
		db.insertData(new Student(name, score, date));
		model.addAttribute("message", "데이터를 삽입하였습니다.");
		return "message";
	}
	
	
	
	
	
}
