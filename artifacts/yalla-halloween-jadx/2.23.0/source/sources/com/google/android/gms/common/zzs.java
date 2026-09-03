package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzy;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.Nullable;
import p252o00ooO0o.o000O0Oo;
import p252o00ooO0o.o000OO0O;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "GoogleCertificatesQueryCreator")
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCallingPackage", id = 1)
    public final String f15306OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAllowTestKeys", id = 3)
    public final boolean f15307OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getCallingCertificateBinder", id = 2, type = "android.os.IBinder")
    public final o000O0Oo f15308OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "false", getter = "getIgnoreTestKeysOverride", id = 4)
    public final boolean f15309OooO0oO;

    public zzs(String str, @Nullable o000O0Oo o000o0oo2, boolean z, boolean z2) {
        this.f15306OooO0Oo = str;
        this.f15308OooO0o0 = o000o0oo2;
        this.f15307OooO0o = z;
        this.f15309OooO0oO = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f15306OooO0Oo, false);
        o000O0Oo o000o0oo2 = this.f15308OooO0o0;
        if (o000o0oo2 == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            o000o0oo2 = null;
        }
        SafeParcelWriter.writeIBinder(parcel, 2, o000o0oo2, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f15307OooO0o);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f15309OooO0oO);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzs(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) @Nullable IBinder iBinder, @SafeParcelable.Param(id = 3) boolean z, @SafeParcelable.Param(id = 4) boolean z2) {
        this.f15306OooO0Oo = str;
        o000OO0O o000oo0o2 = null;
        if (iBinder != null) {
            try {
                IObjectWrapper iObjectWrapperZzd = zzy.zzg(iBinder).zzd();
                byte[] bArr = iObjectWrapperZzd == null ? null : (byte[]) ObjectWrapper.unwrap(iObjectWrapperZzd);
                if (bArr != null) {
                    o000oo0o2 = new o000OO0O(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.f15308OooO0o0 = o000oo0o2;
        this.f15307OooO0o = z;
        this.f15309OooO0oO = z2;
    }
}
