package top.itblacklist.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class MainAction extends ActionSupport {

    public void mainAction(){
        System.out.printf("main action");
    }
}
