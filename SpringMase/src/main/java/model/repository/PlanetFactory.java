package model.repository;

import model.planet.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlanetFactory {
    @Autowired
    private Earth earth;
    @Autowired
    private Jupiter jupiter;
    @Autowired
    private Mars mars;
    @Autowired
    private Neptun neptun;
    @Autowired
    private Pluto pluto;


    public Planet getPlanet(String planetName) {
        switch (planetName) {
            case "earth":
                return earth;
            case "jupiter":
                return jupiter;
            case "mars":
                return mars;
            case "neptun":
                return neptun;
            case "pluto":
                return pluto;
            default:
                return null;
        }

    }
}
