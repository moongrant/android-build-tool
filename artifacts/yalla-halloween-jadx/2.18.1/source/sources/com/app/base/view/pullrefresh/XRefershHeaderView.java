package com.app.base.view.pullrefresh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.app.base.Function.OooO0O0;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.common.ui.view.SVGAView;
import p407o0Oo0OOo.oO000Oo;
import p407o0Oo0OOo.oO000Oo0;
import p407o0Oo0OOo.ooOOOOoo;
import p409o0Oo0Oo0.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
public class XRefershHeaderView extends FrameLayout implements ooOOOOoo {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public SVGAView f12212Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f12213Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public OooO0O0 f12214Oooo0oo;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f12215OooO00o;

        static {
            int[] iArr = new int[RefreshState.values().length];
            f12215OooO00o = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12215OooO00o[RefreshState.PullDownToRefresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public XRefershHeaderView(Context context) {
        super(context);
        this.f12213Oooo0oO = 0;
        OooOO0();
    }

    @Override // p407o0Oo0OOo.oO0OOo0o
    public final void OooO(@NonNull oO000Oo oo000oo, int i, int i2) {
    }

    @Override // p407o0Oo0OOo.oO0OOo0o
    public final void OooO00o(@NonNull oO000Oo oo000oo, int i, int i2) {
    }

    @Override // p407o0Oo0OOo.oO0OOo0o
    public final int OooO0O0(@NonNull oO000Oo oo000oo, boolean z) {
        return 500;
    }

    @Override // p407o0Oo0OOo.oO0OOo0o
    public final void OooO0Oo(float f, int i, int i2) {
    }

    @Override // p407o0Oo0OOo.oO0OOo0o
    public final void OooO0o(@NonNull oO000Oo0 oo000oo0, int i, int i2) {
        if (this.f12213Oooo0oO != 0) {
            ((SmartRefreshLayout.OooOo00) oo000oo0).OooO0OO(this, OooOOO.OooO00o(R.color.colorPrimary));
        }
    }

    @Override // p407o0Oo0OOo.oO0OOo0o
    public final boolean OooO0o0() {
        return false;
    }

    @Override // p407o0Oo0OOo.oO0OOo0o
    public final void OooO0oO(boolean z, float f, int i, int i2, int i3) {
    }

    @Override // p417o0Oo0oOo.oO00OOOo
    public final void OooO0oo(@NonNull oO000Oo oo000oo, @NonNull RefreshState refreshState, @NonNull RefreshState refreshState2) {
        OooO0O0 oooO0O0;
        int i = OooO00o.f12215OooO00o[refreshState2.ordinal()];
        if (i != 1) {
            if (i == 2 && (oooO0O0 = this.f12214Oooo0oo) != null) {
                oooO0O0.OooO0O0();
                return;
            }
            return;
        }
        SVGAView sVGAView = this.f12212Oooo0o;
        if (sVGAView != null) {
            sVGAView.OooO0o0(false);
        }
        OooO0O0 oooO0O1 = this.f12214Oooo0oo;
        if (oooO0O1 != null) {
            oooO0O1.f11348OooO0oo = true;
        }
    }

    public final void OooOO0() {
        View.inflate(getContext(), R.layout.layout_refersh_header, this);
        SVGAView sVGAView = (SVGAView) findViewById(R.id.svga_refersh_header);
        this.f12212Oooo0o = sVGAView;
        OooO0O0 oooO0O0 = new OooO0O0(sVGAView, getContext(), R.array.anim_loading_horse_green, 33, true);
        this.f12214Oooo0oo = oooO0O0;
        oooO0O0.f11348OooO0oo = true;
    }

    @Override // p407o0Oo0OOo.oO0OOo0o
    @NonNull
    public o0OoOo0 getSpinnerStyle() {
        return o0OoOo0.f39152OooO0Oo;
    }

    @Override // p407o0Oo0OOo.oO0OOo0o
    @NonNull
    public View getView() {
        return this;
    }

    public void setHeaderDrawBackground(int i) {
        this.f12213Oooo0oO = i;
    }

    @Override // p407o0Oo0OOo.oO0OOo0o
    public void setPrimaryColors(int... iArr) {
    }

    public XRefershHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12213Oooo0oO = 0;
        OooOO0();
    }

    public XRefershHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12213Oooo0oO = 0;
        OooOO0();
    }
}
