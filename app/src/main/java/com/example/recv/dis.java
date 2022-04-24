package com.example.recv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class dis extends AppCompatActivity {
    ImageView iv;
    TextView tv,tv_dis,price;
    Meil m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dis);


        iv=findViewById(R.id.iv2);
        tv=findViewById(R.id.tv2);
        tv_dis=findViewById(R.id.tv_dis);
        price=findViewById(R.id.price);
        m = new Meil();
        m = (Meil) getIntent().getSerializableExtra("data");
        iv.setImageResource(m.getImg());
        tv.setText(m.getName());
        tv_dis.setText(m.getDis());
        price.setText(m.getPrice());
    }
}