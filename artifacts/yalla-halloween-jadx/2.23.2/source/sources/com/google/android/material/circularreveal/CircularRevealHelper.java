package com.google.android.material.circularreveal;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes3.dex */
public final class CircularRevealHelper {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f16315OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final View f16316OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final Paint f16317OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public OooO0O0.OooO0o f16318OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Drawable f16319OooO0o0;

    public interface OooO00o {
        void OooO0OO(Canvas canvas);

        boolean OooO0Oo();
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Strategy {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CircularRevealHelper(OooO00o oooO00o) {
        this.f16315OooO00o = oooO00o;
        View view = (View) oooO00o;
        this.f16316OooO0O0 = view;
        view.setWillNotDraw(false);
        new Path();
        new Paint(7);
        Paint paint = new Paint(1);
        this.f16317OooO0OO = paint;
        paint.setColor(0);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0017  */
    public final void OooO00o(@NonNull Canvas canvas) {
        boolean z;
        OooO0O0.OooO0o oooO0o = this.f16318OooO0Oo;
        boolean z2 = false;
        if (oooO0o == null) {
            z = true;
        } else {
            if (oooO0o.f16328OooO0OO == Float.MAX_VALUE) {
                z = true;
            } else {
                z = false;
            }
        }
        boolean z3 = !z;
        Paint paint = this.f16317OooO0OO;
        OooO00o oooO00o = this.f16315OooO00o;
        View view = this.f16316OooO0O0;
        if (z3) {
            oooO00o.OooO0OO(canvas);
            if (Color.alpha(paint.getColor()) != 0) {
                canvas.drawRect(0.0f, 0.0f, view.getWidth(), view.getHeight(), paint);
            }
        } else {
            oooO00o.OooO0OO(canvas);
            if (Color.alpha(paint.getColor()) != 0) {
                canvas.drawRect(0.0f, 0.0f, view.getWidth(), view.getHeight(), paint);
            }
        }
        Drawable drawable = this.f16319OooO0o0;
        if (drawable != null && this.f16318OooO0Oo != null) {
            z2 = true;
        }
        if (z2) {
            Rect bounds = drawable.getBounds();
            float fWidth = this.f16318OooO0Oo.f16326OooO00o - (bounds.width() / 2.0f);
            float fHeight = this.f16318OooO0Oo.f16327OooO0O0 - (bounds.height() / 2.0f);
            canvas.translate(fWidth, fHeight);
            this.f16319OooO0o0.draw(canvas);
            canvas.translate(-fWidth, -fHeight);
        }
    }

    @ColorInt
    public final int OooO0O0() {
        return this.f16317OooO0OO.getColor();
    }

    @Nullable
    public final OooO0O0.OooO0o OooO0OO() {
        OooO0O0.OooO0o oooO0o = this.f16318OooO0Oo;
        if (oooO0o == null) {
            return null;
        }
        OooO0O0.OooO0o oooO0o2 = new OooO0O0.OooO0o(oooO0o);
        if (oooO0o2.f16328OooO0OO == Float.MAX_VALUE) {
            float f = oooO0o2.f16326OooO00o;
            float f2 = oooO0o2.f16327OooO0O0;
            View view = this.f16316OooO0O0;
            oooO0o2.f16328OooO0OO = o0O00OO.OooO00o.OooO00o(f, f2, view.getWidth(), view.getHeight());
        }
        return oooO0o2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001f  */
    public final boolean OooO0Oo() {
        boolean z;
        if (!this.f16315OooO00o.OooO0Oo()) {
            return false;
        }
        OooO0O0.OooO0o oooO0o = this.f16318OooO0Oo;
        if (oooO0o == null) {
            z = true;
        } else {
            if (oooO0o.f16328OooO0OO == Float.MAX_VALUE) {
                z = true;
            } else {
                z = false;
            }
        }
        return !(z ^ true);
    }

    public final void OooO0o(@ColorInt int i) {
        this.f16317OooO0OO.setColor(i);
        this.f16316OooO0O0.invalidate();
    }

    public final void OooO0o0(@Nullable Drawable drawable) {
        this.f16319OooO0o0 = drawable;
        this.f16316OooO0O0.invalidate();
    }

    public final void OooO0oO(@Nullable OooO0O0.OooO0o oooO0o) {
        View view = this.f16316OooO0O0;
        if (oooO0o == null) {
            this.f16318OooO0Oo = null;
        } else {
            OooO0O0.OooO0o oooO0o2 = this.f16318OooO0Oo;
            if (oooO0o2 == null) {
                this.f16318OooO0Oo = new OooO0O0.OooO0o(oooO0o);
            } else {
                float f = oooO0o.f16326OooO00o;
                float f2 = oooO0o.f16327OooO0O0;
                float f3 = oooO0o.f16328OooO0OO;
                oooO0o2.f16326OooO00o = f;
                oooO0o2.f16327OooO0O0 = f2;
                oooO0o2.f16328OooO0OO = f3;
            }
            if (oooO0o.f16328OooO0OO + 1.0E-4f >= o0O00OO.OooO00o.OooO00o(oooO0o.f16326OooO00o, oooO0o.f16327OooO0O0, (float) view.getWidth(), (float) view.getHeight())) {
                this.f16318OooO0Oo.f16328OooO0OO = Float.MAX_VALUE;
            }
        }
        view.invalidate();
    }
}
