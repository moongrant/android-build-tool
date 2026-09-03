package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zza;

/* JADX INFO: loaded from: classes3.dex */
public final class zzw extends zza implements ICancelToken {
    public zzw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICancelToken");
    }

    @Override // com.google.android.gms.common.internal.ICancelToken
    public final void cancel() throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        try {
            this.f15358OooO0Oo.transact(2, parcelOooOOoo, null, 1);
        } finally {
            parcelOooOOoo.recycle();
        }
    }
}
