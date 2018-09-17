package top.itblacklist.config;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    public void update() throws Exception{
        System.out.println("update");
    }

    public void delete() throws Exception{
        System.out.println("delete");
    }

    public void save() throws Exception{
        System.out.println("save");
    }
}
