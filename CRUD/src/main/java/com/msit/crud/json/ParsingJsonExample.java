package com.msit.crud.json;


import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class ParsingJsonExample {
	
	@RequestMapping("/test")
	@ResponseBody
	public Student test() {
		Student st=new Student();
		st.setId(2);
		st.setName("jaya");
		return st;
}
	@RequestMapping("/json")
	public String index(){
		return "test";
	}
}
