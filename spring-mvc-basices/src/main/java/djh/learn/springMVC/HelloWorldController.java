package djh.learn.springMVC;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/funny")
public class HelloWorldController {
	
	/*
	 * @RequestMapping("/") public String showMyPage() { return "main-menu"; }
	 */
	@RequestMapping("/showForm")
	public String showForm() {
		return "hello-worldForm";
	}
	
	@RequestMapping("/processForm")
	public String processForm(HttpServletRequest request,Model model) {
		return "helloWorld";
	}
	
	@RequestMapping("/processFormV2")
	public String processFormV2(HttpServletRequest request,Model model) {
		String name = request.getParameter("name");
		String message = "Yo! "+name;
		System.out.println("name is "+name+" "+message);
		model.addAttribute("name", name);
		model.addAttribute("message", message);
		return "helloWorld";
	}
	
	@RequestMapping("/processFormV3")
	public String processFormV3(@RequestParam("name")String name,Model model) {
		String message = "Yo! friend from  processFormV3"+name;
		System.out.println("name is "+name+" "+message);
		model.addAttribute("name", name);
		model.addAttribute("message", message);
		return "helloWorld";
	}
}
