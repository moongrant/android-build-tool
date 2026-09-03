package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.IAccountAccessor;

/* JADX INFO: loaded from: classes3.dex */
public final class zaf extends com.google.android.gms.internal.base.zaa {
    public zaf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void zae(int i) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        parcelOooOOo.writeInt(i);
        OooOOoo(parcelOooOOo, 7);
    }

    public final void zaf(IAccountAccessor iAccountAccessor, int i, boolean z) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        com.google.android.gms.internal.base.zac.zad(parcelOooOOo, iAccountAccessor);
        parcelOooOOo.writeInt(i);
        com.google.android.gms.internal.base.zac.zab(parcelOooOOo, z);
        OooOOoo(parcelOooOOo, 9);
    }

    public final void zag(zai zaiVar, zae zaeVar) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        com.google.android.gms.internal.base.zac.zac(parcelOooOOo, zaiVar);
        com.google.android.gms.internal.base.zac.zad(parcelOooOOo, zaeVar);
        OooOOoo(parcelOooOOo, 12);
    }
}
