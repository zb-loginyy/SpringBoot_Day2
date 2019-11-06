package com.baizhi.test;

import com.baizhi.Application;
import com.baizhi.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TestAOP {

    @Autowired
    private UserService userService;

    @Test
    public void  testAOP(){
        /*userService.register();
        userService.delete();*/
        userService.register("小黑","123456");
    }
}
