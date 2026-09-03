package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public class zzh implements IInterface {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final IBinder f15852OooO0Oo;

    public zzh(IBinder iBinder) {
        this.f15852OooO0Oo = iBinder;
    }

    public static Parcel OooOOo() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
        return parcelObtain;
    }

    public final Parcel OooOOoo(Parcel parcel, int i) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f15852OooO0Oo.transact(i, parcel, parcelObtain, 0);
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
        return this.f15852OooO0Oo;
    }
}
