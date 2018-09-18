package top.itblacklist.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String execute(){
        if ("admin".equals(username)){
            ActionContext.getContext().getSession().put("USER_IN_SESSION", username);
            return SUCCESS;
        }
        return LOGIN;
    }
}
