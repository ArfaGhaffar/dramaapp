package com.example.dramaapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class MyAdapter extends ArrayAdapter<String> {

    Context context;
    String rTitle[];
    String rDescription[];
    int rImgs[];

    MyAdapter (Context c, String title[], String description[], int imgs[]) {
        super(c, R.layout.item_list, R.id.textView1, title);
        this.context = c;
        this.rTitle = title;
        this.rDescription = description;
        this.rImgs = imgs;

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = layoutInflater.inflate(R.layout.item_list, parent, false);
        ImageView images = row.findViewById(R.id.image);
        TextView myTitle = row.findViewById(R.id.textView1);
        TextView myDescription = row.findViewById(R.id.textView2);

        // now set our resources on views
        images.setImageResource(rImgs[position]);
        myTitle.setText(rTitle[position]);
        myDescription.setText(rDescription[position]);




        return row;
    }
}