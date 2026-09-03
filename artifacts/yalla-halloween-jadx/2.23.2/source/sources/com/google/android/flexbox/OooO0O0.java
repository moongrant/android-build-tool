package com.google.android.flexbox;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f14015OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f14020OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f14021OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f14022OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f14023OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f14024OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f14025OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f14026OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f14028OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f14029OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f14030OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f14031OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f14032OooOOo0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f14016OooO00o = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f14017OooO0O0 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f14018OooO0OO = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f14019OooO0Oo = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final ArrayList f14027OooOOO = new ArrayList();

    public final void OooO00o(View view, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        this.f14016OooO00o = Math.min(this.f14016OooO00o, (view.getLeft() - flexItem.o000OOo()) - i);
        this.f14017OooO0O0 = Math.min(this.f14017OooO0O0, (view.getTop() - flexItem.Oooo0()) - i2);
        this.f14018OooO0OO = Math.max(this.f14018OooO0OO, view.getRight() + flexItem.o0000O00() + i3);
        this.f14019OooO0Oo = Math.max(this.f14019OooO0Oo, view.getBottom() + flexItem.o0O0O00() + i4);
    }
}
