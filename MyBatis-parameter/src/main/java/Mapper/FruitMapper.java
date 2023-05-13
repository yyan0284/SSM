package Mapper;

import org.apache.ibatis.annotations.Param;
import pojo.Fruit;

import java.util.List;

public interface FruitMapper {
    int InserFruit();

    void updateFruit();

    void deleteFruit();

    Fruit getFruitById();
    //查询所有用户信息
    List<Fruit> getFruitAll();

    //多表联查，多对一
    //获取水果以及水果种类
    Fruit getFruitAndfruitById(@Param("fid") Integer fid);

    //if条件查询
    List<Fruit> getFruitByCondition(Fruit fruit);

    //批量添加
    void InsertFruit(@Param("fruits") List<Fruit> fruits);
}
