package yma.sms.dto;

import lombok.Data;
import yma.sms.entity.User;

@Data
public class RegisterResponse {

    private int id;

    private String username;

    private String email;

    private String password;

    public RegisterResponse(User user) {
        this.id = user.getId();
        this.username = user.getUsername();
    }
}
