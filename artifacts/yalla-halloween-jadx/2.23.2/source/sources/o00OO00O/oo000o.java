package o00OO00O;

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
import p118o00O0Oo.o0000Ooo;
import p129o00O0oOo.o00O000;
import p129o00O0oOo.o00oOoo;
import p129o00O0oOo.o0O0ooO;

/* JADX INFO: loaded from: classes2.dex */
public final class oo000o implements ComponentCallbacks2, o00oOoo.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Context f37099OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final o00oOoo f37100OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final WeakReference<o0000Ooo> f37101OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public volatile boolean f37102OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f37103OooO0oo;

    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    public oo000o(@NotNull o0000Ooo o0000ooo, @NotNull Context context, boolean z) {
        o00oOoo o0o0ooo;
        this.f37099OooO0Oo = context;
        this.f37101OooO0o0 = new WeakReference<>(o0000ooo);
        if (z) {
            o0000ooo.getClass();
            Object obj = ContextCompat.f5281OooO00o;
            ConnectivityManager connectivityManager = (ConnectivityManager) ContextCompat.OooO0o.OooO0O0(context, ConnectivityManager.class);
            if (connectivityManager == null) {
                o0o0ooo = new o0O0ooO();
            } else {
                if (ContextCompat.OooO00o(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                    try {
                        o0o0ooo = new o00O000(connectivityManager, this);
                    } catch (Exception unused) {
                        o0o0ooo = new o0O0ooO();
                    }
                } else {
                    o0o0ooo = new o0O0ooO();
                }
            }
        } else {
            o0o0ooo = new o0O0ooO();
        }
        this.f37100OooO0o = o0o0ooo;
        this.f37102OooO0oO = o0o0ooo.OooO00o();
        this.f37103OooO0oo = new AtomicBoolean(false);
    }

    @Override // o00O0oOo.o00oOoo.OooO00o
    public final void OooO00o(boolean z) {
        Unit unit;
        if (this.f37101OooO0o0.get() != null) {
            this.f37102OooO0oO = z;
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            OooO0O0();
        }
    }

    public final void OooO0O0() {
        if (this.f37103OooO0oo.getAndSet(true)) {
            return;
        }
        this.f37099OooO0Oo.unregisterComponentCallbacks(this);
        this.f37100OooO0o.shutdown();
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NotNull Configuration configuration) {
        if (this.f37101OooO0o0.get() == null) {
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
        o0000Ooo o0000ooo = this.f37101OooO0o0.get();
        if (o0000ooo != null) {
            Lazy<MemoryCache> lazy = o0000ooo.f36382OooO0O0;
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
