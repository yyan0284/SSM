package fruitTest;

import Mapper.SelectMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import util.SqlSessionUtil;

import java.util.Map;

public class SelectMapperTest {
@Test
    public void testGetCount(){
    SqlSession sqlSession = SqlSessionUtil.getSqlSession();
    SelectMapper sessionMapper = sqlSession.getMapper(SelectMapper.class);

    Map<String, Object> fruitByIdToMap = sessionMapper.getFruitByIdToMap(10);
        System.out.println(fruitByIdToMap);
    }


}
