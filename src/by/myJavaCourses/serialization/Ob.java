package by.myJavaCourses.serialization;

import java.io.Serializable;

public class Ob implements Serializable {

	private int intValue;
	private String name;
	
	
	
	
	public Ob(int intValue, String name) {
		super();
		this.intValue = intValue;
		this.name = name;
	}
	public int getIntValue() {
		return intValue;
	}
	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
