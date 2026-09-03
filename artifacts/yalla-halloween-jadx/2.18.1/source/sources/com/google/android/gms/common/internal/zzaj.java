package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "ValidateAccountRequestCreator")
@Deprecated
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new zzak();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1)
    public final int f15661Oooo0o;

    @SafeParcelable.Constructor
    public zzaj(@SafeParcelable.Param(id = 1) int i) {
        this.f15661Oooo0o = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f15661Oooo0o);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
