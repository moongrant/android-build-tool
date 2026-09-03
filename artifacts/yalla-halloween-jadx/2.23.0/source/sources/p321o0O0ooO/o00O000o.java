package p321o0O0ooO;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import androidx.core.content.ContextCompat;
import coil.memory.MemoryCache;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import p097o000o0oO.o000Oo0;
import p110o000ooo0.o00000O;
import p110o000ooo0.o00000O0;
import p110o000ooo0.o00000OO;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O000o implements ComponentCallbacks2, o00000O.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Context f42865OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final o00000O f42866OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final WeakReference<o000Oo0> f42867OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public volatile boolean f42868OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f42869OooO0oo;

    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    public o00O000o(@NotNull o000Oo0 o000oo1, @NotNull Context context, boolean z) {
        o00000O o00000o1;
        this.f42865OooO0Oo = context;
        this.f42867OooO0o0 = new WeakReference<>(o000oo1);
        if (z) {
            o000oo1.getClass();
            Object obj = ContextCompat.f5271OooO00o;
            ConnectivityManager connectivityManager = (ConnectivityManager) ContextCompat.OooO0o.OooO0O0(context, ConnectivityManager.class);
            if (connectivityManager == null) {
                o00000o1 = new o00000O0();
            } else {
                if (ContextCompat.OooO00o(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                    try {
                        o00000o1 = new o00000OO(connectivityManager, this);
                    } catch (Exception unused) {
                        o00000o1 = new o00000O0();
                    }
                } else {
                    o00000o1 = new o00000O0();
                }
            }
        } else {
            o00000o1 = new o00000O0();
        }
        this.f42866OooO0o = o00000o1;
        this.f42868OooO0oO = o00000o1.OooO00o();
        this.f42869OooO0oo = new AtomicBoolean(false);
    }

    @Override // o000ooo0.o00000O.OooO00o
    public final void OooO00o(boolean z) {
        Unit unit;
        if (this.f42867OooO0o0.get() != null) {
            this.f42868OooO0oO = z;
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            OooO0O0();
        }
    }

    public final void OooO0O0() {
        if (this.f42869OooO0oo.getAndSet(true)) {
            return;
        }
        this.f42865OooO0Oo.unregisterComponentCallbacks(this);
        this.f42866OooO0o.shutdown();
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NotNull Configuration configuration) {
        if (this.f42867OooO0o0.get() == null) {
            OooO0O0();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        Unit unit;
        MemoryCache value;
        o000Oo0 o000oo1 = this.f42867OooO0o0.get();
        if (o000oo1 != null) {
            Lazy<MemoryCache> lazy = o000oo1.f35431OooO0O0;
            if (lazy != null && (value = lazy.getValue()) != null) {
                value.OooO00o(i);
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            OooO0O0();
        }
    }
}
