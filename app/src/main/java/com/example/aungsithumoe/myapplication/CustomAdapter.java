package com.example.aungsithumoe.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by aungsithumoe on 11/4/17.
 */

public class CustomAdapter extends BaseAdapter {
    Context context;
    String[] name;
    int[] img;
    CustomAdapter(Context context,String[] name,int[] img)
    {
        this.context=context;
        this.name=name;
        this.img=img;
    }
    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View row=inflater.inflate(R.layout.custom_adapter,viewGroup,false);
        ImageView image=(ImageView)row.findViewById(R.id.img);
        TextView txtname=(TextView)row.findViewById(R.id.txtname);
        image.setImageResource(img[i]);
        txtname.setText(name[i]);
        return row;
    }
}
