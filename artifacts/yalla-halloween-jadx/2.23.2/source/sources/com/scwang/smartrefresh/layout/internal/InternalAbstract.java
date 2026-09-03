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
import o0OO0oO.OooO0O0;
import o0OO0oO0.OooO;
import o0OO0oO0.OooO0o;
import o0OO0oO0.OooOO0;
import o0OO0oO0.OooOOO0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class InternalAbstract extends RelativeLayout implements OooOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final View f21008OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooOO0 f21009OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OooO0O0 f21010OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InternalAbstract(@NonNull View view) {
        super(view.getContext(), null, 0);
        OooOO0 oooOO1 = view instanceof OooOO0 ? (OooOO0) view : null;
        this.f21008OooO0Oo = view;
        this.f21009OooO0o = oooOO1;
        boolean z = this instanceof RefreshFooterWrapper;
        OooO0O0 oooO0O0 = OooO0O0.f42507OooO0oO;
        if (z && (oooOO1 instanceof OooO) && oooOO1.getSpinnerStyle() == oooO0O0) {
            oooOO1.getView().setScaleY(-1.0f);
            return;
        }
        if (this instanceof RefreshHeaderWrapper) {
            OooOO0 oooOO2 = this.f21009OooO0o;
            if ((oooOO2 instanceof OooO0o) && oooOO2.getSpinnerStyle() == oooO0O0) {
                oooOO1.getView().setScaleY(-1.0f);
            }
        }
    }

    public void OooO(int i, float f, int i2) {
        OooOO0 oooOO1 = this.f21009OooO0o;
        if (oooOO1 == null || oooOO1 == this) {
            return;
        }
        oooOO1.OooO(i, f, i2);
    }

    public void OooO00o(@NonNull OooOOO0 oooOOO0, @NonNull RefreshState refreshState, @NonNull RefreshState refreshState2) {
        OooOO0 oooOO1 = this.f21009OooO0o;
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
        OooOO0 oooOO2 = this.f21009OooO0o;
        if (oooOO2 != null) {
            oooOO2.OooO00o(oooOOO0, refreshState, refreshState2);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public boolean OooO0O0(boolean z) {
        OooOO0 oooOO1 = this.f21009OooO0o;
        return (oooOO1 instanceof OooO0o) && ((OooO0o) oooOO1).OooO0O0(z);
    }

    public int OooO0OO(@NonNull SmartRefreshLayout smartRefreshLayout, boolean z) {
        OooOO0 oooOO1 = this.f21009OooO0o;
        if (oooOO1 == null || oooOO1 == this) {
            return 0;
        }
        return oooOO1.OooO0OO(smartRefreshLayout, z);
    }

    public void OooO0Oo(@NonNull OooOOO0 oooOOO0, int i, int i2) {
        OooOO0 oooOO1 = this.f21009OooO0o;
        if (oooOO1 == null || oooOO1 == this) {
            return;
        }
        oooOO1.OooO0Oo(oooOOO0, i, i2);
    }

    public void OooO0o(float f, int i, int i2, int i3, boolean z) {
        OooOO0 oooOO1 = this.f21009OooO0o;
        if (oooOO1 == null || oooOO1 == this) {
            return;
        }
        oooOO1.OooO0o(f, i, i2, i3, z);
    }

    public void OooO0o0(@NonNull OooOOO0 oooOOO0, int i, int i2) {
        OooOO0 oooOO1 = this.f21009OooO0o;
        if (oooOO1 == null || oooOO1 == this) {
            return;
        }
        oooOO1.OooO0o0(oooOOO0, i, i2);
    }

    public boolean OooO0oO() {
        OooOO0 oooOO1 = this.f21009OooO0o;
        return (oooOO1 == null || oooOO1 == this || !oooOO1.OooO0oO()) ? false : true;
    }

    public void OooO0oo(@NonNull SmartRefreshLayout.OooOOO oooOOO, int i, int i2) {
        OooOO0 oooOO1 = this.f21009OooO0o;
        if (oooOO1 != null && oooOO1 != this) {
            oooOO1.OooO0oo(oooOOO, i, i2);
            return;
        }
        View view = this.f21008OooO0Oo;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof SmartRefreshLayout.LayoutParams) {
                oooOOO.OooO0OO(this, ((SmartRefreshLayout.LayoutParams) layoutParams).f20914OooO00o);
            }
        }
    }

    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return true;
        }
        return (obj instanceof OooOO0) && getView() == ((OooOO0) obj).getView();
    }

    @Override // o0OO0oO0.OooOO0
    @NonNull
    public OooO0O0 getSpinnerStyle() {
        int i;
        OooO0O0 oooO0O0 = this.f21010OooO0o0;
        if (oooO0O0 != null) {
            return oooO0O0;
        }
        OooOO0 oooOO1 = this.f21009OooO0o;
        if (oooOO1 != null && oooOO1 != this) {
            return oooOO1.getSpinnerStyle();
        }
        View view = this.f21008OooO0Oo;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof SmartRefreshLayout.LayoutParams) {
                OooO0O0 oooO0O1 = ((SmartRefreshLayout.LayoutParams) layoutParams).f20915OooO0O0;
                this.f21010OooO0o0 = oooO0O1;
                if (oooO0O1 != null) {
                    return oooO0O1;
                }
            }
            if (layoutParams != null && ((i = layoutParams.height) == 0 || i == -1)) {
                OooO0O0[] oooO0O0Arr = OooO0O0.f42508OooO0oo;
                for (int i2 = 0; i2 < 5; i2++) {
                    OooO0O0 oooO0O2 = oooO0O0Arr[i2];
                    if (oooO0O2.f42511OooO0OO) {
                        this.f21010OooO0o0 = oooO0O2;
                        return oooO0O2;
                    }
                }
            }
        }
        OooO0O0 oooO0O3 = OooO0O0.f42504OooO0Oo;
        this.f21010OooO0o0 = oooO0O3;
        return oooO0O3;
    }

    @Override // o0OO0oO0.OooOO0
    @NonNull
    public View getView() {
        View view = this.f21008OooO0Oo;
        return view == null ? this : view;
    }

    public void setPrimaryColors(@ColorInt int... iArr) {
        OooOO0 oooOO1 = this.f21009OooO0o;
        if (oooOO1 == null || oooOO1 == this) {
            return;
        }
        oooOO1.setPrimaryColors(iArr);
    }
}
