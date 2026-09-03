package net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.badge;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.OooO00o;
import p636o0ooO0oO.o0O00oO0;
import p636o0ooO0oO.o0oO0Ooo;
import p640o0ooOO0O.o00OO000;

/* JADX INFO: loaded from: classes5.dex */
public class BadgePagerTitleView extends FrameLayout implements o0oO0Ooo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o0O00oO0 f33189OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f33190OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public View f33191OooO0o0;

    public BadgePagerTitleView(Context context) {
        super(context);
        this.f33190OooO0o = true;
    }

    @Override // p636o0ooO0oO.o0O00oO0
    public final void OooO00o(int i, int i2) {
        o0O00oO0 o0o00oo1 = this.f33189OooO0Oo;
        if (o0o00oo1 != null) {
            o0o00oo1.OooO00o(i, i2);
        }
    }

    @Override // p636o0ooO0oO.o0O00oO0
    public final void OooO0O0(int i, int i2, float f, boolean z) {
        o0O00oO0 o0o00oo1 = this.f33189OooO0Oo;
        if (o0o00oo1 != null) {
            o0o00oo1.OooO0O0(i, i2, f, z);
        }
    }

    @Override // p636o0ooO0oO.o0O00oO0
    public final void OooO0OO(int i, int i2) {
        o0O00oO0 o0o00oo1 = this.f33189OooO0Oo;
        if (o0o00oo1 != null) {
            o0o00oo1.OooO0OO(i, i2);
        }
        if (this.f33190OooO0o) {
            setBadgeView(null);
        }
    }

    @Override // p636o0ooO0oO.o0O00oO0
    public final void OooO0Oo(int i, int i2, float f, boolean z) {
        o0O00oO0 o0o00oo1 = this.f33189OooO0Oo;
        if (o0o00oo1 != null) {
            o0o00oo1.OooO0Oo(i, i2, f, z);
        }
    }

    public View getBadgeView() {
        return this.f33191OooO0o0;
    }

    @Override // p636o0ooO0oO.o0oO0Ooo
    public int getContentBottom() {
        o0O00oO0 o0o00oo1 = this.f33189OooO0Oo;
        return o0o00oo1 instanceof o0oO0Ooo ? ((o0oO0Ooo) o0o00oo1).getContentBottom() : getBottom();
    }

    @Override // p636o0ooO0oO.o0oO0Ooo
    public int getContentLeft() {
        if (!(this.f33189OooO0Oo instanceof o0oO0Ooo)) {
            return getLeft();
        }
        return ((o0oO0Ooo) this.f33189OooO0Oo).getContentLeft() + getLeft();
    }

    @Override // p636o0ooO0oO.o0oO0Ooo
    public int getContentRight() {
        if (!(this.f33189OooO0Oo instanceof o0oO0Ooo)) {
            return getRight();
        }
        return ((o0oO0Ooo) this.f33189OooO0Oo).getContentRight() + getLeft();
    }

    @Override // p636o0ooO0oO.o0oO0Ooo
    public int getContentTop() {
        o0O00oO0 o0o00oo1 = this.f33189OooO0Oo;
        return o0o00oo1 instanceof o0oO0Ooo ? ((o0oO0Ooo) o0o00oo1).getContentTop() : getTop();
    }

    public o0O00oO0 getInnerPagerTitleView() {
        return this.f33189OooO0Oo;
    }

    public o00OO000 getXBadgeRule() {
        return null;
    }

    public o00OO000 getYBadgeRule() {
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Object obj = this.f33189OooO0Oo;
        if (!(obj instanceof View) || this.f33191OooO0o0 == null) {
            return;
        }
        int[] iArr = new int[14];
        View view = (View) obj;
        iArr[0] = view.getLeft();
        iArr[1] = view.getTop();
        iArr[2] = view.getRight();
        iArr[3] = view.getBottom();
        o0O00oO0 o0o00oo1 = this.f33189OooO0Oo;
        if (o0o00oo1 instanceof o0oO0Ooo) {
            o0oO0Ooo o0oo0ooo2 = (o0oO0Ooo) o0o00oo1;
            iArr[4] = o0oo0ooo2.getContentLeft();
            iArr[5] = o0oo0ooo2.getContentTop();
            iArr[6] = o0oo0ooo2.getContentRight();
            iArr[7] = o0oo0ooo2.getContentBottom();
        } else {
            for (int i5 = 4; i5 < 8; i5++) {
                iArr[i5] = iArr[i5 - 4];
            }
        }
        iArr[8] = view.getWidth() / 2;
        iArr[9] = view.getHeight() / 2;
        iArr[10] = iArr[4] / 2;
        iArr[11] = iArr[5] / 2;
        int i6 = iArr[6];
        iArr[12] = OooO00o.OooO00o(iArr[2], i6, 2, i6);
        int i7 = iArr[7];
        iArr[13] = OooO00o.OooO00o(iArr[3], i7, 2, i7);
    }

    public void setAutoCancelBadge(boolean z) {
        this.f33190OooO0o = z;
    }

    public void setBadgeView(View view) {
        if (this.f33191OooO0o0 == view) {
            return;
        }
        this.f33191OooO0o0 = view;
        removeAllViews();
        if (this.f33189OooO0Oo instanceof View) {
            addView((View) this.f33189OooO0Oo, new FrameLayout.LayoutParams(-1, -1));
        }
        if (this.f33191OooO0o0 != null) {
            addView(this.f33191OooO0o0, new FrameLayout.LayoutParams(-2, -2));
        }
    }

    public void setInnerPagerTitleView(o0O00oO0 o0o00oo1) {
        if (this.f33189OooO0Oo == o0o00oo1) {
            return;
        }
        this.f33189OooO0Oo = o0o00oo1;
        removeAllViews();
        if (this.f33189OooO0Oo instanceof View) {
            addView((View) this.f33189OooO0Oo, new FrameLayout.LayoutParams(-1, -1));
        }
        if (this.f33191OooO0o0 != null) {
            addView(this.f33191OooO0o0, new FrameLayout.LayoutParams(-2, -2));
        }
    }

    public void setXBadgeRule(o00OO000 o00oo001) {
    }

    public void setYBadgeRule(o00OO000 o00oo001) {
    }
}
