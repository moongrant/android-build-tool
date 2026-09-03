package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zza;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaa extends zza implements IGmsCallbacks {
    public zzaa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void onPostInitComplete(int i, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel parcelOooOOo0 = OooOOo0();
        parcelOooOOo0.writeInt(i);
        parcelOooOOo0.writeStrongBinder(iBinder);
        com.google.android.gms.internal.common.zzc.zzd(parcelOooOOo0, bundle);
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f15869OooO00o.transact(1, parcelOooOOo0, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcelOooOOo0.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzb(int i, Bundle bundle) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzc(int i, IBinder iBinder, zzj zzjVar) throws RemoteException {
        throw null;
    }
}
