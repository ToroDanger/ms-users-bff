package cl.duoc.ms_users_bff.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import cl.duoc.ms_users_bff.model.dto.UserDTO;

@FeignClient(name = "ms-users-bs", url = "http://localhost:8181")
public interface UserBsFeignClient {

    @GetMapping("users")
    public List<UserDTO> selectAllUsers();
}
