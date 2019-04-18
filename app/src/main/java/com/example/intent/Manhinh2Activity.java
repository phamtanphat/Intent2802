package com.example.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;

public class Manhinh2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinh2);

        //1 : Kiểu chuỗi
//        Intent intent = getIntent();
//        String chuoi1 = intent.getStringExtra("chuoi");
//        Toast.makeText(this, chuoi1, Toast.LENGTH_SHORT).show();
        //2 : Kiểu số
//        Intent intent = getIntent();
//        Integer so = intent.getIntExtra("so", -1);
//        Toast.makeText(this, so + " ", Toast.LENGTH_SHORT).show();
        //3 : Kiểu Array
//        Intent intent = getIntent();
//        int[] mangso = intent.getIntArrayExtra("mangarray");
//        Toast.makeText(this, mangso.length + " ", Toast.LENGTH_SHORT).show();
        //4 : Kiểu Arraylist
//        Intent intent = getIntent();
//        ArrayList<String> mangten = intent.getStringArrayListExtra("arraylist");
//        Log.d("BBB",mangten.size() + "");
        //5 : Kiểu object
//        Intent intent = getIntent();
//        Person person = (Person) intent.getSerializableExtra("object");
//        Log.d("BBB",person.getTen());
        //6 : Kiểu mảng object
        Intent intent = getIntent();
        ArrayList<Animal> manganimal =  intent.getParcelableArrayListExtra("mangobject");
        Log.d("BBB",manganimal.get(0).getTen());
    }
}
