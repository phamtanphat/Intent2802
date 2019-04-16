package com.example.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class Manhinh2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinh2);

        //1 : Kiểu chuỗi
        Intent intent = getIntent();
        String chuoi1 = intent.getStringExtra("chuoi");
        Toast.makeText(this, chuoi1, Toast.LENGTH_SHORT).show();
        //2 : Kiểu số
//        Intent intent = getIntent();
//        Integer so = intent.getIntExtra("so1", -1);
//        Toast.makeText(this, so + " ", Toast.LENGTH_SHORT).show();
        //3 : Kiểu Array
//        Intent intent = getIntent();
//        int[] mangso = intent.getIntArrayExtra("mangarray");
//        Toast.makeText(this, mangso.length + " ", Toast.LENGTH_SHORT).show();
    }
}
