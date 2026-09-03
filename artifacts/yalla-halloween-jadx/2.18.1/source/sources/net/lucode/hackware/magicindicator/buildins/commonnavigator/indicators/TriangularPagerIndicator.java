package net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.List;
import p418o0Oo0oo.oo000o;
import p653o0ooOooo.lj;
import p655o0ooo0.o00O0OO0;
import p657o0ooo00o.oO0O000;

/* JADX INFO: loaded from: classes3.dex */
public class TriangularPagerIndicator extends View implements oO0O000 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f26483Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public List<o00O0OO0> f26484Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Paint f26485Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f26486Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public float f26487OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f26488OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f26489OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f26490OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public Path f26491OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public float f26492OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public Interpolator f26493o000oOoO;

    public TriangularPagerIndicator(Context context) {
        super(context);
        this.f26491OoooOO0 = new Path();
        this.f26493o000oOoO = new LinearInterpolator();
        Paint paint = new Paint(1);
        this.f26485Oooo0oO = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f26486Oooo0oo = oo000o.OooO00o(context, 3.0d);
        this.f26488OoooO0 = oo000o.OooO00o(context, 14.0d);
        this.f26489OoooO00 = oo000o.OooO00o(context, 8.0d);
    }

    @Override // p657o0ooo00o.oO0O000
    public final void OooO00o() {
    }

    @Override // p657o0ooo00o.oO0O000
    public final void OooO0O0(List<o00O0OO0> list) {
        this.f26484Oooo0o = list;
    }

    @Override // p657o0ooo00o.oO0O000
    public final void OooO0OO(int i, float f) {
        List<o00O0OO0> list = this.f26484Oooo0o;
        if (list == null || list.isEmpty()) {
            return;
        }
        o00O0OO0 o00o0oo0OooO00o = lj.OooO00o(this.f26484Oooo0o, i);
        o00O0OO0 o00o0oo0OooO00o2 = lj.OooO00o(this.f26484Oooo0o, i + 1);
        int i2 = o00o0oo0OooO00o.f51172OooO00o;
        float f2 = ((o00o0oo0OooO00o.f51174OooO0OO - i2) / 2) + i2;
        int i3 = o00o0oo0OooO00o2.f51172OooO00o;
        this.f26492OoooOOO = (this.f26493o000oOoO.getInterpolation(f) * ((((o00o0oo0OooO00o2.f51174OooO0OO - i3) / 2) + i3) - f2)) + f2;
        invalidate();
    }

    @Override // p657o0ooo00o.oO0O000
    public final void OooO0Oo() {
    }

    public int getLineColor() {
        return this.f26483Oooo;
    }

    public int getLineHeight() {
        return this.f26486Oooo0oo;
    }

    public Interpolator getStartInterpolator() {
        return this.f26493o000oOoO;
    }

    public int getTriangleHeight() {
        return this.f26489OoooO00;
    }

    public int getTriangleWidth() {
        return this.f26488OoooO0;
    }

    public float getYOffset() {
        return this.f26487OoooO;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.f26485Oooo0oO.setColor(this.f26483Oooo);
        if (this.f26490OoooO0O) {
            canvas.drawRect(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, (getHeight() - this.f26487OoooO) - this.f26489OoooO00, getWidth(), ((getHeight() - this.f26487OoooO) - this.f26489OoooO00) + this.f26486Oooo0oo, this.f26485Oooo0oO);
        } else {
            canvas.drawRect(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, (getHeight() - this.f26486Oooo0oo) - this.f26487OoooO, getWidth(), getHeight() - this.f26487OoooO, this.f26485Oooo0oO);
        }
        this.f26491OoooOO0.reset();
        if (this.f26490OoooO0O) {
            this.f26491OoooOO0.moveTo(this.f26492OoooOOO - (this.f26488OoooO0 / 2), (getHeight() - this.f26487OoooO) - this.f26489OoooO00);
            this.f26491OoooOO0.lineTo(this.f26492OoooOOO, getHeight() - this.f26487OoooO);
            this.f26491OoooOO0.lineTo(this.f26492OoooOOO + (this.f26488OoooO0 / 2), (getHeight() - this.f26487OoooO) - this.f26489OoooO00);
        } else {
            this.f26491OoooOO0.moveTo(this.f26492OoooOOO - (this.f26488OoooO0 / 2), getHeight() - this.f26487OoooO);
            this.f26491OoooOO0.lineTo(this.f26492OoooOOO, (getHeight() - this.f26489OoooO00) - this.f26487OoooO);
            this.f26491OoooOO0.lineTo(this.f26492OoooOOO + (this.f26488OoooO0 / 2), getHeight() - this.f26487OoooO);
        }
        this.f26491OoooOO0.close();
        canvas.drawPath(this.f26491OoooOO0, this.f26485Oooo0oO);
    }

    public void setLineColor(int i) {
        this.f26483Oooo = i;
    }

    public void setLineHeight(int i) {
        this.f26486Oooo0oo = i;
    }

    public void setReverse(boolean z) {
        this.f26490OoooO0O = z;
    }

    public void setStartInterpolator(Interpolator interpolator) {
        this.f26493o000oOoO = interpolator;
        if (interpolator == null) {
            this.f26493o000oOoO = new LinearInterpolator();
        }
    }

    public void setTriangleHeight(int i) {
        this.f26489OoooO00 = i;
    }

    public void setTriangleWidth(int i) {
        this.f26488OoooO0 = i;
    }

    public void setYOffset(float f) {
        this.f26487OoooO = f;
    }
}
