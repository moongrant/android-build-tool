package p674oooo00o;

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
import p067o0000oo.o00000OO;
import p084o000Ooo0.o000oOoO;
import p089o000o00O.o00O00OO;
import p096o000o0o0.o0000O0;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class oO0O00O extends oO0O000o<o00O00OO> {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final String f60988OooOO0 = o000oOoO.OooO0o0("NetworkStateTracker");

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooO00o f60989OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ConnectivityManager f60990OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @RequiresApi(24)
    public final OooO0O0 f60991OooO0oo;

    public class OooO00o extends BroadcastReceiver {
        public OooO00o() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            o000oOoO.OooO0OO().OooO00o(oO0O00O.f60988OooOO0, "Network broadcast received", new Throwable[0]);
            oO0O00O oo0o00o = oO0O00O.this;
            oo0o00o.OooO0OO(oo0o00o.OooO0o());
        }
    }

    @RequiresApi(24)
    public class OooO0O0 extends ConnectivityManager.NetworkCallback {
        public OooO0O0() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(@NonNull Network network, @NonNull NetworkCapabilities networkCapabilities) {
            o000oOoO.OooO0OO().OooO00o(oO0O00O.f60988OooOO0, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            oO0O00O oo0o00o = oO0O00O.this;
            oo0o00o.OooO0OO(oo0o00o.OooO0o());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(@NonNull Network network) {
            o000oOoO.OooO0OO().OooO00o(oO0O00O.f60988OooOO0, "Network connection lost", new Throwable[0]);
            oO0O00O oo0o00o = oO0O00O.this;
            oo0o00o.OooO0OO(oo0o00o.OooO0o());
        }
    }

    public oO0O00O(@NonNull Context context, @NonNull o0000O0 o0000o1) {
        super(context, o0000o1);
        this.f60990OooO0oO = (ConnectivityManager) this.f60982OooO0O0.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT >= 24) {
            this.f60991OooO0oo = new OooO0O0();
        } else {
            this.f60989OooO = new OooO00o();
        }
    }

    @Override // p674oooo00o.oO0O000o
    public final o00O00OO OooO00o() {
        return OooO0o();
    }

    @Override // p674oooo00o.oO0O000o
    public final void OooO0Oo() {
        boolean z = Build.VERSION.SDK_INT >= 24;
        String str = f60988OooOO0;
        if (!z) {
            o000oOoO.OooO0OO().OooO00o(str, "Registering broadcast receiver", new Throwable[0]);
            this.f60982OooO0O0.registerReceiver(this.f60989OooO, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return;
        }
        try {
            o000oOoO.OooO0OO().OooO00o(str, "Registering network callback", new Throwable[0]);
            this.f60990OooO0oO.registerDefaultNetworkCallback(this.f60991OooO0oo);
        } catch (IllegalArgumentException | SecurityException e) {
            o000oOoO.OooO0OO().OooO0O0(str, "Received exception while registering network callback", e);
        }
    }

    public final o00O00OO OooO0o() {
        boolean z;
        ConnectivityManager connectivityManager = this.f60990OooO0oO;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            z = networkCapabilities != null && networkCapabilities.hasCapability(16);
        } catch (SecurityException e) {
            o000oOoO.OooO0OO().OooO0O0(f60988OooOO0, "Unable to validate active network", e);
        }
        return new o00O00OO(z2, z, o00000OO.OooO00o(connectivityManager), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }

    @Override // p674oooo00o.oO0O000o
    public final void OooO0o0() {
        boolean z = Build.VERSION.SDK_INT >= 24;
        String str = f60988OooOO0;
        if (!z) {
            o000oOoO.OooO0OO().OooO00o(str, "Unregistering broadcast receiver", new Throwable[0]);
            this.f60982OooO0O0.unregisterReceiver(this.f60989OooO);
            return;
        }
        try {
            o000oOoO.OooO0OO().OooO00o(str, "Unregistering network callback", new Throwable[0]);
            this.f60990OooO0oO.unregisterNetworkCallback(this.f60991OooO0oo);
        } catch (IllegalArgumentException | SecurityException e) {
            o000oOoO.OooO0OO().OooO0O0(str, "Received exception while unregistering network callback", e);
        }
    }
}
