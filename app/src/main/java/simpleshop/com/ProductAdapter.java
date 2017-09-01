package simpleshop.com;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import simpleshop.com.model.Product;

public class ProductAdapter extends BaseAdapter {
    private LayoutInflater lInflater;
    private List<? extends Product> objects;

    public ProductAdapter(Context ctx, List<? extends Product> objects) {
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
        setTypeText(view, p.getContentType());

        ((TextView) view.findViewById(R.id.tvName)).setText(p.getName());

        return view;
    }

    private void setTypeText(View view, String contenttype) {
        ((TextView) view.findViewById(R.id.tvType)).setText(contenttype);
    }


    private Product getProduct(int position) {
        return ((Product) getItem(position));
    }


}
