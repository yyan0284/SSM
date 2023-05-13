package pojo;

import java.util.List;

public class fruit2 {
    private int id;
    private String name;

    private List<Fruit> fruits;

    public fruit2() {
    }

    public fruit2(int id, String name, List<Fruit> fruits) {
        this.id = id;
        this.name = name;
        this.fruits = fruits;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Fruit> getFruits() {
        return fruits;
    }

    public void setFruits(List<Fruit> fruits) {
        this.fruits = fruits;
    }

    @Override
    public String toString() {
        return "fruit2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fruits=" + fruits +
                '}';
    }
}
