package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.platform.o00O0;
import com.android.billingclient.api.o0O0O00;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "GoogleCertificatesLookupResponseCreator")
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzr();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getFirstPartyStatusValue", id = 4)
    public final int f15809Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getResult", id = 1)
    public final boolean f15810Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getErrorMessage", id = 2)
    public final String f15811Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStatusValue", id = 3)
    public final int f15812Oooo0oo;

    @SafeParcelable.Constructor
    public zzq(@SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) int i2) {
        this.f15810Oooo0o = z;
        this.f15811Oooo0oO = str;
        this.f15812Oooo0oo = o0O0O00.OooO0O0(i) - 1;
        this.f15809Oooo = o00O0.OooOo0O(i2) - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.f15810Oooo0o);
        SafeParcelWriter.writeString(parcel, 2, this.f15811Oooo0oO, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f15812Oooo0oo);
        SafeParcelWriter.writeInt(parcel, 4, this.f15809Oooo);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Nullable
    public final String zza() {
        return this.f15811Oooo0oO;
    }

    public final boolean zzb() {
        return this.f15810Oooo0o;
    }

    public final int zzc() {
        return o00O0.OooOo0O(this.f15809Oooo);
    }

    public final int zzd() {
        return o0O0O00.OooO0O0(this.f15812Oooo0oo);
    }
}
