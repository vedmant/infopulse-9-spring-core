package annotations.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by vedmant on 2/4/17.
 */
@Component
public class AirPlane {

    @Autowired
    @Value("100")
    private Integer fuelConsumption;

    @Autowired
    private Staff pilot;

    @Autowired
    private Staff steward;

    public Integer getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(Integer fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public Staff getPilot() {
        return pilot;
    }

    public void setPilot(Staff pilot) {
        this.pilot = pilot;
    }

    public Staff getSteward() {
        return steward;
    }

    public void setSteward(Staff steward) {
        this.steward = steward;
    }
}
