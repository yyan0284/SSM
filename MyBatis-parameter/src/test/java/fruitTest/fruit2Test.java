package fruitTest;

import Mapper.fruit2Mapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.fruit2;
import util.SqlSessionUtil;

public class fruit2Test {
    @Test
    //多表联查，一对多
    public void  getFruitAndfruitByIdTest(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();

        fruit2Mapper mapper = sqlSession.getMapper(fruit2Mapper.class);

        fruit2 fruit2 = mapper.getfruitAndFruitById(1);

        System.out.println(fruit2);

        sqlSession.close();
    }
}
