package com.getui.gaoqm;

public class HelloFriend {
    public String sayHelloFriend(String name) {
        Hello hello = new Hello();
        String str = hello.sayHello(name) + " I am " + this.getMyName();
        return str;
    }

    public String getMyName() {
        return "Idea";
    }
}