package com.example.foodappchef.Adapter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodappchef.Fragments.OnRecyclerViewItemClickListener;
import com.example.foodappchef.R;

public class ChefFoodAdapter extends RecyclerView.Adapter<ChefFoodAdapter.ViewHolder> {


    private OnRecyclerViewItemClickListener onRecyclerViewItemClickListener;

    @NonNull
    @Override
    public ChefFoodAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.order_recycler_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChefFoodAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView order_id, food_category_title, food_no_quantities;
        private ImageView food_image;
        private LinearLayout food_category_adapter_layout;

        ViewHolder(View view) {
            super(view);
            order_id = view.findViewById(R.id.order_id);

            food_no_quantities = view.findViewById(R.id.food_no_quantities);
            food_category_title = view.findViewById(R.id.food_category_title);
            food_image = view.findViewById(R.id.food_image);
            food_category_adapter_layout = view.findViewById(R.id.food_category_adapter_layout);

            food_category_adapter_layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    OnRecyclerViewItemClickListener onRecyclerViewItemClickListener = null;
                    if (onRecyclerViewItemClickListener != null) {
                        onRecyclerViewItemClickListener.onItemClick(getAdapterPosition(), view);
                    }
                }
            });
        }
    }


    public void setOnRecyclerViewItemClickListener(OnRecyclerViewItemClickListener onRecyclerViewItemClickListener) {
        this.onRecyclerViewItemClickListener = onRecyclerViewItemClickListener;
    }

}