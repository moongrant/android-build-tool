package com.app.base.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import p206o00o0o0o.o000OO0O;

/* JADX INFO: loaded from: classes.dex */
public class FullScreenImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f12024Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f12025OoooO00;

    public FullScreenImageView(Context context) {
        super(context);
        OooO0OO();
    }

    public final void OooO0OO() {
        Context applicationContext = getContext().getApplicationContext();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
        if (windowManager.getDefaultDisplay() == null) {
            this.f12024Oooo = o000OO0O.OooO0oO();
            this.f12025OoooO00 = o000OO0O.OooO0oo();
        } else {
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
            this.f12024Oooo = displayMetrics.heightPixels;
            this.f12025OoooO00 = displayMetrics.widthPixels;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (getDrawable() != null) {
            setMeasuredDimension(this.f12025OoooO00, this.f12024Oooo);
        } else {
            super.onMeasure(this.f12025OoooO00, i2);
        }
    }

    public FullScreenImageView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        OooO0OO();
    }

    public FullScreenImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        OooO0OO();
    }
}
