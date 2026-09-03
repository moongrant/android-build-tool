package com.appsflyer.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class ac {
    public final String AFInAppEventType;
    private final boolean valueOf;
    public final long values;

    public static final class a {
        final String AFInAppEventType;
        private final boolean valueOf;

        public a(String str, boolean z) {
            this.AFInAppEventType = str;
            this.valueOf = z;
        }

        public final boolean values() {
            return this.valueOf;
        }
    }

    public static final class e implements IInterface {
        private final IBinder AFKeystoreWrapper;

        public e(IBinder iBinder) {
            this.AFKeystoreWrapper = iBinder;
        }

        public final boolean AFKeystoreWrapper() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(1);
                this.AFKeystoreWrapper.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.AFKeystoreWrapper;
        }

        public final String values() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.AFKeystoreWrapper.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    public ac() {
    }

    public ac(String str, long j, boolean z) {
        this.AFInAppEventType = str;
        this.values = j;
        this.valueOf = z;
    }

    public static a AFInAppEventParameterName(Context context) throws Exception {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        d dVar = new d((byte) 0);
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try {
            if (!context.bindService(intent, dVar, 1)) {
                context.unbindService(dVar);
                throw new IOException("Google Play connection failed");
            }
            if (dVar.AFInAppEventParameterName) {
                throw new IllegalStateException("Cannot call get on this connection more than once");
            }
            dVar.AFInAppEventParameterName = true;
            IBinder iBinderPoll = dVar.values.poll(10L, TimeUnit.SECONDS);
            if (iBinderPoll == null) {
                throw new TimeoutException("Timed out waiting for the service connection");
            }
            e eVar = new e(iBinderPoll);
            a aVar = new a(eVar.values(), eVar.AFKeystoreWrapper());
            context.unbindService(dVar);
            return aVar;
        } catch (Throwable th) {
            context.unbindService(dVar);
            throw th;
        }
    }

    public final boolean AFInAppEventType() {
        return this.valueOf;
    }

    public static final class d implements ServiceConnection {
        boolean AFInAppEventParameterName;
        final LinkedBlockingQueue<IBinder> values;

        private d() {
            this.values = new LinkedBlockingQueue<>(1);
            this.AFInAppEventParameterName = false;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.values.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }

        public /* synthetic */ d(byte b) {
            this();
        }
    }
}
