package com.example.demo;

import model.controler.PlanetCalculatorController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = "model")
public class DemoApplication {

	private static PlanetCalculatorController controller;

	@Autowired
	public DemoApplication(PlanetCalculatorController planetController){
		controller = planetController;
	}

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		String planetName = "earth";
		controller.runMass(planetName);
		planetName = "mars";
		controller.runCircum(planetName);
		planetName = "pluto";
		controller.runSurface(planetName);
		planetName ="jupiter";
		controller.runVolume(planetName);
		planetName ="neptun";
		controller.runTimeOfLight(planetName);


		SpringApplication.exit(ctx, () -> 0);
	}
}
