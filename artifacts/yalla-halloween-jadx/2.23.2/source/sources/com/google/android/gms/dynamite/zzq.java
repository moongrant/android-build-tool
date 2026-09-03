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
        Parcel parcelOooOOoo = OooOOoo(OooOo00(), 6);
        int i = parcelOooOOoo.readInt();
        parcelOooOOoo.recycle();
        return i;
    }

    public final int zzf(IObjectWrapper iObjectWrapper, String str, boolean z) throws RemoteException {
        Parcel parcelOooOo00 = OooOo00();
        zzc.zzf(parcelOooOo00, iObjectWrapper);
        parcelOooOo00.writeString(str);
        zzc.zzc(parcelOooOo00, z);
        Parcel parcelOooOOoo = OooOOoo(parcelOooOo00, 3);
        int i = parcelOooOOoo.readInt();
        parcelOooOOoo.recycle();
        return i;
    }

    public final int zzg(IObjectWrapper iObjectWrapper, String str, boolean z) throws RemoteException {
        Parcel parcelOooOo00 = OooOo00();
        zzc.zzf(parcelOooOo00, iObjectWrapper);
        parcelOooOo00.writeString(str);
        zzc.zzc(parcelOooOo00, z);
        Parcel parcelOooOOoo = OooOOoo(parcelOooOo00, 5);
        int i = parcelOooOOoo.readInt();
        parcelOooOOoo.recycle();
        return i;
    }

    public final IObjectWrapper zzh(IObjectWrapper iObjectWrapper, String str, int i) throws RemoteException {
        Parcel parcelOooOo00 = OooOo00();
        zzc.zzf(parcelOooOo00, iObjectWrapper);
        parcelOooOo00.writeString(str);
        parcelOooOo00.writeInt(i);
        Parcel parcelOooOOoo = OooOOoo(parcelOooOo00, 2);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelOooOOoo.readStrongBinder());
        parcelOooOOoo.recycle();
        return iObjectWrapperAsInterface;
    }

    public final IObjectWrapper zzi(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcelOooOo00 = OooOo00();
        zzc.zzf(parcelOooOo00, iObjectWrapper);
        parcelOooOo00.writeString(str);
        parcelOooOo00.writeInt(i);
        zzc.zzf(parcelOooOo00, iObjectWrapper2);
        Parcel parcelOooOOoo = OooOOoo(parcelOooOo00, 8);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelOooOOoo.readStrongBinder());
        parcelOooOOoo.recycle();
        return iObjectWrapperAsInterface;
    }

    public final IObjectWrapper zzj(IObjectWrapper iObjectWrapper, String str, int i) throws RemoteException {
        Parcel parcelOooOo00 = OooOo00();
        zzc.zzf(parcelOooOo00, iObjectWrapper);
        parcelOooOo00.writeString(str);
        parcelOooOo00.writeInt(i);
        Parcel parcelOooOOoo = OooOOoo(parcelOooOo00, 4);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelOooOOoo.readStrongBinder());
        parcelOooOOoo.recycle();
        return iObjectWrapperAsInterface;
    }

    public final IObjectWrapper zzk(IObjectWrapper iObjectWrapper, String str, boolean z, long j) throws RemoteException {
        Parcel parcelOooOo00 = OooOo00();
        zzc.zzf(parcelOooOo00, iObjectWrapper);
        parcelOooOo00.writeString(str);
        zzc.zzc(parcelOooOo00, z);
        parcelOooOo00.writeLong(j);
        Parcel parcelOooOOoo = OooOOoo(parcelOooOo00, 7);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelOooOOoo.readStrongBinder());
        parcelOooOOoo.recycle();
        return iObjectWrapperAsInterface;
    }
}
