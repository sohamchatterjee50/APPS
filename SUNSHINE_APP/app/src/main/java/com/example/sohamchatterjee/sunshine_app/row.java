package com.example.sohamchatterjee.sunshine_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by soham on 25-03-2016.
 */
public class row extends ArrayAdapter<String> {

    public row(Context context,String data[])
    {
        super(context,R.layout.rows,data);

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater lf=LayoutInflater.from(getContext());


        View view= lf.inflate(R.layout.rows, parent, false);
     String s=getItem(position);
        TextView tv=(TextView)view.findViewById(R.id.text);







return view;
    }
}
