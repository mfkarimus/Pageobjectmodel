package com.neurosoft.test;


import com.neurosoft.pages.Login;
import org.testng.annotations.Test;

@Test
public class LoginTest {
    Login log=new Login();

    public void testAll2(){
        log.test4();
        log.test5();
        log.test6();
    }
}
