package com.example.xyzreader.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

//replace frame layout width with 3/2 times the height
public class CustomFrameLayout extends FrameLayout {

    public CustomFrameLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomFrameLayout(Context context) {
        super(context);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightSpec) {
        int threeTwoWidth = MeasureSpec.getSize(heightSpec) * 3/2;
        int threeTwoWidthSpec =
                MeasureSpec.makeMeasureSpec(threeTwoWidth, MeasureSpec.EXACTLY);
        super.onMeasure(threeTwoWidthSpec,heightSpec);
    }
}
