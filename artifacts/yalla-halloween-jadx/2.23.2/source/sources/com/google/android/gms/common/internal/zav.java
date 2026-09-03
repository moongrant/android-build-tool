package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "ResolveAccountResponseCreator")
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new zaw();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1)
    public final int f14664OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getConnectionResult", id = 3)
    public final ConnectionResult f14665OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(id = 2)
    public final IBinder f14666OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSaveDefaultAccount", id = 4)
    public final boolean f14667OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @SafeParcelable.Field(getter = "isFromCrossClientAuth", id = 5)
    public final boolean f14668OooO0oo;

    @SafeParcelable.Constructor
    public zav(@SafeParcelable.Param(id = 1) int i, @Nullable @SafeParcelable.Param(id = 2) IBinder iBinder, @SafeParcelable.Param(id = 3) ConnectionResult connectionResult, @SafeParcelable.Param(id = 4) boolean z, @SafeParcelable.Param(id = 5) boolean z2) {
        this.f14664OooO0Oo = i;
        this.f14666OooO0o0 = iBinder;
        this.f14665OooO0o = connectionResult;
        this.f14667OooO0oO = z;
        this.f14668OooO0oo = z2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zav)) {
            return false;
        }
        zav zavVar = (zav) obj;
        return this.f14665OooO0o.equals(zavVar.f14665OooO0o) && Objects.equal(zab(), zavVar.zab());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f14664OooO0Oo);
        SafeParcelWriter.writeIBinder(parcel, 2, this.f14666OooO0o0, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f14665OooO0o, i, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f14667OooO0oO);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f14668OooO0oo);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final ConnectionResult zaa() {
        return this.f14665OooO0o;
    }

    @Nullable
    public final IAccountAccessor zab() {
        IBinder iBinder = this.f14666OooO0o0;
        if (iBinder == null) {
            return null;
        }
        return IAccountAccessor.Stub.asInterface(iBinder);
    }

    public final boolean zac() {
        return this.f14667OooO0oO;
    }

    public final boolean zad() {
        return this.f14668OooO0oo;
    }
}
