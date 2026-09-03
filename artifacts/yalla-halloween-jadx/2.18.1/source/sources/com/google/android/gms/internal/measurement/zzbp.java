package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbp extends zzbm implements zzbr {
    public zzbp(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.zzbr
    public final Bundle zzd(Bundle bundle) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        zzbo.zze(parcelOooOOOo, bundle);
        Parcel parcelOooOOo0 = OooOOo0(1, parcelOooOOOo);
        Bundle bundle2 = (Bundle) zzbo.zza(parcelOooOOo0, Bundle.CREATOR);
        parcelOooOOo0.recycle();
        return bundle2;
    }
}
