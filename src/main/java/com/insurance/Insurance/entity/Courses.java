package com.insurance.Insurance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Courses 
{
	@Id
	private long id;
	private String title;
	private String description;
	private String price;
	private String type;
	private String printing;
	public Courses(long id, String title, String description, String price, String type, String printing) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.price = price;
		this.type = type;
		this.printing = printing;
	}
	
	// Default constructor
	public Courses()
	{
		super();
	}
	
	//Getter and Setter
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrice()
	{
		return price;
	}
	public void setPrice(String price)
	{
		this.price = price;
	}
	
	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type = type;
	}
	public String getPrinting()
	{
		return printing;
	}
	public void setPrinting(String printing)
	{
		this.printing = printing;
	}
	
	@Override
	public String toString() {
		return "Cources [id=" + id + ", title=" + title + ", description=" + description + "]";
	}

}
