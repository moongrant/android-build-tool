package com.youth.banner.indicator;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes4.dex */
public class CircleIndicator extends BaseIndicator {
    private float mNormalRadius;
    private float mSelectedRadius;
    private float maxRadius;

    public CircleIndicator(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int indicatorSize = this.config.getIndicatorSize();
        if (indicatorSize <= 1) {
            return;
        }
        this.mPaint.setColor(this.config.getNormalColor());
        for (int i = 0; i < indicatorSize; i++) {
            canvas.drawCircle(((this.config.getIndicatorSpace() + this.config.getNormalWidth()) * i) + this.maxRadius, this.maxRadius, this.mNormalRadius, this.mPaint);
        }
        this.mPaint.setColor(this.config.getSelectedColor());
        canvas.drawCircle(((this.config.getIndicatorSpace() + this.config.getNormalWidth()) * this.config.getCurrentPosition()) + this.maxRadius, this.maxRadius, this.mSelectedRadius, this.mPaint);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int indicatorSize = this.config.getIndicatorSize();
        if (indicatorSize <= 1) {
            return;
        }
        this.mNormalRadius = this.config.getNormalWidth() / 2.0f;
        float selectedWidth = this.config.getSelectedWidth() / 2.0f;
        this.mSelectedRadius = selectedWidth;
        this.maxRadius = Math.max(selectedWidth, this.mNormalRadius);
        float f = indicatorSize - 1;
        float indicatorSpace = this.config.getIndicatorSpace() * f;
        float f2 = this.maxRadius;
        setMeasuredDimension((int) ((((this.mNormalRadius * f) + f2) * 2.0f) + indicatorSpace), (int) (f2 * 2.0f));
    }

    public CircleIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mNormalRadius = this.config.getNormalWidth() / 2.0f;
        this.mSelectedRadius = this.config.getSelectedWidth() / 2.0f;
    }
}
