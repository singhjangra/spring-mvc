package djh.learn.springMVC;


import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder)
	{
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, editor);
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		

		theModel.addAttribute("customer",  new Customer());
		return "customer-form";
	}
	
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer customer,BindingResult bindingResult) {
		System.out.println("customer is-------"+customer);
		System.out.println("bindingResult is-------"+bindingResult);
		System.out.println("bindingResult.hasErrors()---"+bindingResult.hasErrors());
		if(bindingResult.hasErrors())
		{
			return "customer-form"; 
		}
		else
		{
			return "customer-confirmation";
		}
	}
}
