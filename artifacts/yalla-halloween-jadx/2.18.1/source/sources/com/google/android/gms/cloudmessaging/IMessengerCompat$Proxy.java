package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class IMessengerCompat$Proxy implements IInterface {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final IBinder f15073OooO00o;

    @Override // android.os.IInterface
    @NonNull
    public IBinder asBinder() {
        return this.f15073OooO00o;
    }

    public void send(@NonNull Message message) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
        parcelObtain.writeInt(1);
        message.writeToParcel(parcelObtain, 0);
        try {
            this.f15073OooO00o.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
