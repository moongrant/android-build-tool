package net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.umeng.analytics.pro.bl;
import java.util.List;
import p653o0ooOooo.lj;
import p655o0ooo0.o00O0OO0;
import p657o0ooo00o.oO0O000;

/* JADX INFO: loaded from: classes3.dex */
public class TestPagerIndicator extends View implements oO0O000 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public RectF f26477Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Paint f26478Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f26479Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f26480Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public List<o00O0OO0> f26481OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public RectF f26482OoooO00;

    public TestPagerIndicator(Context context) {
        super(context);
        this.f26477Oooo = new RectF();
        this.f26482OoooO00 = new RectF();
        Paint paint = new Paint(1);
        this.f26478Oooo0o = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f26479Oooo0oO = bl.a;
        this.f26480Oooo0oo = -16711936;
    }

    @Override // p657o0ooo00o.oO0O000
    public final void OooO00o() {
    }

    @Override // p657o0ooo00o.oO0O000
    public final void OooO0O0(List<o00O0OO0> list) {
        this.f26481OoooO0 = list;
    }

    @Override // p657o0ooo00o.oO0O000
    public final void OooO0OO(int i, float f) {
        List<o00O0OO0> list = this.f26481OoooO0;
        if (list == null || list.isEmpty()) {
            return;
        }
        o00O0OO0 o00o0oo0OooO00o = lj.OooO00o(this.f26481OoooO0, i);
        o00O0OO0 o00o0oo0OooO00o2 = lj.OooO00o(this.f26481OoooO0, i + 1);
        RectF rectF = this.f26477Oooo;
        int i2 = o00o0oo0OooO00o.f51172OooO00o;
        rectF.left = ((o00o0oo0OooO00o2.f51172OooO00o - i2) * f) + i2;
        int i3 = o00o0oo0OooO00o.f51173OooO0O0;
        rectF.top = ((o00o0oo0OooO00o2.f51173OooO0O0 - i3) * f) + i3;
        int i4 = o00o0oo0OooO00o.f51174OooO0OO;
        rectF.right = ((o00o0oo0OooO00o2.f51174OooO0OO - i4) * f) + i4;
        int i5 = o00o0oo0OooO00o.f51175OooO0Oo;
        rectF.bottom = ((o00o0oo0OooO00o2.f51175OooO0Oo - i5) * f) + i5;
        RectF rectF2 = this.f26482OoooO00;
        int i6 = o00o0oo0OooO00o.f51177OooO0o0;
        rectF2.left = ((o00o0oo0OooO00o2.f51177OooO0o0 - i6) * f) + i6;
        int i7 = o00o0oo0OooO00o.f51176OooO0o;
        rectF2.top = ((o00o0oo0OooO00o2.f51176OooO0o - i7) * f) + i7;
        int i8 = o00o0oo0OooO00o.f51178OooO0oO;
        rectF2.right = ((o00o0oo0OooO00o2.f51178OooO0oO - i8) * f) + i8;
        int i9 = o00o0oo0OooO00o.f51179OooO0oo;
        rectF2.bottom = ((o00o0oo0OooO00o2.f51179OooO0oo - i9) * f) + i9;
        invalidate();
    }

    @Override // p657o0ooo00o.oO0O000
    public final void OooO0Oo() {
    }

    public int getInnerRectColor() {
        return this.f26480Oooo0oo;
    }

    public int getOutRectColor() {
        return this.f26479Oooo0oO;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.f26478Oooo0o.setColor(this.f26479Oooo0oO);
        canvas.drawRect(this.f26477Oooo, this.f26478Oooo0o);
        this.f26478Oooo0o.setColor(this.f26480Oooo0oo);
        canvas.drawRect(this.f26482OoooO00, this.f26478Oooo0o);
    }

    public void setInnerRectColor(int i) {
        this.f26480Oooo0oo = i;
    }

    public void setOutRectColor(int i) {
        this.f26479Oooo0oO = i;
    }
}
