package com.youth.banner.transformer;

import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public class AlphaPageTransformer extends BasePageTransformer {
    private static final float DEFAULT_MIN_ALPHA = 0.5f;
    private float mMinAlpha;

    public AlphaPageTransformer() {
        this.mMinAlpha = 0.5f;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(@NonNull View view, float f) {
        view.setScaleX(0.999f);
        if (f < -1.0f) {
            view.setAlpha(this.mMinAlpha);
            return;
        }
        if (f > 1.0f) {
            view.setAlpha(this.mMinAlpha);
            return;
        }
        if (f < 0.0f) {
            float f2 = this.mMinAlpha;
            view.setAlpha(((f + 1.0f) * (1.0f - f2)) + f2);
        } else {
            float f3 = this.mMinAlpha;
            view.setAlpha(((1.0f - f) * (1.0f - f3)) + f3);
        }
    }

    public AlphaPageTransformer(float f) {
        this.mMinAlpha = f;
    }
}
