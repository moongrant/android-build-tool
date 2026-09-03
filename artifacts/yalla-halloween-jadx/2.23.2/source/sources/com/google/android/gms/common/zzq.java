package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.Nullable;
import p548o0oOO.Oooo000;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "GoogleCertificatesLookupResponseCreator")
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzr();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getResult", id = 1)
    public final boolean f14826OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStatusValue", id = 3)
    public final int f14827OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getErrorMessage", id = 2)
    public final String f14828OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getFirstPartyStatusValue", id = 4)
    public final int f14829OooO0oO;

    @SafeParcelable.Constructor
    public zzq(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) int i2, @SafeParcelable.Param(id = 1) boolean z) {
        this.f14826OooO0Oo = z;
        this.f14828OooO0o0 = str;
        this.f14827OooO0o = Oooo000.OooO0O0(i) - 1;
        int i3 = 1;
        int[] iArr = {1, 2, 3};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr[i4];
            int i6 = i5 - 1;
            if (i5 == 0) {
                throw null;
            }
            if (i6 == i2) {
                i3 = i5;
                break;
            }
        }
        this.f14829OooO0oO = i3 - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.f14826OooO0Oo);
        SafeParcelWriter.writeString(parcel, 2, this.f14828OooO0o0, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f14827OooO0o);
        SafeParcelWriter.writeInt(parcel, 4, this.f14829OooO0oO);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Nullable
    public final String zza() {
        return this.f14828OooO0o0;
    }

    public final boolean zzb() {
        return this.f14826OooO0Oo;
    }

    public final int zzc() {
        int[] iArr = {1, 2, 3};
        for (int i = 0; i < 3; i++) {
            int i2 = iArr[i];
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            if (i3 == this.f14829OooO0oO) {
                return i2;
            }
        }
        return 1;
    }

    public final int zzd() {
        return Oooo000.OooO0O0(this.f14827OooO0o);
    }
}
