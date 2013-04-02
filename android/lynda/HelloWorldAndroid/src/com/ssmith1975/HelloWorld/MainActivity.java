package com.ssmith1975.HelloWorld;

import android.app.Activity;
import android.os.Bundle;
import com.ssmith1975.Cars.*;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Car carOne = new Car();
        Car carTwo = new Car();
        
        carOne.shiftGears(3);
        carOne.accelerateSpeed(15);
        carOne.turnWheel("E");
        
        carTwo.shiftGears(2);
        carTwo.applyBrake(10);
        carTwo.turnWheel("W");
    }
}