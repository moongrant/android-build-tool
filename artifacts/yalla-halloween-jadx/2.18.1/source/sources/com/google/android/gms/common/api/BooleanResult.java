package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class BooleanResult implements Result {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Status f15159Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final boolean f15160Oooo0oO;

    @ShowFirstParty
    @KeepForSdk
    public BooleanResult(@NonNull Status status, boolean z) {
        this.f15159Oooo0o = (Status) Preconditions.checkNotNull(status, "Status must not be null");
        this.f15160Oooo0oO = z;
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
        return this.f15159Oooo0o.equals(booleanResult.f15159Oooo0o) && this.f15160Oooo0oO == booleanResult.f15160Oooo0oO;
    }

    @Override // com.google.android.gms.common.api.Result
    @NonNull
    @KeepForSdk
    public Status getStatus() {
        return this.f15159Oooo0o;
    }

    @KeepForSdk
    public boolean getValue() {
        return this.f15160Oooo0oO;
    }

    @KeepForSdk
    public final int hashCode() {
        return ((this.f15159Oooo0o.hashCode() + 527) * 31) + (this.f15160Oooo0oO ? 1 : 0);
    }
}
