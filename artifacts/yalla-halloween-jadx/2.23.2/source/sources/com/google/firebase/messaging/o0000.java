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
public final class o0000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f19821OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final FirebaseMessaging f19822OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final PowerManager.WakeLock f19823OooO0o0;

    @VisibleForTesting
    public static class OooO00o extends BroadcastReceiver {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public o0000 f19824OooO00o;

        public OooO00o(o0000 o0000Var) {
            this.f19824OooO00o = o0000Var;
        }

        public final void OooO00o() {
            if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f19824OooO00o.f19822OooO0o.f19764OooO0Oo.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            o0000 o0000Var = this.f19824OooO00o;
            if (o0000Var != null && o0000Var.OooO00o()) {
                if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                o0000 o0000Var2 = this.f19824OooO00o;
                o0000Var2.f19822OooO0o.getClass();
                FirebaseMessaging.OooO0OO(0L, o0000Var2);
                this.f19824OooO00o.f19822OooO0o.f19764OooO0Oo.unregisterReceiver(this);
                this.f19824OooO00o = null;
            }
        }
    }

    @VisibleForTesting
    @SuppressLint({"InvalidWakeLockTag"})
    public o0000(FirebaseMessaging firebaseMessaging, long j) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));
        this.f19822OooO0o = firebaseMessaging;
        this.f19821OooO0Oo = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.f19764OooO0Oo.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f19823OooO0o0 = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public final boolean OooO00o() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f19822OooO0o.f19764OooO0Oo.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @VisibleForTesting
    public final boolean OooO0O0() throws IOException {
        boolean z = true;
        try {
            if (this.f19822OooO0o.OooO00o() == null) {
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
        o00000O o00000oOooO00o = o00000O.OooO00o();
        FirebaseMessaging firebaseMessaging = this.f19822OooO0o;
        boolean zOooO0OO = o00000oOooO00o.OooO0OO(firebaseMessaging.f19764OooO0Oo);
        PowerManager.WakeLock wakeLock = this.f19823OooO0o0;
        if (zOooO0OO) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f19770OooOO0O = true;
                }
                if (!firebaseMessaging.f19769OooOO0.OooO0o0()) {
                    firebaseMessaging.OooO0oo(false);
                    if (o00000O.OooO00o().OooO0OO(firebaseMessaging.f19764OooO0Oo)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (o00000O.OooO00o().OooO0O0(firebaseMessaging.f19764OooO0Oo) && !OooO00o()) {
                    new OooO00o(this).OooO00o();
                    if (o00000O.OooO00o().OooO0OO(firebaseMessaging.f19764OooO0Oo)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (OooO0O0()) {
                    firebaseMessaging.OooO0oo(false);
                } else {
                    firebaseMessaging.OooOO0(this.f19821OooO0Oo);
                }
                if (!o00000O.OooO00o().OooO0OO(firebaseMessaging.f19764OooO0Oo)) {
                    return;
                }
                wakeLock.release();
            } catch (IOException e) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
                firebaseMessaging.OooO0oo(false);
                if (!o00000O.OooO00o().OooO0OO(firebaseMessaging.f19764OooO0Oo)) {
                }
            }
        } catch (Throwable th) {
            if (o00000O.OooO00o().OooO0OO(firebaseMessaging.f19764OooO0Oo)) {
                wakeLock.release();
            }
            throw th;
        }
    }
}
