package net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.badge;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.OooO00o;
import p631o0ooO0Oo.o00O000o;
import p631o0ooO0Oo.o00oOoo;
import p632o0ooO0o.o0OO00O;

/* JADX INFO: loaded from: classes5.dex */
public class BadgePagerTitleView extends FrameLayout implements o00oOoo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o00O000o f33722OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f33723OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public View f33724OooO0o0;

    public BadgePagerTitleView(Context context) {
        super(context);
        this.f33723OooO0o = true;
    }

    @Override // p631o0ooO0Oo.o00O000o
    public final void OooO00o(int i, int i2) {
        o00O000o o00o000o2 = this.f33722OooO0Oo;
        if (o00o000o2 != null) {
            o00o000o2.OooO00o(i, i2);
        }
    }

    @Override // p631o0ooO0Oo.o00O000o
    public final void OooO0O0(int i, int i2, float f, boolean z) {
        o00O000o o00o000o2 = this.f33722OooO0Oo;
        if (o00o000o2 != null) {
            o00o000o2.OooO0O0(i, i2, f, z);
        }
    }

    @Override // p631o0ooO0Oo.o00O000o
    public final void OooO0OO(int i, int i2) {
        o00O000o o00o000o2 = this.f33722OooO0Oo;
        if (o00o000o2 != null) {
            o00o000o2.OooO0OO(i, i2);
        }
        if (this.f33723OooO0o) {
            setBadgeView(null);
        }
    }

    @Override // p631o0ooO0Oo.o00O000o
    public final void OooO0Oo(int i, int i2, float f, boolean z) {
        o00O000o o00o000o2 = this.f33722OooO0Oo;
        if (o00o000o2 != null) {
            o00o000o2.OooO0Oo(i, i2, f, z);
        }
    }

    public View getBadgeView() {
        return this.f33724OooO0o0;
    }

    @Override // p631o0ooO0Oo.o00oOoo
    public int getContentBottom() {
        o00O000o o00o000o2 = this.f33722OooO0Oo;
        return o00o000o2 instanceof o00oOoo ? ((o00oOoo) o00o000o2).getContentBottom() : getBottom();
    }

    @Override // p631o0ooO0Oo.o00oOoo
    public int getContentLeft() {
        if (!(this.f33722OooO0Oo instanceof o00oOoo)) {
            return getLeft();
        }
        return ((o00oOoo) this.f33722OooO0Oo).getContentLeft() + getLeft();
    }

    @Override // p631o0ooO0Oo.o00oOoo
    public int getContentRight() {
        if (!(this.f33722OooO0Oo instanceof o00oOoo)) {
            return getRight();
        }
        return ((o00oOoo) this.f33722OooO0Oo).getContentRight() + getLeft();
    }

    @Override // p631o0ooO0Oo.o00oOoo
    public int getContentTop() {
        o00O000o o00o000o2 = this.f33722OooO0Oo;
        return o00o000o2 instanceof o00oOoo ? ((o00oOoo) o00o000o2).getContentTop() : getTop();
    }

    public o00O000o getInnerPagerTitleView() {
        return this.f33722OooO0Oo;
    }

    public o0OO00O getXBadgeRule() {
        return null;
    }

    public o0OO00O getYBadgeRule() {
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Object obj = this.f33722OooO0Oo;
        if (!(obj instanceof View) || this.f33724OooO0o0 == null) {
            return;
        }
        int[] iArr = new int[14];
        View view = (View) obj;
        iArr[0] = view.getLeft();
        iArr[1] = view.getTop();
        iArr[2] = view.getRight();
        iArr[3] = view.getBottom();
        o00O000o o00o000o2 = this.f33722OooO0Oo;
        if (o00o000o2 instanceof o00oOoo) {
            o00oOoo o00oooo2 = (o00oOoo) o00o000o2;
            iArr[4] = o00oooo2.getContentLeft();
            iArr[5] = o00oooo2.getContentTop();
            iArr[6] = o00oooo2.getContentRight();
            iArr[7] = o00oooo2.getContentBottom();
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
        this.f33723OooO0o = z;
    }

    public void setBadgeView(View view) {
        if (this.f33724OooO0o0 == view) {
            return;
        }
        this.f33724OooO0o0 = view;
        removeAllViews();
        if (this.f33722OooO0Oo instanceof View) {
            addView((View) this.f33722OooO0Oo, new FrameLayout.LayoutParams(-1, -1));
        }
        if (this.f33724OooO0o0 != null) {
            addView(this.f33724OooO0o0, new FrameLayout.LayoutParams(-2, -2));
        }
    }

    public void setInnerPagerTitleView(o00O000o o00o000o2) {
        if (this.f33722OooO0Oo == o00o000o2) {
            return;
        }
        this.f33722OooO0Oo = o00o000o2;
        removeAllViews();
        if (this.f33722OooO0Oo instanceof View) {
            addView((View) this.f33722OooO0Oo, new FrameLayout.LayoutParams(-1, -1));
        }
        if (this.f33724OooO0o0 != null) {
            addView(this.f33724OooO0o0, new FrameLayout.LayoutParams(-2, -2));
        }
    }

    public void setXBadgeRule(o0OO00O o0oo00o2) {
    }

    public void setYBadgeRule(o0OO00O o0oo00o2) {
    }
}
