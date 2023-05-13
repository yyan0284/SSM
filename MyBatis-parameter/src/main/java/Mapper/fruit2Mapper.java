package Mapper;

import org.apache.ibatis.annotations.Param;
import pojo.Fruit;
import pojo.fruit2;

public interface fruit2Mapper {
    //一对多
    fruit2 getfruitAndFruitById(@Param("id") Integer id);
}
