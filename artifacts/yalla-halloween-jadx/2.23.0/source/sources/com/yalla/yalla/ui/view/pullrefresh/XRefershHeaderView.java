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
import o0OO0o.OooO;
import o0OO0o.OooOO0O;
import o0OO0o.OooOOO0;
import o0OO0oO0.OooO0O0;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO0O0OoO;

/* JADX INFO: loaded from: classes5.dex */
public class XRefershHeaderView extends FrameLayout implements OooO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public SVGAView f31249OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public com.yalla.yalla.util.Function.OooO00o f31250OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f31251OooO0o0;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f31252OooO00o;

        static {
            int[] iArr = new int[RefreshState.values().length];
            f31252OooO00o = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31252OooO00o[RefreshState.PullDownToRefresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public XRefershHeaderView(Context context) {
        super(context);
        this.f31251OooO0o0 = 0;
        OooOO0();
    }

    @Override // o0OO0o.OooOO0
    public final void OooO(int i, float f, int i2) {
    }

    @Override // o0OO0o.OooOO0
    public final void OooO00o(@NonNull OooOO0O oooOO0O, int i, int i2) {
        if (this.f31251OooO0o0 != 0) {
            ((SmartRefreshLayout.OooOOO) oooOO0O).OooO0OO(this, o0000.OooO00o(oO00O0o.colorPrimary));
        }
    }

    @Override // p389o0OOoooO.o00O0OOO
    public final void OooO0OO(@NonNull OooOOO0 oooOOO0, @NonNull RefreshState refreshState, @NonNull RefreshState refreshState2) {
        com.yalla.yalla.util.Function.OooO00o oooO00o;
        int i = OooO00o.f31252OooO00o[refreshState2.ordinal()];
        if (i != 1) {
            if (i == 2 && (oooO00o = this.f31250OooO0o) != null) {
                oooO00o.OooO0OO();
                return;
            }
            return;
        }
        SVGAView sVGAView = this.f31249OooO0Oo;
        if (sVGAView != null) {
            sVGAView.OooO0oO(false);
        }
        com.yalla.yalla.util.Function.OooO00o oooO00o2 = this.f31250OooO0o;
        if (oooO00o2 != null) {
            oooO00o2.f32804OooO0oo = true;
        }
    }

    @Override // o0OO0o.OooOO0
    public final int OooO0Oo(@NonNull SmartRefreshLayout smartRefreshLayout, boolean z) {
        return 500;
    }

    @Override // o0OO0o.OooOO0
    public final void OooO0o(@NonNull OooOOO0 oooOOO0, int i, int i2) {
    }

    @Override // o0OO0o.OooOO0
    public final void OooO0o0(float f, int i, int i2, int i3, boolean z) {
    }

    @Override // o0OO0o.OooOO0
    public final boolean OooO0oO() {
        return false;
    }

    @Override // o0OO0o.OooOO0
    public final void OooO0oo(@NonNull OooOOO0 oooOOO0, int i, int i2) {
    }

    public final void OooOO0() {
        View.inflate(getContext(), oO00OO0O.layout_refersh_header, this);
        SVGAView sVGAView = (SVGAView) findViewById(oO00O0oO.svga_refersh_header);
        this.f31249OooO0Oo = sVGAView;
        com.yalla.yalla.util.Function.OooO00o oooO00o = new com.yalla.yalla.util.Function.OooO00o(oO0O0OoO.anim_loading_horse_green, 33, getContext(), sVGAView, true);
        this.f31250OooO0o = oooO00o;
        oooO00o.f32804OooO0oo = true;
    }

    @Override // o0OO0o.OooOO0
    @NonNull
    public OooO0O0 getSpinnerStyle() {
        return OooO0O0.f43237OooO0Oo;
    }

    @Override // o0OO0o.OooOO0
    @NonNull
    public View getView() {
        return this;
    }

    public void setHeaderDrawBackground(int i) {
        this.f31251OooO0o0 = i;
    }

    @Override // o0OO0o.OooOO0
    public void setPrimaryColors(int... iArr) {
    }

    public XRefershHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31251OooO0o0 = 0;
        OooOO0();
    }

    public XRefershHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31251OooO0o0 = 0;
        OooOO0();
    }
}
