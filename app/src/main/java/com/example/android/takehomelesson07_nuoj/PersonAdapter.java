package com.example.android.takehomelesson07_nuoj;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cherry on 3/25/18.
 */

public class PersonAdapter extends RecyclerView.Adapter<PersonViewHolder> {
    private ArrayList<Person> persons;
    private Context context;

    public PersonAdapter(ArrayList<Person> persons, Context context) {
        this.persons = persons;
        this.context = context;
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_person, parent, false);
        return new PersonViewHolder(view, context);
    }


    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position) {
        Person president = persons.get(position);
        holder.personName.setText(president.getName());
        holder.personInfo.setText(president.getInfo());
        holder.presidentPhoto.setImageResource(president.getPhotoId());
    }

    @Override
    public int getItemCount() {
        return persons.size();
    }

}
