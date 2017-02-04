import annotations.domain.AirPlane;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by vedmant on 2/4/17.
 */
@Configuration
@ComponentScan(value = "annotations.domain")
public class MainAnnotation {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(MainAnnotation.class);

        AirPlane plane = context.getBean(AirPlane.class);
        plane.getPilot().setName("pilot name");
        plane.getSteward().setName("steward name");
        System.out.println("Pilot = " + plane.getPilot().getName());
        System.out.println("Steward = " + plane.getSteward().getName());
    }
}
