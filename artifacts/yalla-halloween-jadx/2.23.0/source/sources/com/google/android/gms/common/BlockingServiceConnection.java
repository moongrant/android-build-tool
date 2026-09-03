package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public class BlockingServiceConnection implements ServiceConnection {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f14605OooO00o = false;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final LinkedBlockingQueue f14606OooO0O0 = new LinkedBlockingQueue();

    @NonNull
    @KeepForSdk
    public IBinder getService() throws InterruptedException {
        Preconditions.checkNotMainThread("BlockingServiceConnection.getService() called on main thread");
        if (this.f14605OooO00o) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f14605OooO00o = true;
        return (IBinder) this.f14606OooO0O0.take();
    }

    @NonNull
    @KeepForSdk
    public IBinder getServiceWithTimeout(long j, @NonNull TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        Preconditions.checkNotMainThread("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f14605OooO00o) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f14605OooO00o = true;
        IBinder iBinder = (IBinder) this.f14606OooO0O0.poll(j, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
        this.f14606OooO0O0.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@NonNull ComponentName componentName) {
    }
}
