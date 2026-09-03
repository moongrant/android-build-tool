package net.lucode.hackware.magicindicator.buildins.commonnavigator.titles;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import o0OO0.OooO0o;
import p636o0ooO0oO.o0oO0Ooo;

/* JADX INFO: loaded from: classes5.dex */
public class ClipPagerTitleView extends View implements o0oO0Ooo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public Paint f33179OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f33180OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f33181OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f33182OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f33183OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f33184OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Rect f33185OooOO0;

    public ClipPagerTitleView(Context context) {
        super(context);
        this.f33185OooOO0 = new Rect();
        int iOooO0O0 = OooO0o.OooO0O0(context, 16.0d);
        Paint paint = new Paint(1);
        this.f33179OooO = paint;
        paint.setTextSize(iOooO0O0);
        int iOooO0O1 = OooO0o.OooO0O0(context, 10.0d);
        setPadding(iOooO0O1, 0, iOooO0O1, 0);
    }

    @Override // p636o0ooO0oO.o0O00oO0
    public final void OooO00o(int i, int i2) {
    }

    @Override // p636o0ooO0oO.o0O00oO0
    public final void OooO0O0(int i, int i2, float f, boolean z) {
        this.f33183OooO0oO = z;
        this.f33184OooO0oo = f;
        invalidate();
    }

    @Override // p636o0ooO0oO.o0O00oO0
    public final void OooO0OO(int i, int i2) {
    }

    @Override // p636o0ooO0oO.o0O00oO0
    public final void OooO0Oo(int i, int i2, float f, boolean z) {
        this.f33183OooO0oO = !z;
        this.f33184OooO0oo = 1.0f - f;
        invalidate();
    }

    public int getClipColor() {
        return this.f33181OooO0o;
    }

    @Override // p636o0ooO0oO.o0oO0Ooo
    public int getContentBottom() {
        Paint.FontMetrics fontMetrics = this.f33179OooO.getFontMetrics();
        return (int) (((fontMetrics.bottom - fontMetrics.top) / 2.0f) + (getHeight() / 2));
    }

    @Override // p636o0ooO0oO.o0oO0Ooo
    public int getContentLeft() {
        int iWidth = this.f33185OooOO0.width();
        return ((getWidth() / 2) + getLeft()) - (iWidth / 2);
    }

    @Override // p636o0ooO0oO.o0oO0Ooo
    public int getContentRight() {
        int iWidth = this.f33185OooOO0.width();
        return (iWidth / 2) + (getWidth() / 2) + getLeft();
    }

    @Override // p636o0ooO0oO.o0oO0Ooo
    public int getContentTop() {
        Paint.FontMetrics fontMetrics = this.f33179OooO.getFontMetrics();
        return (int) ((getHeight() / 2) - ((fontMetrics.bottom - fontMetrics.top) / 2.0f));
    }

    public String getText() {
        return this.f33180OooO0Oo;
    }

    public int getTextColor() {
        return this.f33182OooO0o0;
    }

    public float getTextSize() {
        return this.f33179OooO.getTextSize();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width = (getWidth() - this.f33185OooOO0.width()) / 2;
        Paint.FontMetrics fontMetrics = this.f33179OooO.getFontMetrics();
        int height = (int) (((getHeight() - fontMetrics.bottom) - fontMetrics.top) / 2.0f);
        this.f33179OooO.setColor(this.f33182OooO0o0);
        float f = width;
        float f2 = height;
        canvas.drawText(this.f33180OooO0Oo, f, f2, this.f33179OooO);
        canvas.save();
        if (this.f33183OooO0oO) {
            canvas.clipRect(0.0f, 0.0f, getWidth() * this.f33184OooO0oo, getHeight());
        } else {
            canvas.clipRect((1.0f - this.f33184OooO0oo) * getWidth(), 0.0f, getWidth(), getHeight());
        }
        this.f33179OooO.setColor(this.f33181OooO0o);
        canvas.drawText(this.f33180OooO0Oo, f, f2, this.f33179OooO);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        Paint paint = this.f33179OooO;
        String str = this.f33180OooO0Oo;
        int length = str == null ? 0 : str.length();
        Rect rect = this.f33185OooOO0;
        paint.getTextBounds(str, 0, length, rect);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(getPaddingRight() + getPaddingLeft() + rect.width(), size);
        } else if (mode == 0) {
            size = getPaddingRight() + getPaddingLeft() + rect.width();
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPaddingBottom() + getPaddingTop() + rect.height(), size2);
        } else if (mode2 == 0) {
            size2 = getPaddingBottom() + getPaddingTop() + rect.height();
        }
        setMeasuredDimension(size, size2);
    }

    public void setClipColor(int i) {
        this.f33181OooO0o = i;
        invalidate();
    }

    public void setText(String str) {
        this.f33180OooO0Oo = str;
        requestLayout();
    }

    public void setTextColor(int i) {
        this.f33182OooO0o0 = i;
        invalidate();
    }

    public void setTextSize(float f) {
        this.f33179OooO.setTextSize(f);
        requestLayout();
    }
}
