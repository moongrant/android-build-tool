package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzd extends zza implements zzf {
    public zzd(IBinder iBinder) {
        super(iBinder);
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final String zzc() throws RemoteException {
        Parcel parcelOooOOo0 = OooOOo0(1, OooOOOo());
        String string = parcelOooOOo0.readString();
        parcelOooOOo0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final boolean zzd() throws RemoteException {
        Parcel parcelOooOOo0 = OooOOo0(6, OooOOOo());
        boolean zZzb = zzc.zzb(parcelOooOOo0);
        parcelOooOOo0.recycle();
        return zZzb;
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final boolean zze(boolean z) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        zzc.zza(parcelOooOOOo, true);
        Parcel parcelOooOOo0 = OooOOo0(2, parcelOooOOOo);
        boolean zZzb = zzc.zzb(parcelOooOOo0);
        parcelOooOOo0.recycle();
        return zZzb;
    }
}
