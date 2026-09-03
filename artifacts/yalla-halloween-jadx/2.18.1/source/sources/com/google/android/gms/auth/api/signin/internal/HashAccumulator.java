package com.google.android.gms.auth.api.signin.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class HashAccumulator {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f15065OooO00o = 1;

    @NonNull
    @KeepForSdk
    public HashAccumulator addObject(@Nullable Object obj) {
        this.f15065OooO00o = (31 * this.f15065OooO00o) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    @KeepForSdk
    public int hash() {
        return this.f15065OooO00o;
    }

    @NonNull
    public final HashAccumulator zaa(boolean z) {
        this.f15065OooO00o = (31 * this.f15065OooO00o) + (z ? 1 : 0);
        return this;
    }
}
