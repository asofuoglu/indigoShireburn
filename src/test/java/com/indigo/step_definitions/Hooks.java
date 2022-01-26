package com.indigo.step_definitions;

import com.indigo.utilities.Driver;
import com.indigo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setup(){
        Driver.get().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Driver.get().manage().window().maximize();
    }
    @After
    public void teardown(){
        Driver.closeDriver();
    }



}
