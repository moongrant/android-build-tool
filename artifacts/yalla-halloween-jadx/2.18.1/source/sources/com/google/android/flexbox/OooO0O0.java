package com.google.android.flexbox;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f14991OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f14996OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f14997OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f14998OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f14999OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f15000OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f15001OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f15002OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f15004OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f15005OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f15006OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f15007OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f15008OooOOo0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f14992OooO00o = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f14993OooO0O0 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f14994OooO0OO = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f14995OooO0Oo = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public List<Integer> f15003OooOOO = new ArrayList();

    public final void OooO00o(View view, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        this.f14992OooO00o = Math.min(this.f14992OooO00o, (view.getLeft() - flexItem.OoooOOO()) - i);
        this.f14993OooO0O0 = Math.min(this.f14993OooO0O0, (view.getTop() - flexItem.OooooOO()) - i2);
        this.f14994OooO0OO = Math.max(this.f14994OooO0OO, view.getRight() + flexItem.o000OOo() + i3);
        this.f14995OooO0Oo = Math.max(this.f14995OooO0Oo, view.getBottom() + flexItem.o000oOoO() + i4);
    }
}
