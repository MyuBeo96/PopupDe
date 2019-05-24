package com.myubeo.popupde;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyView> {

    private List<String> list;

    public class MyView extends RecyclerView.ViewHolder {

        public TextView textView;

        public MyView(View view) {
            super(view);

            textView = (TextView) view.findViewById(R.id.textview1);

        }
    }


    public RecyclerViewAdapter(List<String> horizontalList) {
        this.list = horizontalList;
    }

    @NonNull
    @Override
    public MyView onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.horizontal_item, viewGroup, false);

        return new MyView(itemView);
    }

    @Override
    public void onBindViewHolder(final MyView holder, final int position) {

        holder.textView.setText(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

}