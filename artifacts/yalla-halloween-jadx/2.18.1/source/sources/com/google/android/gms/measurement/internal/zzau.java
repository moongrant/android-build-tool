package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import o0OO0OoO.OooOo00;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "EventParamsCreator")
@SafeParcelable.Reserved({1})
public final class zzau extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzau> CREATOR = new zzav();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @SafeParcelable.Field(getter = ak.aD, id = 2)
    public final Bundle f16095Oooo0o;

    @SafeParcelable.Constructor
    public zzau(@SafeParcelable.Param(id = 2) Bundle bundle) {
        this.f16095Oooo0o = bundle;
    }

    public final Double OooO00o() {
        return Double.valueOf(this.f16095Oooo0o.getDouble(AppMeasurementSdk.ConditionalUserProperty.VALUE));
    }

    public final Long OooO0O0() {
        return Long.valueOf(this.f16095Oooo0o.getLong(AppMeasurementSdk.ConditionalUserProperty.VALUE));
    }

    public final Object OooO0oo(String str) {
        return this.f16095Oooo0o.get(str);
    }

    public final String OoooO0O(String str) {
        return this.f16095Oooo0o.getString(str);
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new OooOo00(this);
    }

    public final String toString() {
        return this.f16095Oooo0o.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, zzc(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.f16095Oooo0o.size();
    }

    public final Bundle zzc() {
        return new Bundle(this.f16095Oooo0o);
    }
}
