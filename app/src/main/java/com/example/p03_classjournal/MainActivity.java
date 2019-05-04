package com.example.p03_classjournal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCode=findViewById(R.id.textViewCode);

        //Set listener to handle the clicking of cos tv
        tvCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create module object of grade and year
                Module c347=new Module("c347","B",1);

                Intent i=new Intent(MainActivity.this,ResultActivity.class);
                //Put Module object in Intent
                i.putExtra("module",c347);
                //StartActivit
                startActivity(i);


            }
        });
    }
}
