package com.example.dimsa.shop;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ProductAdapter extends BaseAdapter {
    Context ctx;
    LayoutInflater lInflater;
    ArrayList<? extends Product> objects;

    public ProductAdapter(Context ctx, ArrayList<? extends Product> objects) {
        this.ctx = ctx;
        this.objects = objects;
        lInflater = (LayoutInflater) ctx
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return objects.size();
    }

    @Override
    public Object getItem(int position) {
        return objects.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = lInflater.inflate(R.layout.list_item, parent, false);
        }

        Product p = getProduct(position);

        ((TextView) view.findViewById(R.id.tvName)).setText(p.getName());
        ((TextView) view.findViewById(R.id.tvPrice)).setText(p.getPrice() + "");

        return view;
    }

    Product getProduct(int position) {
        return ((Product) getItem(position));
    }


}
