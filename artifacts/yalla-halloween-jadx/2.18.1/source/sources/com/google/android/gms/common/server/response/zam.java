package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "FieldMapPairCreator")
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new zak();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1)
    public final int f15739Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    public final String f15740Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    public final FastJsonResponse.Field<?, ?> f15741Oooo0oo;

    @SafeParcelable.Constructor
    public zam(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) FastJsonResponse.Field<?, ?> field) {
        this.f15739Oooo0o = i;
        this.f15740Oooo0oO = str;
        this.f15741Oooo0oo = field;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f15739Oooo0o);
        SafeParcelWriter.writeString(parcel, 2, this.f15740Oooo0oO, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f15741Oooo0oo, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zam(String str, FastJsonResponse.Field<?, ?> field) {
        this.f15739Oooo0o = 1;
        this.f15740Oooo0oO = str;
        this.f15741Oooo0oo = field;
    }
}
