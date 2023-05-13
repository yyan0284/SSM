package Controller;

import SSM.pojo.Employee;
import Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class EmpCortroller {

    @Autowired
    private EmployeeService employeeService;
    //查询所有的员工信息
    @RequestMapping(value = "/employee",method = RequestMethod.GET)
    public String getAllEmployee(Model model){
        List<Employee> list = employeeService.getAllEmployee();
        //将员工信息在请求域中共享
        model.addAttribute("list",list);
        //跳转到employee_list.html
        return "employee_list";
    }
    //根据ID查寻
    //跳转添加页面
    //添加员工信息
    //修改员工信息
    //删除员工信息


}
