package com.youth.banner.transformer;

import android.view.View;
import androidx.annotation.NonNull;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;

/* JADX INFO: loaded from: classes3.dex */
public class RotateUpPageTransformer extends BasePageTransformer {
    private static final float DEFAULT_MAX_ROTATE = 15.0f;
    private float mMaxRotate;

    public RotateUpPageTransformer() {
        this.mMaxRotate = DEFAULT_MAX_ROTATE;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(@NonNull View view, float f) {
        if (f < -1.0f) {
            view.setRotation(this.mMaxRotate);
            view.setPivotX(view.getWidth());
            view.setPivotY(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            return;
        }
        if (f > 1.0f) {
            view.setRotation(-this.mMaxRotate);
            view.setPivotX(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            view.setPivotY(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        } else {
            if (f < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                view.setPivotX((((-f) * 0.5f) + 0.5f) * view.getWidth());
                view.setPivotY(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                view.setRotation((-this.mMaxRotate) * f);
                return;
            }
            view.setPivotX((1.0f - f) * view.getWidth() * 0.5f);
            view.setPivotY(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            view.setRotation((-this.mMaxRotate) * f);
        }
    }

    public RotateUpPageTransformer(float f) {
        this.mMaxRotate = f;
    }
}
