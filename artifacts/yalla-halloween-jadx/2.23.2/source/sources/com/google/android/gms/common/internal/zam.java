package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zam extends com.google.android.gms.internal.base.zaa {
    public zam(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    public final IObjectWrapper zae(IObjectWrapper iObjectWrapper, zax zaxVar) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        com.google.android.gms.internal.base.zac.zad(parcelOooOOoo, iObjectWrapper);
        com.google.android.gms.internal.base.zac.zac(parcelOooOOoo, zaxVar);
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f14857OooO0Oo.transact(2, parcelOooOOoo, parcelObtain, 0);
                parcelObtain.readException();
                parcelOooOOoo.recycle();
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelObtain.readStrongBinder());
                parcelObtain.recycle();
                return iObjectWrapperAsInterface;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcelOooOOoo.recycle();
            throw th;
        }
    }
}
