package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final View f16281OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f16282OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f16283OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f16284OooO0Oo;

    public o000oOoO(View view) {
        this.f16281OooO00o = view;
    }

    public final void OooO00o() {
        int i = this.f16284OooO0Oo;
        View view = this.f16281OooO00o;
        int top = i - (view.getTop() - this.f16282OooO0O0);
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f16283OooO0OO));
    }

    public final boolean OooO0O0(int i) {
        if (this.f16284OooO0Oo == i) {
            return false;
        }
        this.f16284OooO0Oo = i;
        OooO00o();
        return true;
    }
}
