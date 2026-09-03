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
        Parcel parcelOooOo00 = OooOo00();
        com.google.android.gms.internal.common.zzc.zzd(parcelOooOo00, zzoVar);
        Parcel parcelOooOOoo = OooOOoo(parcelOooOo00, 6);
        zzq zzqVar = (zzq) com.google.android.gms.internal.common.zzc.zza(parcelOooOOoo, zzq.CREATOR);
        parcelOooOOoo.recycle();
        return zzqVar;
    }

    @Override // com.google.android.gms.common.internal.zzaf
    public final zzq zzf(zzo zzoVar) throws RemoteException {
        Parcel parcelOooOo00 = OooOo00();
        com.google.android.gms.internal.common.zzc.zzd(parcelOooOo00, zzoVar);
        Parcel parcelOooOOoo = OooOOoo(parcelOooOo00, 8);
        zzq zzqVar = (zzq) com.google.android.gms.internal.common.zzc.zza(parcelOooOOoo, zzq.CREATOR);
        parcelOooOOoo.recycle();
        return zzqVar;
    }

    @Override // com.google.android.gms.common.internal.zzaf
    public final boolean zzg() throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo(OooOo00(), 9);
        boolean zZzg = com.google.android.gms.internal.common.zzc.zzg(parcelOooOOoo);
        parcelOooOOoo.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.common.internal.zzaf
    public final boolean zzh(com.google.android.gms.common.zzs zzsVar, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelOooOo00 = OooOo00();
        com.google.android.gms.internal.common.zzc.zzd(parcelOooOo00, zzsVar);
        com.google.android.gms.internal.common.zzc.zzf(parcelOooOo00, iObjectWrapper);
        Parcel parcelOooOOoo = OooOOoo(parcelOooOo00, 5);
        boolean zZzg = com.google.android.gms.internal.common.zzc.zzg(parcelOooOOoo);
        parcelOooOOoo.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.common.internal.zzaf
    public final boolean zzi() throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo(OooOo00(), 7);
        boolean zZzg = com.google.android.gms.internal.common.zzc.zzg(parcelOooOOoo);
        parcelOooOOoo.recycle();
        return zZzg;
    }
}
