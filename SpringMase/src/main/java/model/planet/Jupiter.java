package model.planet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class Jupiter implements Planet {
    @Value("${model.jupiter.acceleration}")
    private Double acceleration;
    @Value("${model.jupiter.radius}")
    private Double radius;
    @Value("${model.jupiter.distance}")
    private Double distance;

    @Override
    public Double getAcceleration(){
        return acceleration;
    }

    @Override
    public Double getRadius(){
        return radius;
    }

    @Override
    public Double getDistance(){
        return distance;
    }
}
