import com.javaee.aop_02.Calculator;
import com.javaee.aop_02.impl.CalculatorPureImpl;
import com.javaee.config.JavaConfig_02;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 5/9/2024 11:19 PM Thu
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@SpringJUnitConfig(locations = "classpath:spring_01.xml")
public class SpringAopTest02 {
    @Autowired
    private Calculator calculator;

    @Test
    public void test02(){

        int result = calculator.div(1,0);
        System.out.println("result = " + result);
    }
}
