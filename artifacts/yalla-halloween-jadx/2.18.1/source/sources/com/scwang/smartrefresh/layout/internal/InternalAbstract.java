package com.scwang.smartrefresh.layout.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.impl.RefreshFooterWrapper;
import com.scwang.smartrefresh.layout.impl.RefreshHeaderWrapper;
import p407o0Oo0OOo.oO000OOo;
import p407o0Oo0OOo.oO000Oo;
import p407o0Oo0OOo.oO000Oo0;
import p407o0Oo0OOo.oO0OOo0o;
import p407o0Oo0OOo.ooOOOOoo;
import p409o0Oo0Oo0.o0OoOo0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class InternalAbstract extends RelativeLayout implements oO0OOo0o {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public View f19666Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public o0OoOo0 f19667Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public oO0OOo0o f19668Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InternalAbstract(@NonNull View view) {
        super(view.getContext(), null, 0);
        oO0OOo0o oo0ooo0o = view instanceof oO0OOo0o ? (oO0OOo0o) view : null;
        this.f19666Oooo0o = view;
        this.f19668Oooo0oo = oo0ooo0o;
        if ((this instanceof RefreshFooterWrapper) && (oo0ooo0o instanceof ooOOOOoo) && oo0ooo0o.getSpinnerStyle() == o0OoOo0.f39155OooO0oO) {
            oo0ooo0o.getView().setScaleY(-1.0f);
            return;
        }
        if (this instanceof RefreshHeaderWrapper) {
            oO0OOo0o oo0ooo0o2 = this.f19668Oooo0oo;
            if ((oo0ooo0o2 instanceof oO000OOo) && oo0ooo0o2.getSpinnerStyle() == o0OoOo0.f39155OooO0oO) {
                oo0ooo0o.getView().setScaleY(-1.0f);
            }
        }
    }

    public void OooO(@NonNull oO000Oo oo000oo, int i, int i2) {
        oO0OOo0o oo0ooo0o = this.f19668Oooo0oo;
        if (oo0ooo0o == null || oo0ooo0o == this) {
            return;
        }
        oo0ooo0o.OooO(oo000oo, i, i2);
    }

    public void OooO00o(@NonNull oO000Oo oo000oo, int i, int i2) {
        oO0OOo0o oo0ooo0o = this.f19668Oooo0oo;
        if (oo0ooo0o == null || oo0ooo0o == this) {
            return;
        }
        oo0ooo0o.OooO00o(oo000oo, i, i2);
    }

    public int OooO0O0(@NonNull oO000Oo oo000oo, boolean z) {
        oO0OOo0o oo0ooo0o = this.f19668Oooo0oo;
        if (oo0ooo0o == null || oo0ooo0o == this) {
            return 0;
        }
        return oo0ooo0o.OooO0O0(oo000oo, z);
    }

    @SuppressLint({"RestrictedApi"})
    public boolean OooO0OO(boolean z) {
        oO0OOo0o oo0ooo0o = this.f19668Oooo0oo;
        return (oo0ooo0o instanceof oO000OOo) && ((oO000OOo) oo0ooo0o).OooO0OO(z);
    }

    public void OooO0Oo(float f, int i, int i2) {
        oO0OOo0o oo0ooo0o = this.f19668Oooo0oo;
        if (oo0ooo0o == null || oo0ooo0o == this) {
            return;
        }
        oo0ooo0o.OooO0Oo(f, i, i2);
    }

    public void OooO0o(@NonNull oO000Oo0 oo000oo0, int i, int i2) {
        oO0OOo0o oo0ooo0o = this.f19668Oooo0oo;
        if (oo0ooo0o != null && oo0ooo0o != this) {
            oo0ooo0o.OooO0o(oo000oo0, i, i2);
            return;
        }
        View view = this.f19666Oooo0o;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof SmartRefreshLayout.LayoutParams) {
                ((SmartRefreshLayout.OooOo00) oo000oo0).OooO0OO(this, ((SmartRefreshLayout.LayoutParams) layoutParams).f19559OooO00o);
            }
        }
    }

    public boolean OooO0o0() {
        oO0OOo0o oo0ooo0o = this.f19668Oooo0oo;
        return (oo0ooo0o == null || oo0ooo0o == this || !oo0ooo0o.OooO0o0()) ? false : true;
    }

    public void OooO0oO(boolean z, float f, int i, int i2, int i3) {
        oO0OOo0o oo0ooo0o = this.f19668Oooo0oo;
        if (oo0ooo0o == null || oo0ooo0o == this) {
            return;
        }
        oo0ooo0o.OooO0oO(z, f, i, i2, i3);
    }

    public void OooO0oo(@NonNull oO000Oo oo000oo, @NonNull RefreshState refreshState, @NonNull RefreshState refreshState2) {
        oO0OOo0o oo0ooo0o = this.f19668Oooo0oo;
        if (oo0ooo0o == null || oo0ooo0o == this) {
            return;
        }
        if ((this instanceof RefreshFooterWrapper) && (oo0ooo0o instanceof ooOOOOoo)) {
            if (refreshState.isFooter) {
                refreshState = refreshState.OooO0O0();
            }
            if (refreshState2.isFooter) {
                refreshState2 = refreshState2.OooO0O0();
            }
        } else if ((this instanceof RefreshHeaderWrapper) && (oo0ooo0o instanceof oO000OOo)) {
            if (refreshState.isHeader) {
                refreshState = refreshState.OooO00o();
            }
            if (refreshState2.isHeader) {
                refreshState2 = refreshState2.OooO00o();
            }
        }
        oO0OOo0o oo0ooo0o2 = this.f19668Oooo0oo;
        if (oo0ooo0o2 != null) {
            oo0ooo0o2.OooO0oo(oo000oo, refreshState, refreshState2);
        }
    }

    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return true;
        }
        return (obj instanceof oO0OOo0o) && getView() == ((oO0OOo0o) obj).getView();
    }

    @Override // p407o0Oo0OOo.oO0OOo0o
    @NonNull
    public o0OoOo0 getSpinnerStyle() {
        int i;
        o0OoOo0 o0oooo1 = this.f19667Oooo0oO;
        if (o0oooo1 != null) {
            return o0oooo1;
        }
        oO0OOo0o oo0ooo0o = this.f19668Oooo0oo;
        if (oo0ooo0o != null && oo0ooo0o != this) {
            return oo0ooo0o.getSpinnerStyle();
        }
        View view = this.f19666Oooo0o;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof SmartRefreshLayout.LayoutParams) {
                o0OoOo0 o0oooo2 = ((SmartRefreshLayout.LayoutParams) layoutParams).f19560OooO0O0;
                this.f19667Oooo0oO = o0oooo2;
                if (o0oooo2 != null) {
                    return o0oooo2;
                }
            }
            if (layoutParams != null && ((i = layoutParams.height) == 0 || i == -1)) {
                o0OoOo0[] o0oooo0Arr = o0OoOo0.f39156OooO0oo;
                for (int i2 = 0; i2 < 5; i2++) {
                    o0OoOo0 o0oooo3 = o0oooo0Arr[i2];
                    if (o0oooo3.f39159OooO0OO) {
                        this.f19667Oooo0oO = o0oooo3;
                        return o0oooo3;
                    }
                }
            }
        }
        o0OoOo0 o0oooo4 = o0OoOo0.f39152OooO0Oo;
        this.f19667Oooo0oO = o0oooo4;
        return o0oooo4;
    }

    @Override // p407o0Oo0OOo.oO0OOo0o
    @NonNull
    public View getView() {
        View view = this.f19666Oooo0o;
        return view == null ? this : view;
    }

    public void setPrimaryColors(@ColorInt int... iArr) {
        oO0OOo0o oo0ooo0o = this.f19668Oooo0oo;
        if (oo0ooo0o == null || oo0ooo0o == this) {
            return;
        }
        oo0ooo0o.setPrimaryColors(iArr);
    }

    public InternalAbstract(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
