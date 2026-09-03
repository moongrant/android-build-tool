package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;

/* JADX INFO: loaded from: classes3.dex */
public final class zzx extends zza implements zzz {
    public zzx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.common.internal.zzz
    public final int zzc() throws RemoteException {
        Parcel parcelOooOOo = OooOOo(OooOOoo(), 2);
        int i = parcelOooOOo.readInt();
        parcelOooOOo.recycle();
        return i;
    }

    @Override // com.google.android.gms.common.internal.zzz
    public final IObjectWrapper zzd() throws RemoteException {
        Parcel parcelOooOOo = OooOOo(OooOOoo(), 1);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelOooOOo.readStrongBinder());
        parcelOooOOo.recycle();
        return iObjectWrapperAsInterface;
    }
}
