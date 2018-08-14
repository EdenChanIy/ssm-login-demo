package controller;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import pojo.User;
import service.UserService;

@Controller
@Scope(value="prototype")
@RequestMapping("")
public class UserController {
	
	@Resource
	private UserService userService;
	
	@RequestMapping(value="/check.action")
		public @ResponseBody User register(@RequestBody User user ) {
		System.out.println("hhhhhhhhhhhhhhh");
		System.out.println(user.getName());
		System.out.println(user.getPw());
		
		user.setName(user.getName());
		user.setPw(user.getPw());
		return user;
		
	}
	
	@RequestMapping(value="",method=RequestMethod.GET)
	public String Origin()throws Exception{
		return "login";
	}
	
	@RequestMapping(value="login",method=RequestMethod.GET)
	public String login()throws Exception{
		return "login";
	}
	
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String login(User user, Model model)throws Exception {
		user = userService.checkLogin(user.getName(), user.getPw());
		if(user!=null) {
			return "welcome";
		}
		return "fail";
	}
	
	@RequestMapping(value="register",method=RequestMethod.GET)
	public String register()throws Exception{
		return "register";
	}
	
	@RequestMapping(value="register",method=RequestMethod.POST)
	public String register(User user, Model model)throws Exception{
		User user_ = userService.checkLogin(user.getName(), user.getPw());
		if(user_!=null) {
			return "success";
		}
		else {
			userService.userRegister(user.getName(), user.getPw());
			
			return "success";
		}
	}
}
