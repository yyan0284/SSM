package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWord {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

//    public String getAPI(HttpServletRequest request) {
//        String parameter = request.getParameter("username");
//        String password = request.getParameter("password");
//        System.out.println("username:"+parameter+"password:"+password);
//        return "succrss";
//    }

    @RequestMapping("/test/view")
    public String view() {
        return "succrss";
    }

}
