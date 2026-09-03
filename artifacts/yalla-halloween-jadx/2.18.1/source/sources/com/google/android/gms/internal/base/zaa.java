package com.google.android.gms.internal.base;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public class zaa implements IInterface {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final IBinder f15842OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f15843OooO0O0;

    public zaa(IBinder iBinder, String str) {
        this.f15842OooO00o = iBinder;
        this.f15843OooO0O0 = str;
    }

    public final Parcel OooOOOo() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f15843OooO0O0);
        return parcelObtain;
    }

    public final void OooOOo0(int i, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f15842OooO00o.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f15842OooO00o;
    }
}
