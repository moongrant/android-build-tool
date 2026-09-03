package p381o0OOoOOO;

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

/* JADX INFO: loaded from: classes2.dex */
public final class o00Oo00 implements Runnable {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @GuardedBy("TOPIC_SYNC_TASK_LOCK")
    public static Boolean f38804OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public static final Object f38805OoooO0 = new Object();

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @GuardedBy("TOPIC_SYNC_TASK_LOCK")
    public static Boolean f38806OoooO0O;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final o00OOOOo f38807Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Context f38808Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final oo0oOO0 f38809Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final PowerManager.WakeLock f38810Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final long f38811OoooO00;

    @VisibleForTesting
    public class OooO00o extends BroadcastReceiver {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        @GuardedBy("this")
        public o00Oo00 f38812OooO00o;

        public OooO00o(o00Oo00 o00oo00) {
            this.f38812OooO00o = o00oo00;
        }

        public final void OooO00o() {
            if (o00Oo00.OooO00o()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            o00Oo00.this.f38808Oooo0o.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public final synchronized void onReceive(Context context, Intent intent) {
            o00Oo00 o00oo00 = this.f38812OooO00o;
            if (o00oo00 == null) {
                return;
            }
            if (o00oo00.OooO0o0()) {
                if (o00Oo00.OooO00o()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                o00Oo00 o00oo01 = this.f38812OooO00o;
                o00oo01.f38807Oooo.f38800OooO0o.schedule(o00oo01, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.f38812OooO00o = null;
            }
        }
    }

    public o00Oo00(o00OOOOo o00ooooo2, Context context, oo0oOO0 oo0ooo0, long j) {
        this.f38807Oooo = o00ooooo2;
        this.f38808Oooo0o = context;
        this.f38811OoooO00 = j;
        this.f38809Oooo0oO = oo0ooo0;
        this.f38810Oooo0oo = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean OooO00o() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    public static boolean OooO0O0(Context context) {
        boolean zBooleanValue;
        synchronized (f38805OoooO0) {
            Boolean bool = f38804OoooO;
            Boolean boolValueOf = Boolean.valueOf(bool == null ? OooO0OO(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
            f38804OoooO = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
        }
        return zBooleanValue;
    }

    public static boolean OooO0OO(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z;
    }

    public static boolean OooO0Oo(Context context) {
        boolean zBooleanValue;
        synchronized (f38805OoooO0) {
            Boolean bool = f38806OoooO0O;
            Boolean boolValueOf = Boolean.valueOf(bool == null ? OooO0OO(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
            f38806OoooO0O = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
        }
        return zBooleanValue;
    }

    public final synchronized boolean OooO0o0() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f38808Oooo0o.getSystemService("connectivity");
        activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public final void run() {
        PowerManager.WakeLock wakeLock;
        if (OooO0Oo(this.f38808Oooo0o)) {
            this.f38810Oooo0oo.acquire(o00O0000.f38750OooO00o);
        }
        try {
            try {
                try {
                    this.f38807Oooo.OooO0o0(true);
                    if (!this.f38809Oooo0oO.OooO0Oo()) {
                        this.f38807Oooo.OooO0o0(false);
                        if (OooO0Oo(this.f38808Oooo0o)) {
                            try {
                                this.f38810Oooo0oo.release();
                                return;
                            } catch (RuntimeException unused) {
                                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                                return;
                            }
                        }
                        return;
                    }
                    if (OooO0O0(this.f38808Oooo0o) && !OooO0o0()) {
                        new OooO00o(this).OooO00o();
                        if (OooO0Oo(this.f38808Oooo0o)) {
                            try {
                                this.f38810Oooo0oo.release();
                                return;
                            } catch (RuntimeException unused2) {
                                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                                return;
                            }
                        }
                        return;
                    }
                    if (this.f38807Oooo.OooO0o()) {
                        this.f38807Oooo.OooO0o0(false);
                    } else {
                        this.f38807Oooo.OooO0oO(this.f38811OoooO00);
                    }
                    if (OooO0Oo(this.f38808Oooo0o)) {
                        wakeLock = this.f38810Oooo0oo;
                        wakeLock.release();
                    }
                } catch (Throwable th) {
                    if (OooO0Oo(this.f38808Oooo0o)) {
                        try {
                            this.f38810Oooo0oo.release();
                        } catch (RuntimeException unused3) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                    throw th;
                }
            } catch (IOException e) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e.getMessage());
                this.f38807Oooo.OooO0o0(false);
                if (!OooO0Oo(this.f38808Oooo0o)) {
                } else {
                    wakeLock = this.f38810Oooo0oo;
                }
            }
        } catch (RuntimeException unused4) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
