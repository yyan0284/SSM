package JDBCTest;

import Spring.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

//指定当前测试类在spring的测试环境中执行，此时可以通过注入的方式直接获取IOC容器中的Bean
@RunWith(SpringJUnit4ClassRunner.class)
//设置spring测试环境的配置文件
@ContextConfiguration("classpath:Spring-jdbc.xml")
public class JdbcTest {
    @Autowired
    private JdbcTemplate JdbcTemplate;

    @Test
    public void test(){
        String sql = "insert into user values(null,?,?,?)";
        JdbcTemplate.update(sql,"DD","123456","2000");
    }

    @Test
    public void SelectTest(){
        String sql = "select * from user where id = ?";
        User user = JdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), 1);
        System.out.println(user);
    }

    @Test
    public void AllUserTest(){
        String sql = "select * from user ";
        List<User> users = JdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
        System.out.println(users);
        users.forEach(System.out::println);
    }

    @Test
    public void AllTest(){
        String sql = "select count(*) from user ";
        Integer integer = JdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(integer);
    }


}
