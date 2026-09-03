package p231o00oOo0o;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.OooOOO;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo0 implements o0OoOo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f33929Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Context f33930Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final o0OoOo0.OooO00o f33931Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f33932Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final OooO00o f33933OoooO00 = new OooO00o();

    public class OooO00o extends BroadcastReceiver {
        public OooO00o() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(@NonNull Context context, Intent intent) {
            o00Oo0 o00oo1 = o00Oo0.this;
            boolean z = o00oo1.f33932Oooo0oo;
            o00oo1.f33932Oooo0oo = o00oo1.OooO00o(context);
            if (z != o00Oo0.this.f33932Oooo0oo) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("connectivity changed, isConnected: ");
                    sbOooO0o0.append(o00Oo0.this.f33932Oooo0oo);
                    Log.d("ConnectivityMonitor", sbOooO0o0.toString());
                }
                o00Oo0 o00oo2 = o00Oo0.this;
                o0OoOo0.OooO00o oooO00o = o00oo2.f33931Oooo0oO;
                boolean z2 = o00oo2.f33932Oooo0oo;
                OooOOO.OooO0O0 oooO0O0 = (OooOOO.OooO0O0) oooO00o;
                Objects.requireNonNull(oooO0O0);
                if (z2) {
                    synchronized (OooOOO.this) {
                        oooO0O0.f12411OooO00o.OooO0O0();
                    }
                }
            }
        }
    }

    public o00Oo0(@NonNull Context context, @NonNull o0OoOo0.OooO00o oooO00o) {
        this.f33930Oooo0o = context.getApplicationContext();
        this.f33931Oooo0oO = oooO00o;
    }

    @SuppressLint({"MissingPermission"})
    public final boolean OooO00o(@NonNull Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        Objects.requireNonNull(connectivityManager, "Argument must not be null");
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e);
            }
            return true;
        }
    }

    @Override // p231o00oOo0o.o0OO00O
    public final void onDestroy() {
    }

    @Override // p231o00oOo0o.o0OO00O
    public final void onStart() {
        if (this.f33929Oooo) {
            return;
        }
        this.f33932Oooo0oo = OooO00o(this.f33930Oooo0o);
        try {
            this.f33930Oooo0o.registerReceiver(this.f33933OoooO00, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f33929Oooo = true;
        } catch (SecurityException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register", e);
            }
        }
    }

    @Override // p231o00oOo0o.o0OO00O
    public final void onStop() {
        if (this.f33929Oooo) {
            this.f33930Oooo0o.unregisterReceiver(this.f33933OoooO00);
            this.f33929Oooo = false;
        }
    }
}
