package djh.learn.springMVC;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	/*
	 * @RequestMapping("/") public String showMyPage() { return "main-menu"; }
	 */
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		Student student = new Student();
		theModel.addAttribute("student", student);
		return "student-form";
	}
	
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent,Model model) {
		System.out.println("student is-------"+theStudent);
	//	model.addAttribute("", model)
		return "student-confirmation";
	}
}
