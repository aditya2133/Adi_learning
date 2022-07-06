package com.qa.may.springprac;

public class PracSnowSports {

	private int sportId;
	private String name;
	private String sportDescription;
	private int parNumbers;
	
	public PracSnowSports(int sportId, String name, String sportDescription, int parNumbers) {
		super();
		this.sportId = sportId;
		this.name = name;
		this.sportDescription = sportDescription;
		this.parNumbers = parNumbers;
	}

	public PracSnowSports() {
		super();
	}

	@Override
	public String toString() {
		return "PracSnowSports [sportId=" + sportId + ", name=" + name + ", sportDescription=" + sportDescription
				+ ", parNumbers=" + parNumbers + "]";
	}

	/**
	 * @return the sportId
	 */
	public int getSportId() {
		return sportId;
	}

	/**
	 * @param sportId the sportId to set
	 */
	public void setSportId(int sportId) {
		this.sportId = sportId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the sportDescription
	 */
	public String getSportDescription() {
		return sportDescription;
	}

	/**
	 * @param sportDescription the sportDescription to set
	 */
	public void setSportDescription(String sportDescription) {
		this.sportDescription = sportDescription;
	}

	/**
	 * @return the parNumbers
	 */
	public int getParNumbers() {
		return parNumbers;
	}

	/**
	 * @param parNumbers the parNumbers to set
	 */
	public void setParNumbers(int parNumbers) {
		this.parNumbers = parNumbers;
	}
	
	
	
	
	
}
