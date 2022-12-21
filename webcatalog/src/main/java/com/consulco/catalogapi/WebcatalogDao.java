package com.consulco.catalogapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class WebcatalogDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	  /* Calling Stored Procedure using SimpleJdbcCall */
	  public Map<String, Object> deckingSelect() {
		  SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
	        .withProcedureName("DeckingSelect");
	    
	    SqlParameterSource in = new MapSqlParameterSource(null);
	    Map<String, Object> simpleJdbcCallResult = simpleJdbcCall.execute(in);
	    System.out.println(simpleJdbcCallResult);
	     
	    return simpleJdbcCallResult;
	  }

	
}

