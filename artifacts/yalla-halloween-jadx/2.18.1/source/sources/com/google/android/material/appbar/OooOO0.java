package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final View f16469OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f16470OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f16471OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f16472OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f16473OooO0o0;

    public OooOO0(View view) {
        this.f16469OooO00o = view;
    }

    public final void OooO00o() {
        View view = this.f16469OooO00o;
        ViewCompat.OooOOOo(view, this.f16472OooO0Oo - (view.getTop() - this.f16470OooO0O0));
        View view2 = this.f16469OooO00o;
        ViewCompat.OooOOOO(view2, this.f16473OooO0o0 - (view2.getLeft() - this.f16471OooO0OO));
    }

    public final boolean OooO0O0(int i) {
        if (this.f16472OooO0Oo == i) {
            return false;
        }
        this.f16472OooO0Oo = i;
        OooO00o();
        return true;
    }
}
