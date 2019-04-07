package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button angry_btn=(Button) findViewById(R.id.angry_btn);
        angry_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View argo) {
                Intent i=new Intent(getApplicationContext(),Menu_baru.class);
                startActivity(i);
            }
        });
    }
}
/**
 *Gilang Fahmi Pratama
 101160902
 IF-2
 CHANGE LOG sabtu 6 april 2019 13.11
 1.membuat layout tampilan awal
 2.membuat tampilan ke 2 dan pindah
 */