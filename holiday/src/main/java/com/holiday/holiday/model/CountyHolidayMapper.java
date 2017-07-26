/**
 * 
 */
package com.holiday.holiday.model;


public class CountyHolidayMapper {
	private String holidayId;
	private String countryId;
	private String mapperId;

	@Override
	public String toString() {
		return "CountyHolidayMapper [holidayId=" + holidayId + ", countryId=" + countryId + ", mapperId=" + mapperId
				+ "]";
	}

	public String getHolidayId() {
		return holidayId;
	}

	public void setHolidayId(String holidayId) {
		this.holidayId = holidayId;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getMapperId() {
		return mapperId;
	}

	public void setMapperId(String mapperId) {
		this.mapperId = mapperId;
	}
}
