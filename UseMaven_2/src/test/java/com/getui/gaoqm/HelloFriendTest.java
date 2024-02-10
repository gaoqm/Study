package com.getui.gaoqm;

import org.junit.Test;

public class HelloFriendTest {
    @Test
    public void testHelloTest() {
        HelloFriend helloFriend = new HelloFriend();
        String results = helloFriend.sayHelloFriend("Maven");
        System.out.println(results);
    }
}