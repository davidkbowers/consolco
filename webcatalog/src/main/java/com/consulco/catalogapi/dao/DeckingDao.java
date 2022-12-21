package com.consulco.catalogapi.dao;

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


public class DeckingDao {

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

	  //DeckingCategoryDelete
	  public Map<String, Object> deckingCategoryDelete(Integer deckingCatID) {
		  
		  
	  }

	  //DeckingCategoryInsert
	  public Map<String, Object> deckingCategoryInsert(String deckingType, String deckingDesc, Boolean viewOnWeb) {
		  
		  
	  }
	  
	  //DeckingCategorySelect
	  public Map<String, Object> deckingCategorySelect() {
		  
		  
	  }

	  //DeckingCategorySelectVOW
	  public Map<String, Object> deckingCategorySelectVOW(Boolean ViewOnWeb) {
		  
		  
	  }
	  
	  //DeckingCategoryUpdate
	  public Map<String, Object> deckingCategoryUpdate(String deckingType, String deckingDesc, Boolean ViewOnWeb, Integer deckingID) {
		  
		  
	  }

	  //DeckingDelete
	  public Map<String, Object> deckingDelete(Integer deckingCatID) {
		  
		  
	  }

	  //DeckingInsert
	  public Map<String, Object> deckingInsert(Integer deckingCatID, String sku, String size, String deckDesc, Float price, String unit, Boolean viewOnWeb) {
		  
		  
	  }

	  //DeckingSelect
	  public Map<String, Object> deckingSelect() {
		  
		  
	  }

	  //DeckingSelectByDeckingCatID
	  public Map<String, Object> deckingSelectByDeckingCatID(Integer deckingCatID) {
		  
		  
	  }

	  //DeckingSelectVOW
	  public Map<String, Object> deckingSelectVOW(Boolean ViewOnWeb) {
		  
		  
	  }
	  
	  //DeckingUpdate
	  public Map<String, Object> deckingUpdate(Integer deckingCatID,
			  	String sku,
			  	String size,
			  	String deckDesc,
			  	Float price,
			  	String unit,
			  	Boolean viewOnWeb,
			  	Integer original_DeckingID,
			  	Integer original_DeckingCatID) {
		  
		  
	  }




	
}

