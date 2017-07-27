/**
 * 
 */
package com.holiday.holiday.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.holiday.holiday.modelsRepository.HolidayRepository;
import com.holiday.model.Holiday;


@RestController
public class HolidayService {
	@Autowired
	HolidayRepository hRepo;

	@RequestMapping(value = "/holiday/putHoliday", method = RequestMethod.POST)
	public ResponseEntity<?> putHolidayInfo(@RequestBody Holiday holiday) throws Exception {
		ResponseEntity<String> response = new ResponseEntity<String>("benefits", HttpStatus.OK);
		System.out.println("Validation Start-----------------------");
		return response;
	}

	@RequestMapping(value = "/holiday/getHoliday", method = RequestMethod.GET)
	public List<Holiday> getHolidayInfo() {
		//ResponseEntity<Holiday> response = new ResponseEntity<String>("benefits", HttpStatus.OK);
		//HolidayRepository hRepo = new HolidayRepository();
		List<Holiday> list = hRepo.findAll();
		list.forEach(x -> System.out.println(x));
		// jdbcTemplate.queryForList("select *From holiday");
		// List<Holiday> list = jdbcTemplate.query("select * from holiday", new
		// HolidayRowMapper());
		// list.forEach(x->System.out.println(x));
		// Arrays.stream(list).forEach(x->System.out.println(x));
		/* System.out.println(list); */
		return list;
	}
	
	@RequestMapping(value="/holiday/getHolidayinfo",method = RequestMethod.GET)
	public Holiday getHolidayInfoById(@RequestParam (value="id", defaultValue="1")String id){
		Holiday holiday = hRepo.findUserById(id);
		System.out.println(holiday);
		return holiday;
	}
}