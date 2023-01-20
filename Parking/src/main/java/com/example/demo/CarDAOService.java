package com.example.demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class CarDAOService {
	
	private static List<Car> currentParking = new ArrayList<Car>();
	
	static {
		currentParking.add(new Car("KL32", "Sujith", LocalDate.now().minusYears(10)));
		currentParking.add(new Car("KA01", "Krishna", LocalDate.now().minusYears(20)));
	}
	
	public List<Car> addParking(Car obj) {
		currentParking.add(obj);
		System.out.println("Current Car Parking--"+currentParking);
		
		return currentParking;
	}
	

}
