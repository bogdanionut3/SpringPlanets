package model.planet;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class Earth implements Planet{
    @Value("${model.earth.acceleration}")
    public Double acceleration;
    @Value("${model.earth.radius}")
    public Double radius;
    @Value("${model.earth.distance}")
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
