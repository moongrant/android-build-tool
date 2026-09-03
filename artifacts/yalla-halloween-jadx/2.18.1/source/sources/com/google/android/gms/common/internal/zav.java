package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "ResolveAccountResponseCreator")
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new zaw();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSaveDefaultAccount", id = 4)
    public final boolean f15647Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1)
    public final int f15648Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(id = 2)
    public final IBinder f15649Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getConnectionResult", id = 3)
    public final ConnectionResult f15650Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @SafeParcelable.Field(getter = "isFromCrossClientAuth", id = 5)
    public final boolean f15651OoooO00;

    @SafeParcelable.Constructor
    public zav(@SafeParcelable.Param(id = 1) int i, @Nullable @SafeParcelable.Param(id = 2) IBinder iBinder, @SafeParcelable.Param(id = 3) ConnectionResult connectionResult, @SafeParcelable.Param(id = 4) boolean z, @SafeParcelable.Param(id = 5) boolean z2) {
        this.f15648Oooo0o = i;
        this.f15649Oooo0oO = iBinder;
        this.f15650Oooo0oo = connectionResult;
        this.f15647Oooo = z;
        this.f15651OoooO00 = z2;
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
        return this.f15650Oooo0oo.equals(zavVar.f15650Oooo0oo) && Objects.equal(zab(), zavVar.zab());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f15648Oooo0o);
        SafeParcelWriter.writeIBinder(parcel, 2, this.f15649Oooo0oO, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f15650Oooo0oo, i, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f15647Oooo);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f15651OoooO00);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final ConnectionResult zaa() {
        return this.f15650Oooo0oo;
    }

    @Nullable
    public final IAccountAccessor zab() {
        IBinder iBinder = this.f15649Oooo0oO;
        if (iBinder == null) {
            return null;
        }
        return IAccountAccessor.Stub.asInterface(iBinder);
    }

    public final boolean zac() {
        return this.f15647Oooo;
    }

    public final boolean zad() {
        return this.f15651OoooO00;
    }
}
