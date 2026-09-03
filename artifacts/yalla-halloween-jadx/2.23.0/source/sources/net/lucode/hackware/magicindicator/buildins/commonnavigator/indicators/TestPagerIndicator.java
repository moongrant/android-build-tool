package net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import p628o0ooO0O.oo000o;
import p631o0ooO0Oo.o00O000;
import p633o0ooO0o0.o0000O00;

/* JADX INFO: loaded from: classes5.dex */
public class TestPagerIndicator extends View implements o00O000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public List<o0000O00> f33685OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Paint f33686OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f33687OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f33688OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final RectF f33689OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final RectF f33690OooO0oo;

    public TestPagerIndicator(Context context) {
        super(context);
        this.f33689OooO0oO = new RectF();
        this.f33690OooO0oo = new RectF();
        Paint paint = new Paint(1);
        this.f33686OooO0Oo = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f33688OooO0o0 = -65536;
        this.f33687OooO0o = -16711936;
    }

    @Override // p631o0ooO0Oo.o00O000
    public final void OooO00o() {
    }

    @Override // p631o0ooO0Oo.o00O000
    public final void OooO0O0(ArrayList arrayList) {
        this.f33685OooO = arrayList;
    }

    @Override // p631o0ooO0Oo.o00O000
    public final void OooO0OO(int i, float f) {
        List<o0000O00> list = this.f33685OooO;
        if (list == null || list.isEmpty()) {
            return;
        }
        o0000O00 o0000o00OooO00o = oo000o.OooO00o(i, this.f33685OooO);
        o0000O00 o0000o00OooO00o2 = oo000o.OooO00o(i + 1, this.f33685OooO);
        RectF rectF = this.f33689OooO0oO;
        int i2 = o0000o00OooO00o.f57126OooO00o;
        rectF.left = ((o0000o00OooO00o2.f57126OooO00o - i2) * f) + i2;
        int i3 = o0000o00OooO00o.f57127OooO0O0;
        rectF.top = ((o0000o00OooO00o2.f57127OooO0O0 - i3) * f) + i3;
        int i4 = o0000o00OooO00o.f57128OooO0OO;
        rectF.right = ((o0000o00OooO00o2.f57128OooO0OO - i4) * f) + i4;
        int i5 = o0000o00OooO00o.f57129OooO0Oo;
        rectF.bottom = ((o0000o00OooO00o2.f57129OooO0Oo - i5) * f) + i5;
        RectF rectF2 = this.f33690OooO0oo;
        int i6 = o0000o00OooO00o.f57131OooO0o0;
        rectF2.left = ((o0000o00OooO00o2.f57131OooO0o0 - i6) * f) + i6;
        int i7 = o0000o00OooO00o.f57130OooO0o;
        rectF2.top = ((o0000o00OooO00o2.f57130OooO0o - i7) * f) + i7;
        int i8 = o0000o00OooO00o.f57132OooO0oO;
        rectF2.right = ((o0000o00OooO00o2.f57132OooO0oO - i8) * f) + i8;
        int i9 = o0000o00OooO00o.f57133OooO0oo;
        rectF2.bottom = ((o0000o00OooO00o2.f57133OooO0oo - i9) * f) + i9;
        invalidate();
    }

    @Override // p631o0ooO0Oo.o00O000
    public final void OooO0Oo() {
    }

    public int getInnerRectColor() {
        return this.f33687OooO0o;
    }

    public int getOutRectColor() {
        return this.f33688OooO0o0;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.f33686OooO0Oo.setColor(this.f33688OooO0o0);
        canvas.drawRect(this.f33689OooO0oO, this.f33686OooO0Oo);
        this.f33686OooO0Oo.setColor(this.f33687OooO0o);
        canvas.drawRect(this.f33690OooO0oo, this.f33686OooO0Oo);
    }

    public void setInnerRectColor(int i) {
        this.f33687OooO0o = i;
    }

    public void setOutRectColor(int i) {
        this.f33688OooO0o0 = i;
    }
}
