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
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OOO0 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final long f38776Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final PowerManager.WakeLock f38777Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final FirebaseMessaging f38778Oooo0oo;

    @VisibleForTesting
    public static class OooO00o extends BroadcastReceiver {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public o00OOO0 f38779OooO00o;

        public OooO00o(o00OOO0 o00ooo1) {
            this.f38779OooO00o = o00ooo1;
        }

        public final void OooO00o() {
            if (o00OOO0.OooO00o()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f38779OooO00o.f38778Oooo0oo.f19178OooO0Oo.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            o00OOO0 o00ooo1 = this.f38779OooO00o;
            if (o00ooo1 != null && o00ooo1.OooO0O0()) {
                if (o00OOO0.OooO00o()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                o00OOO0 o00ooo2 = this.f38779OooO00o;
                o00ooo2.f38778Oooo0oo.OooO0OO(o00ooo2, 0L);
                this.f38779OooO00o.f38778Oooo0oo.f19178OooO0Oo.unregisterReceiver(this);
                this.f38779OooO00o = null;
            }
        }
    }

    @VisibleForTesting
    @SuppressLint({"InvalidWakeLockTag"})
    public o00OOO0(FirebaseMessaging firebaseMessaging, long j) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));
        this.f38778Oooo0oo = firebaseMessaging;
        this.f38776Oooo0o = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.f19178OooO0Oo.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f38777Oooo0oO = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public static boolean OooO00o() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    public final boolean OooO0O0() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f38778Oooo0oo.f19178OooO0Oo.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @VisibleForTesting
    public final boolean OooO0OO() throws IOException {
        boolean z = true;
        try {
            if (this.f38778Oooo0oo.OooO00o() == null) {
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
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Token retrieval failed: ");
            sbOooO0o0.append(e.getMessage());
            sbOooO0o0.append(". Will retry token retrieval");
            Log.w("FirebaseMessaging", sbOooO0o0.toString());
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"WakelockTimeout"})
    public final void run() {
        if (o00OO.OooO00o().OooO0OO(this.f38778Oooo0oo.f19178OooO0Oo)) {
            this.f38777Oooo0oO.acquire();
        }
        try {
            this.f38778Oooo0oo.OooO0oO(true);
            if (!this.f38778Oooo0oo.f19183OooOO0.OooO0Oo()) {
                this.f38778Oooo0oo.OooO0oO(false);
            } else if (o00OO.OooO00o().OooO0O0(this.f38778Oooo0oo.f19178OooO0Oo) && !OooO0O0()) {
                new OooO00o(this).OooO00o();
            } else {
                if (OooO0OO()) {
                    this.f38778Oooo0oo.OooO0oO(false);
                } else {
                    this.f38778Oooo0oo.OooO(this.f38776Oooo0o);
                }
            }
        } catch (IOException e) {
            Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
            this.f38778Oooo0oo.OooO0oO(false);
        } finally {
            if (o00OO.OooO00o().OooO0OO(this.f38778Oooo0oo.f19178OooO0Oo)) {
                this.f38777Oooo0oO.release();
            }
        }
    }
}
