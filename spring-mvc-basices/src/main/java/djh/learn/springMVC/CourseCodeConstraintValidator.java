package djh.learn.springMVC;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix;
	
	@Override
	public void initialize(CourseCode code) {
		// TODO Auto-generated method stub
		this.coursePrefix=code.value();
	}
	@Override
	public boolean isValid(String code, ConstraintValidatorContext arg1) {
		// TODO Auto-generated method stub
		boolean result;
		
		if(code!=null) {
			result = code.startsWith(coursePrefix);
		}
		else
		{
			result = true;
		}
		return result;
	}

}
