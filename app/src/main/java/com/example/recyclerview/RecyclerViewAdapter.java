package com.example.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter {
    private static final String TAG = "Cannot invoke method length() on null object";
    public class viewHolder extends RecyclerView.ViewHolder{
        TextView imagename;
        CircleImageView image;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image_name);
        }
    }
}
