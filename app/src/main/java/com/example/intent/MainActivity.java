package com.example.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnIntentString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnIntentString = findViewById(R.id.buttonString);

        btnIntentString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Manhinh2Activity.class);
                intent.putExtra("chuoi1","abc1");
                intent.putExtra("chuoi2","abc2");
                startActivity(intent);
            }
        });

    }


}
