package com.google.android.gms.samples.vision.ocrreader;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;

import com.google.android.gms.samples.vision.ocrreader.ui.camera.GraphicOverlay;

/**
 * Created by Administrator on 25.10.17.
 */

public class BorderGraphic extends GraphicOverlay.Graphic  {
    private int mBoxWidth, mBoxHeight;

    public BorderGraphic(GraphicOverlay overlay, int boxWidth, int boxHeight) {
        super(overlay);
        mBoxWidth = boxWidth;
        mBoxHeight = boxHeight;
    }

    @Override
    public void draw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(Color.rgb(0, 0, 0));
        paint.setStrokeWidth(10);
        paint.setStyle(Paint.Style.STROKE);

        int width = canvas.getWidth();
        int height = canvas.getHeight();
//        Log.w("Canvas width", String.valueOf(width));
//        Log.w("Canvas height", String.valueOf(height));
        int right = (width / 2) + (mBoxWidth / 2);
        int left = (width / 2) - (mBoxWidth / 2);
        int bottom = (height / 2) + (mBoxHeight / 2);
        int top = (height / 2) - (mBoxHeight / 2);
        canvas.drawRect(left, top, right, bottom, paint);
    }

    @Override
    public boolean contains(float x, float y) {
        return false;
    }
}
