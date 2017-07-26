/**
 * 
 */
package com.holiday.holiday.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.holiday.holiday.model.Holiday;

@RestController
public class HolidayService {
@RequestMapping(value = "/criteria/pref/benefits", method = RequestMethod.POST)
	public ResponseEntity<?> updateEducationInfo(@RequestBody Holiday holiday) throws Exception 
		{
		 ResponseEntity<String> response = new ResponseEntity<String>("benefits", HttpStatus.OK);
		 System.out.println("Validation Start-----------------------");
		 /*JobsInfoMgtCapability writeinfo = new JobsInfoMgtCapability();
		 writeinfo.writa(payload);*/
		 return response;	
		}
  

}