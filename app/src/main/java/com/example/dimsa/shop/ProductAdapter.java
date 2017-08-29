package com.example.dimsa.shop;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
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

     //   System.out.println(p.getClass().getSimpleName()+ position);

        if (p.getClass() == ProgrammingBook.class) {
            ProgrammingBook book = (ProgrammingBook) p;
            ((TextView) view.findViewById(R.id.tvType)).setText(book.TYPE);
        } else if (p.getClass() == CookeryBook.class) {
            CookeryBook book = (CookeryBook) p;
            ((TextView) view.findViewById(R.id.tvType)).setText(book.TYPE);
        } else if (p.getClass() == EsotericsBook.class) {
            EsotericsBook book = (EsotericsBook) p;
            ((TextView) view.findViewById(R.id.tvType)).setText(book.TYPE);

        } else if (p.getClass() == VideoDisc.class) {
            VideoDisc book = (VideoDisc) p;
            ((TextView) view.findViewById(R.id.tvType)).setText(book.TYPE);
        } else if (p.getClass() == MusicDisc.class) {
            MusicDisc book = (MusicDisc) p;
            ((TextView) view.findViewById(R.id.tvType)).setText(book.TYPE);
        } else if (p.getClass() == ProgrammingDisc.class) {
            ProgrammingDisc book = (ProgrammingDisc) p;
            ((TextView) view.findViewById(R.id.tvType)).setText(book.TYPE);
        } else ((TextView) view.findViewById(R.id.tvType)).setText("");


        ((TextView) view.findViewById(R.id.tvName)).setText(p.getName());

        return view;
    }


    Product getProduct(int position) {
        return ((Product) getItem(position));
    }


}
