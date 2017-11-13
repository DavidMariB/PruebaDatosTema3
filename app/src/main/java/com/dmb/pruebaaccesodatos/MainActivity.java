package com.dmb.pruebaaccesodatos;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv2,tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv2 = (TextView)findViewById(R.id.tv2);
        tv3 = (TextView)findViewById(R.id.tv3);
    }

    public void newActivity(View v){
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }

    public void retrieveData(View v){
        SharedPreferences preferences = getSharedPreferences("medic",MODE_PRIVATE);
        String day = preferences.getString("day","day");
        String hour = preferences.getString("hour","hour");

        System.out.print(day);
        System.out.print(hour);

        tv2.setVisibility(View.VISIBLE);
        tv3.setVisibility(View.VISIBLE);
        tv3.setText("El "+day+" a las: "+hour);
    }
}
