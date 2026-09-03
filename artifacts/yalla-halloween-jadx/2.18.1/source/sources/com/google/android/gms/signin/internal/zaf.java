package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.IAccountAccessor;

/* JADX INFO: loaded from: classes2.dex */
public final class zaf extends com.google.android.gms.internal.base.zaa {
    public zaf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void zae(int i) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        parcelOooOOOo.writeInt(i);
        OooOOo0(7, parcelOooOOOo);
    }

    public final void zaf(IAccountAccessor iAccountAccessor, int i, boolean z) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        com.google.android.gms.internal.base.zac.zad(parcelOooOOOo, iAccountAccessor);
        parcelOooOOOo.writeInt(i);
        com.google.android.gms.internal.base.zac.zab(parcelOooOOOo, z);
        OooOOo0(9, parcelOooOOOo);
    }

    public final void zag(zai zaiVar, zae zaeVar) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        com.google.android.gms.internal.base.zac.zac(parcelOooOOOo, zaiVar);
        com.google.android.gms.internal.base.zac.zad(parcelOooOOOo, zaeVar);
        OooOOo0(12, parcelOooOOOo);
    }
}
