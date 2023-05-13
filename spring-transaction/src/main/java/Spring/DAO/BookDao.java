package Spring.DAO;

public interface BookDao {
    //根据图书的ID查询价格
    Integer getPriceByBookId(Integer bookId);

    //更新图书的库存
    void updateStock(Integer bookId);

    //更新图书的余额
    void updateBalance(Integer userId,Integer price);
}
