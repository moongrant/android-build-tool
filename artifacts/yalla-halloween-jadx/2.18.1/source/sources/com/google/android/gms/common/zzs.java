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
import p330o0O0ooo0.o000O;
import p330o0O0ooo0.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "GoogleCertificatesQueryCreator")
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "false", getter = "getIgnoreTestKeysOverride", id = 4)
    public final boolean f15813Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCallingPackage", id = 1)
    public final String f15814Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getCallingCertificateBinder", id = 2, type = "android.os.IBinder")
    public final o000O0O0 f15815Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAllowTestKeys", id = 3)
    public final boolean f15816Oooo0oo;

    @SafeParcelable.Constructor
    public zzs(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) @Nullable IBinder iBinder, @SafeParcelable.Param(id = 3) boolean z, @SafeParcelable.Param(id = 4) boolean z2) {
        this.f15814Oooo0o = str;
        o000O o000o = null;
        if (iBinder != null) {
            try {
                IObjectWrapper iObjectWrapperZzd = zzy.zzg(iBinder).zzd();
                byte[] bArr = iObjectWrapperZzd == null ? null : (byte[]) ObjectWrapper.unwrap(iObjectWrapperZzd);
                if (bArr != null) {
                    o000o = new o000O(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.f15815Oooo0oO = o000o;
        this.f15816Oooo0oo = z;
        this.f15813Oooo = z2;
    }

    public zzs(String str, @Nullable o000O0O0 o000o0o1, boolean z, boolean z2) {
        this.f15814Oooo0o = str;
        this.f15815Oooo0oO = o000o0o1;
        this.f15816Oooo0oo = z;
        this.f15813Oooo = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f15814Oooo0o, false);
        o000O0O0 o000o0o1 = this.f15815Oooo0oO;
        if (o000o0o1 == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            o000o0o1 = null;
        }
        SafeParcelWriter.writeIBinder(parcel, 2, o000o0o1, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f15816Oooo0oo);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f15813Oooo);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
