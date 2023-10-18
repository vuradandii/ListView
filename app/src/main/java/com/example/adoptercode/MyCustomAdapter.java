package com.example.adoptercode;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

public class MyCustomAdapter extends BaseAdapter {

    private Context context;
    private String[] item;

    public MyCustomAdapter(Context context, String[] item) {
        this.context = context;
        this.item = item;

    }

    @Override
    public int getCount() {
        return item.length;
    }

    @Override
    public Object getItem(int position) {
        return item[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;
        if (convertView == null) {

            convertView = LayoutInflater.from(context).inflate(R.layout.my_list_item, parent, false);
            holder = new ViewHolder();
            holder.textView = convertView.findViewById(R.id.textview);
            convertView.setTag(holder);
        } else {

            holder = (ViewHolder) convertView.getTag();

        }

        holder.textView.setText(item[position]);

        return convertView;


    }
    static class ViewHolder {
            TextView textView;
    }
}

