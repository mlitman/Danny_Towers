package com.example.dannytowers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    //v is the pointer to the widget that called this method
    //IBAction in IOS
    public void onPressMeButtonClicked(View v)
    {
        ViewGroup tower0 = this.findViewById(R.id.tower0VG);
        ViewGroup landingZone = this.findViewById(R.id.landingZoneVG);
        TextView disk0 = this.findViewById(R.id.disk0);

        tower0.removeViewAt(0);
        landingZone.addView(disk0);

    }
}
