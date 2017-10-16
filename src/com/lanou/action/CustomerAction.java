package com.lanou.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by dllo on 17/10/10.
 */
public class CustomerAction extends ActionSupport{

    /** 从 Actionsupport 类继承下来的动作方法
     * 当struts,xml中的action 标签没有匹配method属性会调用的方法
     * **/
    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    /**
     * 从ActionSupport类继承下来的方法
     * 用户表单验证
     * 执行在动作方法前
     * 如果验证失败返回input
     * **/
    @Override
    public void validate() {
        super.validate();
    }
    /**
     * 全局结果集
     * 即当前动作返回的结果在action中没有定义时会去查找package包下的全局结果集中是否有对应的声明,有则直接执行,没有则返回错误
     * **/
    public String customGlobleResult(){
        return ERROR;
    }
}
