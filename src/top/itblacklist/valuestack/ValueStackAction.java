package top.itblacklist.valuestack;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ValueStackAction extends ActionSupport {

    private String username;
    private Integer age;

    @Override
    public String execute() throws Exception {
        username = "111";
        age = 10;

        ActionContext.getContext().put("username", "2222");
        return SUCCESS;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
