package net.lucode.hackware.magicindicator.buildins.commonnavigator.titles;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import p418o0Oo0oo.oo000o;
import p657o0ooo00o.oO0;

/* JADX INFO: loaded from: classes3.dex */
public class ClipPagerTitleView extends View implements oO0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f26504Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public String f26505Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f26506Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f26507Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public Paint f26508OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public float f26509OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public Rect f26510OoooO0O;

    public ClipPagerTitleView(Context context) {
        super(context);
        this.f26510OoooO0O = new Rect();
        int iOooO00o = oo000o.OooO00o(context, 16.0d);
        Paint paint = new Paint(1);
        this.f26508OoooO0 = paint;
        paint.setTextSize(iOooO00o);
        int iOooO00o2 = oo000o.OooO00o(context, 10.0d);
        setPadding(iOooO00o2, 0, iOooO00o2, 0);
    }

    @Override // p657o0ooo00o.oO0O000o
    public final void OooO00o(int i, int i2) {
    }

    @Override // p657o0ooo00o.oO0O000o
    public final void OooO0O0(int i, int i2, float f, boolean z) {
        this.f26504Oooo = z;
        this.f26509OoooO00 = f;
        invalidate();
    }

    @Override // p657o0ooo00o.oO0O000o
    public final void OooO0OO(int i, int i2) {
    }

    @Override // p657o0ooo00o.oO0O000o
    public final void OooO0Oo(int i, int i2, float f, boolean z) {
        this.f26504Oooo = !z;
        this.f26509OoooO00 = 1.0f - f;
        invalidate();
    }

    public int getClipColor() {
        return this.f26507Oooo0oo;
    }

    @Override // p657o0ooo00o.oO0
    public int getContentBottom() {
        Paint.FontMetrics fontMetrics = this.f26508OoooO0.getFontMetrics();
        return (int) (((fontMetrics.bottom - fontMetrics.top) / 2.0f) + (getHeight() / 2));
    }

    @Override // p657o0ooo00o.oO0
    public int getContentLeft() {
        int iWidth = this.f26510OoooO0O.width();
        return ((getWidth() / 2) + getLeft()) - (iWidth / 2);
    }

    @Override // p657o0ooo00o.oO0
    public int getContentRight() {
        int iWidth = this.f26510OoooO0O.width();
        return (iWidth / 2) + (getWidth() / 2) + getLeft();
    }

    @Override // p657o0ooo00o.oO0
    public int getContentTop() {
        Paint.FontMetrics fontMetrics = this.f26508OoooO0.getFontMetrics();
        return (int) ((getHeight() / 2) - ((fontMetrics.bottom - fontMetrics.top) / 2.0f));
    }

    public String getText() {
        return this.f26505Oooo0o;
    }

    public int getTextColor() {
        return this.f26506Oooo0oO;
    }

    public float getTextSize() {
        return this.f26508OoooO0.getTextSize();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width = (getWidth() - this.f26510OoooO0O.width()) / 2;
        Paint.FontMetrics fontMetrics = this.f26508OoooO0.getFontMetrics();
        int height = (int) (((getHeight() - fontMetrics.bottom) - fontMetrics.top) / 2.0f);
        this.f26508OoooO0.setColor(this.f26506Oooo0oO);
        float f = width;
        float f2 = height;
        canvas.drawText(this.f26505Oooo0o, f, f2, this.f26508OoooO0);
        canvas.save();
        if (this.f26504Oooo) {
            canvas.clipRect(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, getWidth() * this.f26509OoooO00, getHeight());
        } else {
            canvas.clipRect((1.0f - this.f26509OoooO00) * getWidth(), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, getWidth(), getHeight());
        }
        this.f26508OoooO0.setColor(this.f26507Oooo0oo);
        canvas.drawText(this.f26505Oooo0o, f, f2, this.f26508OoooO0);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        Paint paint = this.f26508OoooO0;
        String str = this.f26505Oooo0o;
        paint.getTextBounds(str, 0, str == null ? 0 : str.length(), this.f26510OoooO0O);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(getPaddingRight() + getPaddingLeft() + this.f26510OoooO0O.width(), size);
        } else if (mode == 0) {
            size = getPaddingRight() + getPaddingLeft() + this.f26510OoooO0O.width();
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPaddingBottom() + getPaddingTop() + this.f26510OoooO0O.height(), size2);
        } else if (mode2 == 0) {
            size2 = getPaddingBottom() + getPaddingTop() + this.f26510OoooO0O.height();
        }
        setMeasuredDimension(size, size2);
    }

    public void setClipColor(int i) {
        this.f26507Oooo0oo = i;
        invalidate();
    }

    public void setText(String str) {
        this.f26505Oooo0o = str;
        requestLayout();
    }

    public void setTextColor(int i) {
        this.f26506Oooo0oO = i;
        invalidate();
    }

    public void setTextSize(float f) {
        this.f26508OoooO0.setTextSize(f);
        requestLayout();
    }
}
