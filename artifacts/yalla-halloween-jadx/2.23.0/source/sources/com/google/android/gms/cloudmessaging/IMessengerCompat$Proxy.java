package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class IMessengerCompat$Proxy implements IInterface {
    public IMessengerCompat$Proxy() {
        throw null;
    }

    @Override // android.os.IInterface
    @NonNull
    public IBinder asBinder() {
        return null;
    }

    public void send(@NonNull Message message) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
        parcelObtain.writeInt(1);
        message.writeToParcel(parcelObtain, 0);
        try {
            throw null;
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }
}
