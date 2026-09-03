package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* JADX INFO: loaded from: classes2.dex */
public final class zzq extends zza {
    public zzq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int zze() throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo(6, OooOOo0());
        int i = parcelOooOOOo.readInt();
        parcelOooOOOo.recycle();
        return i;
    }

    public final int zzf(IObjectWrapper iObjectWrapper, String str, boolean z) throws RemoteException {
        Parcel parcelOooOOo0 = OooOOo0();
        zzc.zzf(parcelOooOOo0, iObjectWrapper);
        parcelOooOOo0.writeString(str);
        zzc.zzc(parcelOooOOo0, z);
        Parcel parcelOooOOOo = OooOOOo(3, parcelOooOOo0);
        int i = parcelOooOOOo.readInt();
        parcelOooOOOo.recycle();
        return i;
    }

    public final int zzg(IObjectWrapper iObjectWrapper, String str, boolean z) throws RemoteException {
        Parcel parcelOooOOo0 = OooOOo0();
        zzc.zzf(parcelOooOOo0, iObjectWrapper);
        parcelOooOOo0.writeString(str);
        zzc.zzc(parcelOooOOo0, z);
        Parcel parcelOooOOOo = OooOOOo(5, parcelOooOOo0);
        int i = parcelOooOOOo.readInt();
        parcelOooOOOo.recycle();
        return i;
    }

    public final IObjectWrapper zzh(IObjectWrapper iObjectWrapper, String str, int i) throws RemoteException {
        Parcel parcelOooOOo0 = OooOOo0();
        zzc.zzf(parcelOooOOo0, iObjectWrapper);
        parcelOooOOo0.writeString(str);
        parcelOooOOo0.writeInt(i);
        Parcel parcelOooOOOo = OooOOOo(2, parcelOooOOo0);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelOooOOOo.readStrongBinder());
        parcelOooOOOo.recycle();
        return iObjectWrapperAsInterface;
    }

    public final IObjectWrapper zzi(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcelOooOOo0 = OooOOo0();
        zzc.zzf(parcelOooOOo0, iObjectWrapper);
        parcelOooOOo0.writeString(str);
        parcelOooOOo0.writeInt(i);
        zzc.zzf(parcelOooOOo0, iObjectWrapper2);
        Parcel parcelOooOOOo = OooOOOo(8, parcelOooOOo0);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelOooOOOo.readStrongBinder());
        parcelOooOOOo.recycle();
        return iObjectWrapperAsInterface;
    }

    public final IObjectWrapper zzj(IObjectWrapper iObjectWrapper, String str, int i) throws RemoteException {
        Parcel parcelOooOOo0 = OooOOo0();
        zzc.zzf(parcelOooOOo0, iObjectWrapper);
        parcelOooOOo0.writeString(str);
        parcelOooOOo0.writeInt(i);
        Parcel parcelOooOOOo = OooOOOo(4, parcelOooOOo0);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelOooOOOo.readStrongBinder());
        parcelOooOOOo.recycle();
        return iObjectWrapperAsInterface;
    }

    public final IObjectWrapper zzk(IObjectWrapper iObjectWrapper, String str, boolean z, long j) throws RemoteException {
        Parcel parcelOooOOo0 = OooOOo0();
        zzc.zzf(parcelOooOOo0, iObjectWrapper);
        parcelOooOOo0.writeString(str);
        zzc.zzc(parcelOooOOo0, z);
        parcelOooOOo0.writeLong(j);
        Parcel parcelOooOOOo = OooOOOo(7, parcelOooOOo0);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelOooOOOo.readStrongBinder());
        parcelOooOOOo.recycle();
        return iObjectWrapperAsInterface;
    }
}
