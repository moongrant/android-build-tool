package com.youth.banner.transformer;

import android.view.View;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;

/* JADX INFO: loaded from: classes3.dex */
public class ZoomOutPageTransformer extends BasePageTransformer {
    private static final float DEFAULT_MIN_ALPHA = 0.5f;
    private static final float DEFAULT_MIN_SCALE = 0.85f;
    private float mMinAlpha;
    private float mMinScale;

    public ZoomOutPageTransformer() {
        this.mMinScale = DEFAULT_MIN_SCALE;
        this.mMinAlpha = 0.5f;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(View view, float f) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (f < -1.0f) {
            view.setAlpha(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            return;
        }
        if (f > 1.0f) {
            view.setAlpha(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            return;
        }
        float fMax = Math.max(this.mMinScale, 1.0f - Math.abs(f));
        float f2 = 1.0f - fMax;
        float f3 = (height * f2) / 2.0f;
        float f4 = (width * f2) / 2.0f;
        if (f < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            view.setTranslationX(f4 - (f3 / 2.0f));
        } else {
            view.setTranslationX((f3 / 2.0f) + (-f4));
        }
        view.setScaleX(fMax);
        view.setScaleY(fMax);
        float f5 = this.mMinAlpha;
        float f6 = this.mMinScale;
        view.setAlpha(((1.0f - f5) * ((fMax - f6) / (1.0f - f6))) + f5);
    }

    public ZoomOutPageTransformer(float f, float f2) {
        this.mMinScale = f;
        this.mMinAlpha = f2;
    }
}
