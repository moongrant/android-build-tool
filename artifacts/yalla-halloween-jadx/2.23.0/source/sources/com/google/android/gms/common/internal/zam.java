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
        Parcel parcelOooOOo = OooOOo();
        com.google.android.gms.internal.base.zac.zad(parcelOooOOo, iObjectWrapper);
        com.google.android.gms.internal.base.zac.zac(parcelOooOOo, zaxVar);
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f15333OooO0Oo.transact(2, parcelOooOOo, parcelObtain, 0);
                parcelObtain.readException();
                parcelOooOOo.recycle();
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelObtain.readStrongBinder());
                parcelObtain.recycle();
                return iObjectWrapperAsInterface;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcelOooOOo.recycle();
            throw th;
        }
    }
}
