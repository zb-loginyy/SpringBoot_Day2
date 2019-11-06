package com.baizhi.test;

import com.baizhi.entity.User;
import org.junit.Test;

public class TestLombok {

    @Test
    public  void   test1(){
        User user = new User();
        User user1 = new User("1", "张三", "123456", 18);
        System.out.println(user1);
    }
}
