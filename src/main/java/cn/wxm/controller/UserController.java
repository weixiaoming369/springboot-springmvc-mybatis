package cn.wxm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.wxm.pojo.User;
import cn.wxm.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	/**
	 * 跳转到指定页面
	 * @param page
	 * @return
	 */
	@RequestMapping("/{page}")
	public String showPage(@PathVariable("page") String page){
		return page;
	}
	
	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	@RequestMapping("/addUser")
	public String addUser(User user){
		this.userService.insertUser(user);
		 return "redirect:/users/find"; //重定向
	}
	
	/**
	 * 查询所有用户
	 * @param model
	 * @return
	 */
	@RequestMapping("find")
	public String findAll(Model model){
		List<User> list = this.userService.findAll();
		model.addAttribute("list", list);
		return "list";
	}
	
	@RequestMapping("findUserById")
	public String findById(Integer id,Model model){
		User user = this.userService.findUserById(id);
		model.addAttribute("user", user);
		return "update";
	}
	
	@RequestMapping("editUser")
	public String updateUser(User user){
		this.userService.updateUser(user);
		 return "redirect:/users/find";
	}
	
	@RequestMapping("deleteUserById")
	public String deleteUserById(User user){
		 int num=this.userService.deleteUserById(user);
		 if(num>0){
			 return "redirect:/users/find";
		 }else{
			 return "error";
		 }
	}
	
}
