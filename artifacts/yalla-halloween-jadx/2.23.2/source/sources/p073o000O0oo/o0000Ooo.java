package p073o000O0oo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.scheduler.Requirements;
import p029Oooo0oo.oo0oO0;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class o0000Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f34363OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0O0 f34364OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Requirements f34365OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Handler f34366OooO0Oo = o00.OooOOO0(null);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f34367OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public OooO00o f34368OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public OooO0OO f34369OooO0oO;

    public class OooO00o extends BroadcastReceiver {
        public OooO00o() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            o0000Ooo.this.OooO00o();
        }
    }

    public interface OooO0O0 {
    }

    @RequiresApi(24)
    public final class OooO0OO extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f34371OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f34372OooO0O0;

        public OooO0OO() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            o0000Ooo.this.f34366OooO0Oo.post(new o0000O00(this, 0));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onBlockedStatusChanged(Network network, boolean z) {
            if (z) {
                return;
            }
            o0000Ooo.this.f34366OooO0Oo.post(new o0000(this));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            boolean zHasCapability = networkCapabilities.hasCapability(16);
            boolean z = this.f34371OooO00o;
            o0000Ooo o0000ooo = o0000Ooo.this;
            if (z && this.f34372OooO0O0 == zHasCapability) {
                if (zHasCapability) {
                    o0000ooo.f34366OooO0Oo.post(new o0000(this));
                }
            } else {
                this.f34371OooO00o = true;
                this.f34372OooO0O0 = zHasCapability;
                o0000ooo.f34366OooO0Oo.post(new o0000O00(this, 0));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            o0000Ooo.this.f34366OooO0Oo.post(new o0000O00(this, 0));
        }
    }

    public o0000Ooo(Context context, oo0oO0 oo0oo0, Requirements requirements) {
        this.f34363OooO00o = context.getApplicationContext();
        this.f34364OooO0O0 = oo0oo0;
        this.f34365OooO0OO = requirements;
    }

    public final void OooO00o() {
        int iOooO00o = this.f34365OooO0OO.OooO00o(this.f34363OooO00o);
        if (this.f34367OooO0o != iOooO00o) {
            this.f34367OooO0o = iOooO00o;
            androidx.media3.exoplayer.offline.OooO00o oooO00o = (androidx.media3.exoplayer.offline.OooO00o) ((oo0oO0) this.f34364OooO0O0).f1318OooO0Oo;
            Requirements requirements = androidx.media3.exoplayer.offline.OooO00o.f7796OooOOOO;
            oooO00o.OooO0O0(this, iOooO00o);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final int OooO0O0() {
        Requirements requirements = this.f34365OooO0OO;
        Context context = this.f34363OooO00o;
        this.f34367OooO0o = requirements.OooO00o(context);
        IntentFilter intentFilter = new IntentFilter();
        int i = requirements.f7843OooO0Oo;
        if ((i & 1) != 0) {
            if (o00.f34910OooO00o >= 24) {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                connectivityManager.getClass();
                OooO0OO oooO0OO = new OooO0OO();
                this.f34369OooO0oO = oooO0OO;
                connectivityManager.registerDefaultNetworkCallback(oooO0OO);
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if ((i & 8) != 0) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if ((i & 4) != 0) {
            if (o00.f34910OooO00o >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        if ((i & 16) != 0) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        OooO00o oooO00o = new OooO00o();
        this.f34368OooO0o0 = oooO00o;
        context.registerReceiver(oooO00o, intentFilter, null, this.f34366OooO0Oo);
        return this.f34367OooO0o;
    }
}
