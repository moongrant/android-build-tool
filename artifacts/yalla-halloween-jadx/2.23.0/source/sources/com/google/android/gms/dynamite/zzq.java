package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* JADX INFO: loaded from: classes3.dex */
public final class zzq extends zza {
    public zzq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int zze() throws RemoteException {
        Parcel parcelOooOOo = OooOOo(OooOOoo(), 6);
        int i = parcelOooOOo.readInt();
        parcelOooOOo.recycle();
        return i;
    }

    public final int zzf(IObjectWrapper iObjectWrapper, String str, boolean z) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        zzc.zzf(parcelOooOOoo, iObjectWrapper);
        parcelOooOOoo.writeString(str);
        zzc.zzc(parcelOooOOoo, z);
        Parcel parcelOooOOo = OooOOo(parcelOooOOoo, 3);
        int i = parcelOooOOo.readInt();
        parcelOooOOo.recycle();
        return i;
    }

    public final int zzg(IObjectWrapper iObjectWrapper, String str, boolean z) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        zzc.zzf(parcelOooOOoo, iObjectWrapper);
        parcelOooOOoo.writeString(str);
        zzc.zzc(parcelOooOOoo, z);
        Parcel parcelOooOOo = OooOOo(parcelOooOOoo, 5);
        int i = parcelOooOOo.readInt();
        parcelOooOOo.recycle();
        return i;
    }

    public final IObjectWrapper zzh(IObjectWrapper iObjectWrapper, String str, int i) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        zzc.zzf(parcelOooOOoo, iObjectWrapper);
        parcelOooOOoo.writeString(str);
        parcelOooOOoo.writeInt(i);
        Parcel parcelOooOOo = OooOOo(parcelOooOOoo, 2);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelOooOOo.readStrongBinder());
        parcelOooOOo.recycle();
        return iObjectWrapperAsInterface;
    }

    public final IObjectWrapper zzi(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        zzc.zzf(parcelOooOOoo, iObjectWrapper);
        parcelOooOOoo.writeString(str);
        parcelOooOOoo.writeInt(i);
        zzc.zzf(parcelOooOOoo, iObjectWrapper2);
        Parcel parcelOooOOo = OooOOo(parcelOooOOoo, 8);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelOooOOo.readStrongBinder());
        parcelOooOOo.recycle();
        return iObjectWrapperAsInterface;
    }

    public final IObjectWrapper zzj(IObjectWrapper iObjectWrapper, String str, int i) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        zzc.zzf(parcelOooOOoo, iObjectWrapper);
        parcelOooOOoo.writeString(str);
        parcelOooOOoo.writeInt(i);
        Parcel parcelOooOOo = OooOOo(parcelOooOOoo, 4);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelOooOOo.readStrongBinder());
        parcelOooOOo.recycle();
        return iObjectWrapperAsInterface;
    }

    public final IObjectWrapper zzk(IObjectWrapper iObjectWrapper, String str, boolean z, long j) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        zzc.zzf(parcelOooOOoo, iObjectWrapper);
        parcelOooOOoo.writeString(str);
        zzc.zzc(parcelOooOOoo, z);
        parcelOooOOoo.writeLong(j);
        Parcel parcelOooOOo = OooOOo(parcelOooOOoo, 7);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelOooOOo.readStrongBinder());
        parcelOooOOo.recycle();
        return iObjectWrapperAsInterface;
    }
}
