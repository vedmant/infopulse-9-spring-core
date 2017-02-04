package annotations.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by vedmant on 2/4/17.
 */
@Component
@Scope(value = "prototype")
public class Staff {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
