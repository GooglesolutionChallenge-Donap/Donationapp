package com.example.donationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class donorhomepage extends AppCompatActivity {
SliderView slider;
int[] images ={
        R.drawable.pic2,
        R.drawable.pic04,
        R.drawable.pic6,
        R.drawable.pic8
};
    private sliderAdapter adapter;
    private SliderView sliderView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donorhomepage);

        //changing statusbar color
        statusbar.blackiconstatusbar(donorhomepage.this,R.color.light_bg);

        //image slider

        slider=findViewById(R.id.donorhomepage_slider);
        adapter = new sliderAdapter(images);
        sliderView.setSliderAdapter(adapter);
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.DROP);
        sliderView.startAutoCycle();
    }
}