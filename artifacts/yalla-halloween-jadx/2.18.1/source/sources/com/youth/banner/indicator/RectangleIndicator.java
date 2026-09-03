package com.youth.banner.indicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;

/* JADX INFO: loaded from: classes3.dex */
public class RectangleIndicator extends BaseIndicator {
    public RectangleIndicator(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int indicatorSize = this.config.getIndicatorSize();
        if (indicatorSize <= 1) {
            return;
        }
        int i = 0;
        float indicatorSpace = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        while (i < indicatorSize) {
            this.mPaint.setColor(this.config.getCurrentPosition() == i ? this.config.getSelectedColor() : this.config.getNormalColor());
            RectF rectF = new RectF(indicatorSpace, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, this.config.getNormalWidth() + indicatorSpace, this.config.getHeight());
            i++;
            indicatorSpace = i * (this.config.getIndicatorSpace() + this.config.getNormalWidth());
            canvas.drawRoundRect(rectF, this.config.getRadius(), this.config.getRadius(), this.mPaint);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int indicatorSize = this.config.getIndicatorSize();
        if (indicatorSize <= 1) {
            return;
        }
        setMeasuredDimension((int) ((this.config.getNormalWidth() * indicatorSize) + (this.config.getIndicatorSpace() * (indicatorSize - 1))), this.config.getHeight());
    }

    public RectangleIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RectangleIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
