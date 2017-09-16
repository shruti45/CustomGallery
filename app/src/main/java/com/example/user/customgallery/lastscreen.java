package com.example.user.customgallery;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by user on 3/31/2016.
 */
public class lastscreen extends Activity {

    @Override

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.lastscreen);

        Intent in = getIntent();

        String path = in.getStringExtra("path");

        ImageView i = (ImageView) findViewById(R.id.imageView1);

        Bitmap new_image = BitmapFactory.decodeFile(path);

        i.setImageBitmap(new_image);

    }



}