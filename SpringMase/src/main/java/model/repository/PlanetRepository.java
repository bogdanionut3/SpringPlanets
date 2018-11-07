package model.repository;

import model.planet.Planet;

public interface PlanetRepository {
    Planet findByName(String namePlanet);
}
