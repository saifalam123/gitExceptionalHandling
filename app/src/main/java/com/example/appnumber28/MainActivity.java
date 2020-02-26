package com.example.appnumber28;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtDesktopComputer = (TextView)findViewById(R.id.txtDesktopComputer);
        TextView txtLaptopComputer = (TextView)findViewById(R.id.txtLaptopComputer);
        TextView txtSmartPhoneComputer = (TextView)findViewById(R.id.txtSmartPhoneComputer);
        TextView txtTabletComputer = (TextView)findViewById(R.id.txtTabletComputer);

        TextView txtDesktopComputerPerformance = (TextView)findViewById(R.id.DesktopComputerPerformance);
        TextView txtLaptopComputerPerformance = (TextView)findViewById(R.id.txtLaptopComputerPerformance);
        TextView txtSmartPhoneComputerPerformance = (TextView)findViewById(R.id.txtSmartPhoneComputerPerformance);
        TextView txtTabletComputerPerformance = (TextView)findViewById(R.id.txtTabletComputerPerformance);

        DesktopComputer myDesktopComputer = new DesktopComputer("Mac book pro" , "high" , "Virtual" , "Virtual 1" ,2000.0 , 1500.0);
        LaptopComputer myLaptopComputer = new LaptopComputer("iMac" , "Low" , "Non" , "Non Virtual" , "Yes" , 1200.0 , 1000.0);
        SmartPhone mySmartPhoneComputer = new SmartPhone("iphone" , "high", "qwerty" , "iOS" , 1000.0 , 2000.0);
        TabletComputer myTabletComputer = new TabletComputer("Samsung" , "High" , "qwerty" , "Andriod" , 1200.0 , 1000.0 , 6);

        txtDesktopComputerPerformance.setText("Performance " + myDesktopComputer.evalutePerformance());
        txtLaptopComputerPerformance.setText("Performance " + myLaptopComputer.evalutePerformance());
        txtSmartPhoneComputerPerformance.setText("Performance" + mySmartPhoneComputer.evalutePerformance());
        txtTabletComputerPerformance.setText("Performance" + myTabletComputer.evalutePerformance());

        // Array of abstract class computer

        Computer[] computers = new Computer[4];
        computers[0] = myDesktopComputer;
        computers[1] = myLaptopComputer;
        computers[2] = mySmartPhoneComputer;
        computers[3] = myTabletComputer;


        // For loop
        for (Computer computer : computers)
        {

            // instanceof means checking that is this a type of this or not?
            // computer is the object of the Computer Class and instanceof means checking if DesktopComputer is part of Computer Class through its object "computer"
            if (computer instanceof DesktopComputer)
            {
                DesktopComputer currentDesktopComputer = (DesktopComputer) computer; // Casting DesktopComputer to 'computer' the object of SuperClass Computer!
                txtDesktopComputer.setText(currentDesktopComputer.toString());
            }
            if (computer instanceof LaptopComputer)
            {
                LaptopComputer currentLaptopComputer = (LaptopComputer) computer;
                txtLaptopComputer.setText(currentLaptopComputer.toString());
            }
            if (computer instanceof SmartPhone) // computers[3] = myTabletComputer; Jab is ki bari ayegi tou yeh true hojayegi kyun kay TabletComputer extends Smartphone tou kahin in ka relationship hai ek dosre se
                // computers[2] = mySmartPhoneComputer; Jab yeh condition check hogi tou true
            { // computers[2] = mySmartPhoneComputer; Jan baari ayegi computer instance of TabletComputer ki tou bhi yeh true hojayega.

                //computers[3] = myTabletComputer; or jese hee uper wala check or true ho kay neche ayega tou yeh wala false hojayega ot phir wo (Computer instanceof TabletComputer) main chala jayega.
                if (!(computer instanceof TabletComputer))
                {
                SmartPhone currentSmartPhone = (SmartPhone) computer;
                txtSmartPhoneComputer.setText(currentSmartPhone.toString());
                }
            }
            if (computer instanceof TabletComputer)
            {
                TabletComputer currentTabletComputer = (TabletComputer) computer;
                txtTabletComputer.setText(currentTabletComputer.toString());
            }
        }


    }


}
