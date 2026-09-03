package com.google.android.gms.cloudmessaging;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class IMessengerCompat$Impl extends Binder implements IInterface {
    @Override // android.os.IInterface
    @NonNull
    public IBinder asBinder() {
        throw null;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, @NonNull Parcel parcel, @Nullable Parcel parcel2, int i2) throws RemoteException {
        throw null;
    }

    public void send(@NonNull Message message) throws RemoteException {
        throw null;
    }
}
