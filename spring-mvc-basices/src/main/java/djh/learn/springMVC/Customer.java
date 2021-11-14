package djh.learn.springMVC;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {

	private String firstName;
	
	
	@NotNull(message = "is Required For Customer")
	@Size(min = 1,message = "atleast one character is required")
	private String lastName;
	
	@NotNull(message = "is Required")
	@Min(value = 1,message = "Value must be greater than 0")
	@Max(value = 10,message = "Value must be less than 10")
	private Integer freePasses;
	
	@NotNull(message = "is Required For Customer Address")
	@Pattern(regexp = "^[a-zA-Z0-9]{5}",message = "Postal Code must have 5 characters only")
	private String postalCode;
	
	@NotNull(message = "is Required For Customer Course")
	@CourseCode
	private String courseCode;
	
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Customer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Customer() {
		super();
	}
	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", freePasses=" + freePasses
				+ ", postalCode=" + postalCode + ", courseCode=" + courseCode + "]";
	}
	
}
