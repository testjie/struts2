package top.itblacklist.model;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

    private User user ;

    public String login(){
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        return SUCCESS;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
