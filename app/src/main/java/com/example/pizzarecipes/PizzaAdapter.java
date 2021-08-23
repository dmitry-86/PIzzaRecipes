package com.example.pizzarecipes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PizzaAdapter extends RecyclerView.Adapter<PizzaAdapter.PizzaViewHolder>{

    private ArrayList<Pizza> pizzas;

    public static class PizzaViewHolder extends RecyclerView.ViewHolder{

        public ImageView imageViewPizza;
        public TextView textViewTitle;
        public TextView textViewDescription;

        public PizzaViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewPizza = itemView.findViewById(R.id.imageViewPizza);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewDescription = itemView.findViewById(R.id.textViewSchortDescription);
        }
    }

    public PizzaAdapter(ArrayList<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    @NonNull
    @Override
    public PizzaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_pizza_item,parent, false);
        return new PizzaViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull PizzaAdapter.PizzaViewHolder holder, int position) {
        Pizza pizza = pizzas.get(position);
        holder.imageViewPizza.setImageResource(pizza.getResId());
        holder.textViewTitle.setText(pizza.getTitle());
        holder.textViewDescription.setText(pizza.getShortDescription());
    }

    @Override
    public int getItemCount() {
        return pizzas.size();
    }

}
