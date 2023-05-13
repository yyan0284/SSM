package Service.impl;

import SSM.pojo.Employee;
import Service.EmployeeService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public List<Employee> getAllEmployee() {
        return null;
    }
}
