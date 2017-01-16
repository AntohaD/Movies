package com.anton.dzherdzh.movies;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class FullImageActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.full_image);

        Intent intent = getIntent();
        int position = intent.getExtras().getInt("id");

        ImageView imageView = (ImageView) findViewById(R.id.full_image_view);
        imageView.setImageResource(position);
    }
}
