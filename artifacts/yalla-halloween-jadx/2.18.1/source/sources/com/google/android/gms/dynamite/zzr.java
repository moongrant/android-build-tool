package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* JADX INFO: loaded from: classes2.dex */
public final class zzr extends zza {
    public zzr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcelOooOOo0 = OooOOo0();
        zzc.zzf(parcelOooOOo0, iObjectWrapper);
        parcelOooOOo0.writeString(str);
        parcelOooOOo0.writeInt(i);
        zzc.zzf(parcelOooOOo0, iObjectWrapper2);
        Parcel parcelOooOOOo = OooOOOo(2, parcelOooOOo0);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelOooOOOo.readStrongBinder());
        parcelOooOOOo.recycle();
        return iObjectWrapperAsInterface;
    }

    public final IObjectWrapper zzf(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcelOooOOo0 = OooOOo0();
        zzc.zzf(parcelOooOOo0, iObjectWrapper);
        parcelOooOOo0.writeString(str);
        parcelOooOOo0.writeInt(i);
        zzc.zzf(parcelOooOOo0, iObjectWrapper2);
        Parcel parcelOooOOOo = OooOOOo(3, parcelOooOOo0);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelOooOOOo.readStrongBinder());
        parcelOooOOOo.recycle();
        return iObjectWrapperAsInterface;
    }
}
