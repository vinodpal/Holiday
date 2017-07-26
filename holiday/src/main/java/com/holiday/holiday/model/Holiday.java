/**
 * 
 */
package com.holiday.holiday.model;


public class Holiday {
	private String holidayName;
	private String holidayId;
	private String discription;

	@Override
	public String toString() {
		return "Holiday [holidayName=" + holidayName + ", holidayId=" + holidayId + ", discription=" + discription
				+ "]";
	}

	public String getHolidayName() {
		return holidayName;
	}

	public void setHolidayName(String holidayName) {
		this.holidayName = holidayName;
	}

	public String getHolidayId() {
		return holidayId;
	}

	public void setHolidayId(String holidayId) {
		this.holidayId = holidayId;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

}
