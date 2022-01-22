package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<Friends> FriendsList;

    public MyAdapter(List<Friends> friendsList, Context context) {
        FriendsList = friendsList;
        this.context = context;
    }

    private Context context;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
     View v = LayoutInflater.from(parent.getContext())
             .inflate(R.layout.list_item,parent,false);
     return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Friends friend = FriendsList.get(position);
        holder.textViewName.setText(friend.toString());

    }

    @Override
    public int getItemCount() {
        return FriendsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

       public TextView textViewName;
       public TextView textViewCity;
       public TextView textViewDOB;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewName  = (TextView) itemView.findViewById(R.id.friendNameView);

        }
    }
}
