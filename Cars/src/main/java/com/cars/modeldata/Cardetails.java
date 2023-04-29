package com.cars.modeldata;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Cardetails {
	@Id
	private int sno;
	private String brand;
	private String modelname;
	private String fueltype;
	private String mileage;
	private String transmissiontype;
	private int numofcylinder;
	private String engine;
	private int capacity;
	private String maxtorque;
	private String bhp;
	private String bodytype;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModelname() {
		return modelname;
	}
	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
	public String getFueltype() {
		return fueltype;
	}
	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}
	public String getMileage() {
		return mileage;
	}
	public void setMileage(String mileage) {
		this.mileage = mileage;
	}
	public String getTransmissiontype() {
		return transmissiontype;
	}
	public void setTransmissiontype(String transmissiontype) {
		this.transmissiontype = transmissiontype;
	}
	public int getNumofcylinder() {
		return numofcylinder;
	}
	public void setNumofcylinder(int numofcylinder) {
		this.numofcylinder = numofcylinder;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getMaxtorque() {
		return maxtorque;
	}
	public void setMaxtorque(String maxtorque) {
		this.maxtorque = maxtorque;
	}
	public String getBhp() {
		return bhp;
	}
	public void setBhp(String bhp) {
		this.bhp = bhp;
	}
	public String getBodytype() {
		return bodytype;
	}
	public void setBodytype(String bodytype) {
		this.bodytype = bodytype;
	}
	
}
