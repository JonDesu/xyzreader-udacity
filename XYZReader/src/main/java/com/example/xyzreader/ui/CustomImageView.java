package com.example.xyzreader.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

//replace height with two-thirds the width size
public class CustomImageView extends ImageView {
    public CustomImageView(Context context) {
        super(context);
    }

    public CustomImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthSpec, int heightSpec) {
        int twoThirdsHeight = MeasureSpec.getSize(widthSpec)*2/3;
        int twoThirdsHieghtSpec =
                MeasureSpec.makeMeasureSpec(twoThirdsHeight, MeasureSpec.EXACTLY);
        super.onMeasure(widthSpec,twoThirdsHieghtSpec);
    }
}
