package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public class zzbm implements IInterface {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final IBinder f15193OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f15194OooO0o0;

    public zzbm(IBinder iBinder, String str) {
        this.f15193OooO0Oo = iBinder;
        this.f15194OooO0o0 = str;
    }

    public final Parcel OooOOoo() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f15194OooO0o0);
        return parcelObtain;
    }

    public final void OooOo0(Parcel parcel, int i) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f15193OooO0Oo.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public final Parcel OooOo00(Parcel parcel, int i) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f15193OooO0Oo.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f15193OooO0Oo;
    }
}
