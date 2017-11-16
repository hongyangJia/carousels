package com.carousel.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.carousel.carousel.Carousels;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String url_01="http://img1.xiazaizhijia.com/walls/20151216/mid_833ed2e63b5d6fb.jpg";
    private static final String url_02="http://img4.xiazaizhijia.com/walls/20151216/mid_4522b1b011e653a.jpg";
    private static final String url_03="http://img3.xiazaizhijia.com/walls/20160324/mid_16d36c56d13ef7f.jpg";
    private static final String url_04="http://img1.xiazaizhijia.com/walls/20160909/mid_f35e64458b91d62.jpg";
    private static final String url_05="http://img1.xiazaizhijia.com/walls/20160909/mid_f35e64458b91d62.jpg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String [] strings = new String[]{url_01,url_02,url_03,url_04,url_05};
        List<View> list = new ArrayList<>();
        for (String s:strings){
            ImageView imageView = new ImageView(this);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            Glide.with(this).load(s).into(imageView);
            list.add(imageView);
        }

        Carousels carousels = findViewById(R.id.cancel_action);
        carousels.setViews(list);
    }
}
