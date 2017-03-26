package com.example.borno.fireapp.view.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.borno.fireapp.R;
import com.example.borno.fireapp.view.adapter.PictureAdapterRecyclerView;
import com.example.borno.fireapp.view.model.Task;

import java.util.ArrayList;

public class TasksFragment extends Fragment {
    private OnFragmentInteractionListener listener;

    public static TasksFragment newInstance() {
            return new TasksFragment();
            }

    @Override
    public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tasks, container, false);
        showTolbar("Tareas",false,view);
        RecyclerView tasksRecycler = (RecyclerView) view.findViewById(R.id.pictureRecycler);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        tasksRecycler.setLayoutManager(linearLayoutManager);

        PictureAdapterRecyclerView pictureAdapterRecyclerView = new PictureAdapterRecyclerView(buidTasks(), R.layout.cardview_picture,getActivity());
        tasksRecycler.setAdapter(pictureAdapterRecyclerView);

        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.fabutn);
        fab.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                NewTaskFragment newTaskFragment = new NewTaskFragment();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, newTaskFragment)
                        .addToBackStack(null).commit();
            }
        });

        return view;
    }

    public ArrayList<Task> buidTasks(){
        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(new Task("http://www.v3wall.com/wallpaper/medium/1005/medium_20100514011244339726.jpg","Ir a la escuela","L - M - M - J - V","9:00 - 2 PM","Primaria 1 de Enero"));
        tasks.add(new Task("https://i2.wp.com/maternidadfacil.com/wp-content/uploads/2015/10/alimentos-ninos1.jpg","Ir a comer","Diariamente","3:00 PM","Casa"));
        tasks.add(new Task("http://www.v3wall.com/wallpaper/1600_1200/1005/1600_1200_20100511091721443215.jpg","Hacer la tarea","Diariamente","3:30 PM","Casa"));
        tasks.add(new Task("http://todofondos.com/bin/fondos/03/40/14d.jpg","Salir a jugar","Diariamente","4:30 AM","Casa - Patio trasero"));
        tasks.add(new Task("http://2.bp.blogspot.com/-yVLu6p3FB0A/T8cFgfpo4nI/AAAAAAAAEHY/aRG5qIEK9gU/s1600/456123_390590767644277_62980131_o.jpg","Leer","Diariamente","5:00 AM","Casa"));
        tasks.add(new Task("http://img14.deviantart.net/f48d/i/2012/160/d/7/mario_background_by_dimitry_24-d52v7v2.jpg","Jugar Videojuegos","L - M - V - D","5:30 - 6:30 AM","Casa"));
        return tasks;

    }

    public void showTolbar(String title, boolean upButton, View view){
            Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
            ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
            ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(title);
            ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }

    @Override
    public void onAttach(Context context) {
            super.onAttach(context);
            if (context instanceof OnFragmentInteractionListener) {
            listener = (OnFragmentInteractionListener) context;
            } else {
            throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
            }
            }

    @Override
    public void onDetach() {
            super.onDetach();
            listener = null;
            }

    public interface OnFragmentInteractionListener {
    }

}
