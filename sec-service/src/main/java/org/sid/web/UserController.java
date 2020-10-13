package org.sid.web;

import lombok.Data;
import org.sid.entities.AppUser;
import org.sid.service.AccountService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private AccountService accountService;

    public UserController(AccountService accountService) {
        this.accountService = accountService;
    }
    @PostMapping("/register")
    public AppUser register(@RequestBody UserForm userForm){
        return accountService.saveUser(userForm.getUsername(),userForm.getPwd(),userForm.getPwdC());
    }
}
@Data
class UserForm {
    private String username;
    private String pwd;
    private String pwdC;
}