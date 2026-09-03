package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public class BooleanResult implements Result {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Status f14182OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f14183OooO0o0;

    @ShowFirstParty
    @KeepForSdk
    public BooleanResult(@NonNull Status status, boolean z) {
        this.f14182OooO0Oo = (Status) Preconditions.checkNotNull(status, "Status must not be null");
        this.f14183OooO0o0 = z;
    }

    @KeepForSdk
    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BooleanResult)) {
            return false;
        }
        BooleanResult booleanResult = (BooleanResult) obj;
        return this.f14182OooO0Oo.equals(booleanResult.f14182OooO0Oo) && this.f14183OooO0o0 == booleanResult.f14183OooO0o0;
    }

    @Override // com.google.android.gms.common.api.Result
    @NonNull
    @KeepForSdk
    public Status getStatus() {
        return this.f14182OooO0Oo;
    }

    @KeepForSdk
    public boolean getValue() {
        return this.f14183OooO0o0;
    }

    @KeepForSdk
    public final int hashCode() {
        return ((this.f14182OooO0Oo.hashCode() + 527) * 31) + (this.f14183OooO0o0 ? 1 : 0);
    }
}
