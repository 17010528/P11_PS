package com.example.p11_ps;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ArrayAdapterClass extends ArrayAdapter<String> {
    private Context context;
    private String[] value;
    ImageView iv;
    TextView tv;

    public ArrayAdapterClass(Context context, int resource, String[] values) {
        super(context, resource, values);
        value = values;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.array_row, parent, false);

        iv = rowView.findViewById(R.id.ivData);
        tv = rowView.findViewById(R.id.tvData);
        tv.setText(value[position]);
        String cat =  value[position];

        if (cat.equals("Bio")) {
            iv.setImageResource(R.drawable.info);
        } else if (cat.equals("Anniversary")) {
            iv.setImageResource(R.drawable.anniversary);
        } else if (cat.equals("About Us")){
            iv.setImageResource(R.drawable.aboutus);
        } else {
            iv.setImageResource(R.drawable.vaccation);
        }
        return rowView;
    }
}
