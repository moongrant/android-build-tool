package com.scwang.smartrefresh.layout.footer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.graphics.colorspace.OooO00o;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.internal.InternalAbstract;
import o0OO0o.OooO0o;
import o0OO0o.OooOOO0;
import o0OO0oO0.OooO0O0;
import p052o00000oO.OooOO0;
import p333o0OO0o0o.OooOOO;
import p335o0OO0oOo.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
public class BallPulseFooter extends InternalAbstract implements OooO0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Paint f21409OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f21410OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f21411OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f21412OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f21413OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final float f21414OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f21415OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public long f21416OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final AccelerateDecelerateInterpolator f21417OooOOOO;

    public BallPulseFooter(Context context) {
        this(context, null);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, o0OO0o.OooOO0
    public final int OooO0Oo(@NonNull SmartRefreshLayout smartRefreshLayout, boolean z) {
        this.f21415OooOOO = false;
        this.f21416OooOOO0 = 0L;
        this.f21409OooO.setColor(this.f21412OooOO0);
        return 0;
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, o0OO0o.OooOO0
    public final void OooO0oo(@NonNull OooOOO0 oooOOO0, int i, int i2) {
        if (this.f21415OooOOO) {
            return;
        }
        invalidate();
        this.f21415OooOOO = true;
        this.f21416OooOOO0 = System.currentTimeMillis();
        this.f21409OooO.setColor(this.f21413OooOO0O);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        float fMin = Math.min(width, height);
        float f = this.f21414OooOO0o;
        float fOooO00o = OooO00o.OooO00o(f, 2.0f, fMin, 6.0f);
        float f2 = fOooO00o * 2.0f;
        float f3 = (width / 2.0f) - (f2 + f);
        float f4 = height / 2.0f;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = 0;
        while (i < 3) {
            int i2 = i + 1;
            long j = (jCurrentTimeMillis - this.f21416OooOOO0) - ((long) (i2 * 120));
            float interpolation = this.f21417OooOOOO.getInterpolation(j > 0 ? (j % 750) / 750.0f : 0.0f);
            canvas.save();
            float f5 = i;
            canvas.translate((f5 * f) + (f2 * f5) + f3, f4);
            if (interpolation < 0.5d) {
                float f6 = 1.0f - ((interpolation * 2.0f) * 0.7f);
                canvas.scale(f6, f6);
            } else {
                float f7 = ((interpolation * 2.0f) * 0.7f) - 0.4f;
                canvas.scale(f7, f7);
            }
            canvas.drawCircle(0.0f, 0.0f, fOooO00o, this.f21409OooO);
            canvas.restore();
            i = i2;
        }
        super.dispatchDraw(canvas);
        if (this.f21415OooOOO) {
            invalidate();
        }
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, o0OO0o.OooOO0
    @Deprecated
    public void setPrimaryColors(@ColorInt int... iArr) {
        boolean z = this.f21411OooO0oo;
        Paint paint = this.f21409OooO;
        if (!z && iArr.length > 1) {
            int i = iArr[0];
            this.f21413OooOO0O = i;
            this.f21411OooO0oo = true;
            if (this.f21415OooOOO) {
                paint.setColor(i);
            }
            this.f21411OooO0oo = false;
        }
        if (this.f21410OooO0oO) {
            return;
        }
        if (iArr.length > 1) {
            int i2 = iArr[1];
            this.f21412OooOO0 = i2;
            this.f21410OooO0oO = true;
            if (!this.f21415OooOOO) {
                paint.setColor(i2);
            }
        } else if (iArr.length > 0) {
            int iOooO0OO = OooOO0.OooO0OO(-1711276033, iArr[0]);
            this.f21412OooOO0 = iOooO0OO;
            this.f21410OooO0oO = true;
            if (!this.f21415OooOOO) {
                paint.setColor(iOooO0OO);
            }
        }
        this.f21410OooO0oO = false;
    }

    public BallPulseFooter(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f21412OooOO0 = -1118482;
        this.f21413OooOO0O = -1615546;
        this.f21416OooOOO0 = 0L;
        this.f21415OooOOO = false;
        this.f21417OooOOOO = new AccelerateDecelerateInterpolator();
        setMinimumHeight(OooOo00.OooO0OO(60.0f));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooOOO.BallPulseFooter);
        Paint paint = new Paint();
        this.f21409OooO = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.f21483OooO0o0 = OooO0O0.f43237OooO0Oo;
        this.f21483OooO0o0 = OooO0O0.f43241OooO0oo[typedArrayObtainStyledAttributes.getInt(OooOOO.BallPulseFooter_srlClassicsSpinnerStyle, 0)];
        int i = OooOOO.BallPulseFooter_srlNormalColor;
        if (typedArrayObtainStyledAttributes.hasValue(i)) {
            int color = typedArrayObtainStyledAttributes.getColor(i, 0);
            this.f21412OooOO0 = color;
            this.f21410OooO0oO = true;
            if (!this.f21415OooOOO) {
                paint.setColor(color);
            }
        }
        int i2 = OooOOO.BallPulseFooter_srlAnimatingColor;
        if (typedArrayObtainStyledAttributes.hasValue(i2)) {
            int color2 = typedArrayObtainStyledAttributes.getColor(i2, 0);
            this.f21413OooOO0O = color2;
            this.f21411OooO0oo = true;
            if (this.f21415OooOOO) {
                paint.setColor(color2);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f21414OooOO0o = OooOo00.OooO0OO(4.0f);
    }
}
