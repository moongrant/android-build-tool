package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.Executor;
import p255o00ooOOo.o0O000;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public abstract class GmsClientSupervisor {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Object f15079OooO00o = new Object();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public static o0O000 f15080OooO0O0 = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    @VisibleForTesting
    public static HandlerThread f15081OooO0OO = null;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static boolean f15082OooO0Oo = false;

    @KeepForSdk
    public static int getDefaultBindFlags() {
        return 4225;
    }

    @NonNull
    @KeepForSdk
    public static GmsClientSupervisor getInstance(@NonNull Context context) {
        synchronized (f15079OooO00o) {
            if (f15080OooO0O0 == null) {
                f15080OooO0O0 = new o0O000(context.getApplicationContext(), f15082OooO0Oo ? getOrStartHandlerThread().getLooper() : context.getMainLooper());
            }
        }
        return f15080OooO0O0;
    }

    @NonNull
    @KeepForSdk
    public static HandlerThread getOrStartHandlerThread() {
        synchronized (f15079OooO00o) {
            HandlerThread handlerThread = f15081OooO0OO;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f15081OooO0OO = handlerThread2;
            handlerThread2.start();
            return f15081OooO0OO;
        }
    }

    @KeepForSdk
    public static void setUseHandlerThreadForCallbacks() {
        synchronized (f15079OooO00o) {
            o0O000 o0o001 = f15080OooO0O0;
            if (o0o001 != null && !f15082OooO0Oo) {
                o0o001.OooO0OO(getOrStartHandlerThread().getLooper());
            }
            f15082OooO0Oo = true;
        }
    }

    public abstract void OooO00o(zzn zznVar, ServiceConnection serviceConnection);

    public abstract boolean OooO0O0(zzn zznVar, ServiceConnection serviceConnection, String str, @Nullable Executor executor);

    @KeepForSdk
    public boolean bindService(@NonNull ComponentName componentName, @NonNull ServiceConnection serviceConnection, @NonNull String str) {
        return OooO0O0(new zzn(componentName, getDefaultBindFlags()), serviceConnection, str, null);
    }

    @KeepForSdk
    public void unbindService(@NonNull ComponentName componentName, @NonNull ServiceConnection serviceConnection, @NonNull String str) {
        OooO00o(new zzn(componentName, getDefaultBindFlags()), serviceConnection);
    }

    public final void zzb(@NonNull String str, @NonNull String str2, int i, @NonNull ServiceConnection serviceConnection, @NonNull String str3, boolean z) {
        OooO00o(new zzn(str, str2, i, z), serviceConnection);
    }

    @KeepForSdk
    public boolean bindService(@NonNull String str, @NonNull ServiceConnection serviceConnection, @NonNull String str2) {
        return OooO0O0(new zzn(str, getDefaultBindFlags(), false), serviceConnection, str2, null);
    }

    @KeepForSdk
    public void unbindService(@NonNull String str, @NonNull ServiceConnection serviceConnection, @NonNull String str2) {
        OooO00o(new zzn(str, getDefaultBindFlags(), false), serviceConnection);
    }
}
