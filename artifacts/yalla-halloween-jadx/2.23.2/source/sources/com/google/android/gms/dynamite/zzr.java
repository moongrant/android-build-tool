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
        Parcel parcelOooOo00 = OooOo00();
        zzc.zzf(parcelOooOo00, iObjectWrapper);
        parcelOooOo00.writeString(str);
        parcelOooOo00.writeInt(i);
        zzc.zzf(parcelOooOo00, iObjectWrapper2);
        Parcel parcelOooOOoo = OooOOoo(parcelOooOo00, 2);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelOooOOoo.readStrongBinder());
        parcelOooOOoo.recycle();
        return iObjectWrapperAsInterface;
    }

    public final IObjectWrapper zzf(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcelOooOo00 = OooOo00();
        zzc.zzf(parcelOooOo00, iObjectWrapper);
        parcelOooOo00.writeString(str);
        parcelOooOo00.writeInt(i);
        zzc.zzf(parcelOooOo00, iObjectWrapper2);
        Parcel parcelOooOOoo = OooOOoo(parcelOooOo00, 3);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelOooOOoo.readStrongBinder());
        parcelOooOOoo.recycle();
        return iObjectWrapperAsInterface;
    }
}
