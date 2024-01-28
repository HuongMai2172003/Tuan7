package com.example.myapplication.tuan41;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.R;

public class Tuan41MainActivity extends AppCompatActivity {
Button btnGetData;
TextView tvKQ;
Context context=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan41_main);
        Tuan42VolleyFn volleyFn=new Tuan42VolleyFn();
        tvKQ=findViewById(R.id.textView);
        btnGetData=findViewById(R.id.button);
        btnGetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                volleyFn.getJsonArrayOfObject(context,tvKQ);
            }
        });

    }
}