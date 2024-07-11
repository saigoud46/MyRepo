package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


	@Controller
	public class MyController {
		
		public String indexPage()
		{
			return "index"; //here index is .jsp file
		}
		@RequestMapping("/about")
		public String aboutPage()
		{
			return "about";
		}
		@RequestMapping("/contact")
		public String contactPage()
		{
			return "contact";
		}
		@RequestMapping("/login")
		public String loginPage()
		{
			return "login";
		}
		@RequestMapping("/register")
		public String registerForm()
		{
			return "reg";
		}

}
