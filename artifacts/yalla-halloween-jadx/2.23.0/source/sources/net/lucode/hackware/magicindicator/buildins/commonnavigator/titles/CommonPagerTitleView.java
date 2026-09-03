package net.lucode.hackware.magicindicator.buildins.commonnavigator.titles;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p631o0ooO0Oo.o00oOoo;

/* JADX INFO: loaded from: classes5.dex */
public class CommonPagerTitleView extends FrameLayout implements o00oOoo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO0O0 f33719OooO0Oo;

    public interface OooO00o {
    }

    public interface OooO0O0 {
        void OooO00o();

        void OooO0O0();

        void OooO0OO();

        void OooO0Oo();
    }

    public CommonPagerTitleView(Context context) {
        super(context);
    }

    @Override // p631o0ooO0Oo.o00O000o
    public final void OooO00o(int i, int i2) {
        OooO0O0 oooO0O0 = this.f33719OooO0Oo;
        if (oooO0O0 != null) {
            oooO0O0.OooO0Oo();
        }
    }

    @Override // p631o0ooO0Oo.o00O000o
    public final void OooO0O0(int i, int i2, float f, boolean z) {
        OooO0O0 oooO0O0 = this.f33719OooO0Oo;
        if (oooO0O0 != null) {
            oooO0O0.OooO00o();
        }
    }

    @Override // p631o0ooO0Oo.o00O000o
    public final void OooO0OO(int i, int i2) {
        OooO0O0 oooO0O0 = this.f33719OooO0Oo;
        if (oooO0O0 != null) {
            oooO0O0.OooO0OO();
        }
    }

    @Override // p631o0ooO0Oo.o00O000o
    public final void OooO0Oo(int i, int i2, float f, boolean z) {
        OooO0O0 oooO0O0 = this.f33719OooO0Oo;
        if (oooO0O0 != null) {
            oooO0O0.OooO0O0();
        }
    }

    @Override // p631o0ooO0Oo.o00oOoo
    public int getContentBottom() {
        return getBottom();
    }

    @Override // p631o0ooO0Oo.o00oOoo
    public int getContentLeft() {
        return getLeft();
    }

    public OooO00o getContentPositionDataProvider() {
        return null;
    }

    @Override // p631o0ooO0Oo.o00oOoo
    public int getContentRight() {
        return getRight();
    }

    @Override // p631o0ooO0Oo.o00oOoo
    public int getContentTop() {
        return getTop();
    }

    public OooO0O0 getOnPagerTitleChangeListener() {
        return this.f33719OooO0Oo;
    }

    public void setContentPositionDataProvider(OooO00o oooO00o) {
    }

    public void setContentView(View view) {
        removeAllViews();
        if (view != null) {
            addView(view, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public void setOnPagerTitleChangeListener(OooO0O0 oooO0O0) {
        this.f33719OooO0Oo = oooO0O0;
    }

    public void setContentView(int i) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(i, (ViewGroup) null);
        removeAllViews();
        if (viewInflate != null) {
            addView(viewInflate, new FrameLayout.LayoutParams(-1, -1));
        }
    }
}
