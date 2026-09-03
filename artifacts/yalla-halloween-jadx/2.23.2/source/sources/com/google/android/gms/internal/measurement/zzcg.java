package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcg extends zzbm implements zzci {
    public zzcg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final int zzd() throws RemoteException {
        Parcel parcelOooOo00 = OooOo00(OooOOoo(), 2);
        int i = parcelOooOo00.readInt();
        parcelOooOo00.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final void zze(String str, String str2, Bundle bundle, long j) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        parcelOooOOoo.writeString(str);
        parcelOooOOoo.writeString(str2);
        zzbo.zzd(parcelOooOOoo, bundle);
        parcelOooOOoo.writeLong(j);
        OooOo0(parcelOooOOoo, 1);
    }
}
