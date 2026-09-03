package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcg extends zzbm implements zzci {
    public zzcg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final int zzd() throws RemoteException {
        Parcel parcelOooOOo0 = OooOOo0(2, OooOOOo());
        int i = parcelOooOOo0.readInt();
        parcelOooOOo0.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final void zze(String str, String str2, Bundle bundle, long j) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        parcelOooOOOo.writeString(str);
        parcelOooOOOo.writeString(str2);
        zzbo.zze(parcelOooOOOo, bundle);
        parcelOooOOOo.writeLong(j);
        OooOOo(1, parcelOooOOOo);
    }
}
