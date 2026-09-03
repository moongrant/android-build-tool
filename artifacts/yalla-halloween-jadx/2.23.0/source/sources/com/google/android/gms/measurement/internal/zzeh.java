package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeh extends com.google.android.gms.internal.measurement.zzbm implements zzej {
    public zzeh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    public final String zzd(zzq zzqVar) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelOooOOo, zzqVar);
        Parcel parcelOooOOoo = OooOOoo(parcelOooOOo, 11);
        String string = parcelOooOOoo.readString();
        parcelOooOOoo.recycle();
        return string;
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    public final List zze(zzq zzqVar, boolean z) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelOooOOo, zzqVar);
        parcelOooOOo.writeInt(z ? 1 : 0);
        Parcel parcelOooOOoo = OooOOoo(parcelOooOOo, 7);
        ArrayList arrayListCreateTypedArrayList = parcelOooOOoo.createTypedArrayList(zzlk.CREATOR);
        parcelOooOOoo.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    public final List zzf(String str, String str2, zzq zzqVar) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        parcelOooOOo.writeString(str);
        parcelOooOOo.writeString(str2);
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelOooOOo, zzqVar);
        Parcel parcelOooOOoo = OooOOoo(parcelOooOOo, 16);
        ArrayList arrayListCreateTypedArrayList = parcelOooOOoo.createTypedArrayList(zzac.CREATOR);
        parcelOooOOoo.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    public final List zzg(String str, String str2, String str3) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        parcelOooOOo.writeString(null);
        parcelOooOOo.writeString(str2);
        parcelOooOOo.writeString(str3);
        Parcel parcelOooOOoo = OooOOoo(parcelOooOOo, 17);
        ArrayList arrayListCreateTypedArrayList = parcelOooOOoo.createTypedArrayList(zzac.CREATOR);
        parcelOooOOoo.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    public final List zzh(String str, String str2, boolean z, zzq zzqVar) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        parcelOooOOo.writeString(str);
        parcelOooOOo.writeString(str2);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.zzbo.f15671OooO00o;
        parcelOooOOo.writeInt(z ? 1 : 0);
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelOooOOo, zzqVar);
        Parcel parcelOooOOoo = OooOOoo(parcelOooOOo, 14);
        ArrayList arrayListCreateTypedArrayList = parcelOooOOoo.createTypedArrayList(zzlk.CREATOR);
        parcelOooOOoo.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    public final List zzi(String str, String str2, String str3, boolean z) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        parcelOooOOo.writeString(null);
        parcelOooOOo.writeString(str2);
        parcelOooOOo.writeString(str3);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.zzbo.f15671OooO00o;
        parcelOooOOo.writeInt(z ? 1 : 0);
        Parcel parcelOooOOoo = OooOOoo(parcelOooOOo, 15);
        ArrayList arrayListCreateTypedArrayList = parcelOooOOoo.createTypedArrayList(zzlk.CREATOR);
        parcelOooOOoo.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    public final void zzj(zzq zzqVar) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelOooOOo, zzqVar);
        OooOo00(parcelOooOOo, 4);
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    public final void zzk(zzau zzauVar, zzq zzqVar) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelOooOOo, zzauVar);
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelOooOOo, zzqVar);
        OooOo00(parcelOooOOo, 1);
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    public final void zzl(zzau zzauVar, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    public final void zzm(zzq zzqVar) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelOooOOo, zzqVar);
        OooOo00(parcelOooOOo, 18);
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    public final void zzn(zzac zzacVar, zzq zzqVar) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelOooOOo, zzacVar);
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelOooOOo, zzqVar);
        OooOo00(parcelOooOOo, 12);
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    public final void zzo(zzac zzacVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    public final void zzp(zzq zzqVar) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelOooOOo, zzqVar);
        OooOo00(parcelOooOOo, 20);
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    public final void zzq(long j, String str, String str2, String str3) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        parcelOooOOo.writeLong(j);
        parcelOooOOo.writeString(str);
        parcelOooOOo.writeString(str2);
        parcelOooOOo.writeString(str3);
        OooOo00(parcelOooOOo, 10);
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    public final void zzr(Bundle bundle, zzq zzqVar) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelOooOOo, bundle);
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelOooOOo, zzqVar);
        OooOo00(parcelOooOOo, 19);
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    public final void zzs(zzq zzqVar) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelOooOOo, zzqVar);
        OooOo00(parcelOooOOo, 6);
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    public final void zzt(zzlk zzlkVar, zzq zzqVar) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelOooOOo, zzlkVar);
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelOooOOo, zzqVar);
        OooOo00(parcelOooOOo, 2);
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    public final byte[] zzu(zzau zzauVar, String str) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelOooOOo, zzauVar);
        parcelOooOOo.writeString(str);
        Parcel parcelOooOOoo = OooOOoo(parcelOooOOo, 9);
        byte[] bArrCreateByteArray = parcelOooOOoo.createByteArray();
        parcelOooOOoo.recycle();
        return bArrCreateByteArray;
    }
}
