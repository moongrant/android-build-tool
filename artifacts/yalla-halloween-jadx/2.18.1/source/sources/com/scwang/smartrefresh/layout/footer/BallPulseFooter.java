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
import com.scwang.smartrefresh.layout.internal.InternalAbstract;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import p071o000O0o.OooO0o;
import p167o00Ooo.OooOO0;
import p407o0Oo0OOo.oO000OOo;
import p407o0Oo0OOo.oO000Oo;
import p409o0Oo0Oo0.o0OoOo0;
import p411o0Oo0Ooo.oOo00OO0;
import p586o0oOoo00.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
public class BallPulseFooter extends InternalAbstract implements oO000OOo {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f19594Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f19595OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public Paint f19596OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f19597OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f19598OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public float f19599OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public boolean f19600OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public AccelerateDecelerateInterpolator f19601OoooOOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public long f19602o000oOoO;

    public BallPulseFooter(Context context) {
        this(context, null);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, p407o0Oo0OOo.oO0OOo0o
    public final void OooO(@NonNull oO000Oo oo000oo, int i, int i2) {
        if (this.f19600OoooOOO) {
            return;
        }
        invalidate();
        this.f19600OoooOOO = true;
        this.f19602o000oOoO = System.currentTimeMillis();
        this.f19596OoooO0.setColor(this.f19595OoooO);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, p407o0Oo0OOo.oO0OOo0o
    public final int OooO0O0(@NonNull oO000Oo oo000oo, boolean z) {
        this.f19600OoooOOO = false;
        this.f19602o000oOoO = 0L;
        this.f19596OoooO0.setColor(this.f19598OoooO0O);
        return 0;
    }

    public final BallPulseFooter OooOO0(@ColorInt int i) {
        this.f19598OoooO0O = i;
        this.f19594Oooo = true;
        if (!this.f19600OoooOOO) {
            this.f19596OoooO0.setColor(i);
        }
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        float fMin = Math.min(width, height);
        float f = this.f19599OoooOO0;
        float fOooO00o = OooOO0.OooO00o(f, 2.0f, fMin, 6.0f);
        float f2 = fOooO00o * 2.0f;
        float f3 = (width / 2.0f) - (f + f2);
        float f4 = height / 2.0f;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = 0;
        while (i < 3) {
            int i2 = i + 1;
            long j = (jCurrentTimeMillis - this.f19602o000oOoO) - ((long) (i2 * 120));
            float interpolation = this.f19601OoooOOo.getInterpolation(j > 0 ? (j % 750) / 750.0f : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            canvas.save();
            float f5 = i;
            canvas.translate((this.f19599OoooOO0 * f5) + (f2 * f5) + f3, f4);
            if (interpolation < 0.5d) {
                float f6 = 1.0f - ((interpolation * 2.0f) * 0.7f);
                canvas.scale(f6, f6);
            } else {
                float f7 = ((interpolation * 2.0f) * 0.7f) - 0.4f;
                canvas.scale(f7, f7);
            }
            canvas.drawCircle(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, fOooO00o, this.f19596OoooO0);
            canvas.restore();
            i = i2;
        }
        super.dispatchDraw(canvas);
        if (this.f19600OoooOOO) {
            invalidate();
        }
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, p407o0Oo0OOo.oO0OOo0o
    @Deprecated
    public void setPrimaryColors(@ColorInt int... iArr) {
        if (!this.f19597OoooO00 && iArr.length > 1) {
            int i = iArr[0];
            this.f19595OoooO = i;
            this.f19597OoooO00 = true;
            if (this.f19600OoooOOO) {
                this.f19596OoooO0.setColor(i);
            }
            this.f19597OoooO00 = false;
        }
        if (this.f19594Oooo) {
            return;
        }
        if (iArr.length > 1) {
            OooOO0(iArr[1]);
        } else if (iArr.length > 0) {
            OooOO0(OooO0o.OooO0O0(-1711276033, iArr[0]));
        }
        this.f19594Oooo = false;
    }

    public BallPulseFooter(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f19598OoooO0O = -1118482;
        this.f19595OoooO = -1615546;
        this.f19602o000oOoO = 0L;
        this.f19600OoooOOO = false;
        this.f19601OoooOOo = new AccelerateDecelerateInterpolator();
        setMinimumHeight(oOo00OO0.OooO0OO(60.0f));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0Oo0oo.BallPulseFooter);
        Paint paint = new Paint();
        this.f19596OoooO0 = paint;
        paint.setColor(-1);
        this.f19596OoooO0.setStyle(Paint.Style.FILL);
        this.f19596OoooO0.setAntiAlias(true);
        this.f19667Oooo0oO = o0OoOo0.f39152OooO0Oo;
        this.f19667Oooo0oO = o0OoOo0.f39156OooO0oo[typedArrayObtainStyledAttributes.getInt(o0Oo0oo.BallPulseFooter_srlClassicsSpinnerStyle, 0)];
        int i = o0Oo0oo.BallPulseFooter_srlNormalColor;
        if (typedArrayObtainStyledAttributes.hasValue(i)) {
            OooOO0(typedArrayObtainStyledAttributes.getColor(i, 0));
        }
        int i2 = o0Oo0oo.BallPulseFooter_srlAnimatingColor;
        if (typedArrayObtainStyledAttributes.hasValue(i2)) {
            int color = typedArrayObtainStyledAttributes.getColor(i2, 0);
            this.f19595OoooO = color;
            this.f19597OoooO00 = true;
            if (this.f19600OoooOOO) {
                this.f19596OoooO0.setColor(color);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f19599OoooOO0 = oOo00OO0.OooO0OO(4.0f);
    }
}
