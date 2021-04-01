package com.example.foodappchef.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodappchef.R;

public class Fragment  extends androidx.fragment.app.Fragment implements OnRecyclerViewItemClickListener {
    RecyclerView recyclerViewHorizontal, recyclerViewVertical;
    Context context;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = getContext();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerViewHorizontal = (RecyclerView) view.findViewById(R.id.home_Horizontal_recyclerView1);
   //     recyclerViewVertical = (RecyclerView) view.findViewById(R.id.home_vertical_recyclerView1);
        recyclerViewHorizontal = view.findViewById(R.id.home_Horizontal_recyclerView1);
        recyclerViewHorizontal.setHasFixedSize(true);
        recyclerViewHorizontal.setLayoutManager(new LinearLayoutManager(view.getContext()));

        return view;

    }

    @Override
    public void onItemClick(int adapterPosition, View view) {

    }
}
