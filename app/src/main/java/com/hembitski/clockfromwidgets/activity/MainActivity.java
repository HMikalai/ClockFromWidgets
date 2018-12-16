package com.hembitski.clockfromwidgets.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.hembitski.clockfromwidgets.R;
import com.hembitski.clockfromwidgets.view.ClockItemView;

public class MainActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ClockItemView clockItemView = findViewById(R.id.clockItem);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(v -> clockItemView.moveArrowsOnOff());
//        button.setOnClickListener(v -> clockItemView.setArrayNumber(new Numbers().getNumber1()));

    }

}
