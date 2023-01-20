package com.example.demo;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class Car {

	
	private String carRegNo;
	private String carOwnerName;
	private LocalDate parkingTime;
	
	public Car() {
		System.out.println("Default Constructor");
		
	}
	public Car(String carRegNo, String carOwnerName, LocalDate parkingTime) {
		this.carRegNo = carRegNo;
		this.carOwnerName = carOwnerName;
		this.parkingTime = parkingTime;
	}
	public String getCarRegNo() {
		return carRegNo;
	}
	public void setCarRegNo(String carRegNo) {
		this.carRegNo = carRegNo;
	}
	public String getCarOwnerName() {
		return carOwnerName;
	}
	public void setCarOwnerName(String carOwnerName) {
		this.carOwnerName = carOwnerName;
	}
	public LocalDate getParkingTime() {
		return parkingTime;
	}
	public void setParkingTime(LocalDate parkingTime) {
		this.parkingTime = parkingTime;
	}
	@Override
	public String toString() {
		return "Car [carRegNo=" + carRegNo + ", carOwnerName=" + carOwnerName + ", parkingTime=" + parkingTime + "]";
	}
	
	
}
