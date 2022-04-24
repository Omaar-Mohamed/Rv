package com.example.recv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv=findViewById(R.id.rec);

        ArrayList<Meil>meils=new ArrayList<>();
        meils.add(new Meil(R.drawable.pizzza,"pizzza","its a gragjiajfjagiaj","20$"));
        meils.add(new Meil(R.drawable.pizzza2,"pizzza2","dddddddddddddddddddddddddddddddd","25$"));
        meils.add(new Meil(R.drawable.burger,"burgeer","burgeeeeeeeeeeeeer1","15$"));
        meils.add(new Meil(R.drawable.burger2,"burgeer2","basic one","12$"));




        RecyclerViewAdapter adapter=new RecyclerViewAdapter(meils);
        RecyclerView.LayoutManager lm=new GridLayoutManager(this,2);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(lm);
        rv.setAdapter(adapter);
    }
}