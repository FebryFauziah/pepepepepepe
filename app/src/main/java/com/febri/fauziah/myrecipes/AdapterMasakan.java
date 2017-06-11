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
public class AdapterMasakan extends BaseAdapter {
    Context context;

    public AdapterMasakan(Context c){
        context = c;
    }

    public int[] masakan = {
            R.drawable.nasigoreng, R.drawable.rendang, R.drawable.mie,
            R.drawable.sate
    };
    @Override
    public int getCount() {
        return masakan.length;
    }

    @Override
    public Object getItem(int position) {
        return masakan[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ImageView im = new ImageView(context);
        im.setImageResource(masakan[position]);
        im.setScaleType(ImageView.ScaleType.CENTER_CROP);
        im.setLayoutParams(new GridView.LayoutParams(250,250));
        return  im;
    }
}
