package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import com.code.android.util.o0000O00;

/* JADX INFO: loaded from: classes5.dex */
public class FullScreenImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f30447OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f30448OooO0o0;

    public FullScreenImageView(Context context) {
        super(context);
        init();
    }

    public final void init() {
        Context applicationContext = getContext().getApplicationContext();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
        if (windowManager.getDefaultDisplay() == null) {
            this.f30447OooO0Oo = o0000O00.OooO00o();
            this.f30448OooO0o0 = o0000O00.OooO0O0();
        } else {
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
            this.f30447OooO0Oo = displayMetrics.heightPixels;
            this.f30448OooO0o0 = displayMetrics.widthPixels;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (getDrawable() != null) {
            setMeasuredDimension(this.f30448OooO0o0, this.f30447OooO0Oo);
        } else {
            super.onMeasure(this.f30448OooO0o0, i2);
        }
    }

    public FullScreenImageView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public FullScreenImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
