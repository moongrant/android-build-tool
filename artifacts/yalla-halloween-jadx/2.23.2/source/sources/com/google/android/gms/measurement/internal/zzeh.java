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
        Parcel parcelOooOOoo = OooOOoo();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelOooOOoo, zzqVar);
        Parcel parcelOooOo00 = OooOo00(parcelOooOOoo, 11);
        String string = parcelOooOo00.readString();
        parcelOooOo00.recycle();
        return string;
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    public final List zze(zzq zzqVar, boolean z) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelOooOOoo, zzqVar);
        parcelOooOOoo.writeInt(z ? 1 : 0);
        Parcel parcelOooOo00 = OooOo00(parcelOooOOoo, 7);
        ArrayList arrayListCreateTypedArrayList = parcelOooOo00.createTypedArrayList(zzlk.CREATOR);
        parcelOooOo00.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    public final List zzf(String str, String str2, zzq zzqVar) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        parcelOooOOoo.writeString(str);
        parcelOooOOoo.writeString(str2);
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelOooOOoo, zzqVar);
        Parcel parcelOooOo00 = OooOo00(parcelOooOOoo, 16);
        ArrayList arrayListCreateTypedArrayList = parcelOooOo00.createTypedArrayList(zzac.CREATOR);
        parcelOooOo00.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    public final List zzg(String str, String str2, String str3) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        parcelOooOOoo.writeString(null);
        parcelOooOOoo.writeString(str2);
        parcelOooOOoo.writeString(str3);
        Parcel parcelOooOo00 = OooOo00(parcelOooOOoo, 17);
        ArrayList arrayListCreateTypedArrayList = parcelOooOo00.createTypedArrayList(zzac.CREATOR);
        parcelOooOo00.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    public final List zzh(String str, String str2, boolean z, zzq zzqVar) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        parcelOooOOoo.writeString(str);
        parcelOooOOoo.writeString(str2);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.zzbo.f15195OooO00o;
        parcelOooOOoo.writeInt(z ? 1 : 0);
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelOooOOoo, zzqVar);
        Parcel parcelOooOo00 = OooOo00(parcelOooOOoo, 14);
        ArrayList arrayListCreateTypedArrayList = parcelOooOo00.createTypedArrayList(zzlk.CREATOR);
        parcelOooOo00.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    public final List zzi(String str, String str2, String str3, boolean z) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        parcelOooOOoo.writeString(null);
        parcelOooOOoo.writeString(str2);
        parcelOooOOoo.writeString(str3);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.zzbo.f15195OooO00o;
        parcelOooOOoo.writeInt(z ? 1 : 0);
        Parcel parcelOooOo00 = OooOo00(parcelOooOOoo, 15);
        ArrayList arrayListCreateTypedArrayList = parcelOooOo00.createTypedArrayList(zzlk.CREATOR);
        parcelOooOo00.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    public final void zzj(zzq zzqVar) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelOooOOoo, zzqVar);
        OooOo0(parcelOooOOoo, 4);
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    public final void zzk(zzau zzauVar, zzq zzqVar) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelOooOOoo, zzauVar);
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelOooOOoo, zzqVar);
        OooOo0(parcelOooOOoo, 1);
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    public final void zzl(zzau zzauVar, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    public final void zzm(zzq zzqVar) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelOooOOoo, zzqVar);
        OooOo0(parcelOooOOoo, 18);
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    public final void zzn(zzac zzacVar, zzq zzqVar) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelOooOOoo, zzacVar);
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelOooOOoo, zzqVar);
        OooOo0(parcelOooOOoo, 12);
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    public final void zzo(zzac zzacVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    public final void zzp(zzq zzqVar) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelOooOOoo, zzqVar);
        OooOo0(parcelOooOOoo, 20);
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    public final void zzq(long j, String str, String str2, String str3) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        parcelOooOOoo.writeLong(j);
        parcelOooOOoo.writeString(str);
        parcelOooOOoo.writeString(str2);
        parcelOooOOoo.writeString(str3);
        OooOo0(parcelOooOOoo, 10);
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    public final void zzr(Bundle bundle, zzq zzqVar) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelOooOOoo, bundle);
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelOooOOoo, zzqVar);
        OooOo0(parcelOooOOoo, 19);
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    public final void zzs(zzq zzqVar) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelOooOOoo, zzqVar);
        OooOo0(parcelOooOOoo, 6);
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    public final void zzt(zzlk zzlkVar, zzq zzqVar) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelOooOOoo, zzlkVar);
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelOooOOoo, zzqVar);
        OooOo0(parcelOooOOoo, 2);
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    public final byte[] zzu(zzau zzauVar, String str) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelOooOOoo, zzauVar);
        parcelOooOOoo.writeString(str);
        Parcel parcelOooOo00 = OooOo00(parcelOooOOoo, 9);
        byte[] bArrCreateByteArray = parcelOooOo00.createByteArray();
        parcelOooOo00.recycle();
        return bArrCreateByteArray;
    }
}
