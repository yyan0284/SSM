package fruitTest;

import Mapper.FruitMapper;
import Mapper.fruit2Mapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import pojo.Fruit;
import pojo.fruit2;
import util.SqlSessionUtil;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class FruitTest {
    @Test
        public void testinsert() throws IOException {
        //读取MyBatis的核心配置文件
        InputStream is = Resources.getResourceAsStream("MyBatis-config.xml");
//创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//通过核心配置文件所对应的字节输入流创建工厂类SqlSessionFactory，生产SqlSession对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
//创建SqlSession对象，此时通过SqlSession对象所操作的sql都必须手动提交或回滚事务
//SqlSession sqlSession = sqlSessionFactory.openSession();
//创建SqlSession对象，此时通过SqlSession对象所操作的sql都会自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
//通过代理模式创建UserMapper接口的代理实现类对象
        FruitMapper fruitMapper = sqlSession.getMapper(FruitMapper.class);
//调用UserMapper接口中的方法，就可以根据UserMapper的全类名匹配元素文件，通过调用的方法名匹配
        //映射文件中的SQL标签，并执行标签中的SQL语句
        int result =  fruitMapper.InserFruit();
//sqlSession.commit();
        System.out.println("结果："+result);

    }
    @Test
    public void Updatetest(){

        SqlSession sqlSession = SqlSessionUtil.getSqlSession();

        FruitMapper fruitMapper = sqlSession.getMapper(FruitMapper.class);

        fruitMapper.updateFruit();

        sqlSession.close();
    }

    @Test
    public void deleteTest(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();

        FruitMapper fruitMapper = sqlSession.getMapper(FruitMapper.class);

        fruitMapper.deleteFruit();

        sqlSession.close();

    }

    @Test
    public void getFruitByIdTest(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();

        FruitMapper fruitMapper = sqlSession.getMapper(FruitMapper.class);

        Fruit byId = fruitMapper.getFruitById();

        System.out.println(byId);

        sqlSession.close();
    }

    @Test
    public void getFruitAllTest(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();

        FruitMapper fruitMapper = sqlSession.getMapper(FruitMapper.class);

        //查询之前开启分页
       // PageHelper;

        List<Fruit> fruitAll = fruitMapper.getFruitAll();

        fruitAll.forEach(System.out::println);

        sqlSession.close();
    }

    @Test
    //多表联查，多对一
    public void  getFruitAndfruitById(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();

        FruitMapper fruitMapper = sqlSession.getMapper(FruitMapper.class);

        Fruit byId = fruitMapper.getFruitAndfruitById(16);

        System.out.println(byId);

        sqlSession.close();
    }

    @Test
    //多表联查，多对一
    public void  getFruitByConditionTest(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();

        FruitMapper fruitMapper = sqlSession.getMapper(FruitMapper.class);

        Fruit fruit = new Fruit(null, "香蕉", 21, 34, "有点酸");

        List<Fruit> fruitByCondition = fruitMapper.getFruitByCondition(fruit);

        System.out.println(fruitByCondition);

        sqlSession.close();
    }

    @Test
    //批量添加
    public void  InsertFruitTest(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();

        FruitMapper fruitMapper = sqlSession.getMapper(FruitMapper.class);

        Fruit fruit = new Fruit(null, "栗子", 21, 34, "有点酸");
        Fruit fruit2 = new Fruit(null, "瓜子", 21, 34, "有点酸");
        Fruit fruit3 = new Fruit(null, "葡萄干", 21, 34, "有点酸");
        List<Fruit> fruits = Arrays.asList(fruit, fruit2, fruit3);
        fruitMapper.InsertFruit(fruits);

        sqlSession.close();
    }
}
