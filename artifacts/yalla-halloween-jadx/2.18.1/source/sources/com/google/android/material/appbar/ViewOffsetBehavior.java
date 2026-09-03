package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes2.dex */
class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public OooOO0 f16475OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f16476OooO0O0;

    public ViewOffsetBehavior() {
        this.f16476OooO0O0 = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean OooO0oo(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        OooOo0(coordinatorLayout, v, i);
        if (this.f16475OooO00o == null) {
            this.f16475OooO00o = new OooOO0(v);
        }
        OooOO0 oooOO1 = this.f16475OooO00o;
        oooOO1.f16470OooO0O0 = oooOO1.f16469OooO00o.getTop();
        oooOO1.f16471OooO0OO = oooOO1.f16469OooO00o.getLeft();
        this.f16475OooO00o.OooO00o();
        int i2 = this.f16476OooO0O0;
        if (i2 == 0) {
            return true;
        }
        this.f16475OooO00o.OooO0O0(i2);
        this.f16476OooO0O0 = 0;
        return true;
    }

    public void OooOo0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        coordinatorLayout.OooOo0o(v, i);
    }

    public final int OooOo00() {
        OooOO0 oooOO1 = this.f16475OooO00o;
        if (oooOO1 != null) {
            return oooOO1.f16472OooO0Oo;
        }
        return 0;
    }

    public final boolean OooOo0O(int i) {
        OooOO0 oooOO1 = this.f16475OooO00o;
        if (oooOO1 != null) {
            return oooOO1.OooO0O0(i);
        }
        this.f16476OooO0O0 = i;
        return false;
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16476OooO0O0 = 0;
    }
}
