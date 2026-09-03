package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zza;

/* JADX INFO: loaded from: classes2.dex */
public final class zzw extends zza implements ICancelToken {
    public zzw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICancelToken");
    }

    @Override // com.google.android.gms.common.internal.ICancelToken
    public final void cancel() throws RemoteException {
        Parcel parcelOooOOo0 = OooOOo0();
        try {
            this.f15869OooO00o.transact(2, parcelOooOOo0, null, 1);
        } finally {
            parcelOooOOo0.recycle();
        }
    }
}
