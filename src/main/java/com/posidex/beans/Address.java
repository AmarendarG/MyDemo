package com.posidex.beans;

public class Address {

	private String city;

	private String state;

	private String country;
	
	private String git;
	provate String git2;
	public void getMessage(String message)
{
	
	System.out.println("git hub....");
}
	
public void getMessage()
{
	
	System.out.println("git hub");
}
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + "]";
	}

}
