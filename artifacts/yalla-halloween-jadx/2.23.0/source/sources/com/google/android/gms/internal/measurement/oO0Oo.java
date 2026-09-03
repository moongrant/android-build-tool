package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Unsafe f15615OooO00o;

    public oO0Oo(Unsafe unsafe) {
        this.f15615OooO00o = unsafe;
    }

    public abstract double OooO00o(long j, Object obj);

    public abstract float OooO0O0(long j, Object obj);

    public abstract void OooO0OO(Object obj, long j, boolean z);

    public abstract void OooO0Oo(Object obj, long j, byte b);

    public abstract void OooO0o(Object obj, long j, float f);

    public abstract void OooO0o0(Object obj, long j, double d);

    public abstract boolean OooO0oO(long j, Object obj);
}
