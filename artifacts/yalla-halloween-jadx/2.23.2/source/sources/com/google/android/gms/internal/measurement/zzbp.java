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
        Parcel parcelOooOOoo = OooOOoo();
        zzbo.zzd(parcelOooOOoo, bundle);
        Parcel parcelOooOo00 = OooOo00(parcelOooOOoo, 1);
        Bundle bundle2 = (Bundle) zzbo.zza(parcelOooOo00, Bundle.CREATOR);
        parcelOooOo00.recycle();
        return bundle2;
    }
}
