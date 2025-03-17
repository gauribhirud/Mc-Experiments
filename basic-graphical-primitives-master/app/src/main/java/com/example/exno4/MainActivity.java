package com.example.exno4;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Creating a Bitmap
        Bitmap bg = Bitmap.createBitmap(720, 1280, Bitmap.Config.ARGB_8888);

        // Setting the Bitmap as background for the ImageView
        ImageView i = findViewById(R.id.imageView);
        i.setImageBitmap(bg); // ✅ Fixed here!

        // Creating the Canvas Object
        Canvas canvas = new Canvas(bg);

        // Creating the Paint Object and set its color & TextSize
        Paint paint = new Paint();
        paint.setColor(Color.rgb(255, 122, 160));  // Soft nude pink 🎀

        canvas.drawColor(Color.rgb(255, 245, 248));  // Light nude pink aesthetic 🎀🤍


        paint.setTextSize(50);

        // Creating a Paint object for text
        Paint textPaint = new Paint();
        textPaint.setColor(Color.parseColor("#ff7aa0")); // Soft nude pink color 🎀
        textPaint.setTextSize(50); // Adjust the text size
        textPaint.setAntiAlias(true);
        textPaint.setTextAlign(Paint.Align.CENTER); // Center alignment

// Getting the center position
        int centerX = bg.getWidth() / 2; // Canvas width divided by 2
        int centerY = 100; // Adjust this for perfect top placement

// Draw the name at the center
        canvas.drawText("tejashree", centerX, centerY, textPaint);


        // To draw a Rectangle
        canvas.drawText("Rectangle", 420, 150, paint);
        canvas.drawRect(400, 200, 650, 700, paint);

        // To draw a Circle
        canvas.drawText("Circle", 120, 150, paint);
        canvas.drawCircle(200, 350, 150, paint);

        // To draw a Square
        canvas.drawText("Square", 120, 800, paint);
        canvas.drawRect(50, 850, 350, 1150, paint);

        // To draw a Line
        canvas.drawText("Line", 480, 800, paint);
        canvas.drawLine(520, 850, 520, 1150, paint);
    }
}

