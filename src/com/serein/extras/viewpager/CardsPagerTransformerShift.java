package com.serein.extras.viewpager;

import android.support.v4.view.ViewPager;
import android.view.View;

public class CardsPagerTransformerShift implements ViewPager.PageTransformer {

    private int baseElevation;
    private int raisingElevation;
    private float smallerScale;
    private float startOffset;

    public CardsPagerTransformerShift(int baseElevation, int raisingElevation, float smallerScale, float startOffset) {
        this.baseElevation = baseElevation;
        this.raisingElevation = raisingElevation;
        this.smallerScale = smallerScale;
        this.startOffset = startOffset;
    }

    @Override
    public void transformPage(View page, float position) {
        float absPosition = Math.abs(position - startOffset);

        if (absPosition >= 1) {
            page.setElevation(baseElevation);
            page.setScaleY(smallerScale);
        } else {
            // This will be during transformation
            page.setElevation(((1 - absPosition) * raisingElevation + baseElevation));
            page.setScaleY((smallerScale - 1) * absPosition + 1);
        }
    }

}
