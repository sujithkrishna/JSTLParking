package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class CarParkingResource {
	
	@Autowired
	private CarDAOService carDao;

	@GetMapping("/")
	public String homePage() {
		return "index.jsp";
	}
	@GetMapping("addCar")
	public String addCar(@ModelAttribute("car") Car car,Model m) {
		System.out.println("Car------"+car);
		List<Car> currentParking = carDao.addParking(car);
		m.addAttribute("current", currentParking);
		return "display.jsp";
	}
	
	
}
