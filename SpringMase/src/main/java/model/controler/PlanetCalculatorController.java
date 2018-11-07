package model.controler;

import model.service.PlanetMassCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlanetCalculatorController {

    @Autowired
    private PlanetMassCalculator planetMassCalculator;


    public void runMass(String planet) {
        System.out.println("Calculating mass of the planet " + planet);
        Double massOfPlanet = planetMassCalculator.calculateMass(planet);
        System.out.println("Mass is: " + massOfPlanet);
    }

    public void runCircum(String planet) {
        System.out.println("Calculating circum of the planet " + planet);
        Double circumOfPlanet = planetMassCalculator.calculateCircumf(planet);
        System.out.println("Circum is: " + circumOfPlanet);
    }

    public void runVolume(String planet) {
        System.out.println("Calculating volume of the planet " + planet);
        Double volume = planetMassCalculator.calculateVolum(planet);
        System.out.println("Volume is: " + volume);
    }

    public void runSurface(String planet) {
        System.out.println("Calculating surface of the planet " + planet);
        Double surface = planetMassCalculator.calculateSurface(planet);
        System.out.println("Surface is: " +surface );
    }
    public void runTimeOfLight(String planet) {
        System.out.println("Calculating time of light from "+planet+" to the sun.");
        Double time = planetMassCalculator.calculateTimeOfLight(planet);
        System.out.println("Time of ligth is: " +time );
    }

    public PlanetCalculatorController() {
    }
}
