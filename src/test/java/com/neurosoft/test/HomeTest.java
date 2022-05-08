package com.neurosoft.test;

import com.neurosoft.pages.Home;
import org.testng.annotations.Test;

@Test
public class HomeTest {
    Home home=new Home();

    public void testAll1(){
        home.test1();
        home.test2();
        home.test3();
    }
}
