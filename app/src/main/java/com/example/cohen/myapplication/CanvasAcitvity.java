package com.example.cohen.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.LinearLayout;

public class CanvasAcitvity extends ActionBarActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas_acitvity);

        Paint paint=new Paint();
        paint.setColor(Color.parseColor("#CD5C5C"));
        Bitmap bg=Bitmap.createBitmap(480,800,Bitmap.Config.ARGB_8888);
        Canvas canvas=new Canvas(bg);
        canvas.drawCircle(100,100,30,paint);

        LinearLayout linearLayout=(LinearLayout) findViewById(R.id.rect);
        linearLayout.setBackgroundDrawable(new BitmapDrawable(bg));

    }
}
