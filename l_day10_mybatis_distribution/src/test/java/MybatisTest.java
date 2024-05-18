import com.mybatis.mapper.CustomerMapper;
import com.mybatis.mapper.OrderMapper;
import com.mybatis.pojo.Customer;
import com.mybatis.pojo.Order;
import com.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 16/5/2024 16:51 周四
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class MybatisTest {
    @Test
    public void test_01(){
        SqlSession sqlSession = SqlSessionUtils.openSession();
        OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
        List<Order> orderList =  mapper.queryAll();
        orderList.forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void test_02(){
        SqlSession sqlSession = SqlSessionUtils.openAutoSession();
        OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
        List<Order> orderList = mapper.queryByCustomerId(1);
        System.out.println("orderList = " + orderList);
        sqlSession.close();
    }
    @Test
    public void test_03(){
        SqlSession sqlSession = SqlSessionUtils.openAutoSession();
        CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);
        Customer customer = mapper.queryById(1);
        System.out.println("customer = " + customer);
        sqlSession.close();
    }
    @Test
    public void test_04(){
        SqlSession sqlSession = SqlSessionUtils.openAutoSession();
        CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);
        Customer customer = mapper.queryByCustomerId(1);
        System.out.println("customer = " + customer);
        sqlSession.close();
    }
}
