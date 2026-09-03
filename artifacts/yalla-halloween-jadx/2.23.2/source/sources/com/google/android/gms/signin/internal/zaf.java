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
        Parcel parcelOooOOoo = OooOOoo();
        parcelOooOOoo.writeInt(i);
        OooOo00(parcelOooOOoo, 7);
    }

    public final void zaf(IAccountAccessor iAccountAccessor, int i, boolean z) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        com.google.android.gms.internal.base.zac.zad(parcelOooOOoo, iAccountAccessor);
        parcelOooOOoo.writeInt(i);
        com.google.android.gms.internal.base.zac.zab(parcelOooOOoo, z);
        OooOo00(parcelOooOOoo, 9);
    }

    public final void zag(zai zaiVar, zae zaeVar) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        com.google.android.gms.internal.base.zac.zac(parcelOooOOoo, zaiVar);
        com.google.android.gms.internal.base.zac.zad(parcelOooOOoo, zaeVar);
        OooOo00(parcelOooOOoo, 12);
    }
}
