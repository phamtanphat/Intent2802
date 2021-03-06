package com.example.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    Button btnIntentString,btnIntentInteger,btnIntentArray,btnArrayList,btnObject,btnArraylistObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnIntentString = findViewById(R.id.buttonString);
        btnIntentInteger = findViewById(R.id.buttonInteger);
        btnIntentArray = findViewById(R.id.buttonArray);
        btnArrayList = findViewById(R.id.buttonArrayList);
        btnObject = findViewById(R.id.buttonObject);
        btnArraylistObject = findViewById(R.id.buttonArraylistobject);

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
        btnArrayList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<String> mangten = new ArrayList<>(Arrays.asList("Teo","Ti","Tun"));
                chuyenmanhinh("arraylist",mangten);
            }
        });
        btnObject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Person person = new Person("Teo","20");
                Intent intent = new Intent(MainActivity.this,Manhinh2Activity.class);
                intent.putExtra("object",  person);
                startActivity(intent);
            }
        });
        btnArraylistObject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<Animal> mangthucung = new ArrayList<>();
                mangthucung.add(new Animal("Meo","5"));
                mangthucung.add(new Animal("Ca","2"));

                Intent intent = new Intent(MainActivity.this,Manhinh2Activity.class);
                intent.putExtra("mangobject",  mangthucung);
                startActivity(intent);

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
        }else if(value instanceof  ArrayList<?>){
            if(value instanceof Object){
                intent.putExtra(tukhoa ,(ArrayList<String>) value);
            }
        }
        startActivity(intent);
    }


}
