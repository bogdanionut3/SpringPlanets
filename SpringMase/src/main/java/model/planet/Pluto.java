package model.planet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class Pluto implements Planet {
    @Value("${model.pluto.acceleration}")
    private Double acceleration;
    @Value("${model.pluto.radius}")
    private Double radius;
    @Value("${model.pluto.distance}")
    private Double distance;

    @Override
    public Double getAcceleration() {
        return acceleration;
    }

    @Override
    public Double getRadius() {
        return radius;
    }

    @Override
    public Double getDistance(){
        return distance;
    }
}
