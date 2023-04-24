package com.example.footballdemo.footballdata;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Football {
	@Id
	private int num;
	private String name;
	private int matches;
	private int goals;
	private int assists;
	private int hatricks;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMatches() {
		return matches;
	}
	public void setMatches(int matches) {
		this.matches = matches;
	}
	public int getGoals() {
		return goals;
	}
	public void setGoals(int goals) {
		this.goals = goals;
	}
	public int getAssists() {
		return assists;
	}
	public void setAssists(int assists) {
		this.assists = assists;
	}
	public int getHatricks() {
		return hatricks;
	}
	public void setHatricks(int hatricks) {
		this.hatricks = hatricks;
	}
	
}
