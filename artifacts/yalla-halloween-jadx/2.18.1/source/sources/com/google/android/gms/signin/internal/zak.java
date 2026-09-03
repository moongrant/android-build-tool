package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zav;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "SignInResponseCreator")
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new zal();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1)
    public final int f16339Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getConnectionResult", id = 2)
    public final ConnectionResult f16340Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getResolveAccountResponse", id = 3)
    public final zav f16341Oooo0oo;

    @SafeParcelable.Constructor
    public zak(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) ConnectionResult connectionResult, @Nullable @SafeParcelable.Param(id = 3) zav zavVar) {
        this.f16339Oooo0o = i;
        this.f16340Oooo0oO = connectionResult;
        this.f16341Oooo0oo = zavVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f16339Oooo0o);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f16340Oooo0oO, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f16341Oooo0oo, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final ConnectionResult zaa() {
        return this.f16340Oooo0oO;
    }

    @Nullable
    public final zav zab() {
        return this.f16341Oooo0oo;
    }
}
