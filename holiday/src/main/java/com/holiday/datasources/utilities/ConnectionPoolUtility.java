/**
 * 
 */
package com.holiday.datasources.utilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class ConnectionPoolUtility {
	@Autowired
	private JdbcTemplate jdbcTemplate ;
}
