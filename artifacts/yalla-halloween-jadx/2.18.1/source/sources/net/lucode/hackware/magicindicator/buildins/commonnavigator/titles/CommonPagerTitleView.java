package net.lucode.hackware.magicindicator.buildins.commonnavigator.titles;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p657o0ooo00o.oO0;

/* JADX INFO: loaded from: classes3.dex */
public class CommonPagerTitleView extends FrameLayout implements oO0 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public OooO0O0 f26511Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public OooO00o f26512Oooo0oO;

    public interface OooO00o {
        int getContentBottom();

        int getContentLeft();

        int getContentRight();

        int getContentTop();
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

    @Override // p657o0ooo00o.oO0O000o
    public final void OooO00o(int i, int i2) {
        OooO0O0 oooO0O0 = this.f26511Oooo0o;
        if (oooO0O0 != null) {
            oooO0O0.OooO0Oo();
        }
    }

    @Override // p657o0ooo00o.oO0O000o
    public final void OooO0O0(int i, int i2, float f, boolean z) {
        OooO0O0 oooO0O0 = this.f26511Oooo0o;
        if (oooO0O0 != null) {
            oooO0O0.OooO00o();
        }
    }

    @Override // p657o0ooo00o.oO0O000o
    public final void OooO0OO(int i, int i2) {
        OooO0O0 oooO0O0 = this.f26511Oooo0o;
        if (oooO0O0 != null) {
            oooO0O0.OooO0OO();
        }
    }

    @Override // p657o0ooo00o.oO0O000o
    public final void OooO0Oo(int i, int i2, float f, boolean z) {
        OooO0O0 oooO0O0 = this.f26511Oooo0o;
        if (oooO0O0 != null) {
            oooO0O0.OooO0O0();
        }
    }

    @Override // p657o0ooo00o.oO0
    public int getContentBottom() {
        OooO00o oooO00o = this.f26512Oooo0oO;
        return oooO00o != null ? oooO00o.getContentBottom() : getBottom();
    }

    @Override // p657o0ooo00o.oO0
    public int getContentLeft() {
        OooO00o oooO00o = this.f26512Oooo0oO;
        return oooO00o != null ? oooO00o.getContentLeft() : getLeft();
    }

    public OooO00o getContentPositionDataProvider() {
        return this.f26512Oooo0oO;
    }

    @Override // p657o0ooo00o.oO0
    public int getContentRight() {
        OooO00o oooO00o = this.f26512Oooo0oO;
        return oooO00o != null ? oooO00o.getContentRight() : getRight();
    }

    @Override // p657o0ooo00o.oO0
    public int getContentTop() {
        OooO00o oooO00o = this.f26512Oooo0oO;
        return oooO00o != null ? oooO00o.getContentTop() : getTop();
    }

    public OooO0O0 getOnPagerTitleChangeListener() {
        return this.f26511Oooo0o;
    }

    public void setContentPositionDataProvider(OooO00o oooO00o) {
        this.f26512Oooo0oO = oooO00o;
    }

    public void setContentView(View view) {
        removeAllViews();
        if (view != null) {
            addView(view, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public void setOnPagerTitleChangeListener(OooO0O0 oooO0O0) {
        this.f26511Oooo0o = oooO0O0;
    }

    public void setContentView(int i) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(i, (ViewGroup) null);
        removeAllViews();
        if (viewInflate != null) {
            addView(viewInflate, new FrameLayout.LayoutParams(-1, -1));
        }
    }
}
