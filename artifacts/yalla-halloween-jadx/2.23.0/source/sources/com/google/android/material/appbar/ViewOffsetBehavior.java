package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes3.dex */
class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o000oOoO f16279OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f16280OooO0O0;

    public ViewOffsetBehavior() {
        this.f16280OooO0O0 = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean OooO0oo(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        OooOo0O(coordinatorLayout, v, i);
        if (this.f16279OooO00o == null) {
            this.f16279OooO00o = new o000oOoO(v);
        }
        o000oOoO o000oooo2 = this.f16279OooO00o;
        View view = o000oooo2.f16281OooO00o;
        o000oooo2.f16282OooO0O0 = view.getTop();
        o000oooo2.f16283OooO0OO = view.getLeft();
        this.f16279OooO00o.OooO00o();
        int i2 = this.f16280OooO0O0;
        if (i2 == 0) {
            return true;
        }
        this.f16279OooO00o.OooO0O0(i2);
        this.f16280OooO0O0 = 0;
        return true;
    }

    public int OooOo0() {
        return OooOo00();
    }

    public final int OooOo00() {
        o000oOoO o000oooo2 = this.f16279OooO00o;
        if (o000oooo2 != null) {
            return o000oooo2.f16284OooO0Oo;
        }
        return 0;
    }

    public void OooOo0O(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        coordinatorLayout.OooOOOo(i, v);
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16280OooO0O0 = 0;
    }
}
