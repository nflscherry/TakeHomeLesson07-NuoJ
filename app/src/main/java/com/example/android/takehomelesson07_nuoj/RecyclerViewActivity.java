package com.example.android.takehomelesson07_nuoj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    private ArrayList <Person> presidents;
    private PersonAdapter adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        initialData();

        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new PersonAdapter(presidents,this);
        recyclerView.setAdapter(adapter);

    }

    private void initialData(){
        presidents = new ArrayList<>();
        presidents.add(new Person("Bill Clinton", "1993-2001",R.drawable.clinton));
        presidents.add(new Person("George W.Bush", "2001-2009", R.drawable.bush));
        presidents.add(new Person("Barack Obama", "2009-2017", R.drawable.obama));
    }

    private Person getRandomPerson(){
        int num = (int)(Math.random() * 3);
        if (num == 0){
            return new Person("Bill Clinton", "1993-2001", R.drawable.clinton);
        }
        else if (num == 1){
            return new Person("Barack Obama", "2009-2017", R.drawable.obama);
        }
        else{
            return new Person("George W. Bush", "2001-2009", R.drawable.bush);
        }
    }

    private void Add(View view){
        presidents.add(getRandomPerson());
        adapter.notifyDataSetChanged();
    }
}
