package top.itblacklist.modeldriver;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven<User> {

    // 实现modeldriver的方式
    User user = new User();
    @Override
    public User getModel() {
        return user;
    }

    // 实现phone的方式
    private String phone;
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String login() {
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        return SUCCESS;
    }
}
