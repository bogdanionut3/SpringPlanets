package model.repository;

import model.planet.Planet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HardcodedRepository implements PlanetRepository {

    @Autowired
    private PlanetFactory planetFactory;


    @Override
    public Planet findByName(String namePlanet) {
       return planetFactory.getPlanet(namePlanet) ;
    }
}
