package net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import p633o0ooO0Oo.o0O00;
import p636o0ooO0oO.o0O00o00;
import p637o0ooO0oo.o0O0O0O;

/* JADX INFO: loaded from: classes5.dex */
public class TestPagerIndicator extends View implements o0O00o00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public List<o0O0O0O> f33152OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Paint f33153OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f33154OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f33155OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final RectF f33156OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final RectF f33157OooO0oo;

    public TestPagerIndicator(Context context) {
        super(context);
        this.f33156OooO0oO = new RectF();
        this.f33157OooO0oo = new RectF();
        Paint paint = new Paint(1);
        this.f33153OooO0Oo = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f33155OooO0o0 = -65536;
        this.f33154OooO0o = -16711936;
    }

    @Override // p636o0ooO0oO.o0O00o00
    public final void OooO00o() {
    }

    @Override // p636o0ooO0oO.o0O00o00
    public final void OooO0O0(ArrayList arrayList) {
        this.f33152OooO = arrayList;
    }

    @Override // p636o0ooO0oO.o0O00o00
    public final void OooO0OO(int i, float f) {
        List<o0O0O0O> list = this.f33152OooO;
        if (list == null || list.isEmpty()) {
            return;
        }
        o0O0O0O o0o0o0oOooO00o = o0O00.OooO00o(i, this.f33152OooO);
        o0O0O0O o0o0o0oOooO00o2 = o0O00.OooO00o(i + 1, this.f33152OooO);
        RectF rectF = this.f33156OooO0oO;
        int i2 = o0o0o0oOooO00o.f57700OooO00o;
        rectF.left = ((o0o0o0oOooO00o2.f57700OooO00o - i2) * f) + i2;
        int i3 = o0o0o0oOooO00o.f57701OooO0O0;
        rectF.top = ((o0o0o0oOooO00o2.f57701OooO0O0 - i3) * f) + i3;
        int i4 = o0o0o0oOooO00o.f57702OooO0OO;
        rectF.right = ((o0o0o0oOooO00o2.f57702OooO0OO - i4) * f) + i4;
        int i5 = o0o0o0oOooO00o.f57703OooO0Oo;
        rectF.bottom = ((o0o0o0oOooO00o2.f57703OooO0Oo - i5) * f) + i5;
        RectF rectF2 = this.f33157OooO0oo;
        int i6 = o0o0o0oOooO00o.f57705OooO0o0;
        rectF2.left = ((o0o0o0oOooO00o2.f57705OooO0o0 - i6) * f) + i6;
        int i7 = o0o0o0oOooO00o.f57704OooO0o;
        rectF2.top = ((o0o0o0oOooO00o2.f57704OooO0o - i7) * f) + i7;
        int i8 = o0o0o0oOooO00o.f57706OooO0oO;
        rectF2.right = ((o0o0o0oOooO00o2.f57706OooO0oO - i8) * f) + i8;
        int i9 = o0o0o0oOooO00o.f57707OooO0oo;
        rectF2.bottom = ((o0o0o0oOooO00o2.f57707OooO0oo - i9) * f) + i9;
        invalidate();
    }

    @Override // p636o0ooO0oO.o0O00o00
    public final void OooO0Oo() {
    }

    public int getInnerRectColor() {
        return this.f33154OooO0o;
    }

    public int getOutRectColor() {
        return this.f33155OooO0o0;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.f33153OooO0Oo.setColor(this.f33155OooO0o0);
        canvas.drawRect(this.f33156OooO0oO, this.f33153OooO0Oo);
        this.f33153OooO0Oo.setColor(this.f33154OooO0o);
        canvas.drawRect(this.f33157OooO0oo, this.f33153OooO0Oo);
    }

    public void setInnerRectColor(int i) {
        this.f33154OooO0o = i;
    }

    public void setOutRectColor(int i) {
        this.f33155OooO0o0 = i;
    }
}
