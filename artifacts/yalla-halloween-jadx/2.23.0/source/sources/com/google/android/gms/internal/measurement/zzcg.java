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
        Parcel parcelOooOOoo = OooOOoo(OooOOo(), 2);
        int i = parcelOooOOoo.readInt();
        parcelOooOOoo.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final void zze(String str, String str2, Bundle bundle, long j) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        parcelOooOOo.writeString(str);
        parcelOooOOo.writeString(str2);
        zzbo.zzd(parcelOooOOo, bundle);
        parcelOooOOo.writeLong(j);
        OooOo00(parcelOooOOo, 1);
    }
}
