package com.softpian.carouselrecyclerview;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class CarouselLayoutManager extends LinearLayoutManager {

    public CarouselLayoutManager(Context context, int orientation, boolean reverseLayout) {
        super(context, orientation, reverseLayout);
    }

    @Override
    public int scrollHorizontallyBy(int dx, RecyclerView.Recycler recycler, RecyclerView.State state) {

        int orientation = getOrientation();

        if (orientation == HORIZONTAL) {
            int scrolled = super.scrollHorizontallyBy(dx, recycler, state);

            float minifyAmount = 0.25f;
            float minifyDistance = 0.75f;

            float parentMidpoint = getWidth() / 2.f;
            float d0 = 0.f;
            float d1 = parentMidpoint * minifyDistance;
            float s0 = 1.f;
            float s1 = 1.f - minifyAmount;

            for (int i = 0; i < getChildCount(); i++) {
                View child = getChildAt(i);

                float childMidpoint = (getDecoratedLeft(child) + getDecoratedRight(child)) / 2.f;
                float d = Math.min(d1, Math.abs(parentMidpoint - childMidpoint));
                float scaleFactor = s0 + (s1 - s0) * (d - d0) / (d1 - d0);

                child.setScaleX(scaleFactor);
                child.setScaleY(scaleFactor);
            }

            return scrolled;
        } else {
            return 0;
        }
    }

    @Override
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        super.onLayoutChildren(recycler, state);

        scrollHorizontallyBy(0, recycler, state);
    }
}
