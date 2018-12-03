package com.m2m.dto;

import java.util.Random;

public class Device {
	Long id;
	String name;
	String position;
	int batteryLevel;
	int signalLevel;
	
	public Device(String name, String position, int batteryLevel, int signalLevel) {
		super();
		Random rnd = new Random();
		this.id = rnd.nextLong();
		this.name = name;
		this.position = position;
		this.batteryLevel = batteryLevel;
		this.signalLevel = signalLevel;
	}
	
	public Device(Long id) {
		super();
		this.id = id;
		Random rnd = new Random();
		this.name = ((Float)rnd.nextFloat()).toString();
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getBatteryLevel() {
		return batteryLevel;
	}
	public void setBatteryLevel(int batteryLevel) {
		this.batteryLevel = batteryLevel;
	}
	public int getSignalLevel() {
		return signalLevel;
	}
	public void setSignalLevel(int signalLevel) {
		this.signalLevel = signalLevel;
	}
	
}
