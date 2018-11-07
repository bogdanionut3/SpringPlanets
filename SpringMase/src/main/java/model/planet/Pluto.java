package model.planet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class Pluto implements Planet {
    @Value("0.620")
    private Double acceleration;
    @Value("1180.0")
    private Double radius;
    @Value("4425000000")
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
