package com.cloudclass.controller;

import com.cloudclass.common.RestResult;
import com.cloudclass.dto.UserDTO;
import com.cloudclass.dto.UserRePasswordDTO;
import com.cloudclass.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author yy
 * @date 2022/3/18 14:54
 */
@RestController
@RequestMapping()
public class UserController {
    @Resource
    private UserService userService;


    @PostMapping("/login")
    RestResult login(@RequestBody UserDTO userDTO) {
        return userService.login(userDTO);
    }

    @PostMapping("/logout")
    RestResult logout(@RequestParam Integer id) {
        return userService.logout(id);
    }

    @PostMapping("/forget")
    RestResult forget(@RequestBody UserRePasswordDTO userRePasswordDTO) {
        return userService.forget(userRePasswordDTO);
    }
}
