package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbp extends zzbm implements zzbr {
    public zzbp(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.zzbr
    public final Bundle zzd(Bundle bundle) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        zzbo.zzd(parcelOooOOo, bundle);
        Parcel parcelOooOOoo = OooOOoo(parcelOooOOo, 1);
        Bundle bundle2 = (Bundle) zzbo.zza(parcelOooOOoo, Bundle.CREATOR);
        parcelOooOOoo.recycle();
        return bundle2;
    }
}
