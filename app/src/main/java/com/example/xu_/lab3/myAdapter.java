package com.example.xu_.lab3;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xu_ on 2017/10/23.
 */

public class myAdapter{
    public static void process(Context context, RecyclerView recyclerView){
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        myAdapter adapter = new myAdapter();
        adapter.init(context);


    }
    static class myAdapter extends RecyclerView.Adapter<myAdapter.ViewHolder>{
        private List<String> names;
        public Context context;
        public void init(Context context){
            names = new ArrayList<>();
            this.context = context;
        }
        public void add(final String name){
            names.add(name);
        }
        @Override
        public int getItemsCount(){
            return names.size();
        }
        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
            myAdapter.ViewHolder holder = new myAdapter.ViewHolder(LayoutInflater.from(context).inflate(R.layout.listview_item, parent,false));
            return holder;
        }
    }
}
