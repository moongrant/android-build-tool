package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.base.zac;

/* JADX INFO: loaded from: classes3.dex */
public final class zal extends com.google.android.gms.internal.base.zaa {
    public zal(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    public final void zae(zak zakVar) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        zac.zad(parcelOooOOo, zakVar);
        try {
            this.f15333OooO0Oo.transact(1, parcelOooOOo, null, 1);
        } finally {
            parcelOooOOo.recycle();
        }
    }
}
