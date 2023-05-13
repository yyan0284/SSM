package Spring.pojo.DAO.impl;

import Spring.pojo.DAO.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoimpl implements UserDao {
    @Autowired
    @Override
    public void saveUser() {
        System.out.println("保存成功");
    }
}
