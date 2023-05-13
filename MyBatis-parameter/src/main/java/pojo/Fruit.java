package pojo;

public class Fruit {
    private Integer fid ;
    private String fname ;
    private Integer price ;
    private Integer fcount ;
    private String remark ;

    private fruit2 fruit2;

    public Fruit() {
    }

    public Fruit(Integer fid, String fname, Integer price, Integer fcount, String remark, pojo.fruit2 fruit2) {
        this.fid = fid;
        this.fname = fname;
        this.price = price;
        this.fcount = fcount;
        this.remark = remark;
        this.fruit2 = fruit2;
    }

    public Fruit(Integer fid, String fname, Integer price, Integer fcount, String remark) {
        this.fid = fid;
        this.fname = fname;
        this.price = price;
        this.fcount = fcount;
        this.remark = remark;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getFcount() {
        return fcount;
    }

    public void setFcount(Integer fcount) {
        this.fcount = fcount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }



    public pojo.fruit2 getFruit2() {
        return fruit2;
    }

    public void setFruit2(pojo.fruit2 fruit2) {
        this.fruit2 = fruit2;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "fid=" + fid +
                ", fname='" + fname + '\'' +
                ", price=" + price +
                ", fcount=" + fcount +
                ", remark='" + remark + '\'' +
                ", fruit2=" + fruit2 +
                '}';
    }
}
