package model.planet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class Neptun implements Planet {
    @Value("${model.neptun.acceleration}")
    private Double acceleration;
    @Value("${model.neptun.radius}")
    private Double radius;
    @Value("${model.neptun.distance}")
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
