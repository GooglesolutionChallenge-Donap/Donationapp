//package com.example.donationapp;
//
//import android.view.ViewGroup;
//import android.widget.ImageView;
//
//import com.smarteist.autoimageslider.SliderViewAdapter;
//
//public class sliderAdapter extends SliderViewAdapter<SliderAdapter.Holder> {
//
//    @Override
//    public SliderAdapter.Holder onCreateViewHolder(ViewGroup parent) {
//        return null;
//    }
//
//    @Override
//    public void onBindViewHolder(SliderAdapter.Holder viewHolder, int position) {
//
//    }
//
//    @Override
//    public int getCount() {
//        return 0;
//    }
//
//    public class Holder extends SliderViewAdapter.ViewHolder{
//          ImageView imgview;
//
//
//    }
//}




package com.example.donationapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.smarteist.autoimageslider.SliderViewAdapter;

public class sliderAdapter extends SliderViewAdapter<sliderAdapter.SliderViewHolder> {


    private int[] images;

    public sliderAdapter(int[] images) {
        this.images = images;
    }


    @Override
    public SliderViewHolder onCreateViewHolder(ViewGroup parent) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.slider_item,null);
        return new SliderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SliderViewHolder viewHolder, int position) {

        viewHolder.imageView.setImageResource(images[position]);

    }

    @Override
    public int getCount() {
        return images.length;
    }

    public class SliderViewHolder extends SliderViewAdapter.ViewHolder{

        private ImageView imageView;

        public SliderViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_view);
        }
    }
}

