package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "StringToIntConverterEntryCreator")
public final class zac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zac> CREATOR = new zae();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1)
    public final int f14712OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    public final int f14713OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    public final String f14714OooO0o0;

    @SafeParcelable.Constructor
    public zac(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i2) {
        this.f14712OooO0Oo = i;
        this.f14714OooO0o0 = str;
        this.f14713OooO0o = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f14712OooO0Oo);
        SafeParcelWriter.writeString(parcel, 2, this.f14714OooO0o0, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f14713OooO0o);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zac(String str, int i) {
        this.f14712OooO0Oo = 1;
        this.f14714OooO0o0 = str;
        this.f14713OooO0o = i;
    }
}
