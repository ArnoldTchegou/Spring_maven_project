package com.firstmavaneproject.demo_firstmavenproject.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDAO {
	@Autowired
	JdbcConnection jdbcCo;

	public JdbcConnection getJdbcCo() {
		return jdbcCo;
	}

	public void setJdbcCo(JdbcConnection jdbcCo) {
		this.jdbcCo = jdbcCo;
	}

}
