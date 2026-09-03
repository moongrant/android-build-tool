package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.zzo;
import com.google.android.gms.common.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;

/* JADX INFO: loaded from: classes2.dex */
public final class zzad extends zza implements zzaf {
    public zzad(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.google.android.gms.common.internal.zzaf
    public final zzq zze(zzo zzoVar) throws RemoteException {
        Parcel parcelOooOOo0 = OooOOo0();
        com.google.android.gms.internal.common.zzc.zzd(parcelOooOOo0, zzoVar);
        Parcel parcelOooOOOo = OooOOOo(6, parcelOooOOo0);
        zzq zzqVar = (zzq) com.google.android.gms.internal.common.zzc.zza(parcelOooOOOo, zzq.CREATOR);
        parcelOooOOOo.recycle();
        return zzqVar;
    }

    @Override // com.google.android.gms.common.internal.zzaf
    public final zzq zzf(zzo zzoVar) throws RemoteException {
        Parcel parcelOooOOo0 = OooOOo0();
        com.google.android.gms.internal.common.zzc.zzd(parcelOooOOo0, zzoVar);
        Parcel parcelOooOOOo = OooOOOo(8, parcelOooOOo0);
        zzq zzqVar = (zzq) com.google.android.gms.internal.common.zzc.zza(parcelOooOOOo, zzq.CREATOR);
        parcelOooOOOo.recycle();
        return zzqVar;
    }

    @Override // com.google.android.gms.common.internal.zzaf
    public final boolean zzg() throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo(9, OooOOo0());
        boolean zZzg = com.google.android.gms.internal.common.zzc.zzg(parcelOooOOOo);
        parcelOooOOOo.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.common.internal.zzaf
    public final boolean zzh(com.google.android.gms.common.zzs zzsVar, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelOooOOo0 = OooOOo0();
        com.google.android.gms.internal.common.zzc.zzd(parcelOooOOo0, zzsVar);
        com.google.android.gms.internal.common.zzc.zzf(parcelOooOOo0, iObjectWrapper);
        Parcel parcelOooOOOo = OooOOOo(5, parcelOooOOo0);
        boolean zZzg = com.google.android.gms.internal.common.zzc.zzg(parcelOooOOOo);
        parcelOooOOOo.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.common.internal.zzaf
    public final boolean zzi() throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo(7, OooOOo0());
        boolean zZzg = com.google.android.gms.internal.common.zzc.zzg(parcelOooOOOo);
        parcelOooOOOo.recycle();
        return zZzg;
    }
}
