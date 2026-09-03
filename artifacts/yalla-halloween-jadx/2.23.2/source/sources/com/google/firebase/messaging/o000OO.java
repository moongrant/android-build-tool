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
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OO implements Runnable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final Object f19876OooO = new Object();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @GuardedBy("TOPIC_SYNC_TASK_LOCK")
    public static Boolean f19877OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @GuardedBy("TOPIC_SYNC_TASK_LOCK")
    public static Boolean f19878OooOO0O;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Context f19879OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final PowerManager.WakeLock f19880OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0OOO0o f19881OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o0000O0O f19882OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final long f19883OooO0oo;

    @VisibleForTesting
    public class OooO00o extends BroadcastReceiver {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        @GuardedBy("this")
        public o000OO f19884OooO00o;

        public OooO00o(o000OO o000oo2) {
            this.f19884OooO00o = o000oo2;
        }

        public final void OooO00o() {
            if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            o000OO.this.f19879OooO0Oo.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public final synchronized void onReceive(Context context, Intent intent) {
            o000OO o000oo2 = this.f19884OooO00o;
            if (o000oo2 == null) {
                return;
            }
            if (o000oo2.OooO0Oo()) {
                if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                o000OO o000oo3 = this.f19884OooO00o;
                o000oo3.f19882OooO0oO.f19858OooO0o.schedule(o000oo3, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.f19884OooO00o = null;
            }
        }
    }

    public o000OO(o0000O0O o0000o0o2, Context context, o0OOO0o o0ooo0o2, long j) {
        this.f19882OooO0oO = o0000o0o2;
        this.f19879OooO0Oo = context;
        this.f19883OooO0oo = j;
        this.f19881OooO0o0 = o0ooo0o2;
        this.f19880OooO0o = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean OooO00o(Context context) {
        boolean zBooleanValue;
        synchronized (f19876OooO) {
            Boolean bool = f19878OooOO0O;
            Boolean boolValueOf = Boolean.valueOf(bool == null ? OooO0O0("android.permission.ACCESS_NETWORK_STATE", bool, context) : bool.booleanValue());
            f19878OooOO0O = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
        }
        return zBooleanValue;
    }

    public static boolean OooO0O0(String str, Boolean bool, Context context) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z;
    }

    public static boolean OooO0OO(Context context) {
        boolean zBooleanValue;
        synchronized (f19876OooO) {
            Boolean bool = f19877OooOO0;
            Boolean boolValueOf = Boolean.valueOf(bool == null ? OooO0O0("android.permission.WAKE_LOCK", bool, context) : bool.booleanValue());
            f19877OooOO0 = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
        }
        return zBooleanValue;
    }

    public final synchronized boolean OooO0Oo() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f19879OooO0Oo.getSystemService("connectivity");
        activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public final void run() {
        o0000O0O o0000o0o2 = this.f19882OooO0oO;
        Context context = this.f19879OooO0Oo;
        boolean zOooO0OO = OooO0OO(context);
        PowerManager.WakeLock wakeLock = this.f19880OooO0o;
        if (zOooO0OO) {
            wakeLock.acquire(OooOO0.f19798OooO00o);
        }
        try {
            try {
                synchronized (o0000o0o2) {
                    o0000o0o2.f19860OooO0oO = true;
                }
                if (!this.f19881OooO0o0.OooO0o0()) {
                    o0000o0o2.OooO0o(false);
                    if (OooO0OO(context)) {
                        try {
                            wakeLock.release();
                            return;
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                            return;
                        }
                    }
                    return;
                }
                if (OooO00o(context) && !OooO0Oo()) {
                    new OooO00o(this).OooO00o();
                    if (OooO0OO(context)) {
                        try {
                            wakeLock.release();
                            return;
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                            return;
                        }
                    }
                    return;
                }
                if (o0000o0o2.OooO0oO()) {
                    o0000o0o2.OooO0o(false);
                } else {
                    o0000o0o2.OooO0oo(this.f19883OooO0oo);
                }
                if (!OooO0OO(context)) {
                    return;
                }
                try {
                    wakeLock.release();
                } catch (RuntimeException unused3) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            } catch (Throwable th) {
                if (OooO0OO(context)) {
                    try {
                        wakeLock.release();
                    } catch (RuntimeException unused4) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e.getMessage());
            o0000o0o2.OooO0o(false);
            if (!OooO0OO(context)) {
            }
        }
    }
}
