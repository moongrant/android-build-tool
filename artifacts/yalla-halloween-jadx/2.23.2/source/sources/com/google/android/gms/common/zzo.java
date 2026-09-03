package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "GoogleCertificatesLookupQueryCreator")
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new zzp();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCallingPackage", id = 1)
    public final String f14821OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "false", getter = "getIgnoreTestKeysOverride", id = 3)
    public final boolean f14822OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAllowTestKeys", id = 2)
    public final boolean f14823OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCallingContextBinder", id = 4, type = "android.os.IBinder")
    public final Context f14824OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getIsChimeraPackage", id = 5)
    public final boolean f14825OooO0oo;

    @SafeParcelable.Constructor
    public zzo(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) boolean z2, @SafeParcelable.Param(id = 4) IBinder iBinder, @SafeParcelable.Param(id = 5) boolean z3) {
        this.f14821OooO0Oo = str;
        this.f14823OooO0o0 = z;
        this.f14822OooO0o = z2;
        this.f14824OooO0oO = (Context) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder));
        this.f14825OooO0oo = z3;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.IBinder, com.google.android.gms.dynamic.IObjectWrapper] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f14821OooO0Oo, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.f14823OooO0o0);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f14822OooO0o);
        SafeParcelWriter.writeIBinder(parcel, 4, ObjectWrapper.wrap(this.f14824OooO0oO), false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f14825OooO0oo);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
