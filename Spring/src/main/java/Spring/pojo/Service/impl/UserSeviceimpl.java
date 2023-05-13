package Spring.pojo.Service.impl;

import Spring.pojo.DAO.impl.UserDaoimpl;
import Spring.pojo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSeviceimpl implements UserService {
    @Autowired
    private UserDaoimpl userDao;

//    public UserDaoimpl getUserDao() {
//        return userDao;
//    }
//
//    public void setUserDao(UserDaoimpl userDao) {
//        this.userDao = userDao;
//    }

    @Override
    public void saveUser() {
        userDao.saveUser();
    }
}
