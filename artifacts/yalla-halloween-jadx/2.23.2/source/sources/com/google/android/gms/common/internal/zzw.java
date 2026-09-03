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
        Parcel parcelOooOo00 = OooOo00();
        try {
            this.f14882OooO0Oo.transact(2, parcelOooOo00, null, 1);
        } finally {
            parcelOooOo00.recycle();
        }
    }
}
