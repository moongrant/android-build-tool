package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000oo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f20338OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final FirebaseMessaging f20339OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final PowerManager.WakeLock f20340OooO0o0;

    @VisibleForTesting
    public static class OooO00o extends BroadcastReceiver {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public o0000oo f20341OooO00o;

        public OooO00o(o0000oo o0000ooVar) {
            this.f20341OooO00o = o0000ooVar;
        }

        public final void OooO00o() {
            if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f20341OooO00o.f20339OooO0o.f20236OooO0Oo.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            o0000oo o0000ooVar = this.f20341OooO00o;
            if (o0000ooVar != null && o0000ooVar.OooO00o()) {
                if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                o0000oo o0000ooVar2 = this.f20341OooO00o;
                o0000ooVar2.f20339OooO0o.getClass();
                FirebaseMessaging.OooO0OO(0L, o0000ooVar2);
                this.f20341OooO00o.f20339OooO0o.f20236OooO0Oo.unregisterReceiver(this);
                this.f20341OooO00o = null;
            }
        }
    }

    @VisibleForTesting
    @SuppressLint({"InvalidWakeLockTag"})
    public o0000oo(FirebaseMessaging firebaseMessaging, long j) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));
        this.f20339OooO0o = firebaseMessaging;
        this.f20338OooO0Oo = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.f20236OooO0Oo.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f20340OooO0o0 = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public final boolean OooO00o() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f20339OooO0o.f20236OooO0Oo.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @VisibleForTesting
    public final boolean OooO0O0() throws IOException {
        boolean z = true;
        try {
            if (this.f20339OooO0o.OooO00o() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
            }
            return true;
        } catch (IOException e) {
            String message = e.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                z = false;
            }
            if (!z) {
                if (e.getMessage() != null) {
                    throw e;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"WakelockTimeout"})
    public final void run() {
        o00000OO o00000ooOooO00o = o00000OO.OooO00o();
        FirebaseMessaging firebaseMessaging = this.f20339OooO0o;
        boolean zOooO0OO = o00000ooOooO00o.OooO0OO(firebaseMessaging.f20236OooO0Oo);
        PowerManager.WakeLock wakeLock = this.f20340OooO0o0;
        if (zOooO0OO) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f20242OooOO0O = true;
                }
                if (!firebaseMessaging.f20241OooOO0.OooO0o0()) {
                    firebaseMessaging.OooO0oo(false);
                    if (o00000OO.OooO00o().OooO0OO(firebaseMessaging.f20236OooO0Oo)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (o00000OO.OooO00o().OooO0O0(firebaseMessaging.f20236OooO0Oo) && !OooO00o()) {
                    new OooO00o(this).OooO00o();
                    if (o00000OO.OooO00o().OooO0OO(firebaseMessaging.f20236OooO0Oo)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (OooO0O0()) {
                    firebaseMessaging.OooO0oo(false);
                } else {
                    firebaseMessaging.OooOO0(this.f20338OooO0Oo);
                }
                if (!o00000OO.OooO00o().OooO0OO(firebaseMessaging.f20236OooO0Oo)) {
                    return;
                }
                wakeLock.release();
            } catch (IOException e) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
                firebaseMessaging.OooO0oo(false);
                if (!o00000OO.OooO00o().OooO0OO(firebaseMessaging.f20236OooO0Oo)) {
                }
            }
        } catch (Throwable th) {
            if (o00000OO.OooO00o().OooO0OO(firebaseMessaging.f20236OooO0Oo)) {
                wakeLock.release();
            }
            throw th;
        }
    }
}
