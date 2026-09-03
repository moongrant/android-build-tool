package com.google.android.flexbox;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f14491OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f14496OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f14497OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f14498OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f14499OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f14500OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f14501OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f14502OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f14504OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f14505OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f14506OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f14507OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f14508OooOOo0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f14492OooO00o = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f14493OooO0O0 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f14494OooO0OO = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f14495OooO0Oo = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final ArrayList f14503OooOOO = new ArrayList();

    public final void OooO00o(View view, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        this.f14492OooO00o = Math.min(this.f14492OooO00o, (view.getLeft() - flexItem.oo0o0Oo()) - i);
        this.f14493OooO0O0 = Math.min(this.f14493OooO0O0, (view.getTop() - flexItem.Oooo0()) - i2);
        this.f14494OooO0OO = Math.max(this.f14494OooO0OO, view.getRight() + flexItem.o0000() + i3);
        this.f14495OooO0Oo = Math.max(this.f14495OooO0Oo, view.getBottom() + flexItem.o0OOO0o() + i4);
    }
}
