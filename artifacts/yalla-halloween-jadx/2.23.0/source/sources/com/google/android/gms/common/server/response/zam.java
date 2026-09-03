package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes3.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "FieldMapPairCreator")
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new zak();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1)
    public final int f15232OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    public final FastJsonResponse.Field<?, ?> f15233OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    public final String f15234OooO0o0;

    @SafeParcelable.Constructor
    public zam(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 3) FastJsonResponse.Field field, @SafeParcelable.Param(id = 2) String str) {
        this.f15232OooO0Oo = i;
        this.f15234OooO0o0 = str;
        this.f15233OooO0o = field;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f15232OooO0Oo);
        SafeParcelWriter.writeString(parcel, 2, this.f15234OooO0o0, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f15233OooO0o, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zam(FastJsonResponse.Field field, String str) {
        this.f15232OooO0Oo = 1;
        this.f15234OooO0o0 = str;
        this.f15233OooO0o = field;
    }
}
