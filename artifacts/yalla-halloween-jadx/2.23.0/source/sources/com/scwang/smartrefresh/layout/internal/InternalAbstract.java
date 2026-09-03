package com.scwang.smartrefresh.layout.internal;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.impl.RefreshFooterWrapper;
import com.scwang.smartrefresh.layout.impl.RefreshHeaderWrapper;
import o0OO0o.OooO;
import o0OO0o.OooO0o;
import o0OO0o.OooOO0;
import o0OO0o.OooOO0O;
import o0OO0o.OooOOO0;
import o0OO0oO0.OooO0O0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class InternalAbstract extends RelativeLayout implements OooOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final View f21481OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooOO0 f21482OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OooO0O0 f21483OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InternalAbstract(@NonNull View view) {
        super(view.getContext(), null, 0);
        OooOO0 oooOO1 = view instanceof OooOO0 ? (OooOO0) view : null;
        this.f21481OooO0Oo = view;
        this.f21482OooO0o = oooOO1;
        boolean z = this instanceof RefreshFooterWrapper;
        OooO0O0 oooO0O0 = OooO0O0.f43240OooO0oO;
        if (z && (oooOO1 instanceof OooO) && oooOO1.getSpinnerStyle() == oooO0O0) {
            oooOO1.getView().setScaleY(-1.0f);
            return;
        }
        if (this instanceof RefreshHeaderWrapper) {
            OooOO0 oooOO2 = this.f21482OooO0o;
            if ((oooOO2 instanceof OooO0o) && oooOO2.getSpinnerStyle() == oooO0O0) {
                oooOO1.getView().setScaleY(-1.0f);
            }
        }
    }

    public void OooO(int i, float f, int i2) {
        OooOO0 oooOO1 = this.f21482OooO0o;
        if (oooOO1 == null || oooOO1 == this) {
            return;
        }
        oooOO1.OooO(i, f, i2);
    }

    public void OooO00o(@NonNull OooOO0O oooOO0O, int i, int i2) {
        OooOO0 oooOO1 = this.f21482OooO0o;
        if (oooOO1 != null && oooOO1 != this) {
            oooOO1.OooO00o(oooOO0O, i, i2);
            return;
        }
        View view = this.f21481OooO0Oo;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof SmartRefreshLayout.LayoutParams) {
                ((SmartRefreshLayout.OooOOO) oooOO0O).OooO0OO(this, ((SmartRefreshLayout.LayoutParams) layoutParams).f21387OooO00o);
            }
        }
    }

    @SuppressLint({"RestrictedApi"})
    public boolean OooO0O0(boolean z) {
        OooOO0 oooOO1 = this.f21482OooO0o;
        return (oooOO1 instanceof OooO0o) && ((OooO0o) oooOO1).OooO0O0(z);
    }

    public void OooO0OO(@NonNull OooOOO0 oooOOO0, @NonNull RefreshState refreshState, @NonNull RefreshState refreshState2) {
        OooOO0 oooOO1 = this.f21482OooO0o;
        if (oooOO1 == null || oooOO1 == this) {
            return;
        }
        if ((this instanceof RefreshFooterWrapper) && (oooOO1 instanceof OooO)) {
            boolean z = refreshState.isFooter;
            if (z && z && !refreshState.isTwoLevel) {
                refreshState = RefreshState.values()[refreshState.ordinal() - 1];
            }
            boolean z2 = refreshState2.isFooter;
            if (z2 && z2 && !refreshState2.isTwoLevel) {
                refreshState2 = RefreshState.values()[refreshState2.ordinal() - 1];
            }
        } else if ((this instanceof RefreshHeaderWrapper) && (oooOO1 instanceof OooO0o)) {
            boolean z3 = refreshState.isHeader;
            if (z3 && z3 && !refreshState.isTwoLevel) {
                refreshState = RefreshState.values()[refreshState.ordinal() + 1];
            }
            boolean z4 = refreshState2.isHeader;
            if (z4 && z4 && !refreshState2.isTwoLevel) {
                refreshState2 = RefreshState.values()[refreshState2.ordinal() + 1];
            }
        }
        OooOO0 oooOO2 = this.f21482OooO0o;
        if (oooOO2 != null) {
            oooOO2.OooO0OO(oooOOO0, refreshState, refreshState2);
        }
    }

    public int OooO0Oo(@NonNull SmartRefreshLayout smartRefreshLayout, boolean z) {
        OooOO0 oooOO1 = this.f21482OooO0o;
        if (oooOO1 == null || oooOO1 == this) {
            return 0;
        }
        return oooOO1.OooO0Oo(smartRefreshLayout, z);
    }

    public void OooO0o(@NonNull OooOOO0 oooOOO0, int i, int i2) {
        OooOO0 oooOO1 = this.f21482OooO0o;
        if (oooOO1 == null || oooOO1 == this) {
            return;
        }
        oooOO1.OooO0o(oooOOO0, i, i2);
    }

    public void OooO0o0(float f, int i, int i2, int i3, boolean z) {
        OooOO0 oooOO1 = this.f21482OooO0o;
        if (oooOO1 == null || oooOO1 == this) {
            return;
        }
        oooOO1.OooO0o0(f, i, i2, i3, z);
    }

    public boolean OooO0oO() {
        OooOO0 oooOO1 = this.f21482OooO0o;
        return (oooOO1 == null || oooOO1 == this || !oooOO1.OooO0oO()) ? false : true;
    }

    public void OooO0oo(@NonNull OooOOO0 oooOOO0, int i, int i2) {
        OooOO0 oooOO1 = this.f21482OooO0o;
        if (oooOO1 == null || oooOO1 == this) {
            return;
        }
        oooOO1.OooO0oo(oooOOO0, i, i2);
    }

    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return true;
        }
        return (obj instanceof OooOO0) && getView() == ((OooOO0) obj).getView();
    }

    @Override // o0OO0o.OooOO0
    @NonNull
    public OooO0O0 getSpinnerStyle() {
        int i;
        OooO0O0 oooO0O0 = this.f21483OooO0o0;
        if (oooO0O0 != null) {
            return oooO0O0;
        }
        OooOO0 oooOO1 = this.f21482OooO0o;
        if (oooOO1 != null && oooOO1 != this) {
            return oooOO1.getSpinnerStyle();
        }
        View view = this.f21481OooO0Oo;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof SmartRefreshLayout.LayoutParams) {
                OooO0O0 oooO0O1 = ((SmartRefreshLayout.LayoutParams) layoutParams).f21388OooO0O0;
                this.f21483OooO0o0 = oooO0O1;
                if (oooO0O1 != null) {
                    return oooO0O1;
                }
            }
            if (layoutParams != null && ((i = layoutParams.height) == 0 || i == -1)) {
                OooO0O0[] oooO0O0Arr = OooO0O0.f43241OooO0oo;
                for (int i2 = 0; i2 < 5; i2++) {
                    OooO0O0 oooO0O2 = oooO0O0Arr[i2];
                    if (oooO0O2.f43244OooO0OO) {
                        this.f21483OooO0o0 = oooO0O2;
                        return oooO0O2;
                    }
                }
            }
        }
        OooO0O0 oooO0O3 = OooO0O0.f43237OooO0Oo;
        this.f21483OooO0o0 = oooO0O3;
        return oooO0O3;
    }

    @Override // o0OO0o.OooOO0
    @NonNull
    public View getView() {
        View view = this.f21481OooO0Oo;
        return view == null ? this : view;
    }

    public void setPrimaryColors(@ColorInt int... iArr) {
        OooOO0 oooOO1 = this.f21482OooO0o;
        if (oooOO1 == null || oooOO1 == this) {
            return;
        }
        oooOO1.setPrimaryColors(iArr);
    }
}
