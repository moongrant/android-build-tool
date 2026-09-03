package com.google.android.gms.internal.base;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public class zaa implements IInterface {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final IBinder f15333OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f15334OooO0o0;

    public zaa(IBinder iBinder, String str) {
        this.f15333OooO0Oo = iBinder;
        this.f15334OooO0o0 = str;
    }

    public final Parcel OooOOo() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f15334OooO0o0);
        return parcelObtain;
    }

    public final void OooOOoo(Parcel parcel, int i) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f15333OooO0Oo.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f15333OooO0Oo;
    }
}
