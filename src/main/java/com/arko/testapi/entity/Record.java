package com.arko.testapi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Record {
	
	@Id
	Long id;
	String name;
	
	public Record() {
		this.id = 0L;
		this.name = null;
	}
	
	/**
	 * @param id
	 * @param name
	 */
	public Record(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Record [id=" + id + ", name=" + name + "]";
	}

}
