package com.neurosoft.test;


import com.neurosoft.pages.Signout;
import org.testng.annotations.Test;

@Test
public class SignoutTest {
    Signout sign=new Signout();

    public void testAll3(){
        sign.test10();
        sign.test11();
        sign.test12();
    }
}
