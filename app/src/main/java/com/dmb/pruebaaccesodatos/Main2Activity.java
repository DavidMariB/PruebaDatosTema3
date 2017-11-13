package com.dmb.pruebaaccesodatos;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    private EditText et1,et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);
    }

    public void saveAndExit(View v){
        SharedPreferences preferences = getSharedPreferences("medic",MODE_PRIVATE);
        SharedPreferences.Editor edit = preferences.edit();
        edit.putString("day",et1.getText().toString());
        edit.putString("hour",et2.getText().toString());
        edit.apply();
        this.finish();
    }
}
