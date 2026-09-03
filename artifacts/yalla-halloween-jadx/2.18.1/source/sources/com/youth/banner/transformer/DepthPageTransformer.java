package com.youth.banner.transformer;

import android.view.View;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;

/* JADX INFO: loaded from: classes3.dex */
public class DepthPageTransformer extends BasePageTransformer {
    private static final float DEFAULT_MIN_SCALE = 0.75f;
    private float mMinScale;

    public DepthPageTransformer() {
        this.mMinScale = DEFAULT_MIN_SCALE;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(View view, float f) {
        int width = view.getWidth();
        if (f < -1.0f) {
            view.setAlpha(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            return;
        }
        if (f <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            view.setAlpha(1.0f);
            view.setTranslationX(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            return;
        }
        if (f > 1.0f) {
            view.setAlpha(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            return;
        }
        view.setVisibility(0);
        view.setAlpha(1.0f - f);
        view.setTranslationX(width * (-f));
        float f2 = this.mMinScale;
        float fAbs = ((1.0f - Math.abs(f)) * (1.0f - f2)) + f2;
        view.setScaleX(fAbs);
        view.setScaleY(fAbs);
        if (f == 1.0f) {
            view.setVisibility(4);
        }
    }

    public DepthPageTransformer(float f) {
        this.mMinScale = f;
    }
}
