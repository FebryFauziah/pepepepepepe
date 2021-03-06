package com.febri.fauziah.myrecipes;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Febri on 5/27/2017.
 */
public class AdapterMinuman extends BaseAdapter{
    Context context;

    public AdapterMinuman(Context c) {
        context = c;
    }

    public int[] minuman = {
            R.drawable.bajigur, R.drawable.esbuah
    };
    @Override
    public int getCount() {
        return minuman.length;
    }

    @Override
    public Object getItem(int position) {
        return minuman[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ImageView im = new ImageView(context);
        im.setImageResource(minuman[position]);
        im.setScaleType(ImageView.ScaleType.CENTER_CROP);
        im.setLayoutParams(new GridView.LayoutParams(250,250));
        return  im;
    }
}
