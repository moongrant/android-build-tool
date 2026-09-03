package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzec extends com.google.android.gms.internal.measurement.zzbm implements zzee {
    public zzec(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final String zzd(zzq zzqVar) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        com.google.android.gms.internal.measurement.zzbo.zze(parcelOooOOOo, zzqVar);
        Parcel parcelOooOOo0 = OooOOo0(11, parcelOooOOOo);
        String string = parcelOooOOo0.readString();
        parcelOooOOo0.recycle();
        return string;
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final List zze(zzq zzqVar, boolean z) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        com.google.android.gms.internal.measurement.zzbo.zze(parcelOooOOOo, zzqVar);
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelOooOOOo, z);
        Parcel parcelOooOOo0 = OooOOo0(7, parcelOooOOOo);
        ArrayList arrayListCreateTypedArrayList = parcelOooOOo0.createTypedArrayList(zzlc.CREATOR);
        parcelOooOOo0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final List zzf(String str, String str2, zzq zzqVar) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        parcelOooOOOo.writeString(str);
        parcelOooOOOo.writeString(str2);
        com.google.android.gms.internal.measurement.zzbo.zze(parcelOooOOOo, zzqVar);
        Parcel parcelOooOOo0 = OooOOo0(16, parcelOooOOOo);
        ArrayList arrayListCreateTypedArrayList = parcelOooOOo0.createTypedArrayList(zzac.CREATOR);
        parcelOooOOo0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final List zzg(String str, String str2, String str3) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        parcelOooOOOo.writeString(null);
        parcelOooOOOo.writeString(str2);
        parcelOooOOOo.writeString(str3);
        Parcel parcelOooOOo0 = OooOOo0(17, parcelOooOOOo);
        ArrayList arrayListCreateTypedArrayList = parcelOooOOo0.createTypedArrayList(zzac.CREATOR);
        parcelOooOOo0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final List zzh(String str, String str2, boolean z, zzq zzqVar) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        parcelOooOOOo.writeString(str);
        parcelOooOOOo.writeString(str2);
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelOooOOOo, z);
        com.google.android.gms.internal.measurement.zzbo.zze(parcelOooOOOo, zzqVar);
        Parcel parcelOooOOo0 = OooOOo0(14, parcelOooOOOo);
        ArrayList arrayListCreateTypedArrayList = parcelOooOOo0.createTypedArrayList(zzlc.CREATOR);
        parcelOooOOo0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final List zzi(String str, String str2, String str3, boolean z) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        parcelOooOOOo.writeString(null);
        parcelOooOOOo.writeString(str2);
        parcelOooOOOo.writeString(str3);
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelOooOOOo, z);
        Parcel parcelOooOOo0 = OooOOo0(15, parcelOooOOOo);
        ArrayList arrayListCreateTypedArrayList = parcelOooOOo0.createTypedArrayList(zzlc.CREATOR);
        parcelOooOOo0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void zzj(zzq zzqVar) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        com.google.android.gms.internal.measurement.zzbo.zze(parcelOooOOOo, zzqVar);
        OooOOo(4, parcelOooOOOo);
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void zzk(zzaw zzawVar, zzq zzqVar) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        com.google.android.gms.internal.measurement.zzbo.zze(parcelOooOOOo, zzawVar);
        com.google.android.gms.internal.measurement.zzbo.zze(parcelOooOOOo, zzqVar);
        OooOOo(1, parcelOooOOOo);
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void zzl(zzaw zzawVar, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void zzm(zzq zzqVar) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        com.google.android.gms.internal.measurement.zzbo.zze(parcelOooOOOo, zzqVar);
        OooOOo(18, parcelOooOOOo);
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void zzn(zzac zzacVar, zzq zzqVar) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        com.google.android.gms.internal.measurement.zzbo.zze(parcelOooOOOo, zzacVar);
        com.google.android.gms.internal.measurement.zzbo.zze(parcelOooOOOo, zzqVar);
        OooOOo(12, parcelOooOOOo);
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void zzo(zzac zzacVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void zzp(zzq zzqVar) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        com.google.android.gms.internal.measurement.zzbo.zze(parcelOooOOOo, zzqVar);
        OooOOo(20, parcelOooOOOo);
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void zzq(long j, String str, String str2, String str3) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        parcelOooOOOo.writeLong(j);
        parcelOooOOOo.writeString(str);
        parcelOooOOOo.writeString(str2);
        parcelOooOOOo.writeString(str3);
        OooOOo(10, parcelOooOOOo);
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void zzr(Bundle bundle, zzq zzqVar) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        com.google.android.gms.internal.measurement.zzbo.zze(parcelOooOOOo, bundle);
        com.google.android.gms.internal.measurement.zzbo.zze(parcelOooOOOo, zzqVar);
        OooOOo(19, parcelOooOOOo);
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void zzs(zzq zzqVar) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        com.google.android.gms.internal.measurement.zzbo.zze(parcelOooOOOo, zzqVar);
        OooOOo(6, parcelOooOOOo);
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void zzt(zzlc zzlcVar, zzq zzqVar) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        com.google.android.gms.internal.measurement.zzbo.zze(parcelOooOOOo, zzlcVar);
        com.google.android.gms.internal.measurement.zzbo.zze(parcelOooOOOo, zzqVar);
        OooOOo(2, parcelOooOOOo);
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final byte[] zzu(zzaw zzawVar, String str) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        com.google.android.gms.internal.measurement.zzbo.zze(parcelOooOOOo, zzawVar);
        parcelOooOOOo.writeString(str);
        Parcel parcelOooOOo0 = OooOOo0(9, parcelOooOOOo);
        byte[] bArrCreateByteArray = parcelOooOOo0.createByteArray();
        parcelOooOOo0.recycle();
        return bArrCreateByteArray;
    }
}
