package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public class zza implements IInterface {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final IBinder f15332OooO0Oo;

    public zza(IBinder iBinder) {
        this.f15332OooO0Oo = iBinder;
    }

    public final Parcel OooOOo(Parcel parcel, int i) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f15332OooO0Oo.transact(i, parcel, parcelObtain, 0);
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
        return this.f15332OooO0Oo;
    }
}
