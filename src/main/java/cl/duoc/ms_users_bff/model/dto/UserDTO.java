package cl.duoc.ms_users_bff.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserDTO {

    private Long id;
    private String username;
    private String name;
    private String surnames;
    private String email;
    private String password;
    private int role;

    
}
