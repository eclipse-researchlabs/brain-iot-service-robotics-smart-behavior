package org.lib.reply.placecomponent;

import org.lib.availability.Stamp;

public class Addheader {

	int priority=0;
	
	Stamp stamp =new Stamp();
	
	int id =0;
	String name ="";
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public Stamp getStamp() {
		return stamp;
	}
	public void setStamp(Stamp stamp) {
		this.stamp = stamp;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	 
}
