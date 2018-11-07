package model.planet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class Mars implements Planet {
    @Value("3.73")
    private Double acceleration;
    @Value("3397.0")
    private Double radius;
    @Value("227200000")
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
