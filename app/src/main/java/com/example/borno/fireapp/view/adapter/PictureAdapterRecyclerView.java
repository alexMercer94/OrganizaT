package com.example.borno.fireapp.view.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.borno.fireapp.R;
import com.example.borno.fireapp.view.model.Task;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by borno on 20/03/2017.
 */

public class PictureAdapterRecyclerView extends RecyclerView.Adapter<PictureAdapterRecyclerView.PictureViewHolder> {

    private ArrayList<Task> tasks;
    private int resource;
    private Activity activity;

    public PictureAdapterRecyclerView(ArrayList<Task> task, int resource, Activity activity) {
        this.tasks = task;
        this.resource = resource;
        this.activity = activity;
    }

    @Override
    public PictureViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(resource, parent, false);
        return new PictureViewHolder(view);
    }

    //Lista de elementos
    //paso de datos a la lista d elementos
    @Override
    public void onBindViewHolder(PictureViewHolder holder, int position) {
        Task task = tasks.get(position);
        holder.nameTaskCard.setText(task.getTaskname());
        holder.dateTaskCard.setText(task.getTaskdate());
        holder.timeTaskCard.setText(task.getTaskTime());
        holder.placeTaskeCard.setText(task.getTaskPlace());
        Picasso.with(activity).load(task.getPicture()).into(holder.pictureCard);
    }

    @Override
    public int getItemCount() {
        return tasks.size();
    }

    public class PictureViewHolder extends RecyclerView.ViewHolder{

        private ImageView pictureCard;
        private TextView nameTaskCard;
        private TextView dateTaskCard;
        private TextView timeTaskCard;
        private TextView placeTaskeCard;

        public PictureViewHolder(View itemView) {
            super(itemView);

            pictureCard = (ImageView) itemView.findViewById(R.id.picture_Card);
            nameTaskCard = (TextView) itemView.findViewById(R.id.taskNameCard);
            dateTaskCard = (TextView) itemView.findViewById(R.id.date);
            timeTaskCard = (TextView) itemView.findViewById(R.id.time);
            placeTaskeCard = (TextView) itemView.findViewById(R.id.place);
        }
    }
}
