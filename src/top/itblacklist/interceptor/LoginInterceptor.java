package top.itblacklist.interceptor;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LoginInterceptor extends AbstractInterceptor  {

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        Object user = ActionContext.getContext().getSession().get("USER_IN_SESSION");
        if (user == null){
            return Action.LOGIN;
        }
        return actionInvocation.invoke();
    }
}
