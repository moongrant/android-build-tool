package p119o00O0Oo0;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o000O000.OooO00o;
import oOO00O.OooOOO0;
import org.jetbrains.annotations.NotNull;
import p116o00O0O0o.o0OO00O;
import p116o00O0O0o.o0OOO0o;
import p116o00O0O0o.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final class oo0o0Oo implements ComponentCallbacks2, o0Oo0oo.OooO00o {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public volatile boolean f30760Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final Context f30761Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final WeakReference<OooOOO0> f30762Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final o0Oo0oo f30763Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f30764OoooO00;

    /* JADX WARN: Code duplicated, block: B:20:0x0058  */
    public oo0o0Oo(@NotNull OooOOO0 imageLoader, @NotNull Context context, boolean z) {
        o0Oo0oo o0oo00o2;
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f30761Oooo0o = context;
        this.f30762Oooo0oO = new WeakReference<>(imageLoader);
        o0OO00O o0oo00o3 = imageLoader.f53009OooO0oO;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(this, "listener");
        if (z) {
            ConnectivityManager connectivityManager = (ConnectivityManager) OooO00o.OooO0OO(context, ConnectivityManager.class);
            if (connectivityManager == null) {
                if (o0oo00o3 != null && o0oo00o3.getLevel() <= 5) {
                    o0oo00o3.OooO00o();
                }
                o0oo00o2 = o0OOO0o.f30550OooO00o;
            } else {
                if (OooO00o.OooO00o(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                    try {
                        o0oo00o2 = new o0OO00O(connectivityManager, this);
                    } catch (Exception e) {
                        if (o0oo00o3 != null) {
                            o00oO0o.OooO00o(o0oo00o3, "NetworkObserver", new RuntimeException("Failed to register network observer.", e));
                        }
                        o0oo00o2 = o0OOO0o.f30550OooO00o;
                    }
                } else {
                    if (o0oo00o3 != null) {
                        o0oo00o3.OooO00o();
                    }
                    o0oo00o2 = o0OOO0o.f30550OooO00o;
                }
            }
        } else {
            o0oo00o2 = o0OOO0o.f30550OooO00o;
        }
        this.f30763Oooo0oo = o0oo00o2;
        this.f30760Oooo = o0oo00o2.OooO00o();
        this.f30764OoooO00 = new AtomicBoolean(false);
        this.f30761Oooo0o.registerComponentCallbacks(this);
    }

    @Override // o00O0O0o.o0Oo0oo.OooO00o
    public final void OooO00o(boolean z) {
        OooOOO0 oooOOO0 = this.f30762Oooo0oO.get();
        if (oooOOO0 == null) {
            OooO0O0();
            return;
        }
        this.f30760Oooo = z;
        o0OO00O o0oo00o2 = oooOOO0.f53009OooO0oO;
        if (o0oo00o2 != null && o0oo00o2.getLevel() <= 4) {
            o0oo00o2.OooO00o();
        }
    }

    public final void OooO0O0() {
        if (this.f30764OoooO00.getAndSet(true)) {
            return;
        }
        this.f30761Oooo0o.unregisterComponentCallbacks(this);
        this.f30763Oooo0oo.shutdown();
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        if (this.f30762Oooo0oO.get() == null) {
            OooO0O0();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        Unit unit;
        OooOOO0 oooOOO0 = this.f30762Oooo0oO.get();
        if (oooOOO0 == null) {
            unit = null;
        } else {
            oooOOO0.f53005OooO0OO.f30499OooO00o.OooO00o(i);
            oooOOO0.f53005OooO0OO.f30500OooO0O0.OooO00o(i);
            oooOOO0.f53004OooO0O0.OooO00o(i);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            OooO0O0();
        }
    }
}
