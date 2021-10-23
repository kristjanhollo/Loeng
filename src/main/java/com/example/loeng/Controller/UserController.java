package com.example.loeng.Controller;



import com.example.loeng.service.UserService;
import com.example.loeng.vo.UserRequestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public void createUser(@RequestBody UserRequestVo userRequestVo) {
        userService.saveUser(userRequestVo);
    }


}
