package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzf extends zzi implements zzg {
    @Override // com.google.android.gms.internal.play_billing.zzi
    public final boolean OooOOo(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) zzj.zza(parcel, Bundle.CREATOR);
        zzj.zzb(parcel);
        zza(bundle);
        parcel2.writeNoException();
        return true;
    }
}
