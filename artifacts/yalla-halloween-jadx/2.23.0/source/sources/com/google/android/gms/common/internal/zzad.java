package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.zzo;
import com.google.android.gms.common.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;

/* JADX INFO: loaded from: classes3.dex */
public final class zzad extends zza implements zzaf {
    public zzad(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.google.android.gms.common.internal.zzaf
    public final zzq zze(zzo zzoVar) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        com.google.android.gms.internal.common.zzc.zzd(parcelOooOOoo, zzoVar);
        Parcel parcelOooOOo = OooOOo(parcelOooOOoo, 6);
        zzq zzqVar = (zzq) com.google.android.gms.internal.common.zzc.zza(parcelOooOOo, zzq.CREATOR);
        parcelOooOOo.recycle();
        return zzqVar;
    }

    @Override // com.google.android.gms.common.internal.zzaf
    public final zzq zzf(zzo zzoVar) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        com.google.android.gms.internal.common.zzc.zzd(parcelOooOOoo, zzoVar);
        Parcel parcelOooOOo = OooOOo(parcelOooOOoo, 8);
        zzq zzqVar = (zzq) com.google.android.gms.internal.common.zzc.zza(parcelOooOOo, zzq.CREATOR);
        parcelOooOOo.recycle();
        return zzqVar;
    }

    @Override // com.google.android.gms.common.internal.zzaf
    public final boolean zzg() throws RemoteException {
        Parcel parcelOooOOo = OooOOo(OooOOoo(), 9);
        boolean zZzg = com.google.android.gms.internal.common.zzc.zzg(parcelOooOOo);
        parcelOooOOo.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.common.internal.zzaf
    public final boolean zzh(com.google.android.gms.common.zzs zzsVar, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        com.google.android.gms.internal.common.zzc.zzd(parcelOooOOoo, zzsVar);
        com.google.android.gms.internal.common.zzc.zzf(parcelOooOOoo, iObjectWrapper);
        Parcel parcelOooOOo = OooOOo(parcelOooOOoo, 5);
        boolean zZzg = com.google.android.gms.internal.common.zzc.zzg(parcelOooOOo);
        parcelOooOOo.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.common.internal.zzaf
    public final boolean zzi() throws RemoteException {
        Parcel parcelOooOOo = OooOOo(OooOOoo(), 7);
        boolean zZzg = com.google.android.gms.internal.common.zzc.zzg(parcelOooOOo);
        parcelOooOOo.recycle();
        return zZzg;
    }
}
