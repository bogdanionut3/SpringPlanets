package model.planet;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class Earth implements Planet{
    @Value("0.320")
    public Double acceleration;
    @Value("1188.3")
    public Double radius;
    @Value("149600000.0")
    public Double distance;

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
