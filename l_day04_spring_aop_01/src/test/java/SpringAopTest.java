import com.javaee.aop_01.Calculator;

import com.javaee.config.JavaConfig_01;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 5/9/2024 10:42 PM Thu
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@SpringJUnitConfig(JavaConfig_01.class)

public class SpringAopTest {
    @Autowired
    private Calculator calculator;
    @Test
    public void test01(){
        int add = calculator.add(1,2);

        System.out.println("add = " + add);
    }
}
