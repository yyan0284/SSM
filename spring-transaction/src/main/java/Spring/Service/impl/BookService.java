package Spring.Service.impl;

import Spring.DAO.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService implements Spring.Service.BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public void buyBook(Integer userId, Integer bookId) {

        //查询图书的价格
        bookDao.getPriceByBookId(bookId);
        //更新图书的库存
        bookDao.updateStock(bookId);
        //更新用户的余额
        //bookDao.updateBalance(bookId,price);
    }
}
