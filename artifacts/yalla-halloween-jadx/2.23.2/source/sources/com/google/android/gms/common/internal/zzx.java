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
        Parcel parcelOooOOoo = OooOOoo(OooOo00(), 2);
        int i = parcelOooOOoo.readInt();
        parcelOooOOoo.recycle();
        return i;
    }

    @Override // com.google.android.gms.common.internal.zzz
    public final IObjectWrapper zzd() throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo(OooOo00(), 1);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelOooOOoo.readStrongBinder());
        parcelOooOOoo.recycle();
        return iObjectWrapperAsInterface;
    }
}
