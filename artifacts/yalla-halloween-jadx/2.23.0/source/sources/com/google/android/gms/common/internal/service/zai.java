package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.internal.base.zac;

/* JADX INFO: loaded from: classes3.dex */
public final class zai extends com.google.android.gms.internal.base.zaa {
    public zai(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void zae(TelemetryData telemetryData) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        zac.zac(parcelOooOOo, telemetryData);
        try {
            this.f15333OooO0Oo.transact(1, parcelOooOOo, null, 1);
        } finally {
            parcelOooOOo.recycle();
        }
    }
}
