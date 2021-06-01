package com.kopo.login;

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

import com.kopo.login.DBCommon;
import com.kopo.login.Member;
import com.kopo.login.UserDB;

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

	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String create(Locale locale, Model model) {
		UserDB userDB = new UserDB();
		userDB.createDB();
		boolean isSuccess = userDB.createDB();
		if (isSuccess) {
			model.addAttribute("m1", "테이블이 생성되었습니다.");
		} else {
			model.addAttribute("m1", "DB Error");
		}
		return "message";
	}

	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insertMethod(Locale locale, Model model) {
		return "insert";
	}

	@RequestMapping(value = "/insert_action", method = RequestMethod.GET)
	public String insertAction(Locale locale, Model model
			, @RequestParam("id") String id
			, @RequestParam("pwd") String pwd
			, @RequestParam("name") String name
			, @RequestParam("birthday") String birthday
			, @RequestParam("address") String address) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String now = sdf.format(Calendar.getInstance().getTime());
		Member member = new Member(id, pwd, name, birthday, address, now, now);
		
		UserDB userDB = new UserDB();
		boolean isSuccess = userDB.insertDB(member);
		if (isSuccess) {
			model.addAttribute("m1", "데이터가 입력되었습니다.");
		} else {
			model.addAttribute("m1", "DB Error");
		}
		return "message";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String listMethod(Locale locale, Model model) {

		UserDB db = new UserDB();
		String htmlString = db.selectData();
		model.addAttribute("list", htmlString);
		
		return "list";
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String edit(Locale locale, Model model) {
		return "edit";
	}
	
	@RequestMapping(value = "/edit_action", method = RequestMethod.GET)
	public String edit_action(Locale locale, Model model
			, @RequestParam("id") String id
			, @RequestParam("pwd") String pwd) {	
		
		UserDB userDB = new UserDB();
		Member isSuccess = userDB.vaildData(id, pwd);
//		if (isSuccess) {
//			model.addAttribute("m1", "데이터가 입력되었습니다.");
//		} else {
//			model.addAttribute("m1", "DB Error");
//		}
		return "update";
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String updateMethod(Locale locale, Model model
			, @RequestParam("idx") int idx) {

		UserDB db = new UserDB();
		Member selectedMember = db.detailsData(idx);

		if (selectedMember != null) {
			model.addAttribute("idx", selectedMember.idx);
			model.addAttribute("id", selectedMember.id);
			model.addAttribute("pwd", selectedMember.pwd);
			model.addAttribute("name", selectedMember.name);
			model.addAttribute("birthday", selectedMember.birthday);
			model.addAttribute("address", selectedMember.address);
		}
		return "update";
	}
	
	@RequestMapping(value = "/update_action", method = RequestMethod.GET)
	public String updateAction(Locale locale, Model model
			, @RequestParam("idx") int idx
			, @RequestParam("id") String id
			, @RequestParam("pwd") String pwd
			, @RequestParam("name") String name
			, @RequestParam("birthday") String birthday
			, @RequestParam("address") String address) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String now = sdf.format(Calendar.getInstance().getTime());
		UserDB userDB = new UserDB();

		boolean isSuccess = userDB.updateData(idx, id, pwd, name, birthday, address, now);
		if (isSuccess) {
			model.addAttribute("m1", "데이터가 수정되었습니다.");
		} else {
			model.addAttribute("m1", "데이터 수정에 실패하였습니다.");
		}
		return "message";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(Locale locale, Model model, @RequestParam("idx") int idx) {

		UserDB userDB = new UserDB();
		boolean isSuccess = userDB.deleteData(idx);
		if (isSuccess) {
			model.addAttribute("m1", "데이터가 삭제되었습니다.");
		} else {
			model.addAttribute("m1", "데이터 삭제에 실패하였습니다.");
		}
		return "message";
	}
	
	@RequestMapping(value = "/select", method = RequestMethod.GET)
	public String selectMethod(Locale locale, Model model) {
		return "select";
	}

	@RequestMapping(value = "/select_action", method = RequestMethod.GET)
	public String selectAction(Locale locale, Model model
			, @RequestParam("name") String name){
		UserDB userDB = new UserDB();
		String htmlString = userDB.searchData(name);
		model.addAttribute("list", htmlString);
		return "list";
	}
	
}
