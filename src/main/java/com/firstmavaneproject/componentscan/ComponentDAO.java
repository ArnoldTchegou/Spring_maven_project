package com.firstmavaneproject.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentDAO {
	@Autowired
	ComponentJdbcConnection jdbcCo;

	public ComponentJdbcConnection getJdbcCo() {
		return jdbcCo;
	}

	public void setJdbcCo(ComponentJdbcConnection jdbcCo) {
		this.jdbcCo = jdbcCo;
	}

}
