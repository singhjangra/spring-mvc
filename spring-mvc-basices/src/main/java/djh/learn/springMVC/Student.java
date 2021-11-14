package djh.learn.springMVC;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	
	
	private String lastName;
	private String[] operatingSystems;
	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}
	public String[] getOperatingSystems() {
		return operatingSystems;
	}
	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}
	private String country;
	private String favouriteLanguage;
	
	private LinkedHashMap<String, String> countryOptions;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
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
	
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}
	public Student() {
		super();
		 countryOptions = new LinkedHashMap();
		 countryOptions.put("IND", "India");
		 countryOptions.put("Pak", "PAK");
		 countryOptions.put("US", "USA");
		 countryOptions.put("UK", "UK");
	}

	public Student(String firstName, String lastName, String[] operatingSystems, String country,
			String favouriteLanguage, LinkedHashMap<String, String> countryOptions) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.operatingSystems = operatingSystems;
		this.country = country;
		this.favouriteLanguage = favouriteLanguage;
		this.countryOptions = countryOptions;
	}
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", operatingSystems="
				+ Arrays.toString(operatingSystems) + ", country=" + country + ", favouriteLanguage="
				+ favouriteLanguage + ", countryOptions=" + countryOptions + "]";
	}
	
	
}
