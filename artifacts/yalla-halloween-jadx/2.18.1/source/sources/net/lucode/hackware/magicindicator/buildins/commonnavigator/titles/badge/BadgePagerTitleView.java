package net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.badge;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import p657o0ooo00o.oO0;
import p657o0ooo00o.oO0O000o;
import p658o0ooo0O.o00OO0O0;

/* JADX INFO: loaded from: classes3.dex */
public class BadgePagerTitleView extends FrameLayout implements oO0 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public oO0O000o f26515Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public View f26516Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f26517Oooo0oo;

    public BadgePagerTitleView(Context context) {
        super(context);
        this.f26517Oooo0oo = true;
    }

    @Override // p657o0ooo00o.oO0O000o
    public final void OooO00o(int i, int i2) {
        oO0O000o oo0o000o = this.f26515Oooo0o;
        if (oo0o000o != null) {
            oo0o000o.OooO00o(i, i2);
        }
    }

    @Override // p657o0ooo00o.oO0O000o
    public final void OooO0O0(int i, int i2, float f, boolean z) {
        oO0O000o oo0o000o = this.f26515Oooo0o;
        if (oo0o000o != null) {
            oo0o000o.OooO0O0(i, i2, f, z);
        }
    }

    @Override // p657o0ooo00o.oO0O000o
    public final void OooO0OO(int i, int i2) {
        oO0O000o oo0o000o = this.f26515Oooo0o;
        if (oo0o000o != null) {
            oo0o000o.OooO0OO(i, i2);
        }
        if (this.f26517Oooo0oo) {
            setBadgeView(null);
        }
    }

    @Override // p657o0ooo00o.oO0O000o
    public final void OooO0Oo(int i, int i2, float f, boolean z) {
        oO0O000o oo0o000o = this.f26515Oooo0o;
        if (oo0o000o != null) {
            oo0o000o.OooO0Oo(i, i2, f, z);
        }
    }

    public View getBadgeView() {
        return this.f26516Oooo0oO;
    }

    @Override // p657o0ooo00o.oO0
    public int getContentBottom() {
        oO0O000o oo0o000o = this.f26515Oooo0o;
        return oo0o000o instanceof oO0 ? ((oO0) oo0o000o).getContentBottom() : getBottom();
    }

    @Override // p657o0ooo00o.oO0
    public int getContentLeft() {
        if (!(this.f26515Oooo0o instanceof oO0)) {
            return getLeft();
        }
        return ((oO0) this.f26515Oooo0o).getContentLeft() + getLeft();
    }

    @Override // p657o0ooo00o.oO0
    public int getContentRight() {
        if (!(this.f26515Oooo0o instanceof oO0)) {
            return getRight();
        }
        return ((oO0) this.f26515Oooo0o).getContentRight() + getLeft();
    }

    @Override // p657o0ooo00o.oO0
    public int getContentTop() {
        oO0O000o oo0o000o = this.f26515Oooo0o;
        return oo0o000o instanceof oO0 ? ((oO0) oo0o000o).getContentTop() : getTop();
    }

    public oO0O000o getInnerPagerTitleView() {
        return this.f26515Oooo0o;
    }

    public o00OO0O0 getXBadgeRule() {
        return null;
    }

    public o00OO0O0 getYBadgeRule() {
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Object obj = this.f26515Oooo0o;
        if (!(obj instanceof View) || this.f26516Oooo0oO == null) {
            return;
        }
        int[] iArr = new int[14];
        View view = (View) obj;
        iArr[0] = view.getLeft();
        iArr[1] = view.getTop();
        iArr[2] = view.getRight();
        iArr[3] = view.getBottom();
        oO0O000o oo0o000o = this.f26515Oooo0o;
        if (oo0o000o instanceof oO0) {
            oO0 oo0 = (oO0) oo0o000o;
            iArr[4] = oo0.getContentLeft();
            iArr[5] = oo0.getContentTop();
            iArr[6] = oo0.getContentRight();
            iArr[7] = oo0.getContentBottom();
        } else {
            for (int i5 = 4; i5 < 8; i5++) {
                iArr[i5] = iArr[i5 - 4];
            }
        }
        iArr[8] = view.getWidth() / 2;
        iArr[9] = view.getHeight() / 2;
        iArr[10] = iArr[4] / 2;
        iArr[11] = iArr[5] / 2;
        iArr[12] = ((iArr[2] - iArr[6]) / 2) + iArr[6];
        iArr[13] = ((iArr[3] - iArr[7]) / 2) + iArr[7];
    }

    public void setAutoCancelBadge(boolean z) {
        this.f26517Oooo0oo = z;
    }

    public void setBadgeView(View view) {
        if (this.f26516Oooo0oO == view) {
            return;
        }
        this.f26516Oooo0oO = view;
        removeAllViews();
        if (this.f26515Oooo0o instanceof View) {
            addView((View) this.f26515Oooo0o, new FrameLayout.LayoutParams(-1, -1));
        }
        if (this.f26516Oooo0oO != null) {
            addView(this.f26516Oooo0oO, new FrameLayout.LayoutParams(-2, -2));
        }
    }

    public void setInnerPagerTitleView(oO0O000o oo0o000o) {
        if (this.f26515Oooo0o == oo0o000o) {
            return;
        }
        this.f26515Oooo0o = oo0o000o;
        removeAllViews();
        if (this.f26515Oooo0o instanceof View) {
            addView((View) this.f26515Oooo0o, new FrameLayout.LayoutParams(-1, -1));
        }
        if (this.f26516Oooo0oO != null) {
            addView(this.f26516Oooo0oO, new FrameLayout.LayoutParams(-2, -2));
        }
    }

    public void setXBadgeRule(o00OO0O0 o00oo0o1) {
    }

    public void setYBadgeRule(o00OO0O0 o00oo0o1) {
    }
}
