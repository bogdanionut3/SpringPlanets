package model.planet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class Neptun implements Planet {
    @Value("9.78")
    private Double acceleration;
    @Value("24622.0")
    private Double radius;
    @Value("4.495")
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
