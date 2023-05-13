package Mapper;

import pojo.Fruit;

import java.util.List;

public interface FruitMapper {
    int InserFruit();

    void updateFruit();

    void deleteFruit();

    Fruit getFruitById();
    //查询所有用户信息
    List<Fruit> getFruitAll();
}
