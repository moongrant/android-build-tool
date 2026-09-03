package p112o000oooo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import p102o000oo.o0OoOo0;
import p109o000ooo.o00000O;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class oO0O00oO extends oO0O00o0<o00000O> {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final String f30056OooOO0 = o0OoOo0.OooO0o0("NetworkStateTracker");

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public OooO00o f30057OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ConnectivityManager f30058OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @RequiresApi(24)
    public OooO0O0 f30059OooO0oo;

    public class OooO00o extends BroadcastReceiver {
        public OooO00o() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            o0OoOo0.OooO0OO().OooO00o(oO0O00oO.f30056OooOO0, "Network broadcast received", new Throwable[0]);
            oO0O00oO oo0o00oo = oO0O00oO.this;
            oo0o00oo.OooO0OO(oo0o00oo.OooO0o());
        }
    }

    @RequiresApi(24)
    public class OooO0O0 extends ConnectivityManager.NetworkCallback {
        public OooO0O0() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(@NonNull Network network, @NonNull NetworkCapabilities networkCapabilities) {
            o0OoOo0.OooO0OO().OooO00o(oO0O00oO.f30056OooOO0, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            oO0O00oO oo0o00oo = oO0O00oO.this;
            oo0o00oo.OooO0OO(oo0o00oo.OooO0o());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(@NonNull Network network) {
            o0OoOo0.OooO0OO().OooO00o(oO0O00oO.f30056OooOO0, "Network connection lost", new Throwable[0]);
            oO0O00oO oo0o00oo = oO0O00oO.this;
            oo0o00oo.OooO0OO(oo0o00oo.OooO0o());
        }
    }

    public oO0O00oO(@NonNull Context context, @NonNull o00O000.OooO00o oooO00o) {
        super(context, oooO00o);
        this.f30058OooO0oO = (ConnectivityManager) this.f30050OooO0O0.getSystemService("connectivity");
        if (OooO0oO()) {
            this.f30059OooO0oo = new OooO0O0();
        } else {
            this.f30057OooO = new OooO00o();
        }
    }

    public static boolean OooO0oO() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @Override // p112o000oooo.oO0O00o0
    public final o00000O OooO00o() {
        return OooO0o();
    }

    @Override // p112o000oooo.oO0O00o0
    public final void OooO0Oo() {
        if (!OooO0oO()) {
            o0OoOo0.OooO0OO().OooO00o(f30056OooOO0, "Registering broadcast receiver", new Throwable[0]);
            this.f30050OooO0O0.registerReceiver(this.f30057OooO, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return;
        }
        try {
            o0OoOo0.OooO0OO().OooO00o(f30056OooOO0, "Registering network callback", new Throwable[0]);
            this.f30058OooO0oO.registerDefaultNetworkCallback(this.f30059OooO0oo);
        } catch (IllegalArgumentException | SecurityException e) {
            o0OoOo0.OooO0OO().OooO0O0(f30056OooOO0, "Received exception while registering network callback", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    public final o00000O OooO0o() {
        boolean z;
        NetworkInfo activeNetworkInfo = this.f30058OooO0oO.getActiveNetworkInfo();
        boolean z2 = false;
        boolean z3 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        if (Build.VERSION.SDK_INT < 23) {
            z = false;
        } else {
            try {
                NetworkCapabilities networkCapabilities = this.f30058OooO0oO.getNetworkCapabilities(this.f30058OooO0oO.getActiveNetwork());
                if (networkCapabilities == null || !networkCapabilities.hasCapability(16)) {
                    z = false;
                } else {
                    z = true;
                }
            } catch (SecurityException e) {
                o0OoOo0.OooO0OO().OooO0O0(f30056OooOO0, "Unable to validate active network", e);
            }
        }
        boolean zOooO00o = o000O00.OooO00o.OooO00o(this.f30058OooO0oO);
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z2 = true;
        }
        return new o00000O(z3, z, zOooO00o, z2);
    }

    @Override // p112o000oooo.oO0O00o0
    public final void OooO0o0() {
        if (!OooO0oO()) {
            o0OoOo0.OooO0OO().OooO00o(f30056OooOO0, "Unregistering broadcast receiver", new Throwable[0]);
            this.f30050OooO0O0.unregisterReceiver(this.f30057OooO);
            return;
        }
        try {
            o0OoOo0.OooO0OO().OooO00o(f30056OooOO0, "Unregistering network callback", new Throwable[0]);
            this.f30058OooO0oO.unregisterNetworkCallback(this.f30059OooO0oo);
        } catch (IllegalArgumentException | SecurityException e) {
            o0OoOo0.OooO0OO().OooO0O0(f30056OooOO0, "Received exception while unregistering network callback", e);
        }
    }
}
