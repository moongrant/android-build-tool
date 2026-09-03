package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Iterator;
import p269o00ooooo.o0OO000;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "EventParamsCreator")
@SafeParcelable.Reserved({1})
public final class zzas extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzas> CREATOR = new zzat();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @SafeParcelable.Field(getter = "z", id = 2)
    public final Bundle f15891OooO0Oo;

    @SafeParcelable.Constructor
    public zzas(@SafeParcelable.Param(id = 2) Bundle bundle) {
        this.f15891OooO0Oo = bundle;
    }

    public final Double OooO00o() {
        return Double.valueOf(this.f15891OooO0Oo.getDouble(AppMeasurementSdk.ConditionalUserProperty.VALUE));
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new o0OO000(this);
    }

    public final String toString() {
        return this.f15891OooO0Oo.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, zzc(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.f15891OooO0Oo.size();
    }

    public final Bundle zzc() {
        return new Bundle(this.f15891OooO0Oo);
    }
}
