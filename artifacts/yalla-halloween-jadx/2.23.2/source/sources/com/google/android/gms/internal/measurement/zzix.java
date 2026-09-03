package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzix extends zziv {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Object[] f15260OooO00o = new Object[4];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f15261OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f15262OooO0OO;

    public final zzix zza(Object... objArr) {
        for (int i = 0; i < 15; i++) {
            if (objArr[i] == null) {
                throw new NullPointerException(android.support.v4.media.OooO00o.OooO00o("at index ", i));
            }
        }
        int i2 = this.f15261OooO0O0 + 15;
        Object[] objArr2 = this.f15260OooO00o;
        int length = objArr2.length;
        if (length < i2) {
            int i3 = length + (length >> 1) + 1;
            if (i3 < i2) {
                int iHighestOneBit = Integer.highestOneBit(i2 - 1);
                i3 = iHighestOneBit + iHighestOneBit;
            }
            if (i3 < 0) {
                i3 = Integer.MAX_VALUE;
            }
            this.f15260OooO00o = Arrays.copyOf(objArr2, i3);
            this.f15262OooO0OO = false;
        } else if (this.f15262OooO0OO) {
            this.f15260OooO00o = (Object[]) objArr2.clone();
            this.f15262OooO0OO = false;
        }
        System.arraycopy(objArr, 0, this.f15260OooO00o, this.f15261OooO0O0, 15);
        this.f15261OooO0O0 += 15;
        return this;
    }

    public final zzja zzb() {
        this.f15262OooO0OO = true;
        return zzja.OooO0o0(this.f15261OooO0O0, this.f15260OooO00o);
    }
}
