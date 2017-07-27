/**
 * 
 */
package com.holiday.holiday.modelsRepository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import com.holiday.model.Holiday;

@Repository
public class HolidayRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	/*
	public HolidayRepository() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
    public HolidayRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate=jdbcTemplate;
    }*/
    @Transactional(readOnly=true)
	public List<Holiday> findAll() {
    	System.out.println(jdbcTemplate);
		return jdbcTemplate.query("select * from holiday", new HolidayRowMapper());
	}
 
    @Transactional(readOnly=true)
	public Holiday findUserById(String id) {
		return jdbcTemplate.queryForObject("select * from holiday where id=?", new Object[] { id }, new BeanPropertyRowMapper<Holiday>(Holiday.class));
	}
 
    /*public User create(final User user) 
    {
        final String sql = "insert into users(name,email) values(?,?)";
 
        KeyHolder holder = new GeneratedKeyHolder();
        jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, user.getName());
                ps.setString(2, user.getEmail());
                return ps;
            }
        }, holder);
 
        int newUserId = holder.getKey().intValue();
        user.setId(newUserId);
        return user;
    }*/
}

class HolidayRowMapper implements RowMapper<Holiday> {
	@Override
	public Holiday mapRow(ResultSet rs, int rowNum) throws SQLException {
		Holiday holiday = new Holiday();
		holiday.setId(rs.getString("id"));
		holiday.setName(rs.getString("name"));
		holiday.setDiscription(rs.getString("discription"));
		return holiday;
	}
}
