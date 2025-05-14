package cl.duoc.ms_users_bff.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.ms_users_bff.clients.UserBsFeignClient;
import cl.duoc.ms_users_bff.model.dto.UserDTO;

@Service
public class UserService {

    @Autowired
    UserBsFeignClient userBsFeignClient;

    public List<UserDTO> selectAllUsers(){
        List<UserDTO> listaClientes = userBsFeignClient.selectAllUsers();
        return listaClientes;
    }
}
