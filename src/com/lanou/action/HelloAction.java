package com.lanou.action;

/**
 * Created by dllo on 17/10/10.
 */
public class HelloAction {

    /**
     * 动作方法
     * 访问权限必须是public,struts2 才能访问到该方法
     * 返回类型必须是 String, 代表该动作执行之后的结果
     * @return
     */
    public String sayHello(){
        System.out.println("该动作执行了!");
        return "success";
    }
}
