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
import p254o00ooO0o.o00;
import p254o00ooO0o.o00O0000;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "GoogleCertificatesQueryCreator")
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCallingPackage", id = 1)
    public final String f14830OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAllowTestKeys", id = 3)
    public final boolean f14831OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getCallingCertificateBinder", id = 2, type = "android.os.IBinder")
    public final o00 f14832OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "false", getter = "getIgnoreTestKeysOverride", id = 4)
    public final boolean f14833OooO0oO;

    public zzs(String str, @Nullable o00 o00Var, boolean z, boolean z2) {
        this.f14830OooO0Oo = str;
        this.f14832OooO0o0 = o00Var;
        this.f14831OooO0o = z;
        this.f14833OooO0oO = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f14830OooO0Oo, false);
        o00 o00Var = this.f14832OooO0o0;
        if (o00Var == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            o00Var = null;
        }
        SafeParcelWriter.writeIBinder(parcel, 2, o00Var, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f14831OooO0o);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f14833OooO0oO);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzs(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) @Nullable IBinder iBinder, @SafeParcelable.Param(id = 3) boolean z, @SafeParcelable.Param(id = 4) boolean z2) {
        this.f14830OooO0Oo = str;
        o00O0000 o00o0001 = null;
        if (iBinder != null) {
            try {
                IObjectWrapper iObjectWrapperZzd = zzy.zzg(iBinder).zzd();
                byte[] bArr = iObjectWrapperZzd == null ? null : (byte[]) ObjectWrapper.unwrap(iObjectWrapperZzd);
                if (bArr != null) {
                    o00o0001 = new o00O0000(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.f14832OooO0o0 = o00o0001;
        this.f14831OooO0o = z;
        this.f14833OooO0oO = z2;
    }
}
