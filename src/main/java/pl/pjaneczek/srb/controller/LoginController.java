package pl.pjaneczek.srb.controller;

import com.google.gson.Gson;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.pjaneczek.srb.model.Users;
import pl.pjaneczek.srb.service.UserService;

@Controller
@RequestMapping("/login")
public class LoginController {

//    @RequestMapping(value = "/authenticate.do", method = RequestMethod.POST)
//    public @ResponseBody
//    String login(@RequestParam("username") final String username, @RequestParam("password") final String password) {
//
//        GenericResponse genericResponse = new GenericResponse();
//        Gson gson = new Gson();
//
//        if (username.equals("pawel") && password.equals("password")) {
//            genericResponse.setMsg("Logowanie zakończone powodzeniem");
//            genericResponse.setSuccess(true);
//        } else {
//            genericResponse.setMsg("Błąd logowania");
//            genericResponse.setSuccess(false);
//        }
//
//        String json = gson.toJson(genericResponse);
//        return json;
//    }
    @Autowired
    private UserService userService;
    
    @RequestMapping(value = "/authenticate.do", method = RequestMethod.POST)
    Users getUser(@RequestParam("username") String username) {
        return userService.findByUserName(username);
    }
    
}
