package com.module.action;

import com.module.bean.Myuser;
import com.module.service.UserService;
public class LoginAction extends baseAction
{

    private Myuser myuser;
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    public Myuser getMyuser() {
        return myuser;
    }
    public void setMyuser(Myuser myuser) {
        this.myuser = myuser;
    }
    @Override
    public String execute() throws Exception {

        if(this.userService.login(myuser)){
            return SUCCESS;
        }

        return ERROR;
    }
}
