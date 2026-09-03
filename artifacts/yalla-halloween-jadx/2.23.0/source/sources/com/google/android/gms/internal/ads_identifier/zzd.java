package com.google.android.gms.internal.ads_identifier;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzd extends zza implements zzf {
    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final String zzc() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        Parcel parcelOooOOo = OooOOo(parcelObtain, 1);
        String string = parcelOooOOo.readString();
        parcelOooOOo.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final boolean zzd() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        Parcel parcelOooOOo = OooOOo(parcelObtain, 6);
        boolean zZzb = zzc.zzb(parcelOooOOo);
        parcelOooOOo.recycle();
        return zZzb;
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final boolean zze(boolean z) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        zzc.zza(parcelObtain, true);
        Parcel parcelOooOOo = OooOOo(parcelObtain, 2);
        boolean zZzb = zzc.zzb(parcelOooOOo);
        parcelOooOOo.recycle();
        return zZzb;
    }
}
