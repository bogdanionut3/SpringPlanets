package model.planet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class Jupiter implements Planet {
    @Value("24.79")
    private Double acceleration;
    @Value("69911.0")
    private Double radius;
    @Value("778500000")
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
