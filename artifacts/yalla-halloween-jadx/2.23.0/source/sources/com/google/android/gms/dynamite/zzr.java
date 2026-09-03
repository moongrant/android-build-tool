package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* JADX INFO: loaded from: classes3.dex */
public final class zzr extends zza {
    public zzr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        zzc.zzf(parcelOooOOoo, iObjectWrapper);
        parcelOooOOoo.writeString(str);
        parcelOooOOoo.writeInt(i);
        zzc.zzf(parcelOooOOoo, iObjectWrapper2);
        Parcel parcelOooOOo = OooOOo(parcelOooOOoo, 2);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelOooOOo.readStrongBinder());
        parcelOooOOo.recycle();
        return iObjectWrapperAsInterface;
    }

    public final IObjectWrapper zzf(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        zzc.zzf(parcelOooOOoo, iObjectWrapper);
        parcelOooOOoo.writeString(str);
        parcelOooOOoo.writeInt(i);
        zzc.zzf(parcelOooOOoo, iObjectWrapper2);
        Parcel parcelOooOOo = OooOOo(parcelOooOOoo, 3);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelOooOOo.readStrongBinder());
        parcelOooOOo.recycle();
        return iObjectWrapperAsInterface;
    }
}
