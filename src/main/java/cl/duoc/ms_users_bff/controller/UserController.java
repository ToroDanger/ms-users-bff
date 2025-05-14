package cl.duoc.ms_users_bff.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.ms_users_bff.model.dto.UserDTO;
import cl.duoc.ms_users_bff.service.UserService;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<UserDTO> selectAllUsers(){
        return userService.selectAllUsers();
    }
}
