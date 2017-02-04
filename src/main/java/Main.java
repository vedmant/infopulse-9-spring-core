import com.domain.Company;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by vedmant on 2/4/17.
 */
public class Main {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Company company = context.getBean("company", Company.class);
        Integer profit = company.totalProfit();
        System.out.println("Profit = " + profit);
    }
}
