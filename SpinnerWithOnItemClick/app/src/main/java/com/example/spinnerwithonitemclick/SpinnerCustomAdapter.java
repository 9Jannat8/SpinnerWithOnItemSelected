package com.example.spinnerwithonitemclick;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class SpinnerCustomAdapter extends BaseAdapter {

    String[] countryNames;
     String[] population;
    int[] flags;
    Context context;
    private LayoutInflater layoutInflater;

    public SpinnerCustomAdapter(Context context, int[] flags, String[] countryNames, String[] population) {
        this.context = context;
        this.flags = flags;
        this.countryNames = countryNames;
        this.population = population;
    }

    @Override
    public int getCount() {
        return countryNames.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {

            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.spinner_onclick_listener, null, false);

        }

        ImageView imageView = convertView.findViewById(R.id.imgId);
        imageView.setImageResource(flags[position]);

        TextView country = convertView.findViewById(R.id.txtsmId1);
        country.setText(countryNames[position]);

        TextView populations = convertView.findViewById(R.id.txtsmId2);
        populations.setText(population[position]);

        return convertView;
    }
}
