package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes3.dex */
class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o000oOoO f15807OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f15808OooO0O0;

    public ViewOffsetBehavior() {
        this.f15808OooO0O0 = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean OooO0oo(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        OooOo0O(coordinatorLayout, v, i);
        if (this.f15807OooO00o == null) {
            this.f15807OooO00o = new o000oOoO(v);
        }
        o000oOoO o000oooo2 = this.f15807OooO00o;
        View view = o000oooo2.f15809OooO00o;
        o000oooo2.f15810OooO0O0 = view.getTop();
        o000oooo2.f15811OooO0OO = view.getLeft();
        this.f15807OooO00o.OooO00o();
        int i2 = this.f15808OooO0O0;
        if (i2 == 0) {
            return true;
        }
        this.f15807OooO00o.OooO0O0(i2);
        this.f15808OooO0O0 = 0;
        return true;
    }

    public int OooOo0() {
        return OooOo00();
    }

    public final int OooOo00() {
        o000oOoO o000oooo2 = this.f15807OooO00o;
        if (o000oooo2 != null) {
            return o000oooo2.f15812OooO0Oo;
        }
        return 0;
    }

    public void OooOo0O(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        coordinatorLayout.OooOOOo(i, v);
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15808OooO0O0 = 0;
    }
}
