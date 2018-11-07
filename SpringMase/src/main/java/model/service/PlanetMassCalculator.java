package model.service;


import model.repository.PlanetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;

@Service
public class PlanetMassCalculator {

    private static final Double CONSTANTAGRAV = 6.6726;
    private static final Double PI = 3.14;
    private static final Double LIGHTSPEED = 300000.0;

    @Autowired
    private PlanetRepository planetRepository;

    public Double calculateMass(String planetName){
        Double mass = (planetRepository.findByName(planetName).getAcceleration()*planetRepository.findByName(planetName).getRadius()*
                planetRepository.findByName(planetName).getRadius())/CONSTANTAGRAV;
        return mass;
    }

    public Double calculateSurface(String planetName){
       Double surface = 4 * PI * (planetRepository.findByName(planetName).getRadius())
               *planetRepository.findByName(planetName).getRadius();
       return surface;
    }

    public Double calculateCircumf(String planetName){
        Double circum =  4 * PI * (planetRepository.findByName(planetName).getRadius())
                *planetRepository.findByName(planetName).getRadius();
        return circum;
    }

    public Double calculateVolum(String planetName){
        Double volum = 4/3*PI*Math.pow(planetRepository.findByName(planetName).getRadius(),3);
        return volum;
    }

    public Double calculateTimeOfLight(String planetName){
        Double timeOfLight = planetRepository.findByName(planetName).getDistance()/LIGHTSPEED;
        return timeOfLight;
    }
}



