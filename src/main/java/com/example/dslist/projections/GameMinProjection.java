package com.example.dslist.projections;

public interface GameMinProjection {
	
	Long getId();
	String getTitle();
	Integer getYear();
	String getImgUrl();
	String getShortDescription();
	Integer getPosition();
	
	// Add any other fields you need from the Game entity

}
