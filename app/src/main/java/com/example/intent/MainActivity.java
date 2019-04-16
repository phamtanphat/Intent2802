package com.example.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnIntentString,btnIntentInteger,btnIntentArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnIntentString = findViewById(R.id.buttonString);
        btnIntentInteger = findViewById(R.id.buttonInteger);
        btnIntentArray = findViewById(R.id.buttonArray);

        btnIntentString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               chuyenmanhinh("chuoi","abc");
            }
        });
        btnIntentInteger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chuyenmanhinh("so",10);
//                Intent intent = new Intent(MainActivity.this,Manhinh2Activity.class);
//                intent.putExtra("so",10);
//                startActivity(intent);
            }
        });
        btnIntentArray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int[] mangso = {1,2,3,4,5,6,7,8};
//                Intent intent = new Intent(MainActivity.this,Manhinh2Activity.class);
//                intent.putExtra("mangarray",mangso);
//                startActivity(intent);
                chuyenmanhinh("mangarray",mangso);
            }
        });
        //arraylistString
        //object
        //arrayobject
    }
    private <T > void chuyenmanhinh(String tukhoa ,T value  ){
        Intent intent = new Intent(MainActivity.this,Manhinh2Activity.class);
        if (value instanceof String){
//            typecasting
            intent.putExtra(tukhoa , (String) value);
        }else if (value instanceof Integer){
            intent.putExtra(tukhoa , (Integer) value);
        }else if (value instanceof int[]){
            intent.putExtra(tukhoa , (int[]) value);
        }
        startActivity(intent);
    }


}
