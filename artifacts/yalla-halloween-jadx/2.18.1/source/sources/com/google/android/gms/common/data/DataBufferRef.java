package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public abstract class DataBufferRef {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    @KeepForSdk
    public final DataHolder f15458OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @KeepForSdk
    public int f15459OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f15460OooO0OO;

    @KeepForSdk
    public DataBufferRef(@NonNull DataHolder dataHolder, int i) {
        this.f15458OooO00o = (DataHolder) Preconditions.checkNotNull(dataHolder);
        OooO00o(i);
    }

    public final void OooO00o(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f15458OooO00o.getCount()) {
            z = true;
        }
        Preconditions.checkState(z);
        this.f15459OooO0O0 = i;
        this.f15460OooO0OO = this.f15458OooO00o.getWindowIndex(i);
    }

    @KeepForSdk
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof DataBufferRef) {
            DataBufferRef dataBufferRef = (DataBufferRef) obj;
            if (Objects.equal(Integer.valueOf(dataBufferRef.f15459OooO0O0), Integer.valueOf(this.f15459OooO0O0)) && Objects.equal(Integer.valueOf(dataBufferRef.f15460OooO0OO), Integer.valueOf(this.f15460OooO0OO)) && dataBufferRef.f15458OooO00o == this.f15458OooO00o) {
                return true;
            }
        }
        return false;
    }

    @KeepForSdk
    public boolean hasColumn(@NonNull String str) {
        return this.f15458OooO00o.hasColumn(str);
    }

    @KeepForSdk
    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f15459OooO0O0), Integer.valueOf(this.f15460OooO0OO), this.f15458OooO00o);
    }

    @KeepForSdk
    public boolean isDataValid() {
        return !this.f15458OooO00o.isClosed();
    }
}
