package com.yalla.yalla.ui.view.pullrefresh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import o0OO0oO.OooO0O0;
import o0OO0oO0.OooO;
import o0OO0oO0.OooOOO0;
import p562o0oOo000.o00oO0o;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public class XRefershHeaderView extends FrameLayout implements OooO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public SVGAView f30708OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public com.yalla.yalla.util.Function.OooO00o f30709OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f30710OooO0o0;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f30711OooO00o;

        static {
            int[] iArr = new int[RefreshState.values().length];
            f30711OooO00o = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30711OooO00o[RefreshState.PullDownToRefresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public XRefershHeaderView(Context context) {
        super(context);
        this.f30710OooO0o0 = 0;
        OooOO0();
    }

    @Override // o0OO0oO0.OooOO0
    public final void OooO(int i, float f, int i2) {
    }

    @Override // p338o0OO0oOo.o000oOoO
    public final void OooO00o(@NonNull OooOOO0 oooOOO0, @NonNull RefreshState refreshState, @NonNull RefreshState refreshState2) {
        com.yalla.yalla.util.Function.OooO00o oooO00o;
        int i = OooO00o.f30711OooO00o[refreshState2.ordinal()];
        if (i != 1) {
            if (i == 2 && (oooO00o = this.f30709OooO0o) != null) {
                oooO00o.OooO0OO();
                return;
            }
            return;
        }
        SVGAView sVGAView = this.f30708OooO0Oo;
        if (sVGAView != null) {
            sVGAView.OooO0oO(false);
        }
        com.yalla.yalla.util.Function.OooO00o oooO00o2 = this.f30709OooO0o;
        if (oooO00o2 != null) {
            oooO00o2.f32268OooO0oo = true;
        }
    }

    @Override // o0OO0oO0.OooOO0
    public final int OooO0OO(@NonNull SmartRefreshLayout smartRefreshLayout, boolean z) {
        return 500;
    }

    @Override // o0OO0oO0.OooOO0
    public final void OooO0Oo(@NonNull OooOOO0 oooOOO0, int i, int i2) {
    }

    @Override // o0OO0oO0.OooOO0
    public final void OooO0o(float f, int i, int i2, int i3, boolean z) {
    }

    @Override // o0OO0oO0.OooOO0
    public final void OooO0o0(@NonNull OooOOO0 oooOOO0, int i, int i2) {
    }

    @Override // o0OO0oO0.OooOO0
    public final boolean OooO0oO() {
        return false;
    }

    @Override // o0OO0oO0.OooOO0
    public final void OooO0oo(@NonNull SmartRefreshLayout.OooOOO oooOOO, int i, int i2) {
        if (this.f30710OooO0o0 != 0) {
            oooOOO.OooO0OO(this, o0000.OooO00o(o0OOO0o.colorPrimary));
        }
    }

    public final void OooOO0() {
        View.inflate(getContext(), oo0o0Oo.layout_refersh_header, this);
        SVGAView sVGAView = (SVGAView) findViewById(o0OO00O.svga_refersh_header);
        this.f30708OooO0Oo = sVGAView;
        com.yalla.yalla.util.Function.OooO00o oooO00o = new com.yalla.yalla.util.Function.OooO00o(o00oO0o.anim_loading_horse_green, 33, getContext(), sVGAView, true);
        this.f30709OooO0o = oooO00o;
        oooO00o.f32268OooO0oo = true;
    }

    @Override // o0OO0oO0.OooOO0
    @NonNull
    public OooO0O0 getSpinnerStyle() {
        return OooO0O0.f42504OooO0Oo;
    }

    @Override // o0OO0oO0.OooOO0
    @NonNull
    public View getView() {
        return this;
    }

    public void setHeaderDrawBackground(int i) {
        this.f30710OooO0o0 = i;
    }

    @Override // o0OO0oO0.OooOO0
    public void setPrimaryColors(int... iArr) {
    }

    public XRefershHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30710OooO0o0 = 0;
        OooOO0();
    }

    public XRefershHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30710OooO0o0 = 0;
        OooOO0();
    }
}
