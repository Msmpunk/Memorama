package com.example.mario.energru;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.UsersViewHolder> {

    private ArrayList<Usuario> list;

    private Context context;


    public UsersAdapter(ArrayList<Usuario> list) {
        this.list = list;
    }

    @Override
    public UsersViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_row,parent,false);
        return new UsersViewHolder(v);
    }

    @Override
    public void onBindViewHolder(UsersViewHolder holder, int position) {
        final Usuario user = list.get(position);
        holder.tvName.setText(user.getNickname());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class UsersViewHolder extends RecyclerView.ViewHolder {

        TextView tvName;
        TextView tvScore;

        public UsersViewHolder(View itemView) {
            super(itemView);
            tvName = (TextView) itemView.findViewById(R.id.user_name_);
            tvScore = (TextView) itemView.findViewById(R.id.user_score_);
        }

    }

}
