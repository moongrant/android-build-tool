package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public abstract class DataBufferRef {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    @KeepForSdk
    public final DataHolder f14479OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @KeepForSdk
    public int f14480OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f14481OooO0OO;

    @KeepForSdk
    public DataBufferRef(@NonNull DataHolder dataHolder, int i) {
        DataHolder dataHolder2 = (DataHolder) Preconditions.checkNotNull(dataHolder);
        this.f14479OooO00o = dataHolder2;
        Preconditions.checkState(i >= 0 && i < dataHolder2.getCount());
        this.f14480OooO0O0 = i;
        this.f14481OooO0OO = dataHolder2.getWindowIndex(i);
    }

    @KeepForSdk
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof DataBufferRef) {
            DataBufferRef dataBufferRef = (DataBufferRef) obj;
            if (Objects.equal(Integer.valueOf(dataBufferRef.f14480OooO0O0), Integer.valueOf(this.f14480OooO0O0)) && Objects.equal(Integer.valueOf(dataBufferRef.f14481OooO0OO), Integer.valueOf(this.f14481OooO0OO)) && dataBufferRef.f14479OooO00o == this.f14479OooO00o) {
                return true;
            }
        }
        return false;
    }

    @KeepForSdk
    public boolean hasColumn(@NonNull String str) {
        return this.f14479OooO00o.hasColumn(str);
    }

    @KeepForSdk
    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f14480OooO0O0), Integer.valueOf(this.f14481OooO0OO), this.f14479OooO00o);
    }

    @KeepForSdk
    public boolean isDataValid() {
        return !this.f14479OooO00o.isClosed();
    }
}
