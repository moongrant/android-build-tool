package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import p214o00oO0.o00O;
import p231o00oOo0o.o000000;
import p231o00oOo0o.o000000O;
import p231o00oOo0o.o00000O0;
import p231o00oOo0o.o00O0O;
import p231o00oOo0o.o00Oo0;
import p231o00oOo0o.o00Ooo;
import p231o00oOo0o.o0OO00O;
import p231o00oOo0o.o0Oo0oo;
import p231o00oOo0o.o0OoOo0;
import p231o00oOo0o.oo0o0Oo;
import p234o00oOoOO.oOO0O0O;
import p234o00oOoOO.oOO0O0O0;
import p234o00oOoOO.oOO0OO0O;
import p235o00oOoOo.oOOO0O0o;
import p238o00oOooO.oOOOOo0O;
import p243o00oo00O.o000O000;

/* JADX INFO: loaded from: classes.dex */
public class OooOOO implements ComponentCallbacks2, o0OO00O {

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public static final oOO0OO0O f12398OoooOOO = new oOO0OO0O().OooO(Bitmap.class).OooOOOo();

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public static final oOO0OO0O f12399OoooOOo = new oOO0OO0O().OooO(oOOOOo0O.class).OooOOOo();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @GuardedBy("this")
    public final o000000O f12400Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final OooO0OO f12401Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final Context f12402Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final o0Oo0oo f12403Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final o0OoOo0 f12404OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @GuardedBy("this")
    public final o00000O0 f12405OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @GuardedBy("this")
    public final o000000 f12406OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final OooO00o f12407OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final CopyOnWriteArrayList<oOO0O0O<Object>> f12408OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @GuardedBy("this")
    public oOO0OO0O f12409o000oOoO;

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            OooOOO oooOOO = OooOOO.this;
            oooOOO.f12403Oooo0oo.OooO0O0(oooOOO);
        }
    }

    public class OooO0O0 implements o0OoOo0.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @GuardedBy("RequestManager.this")
        public final o000000O f12411OooO00o;

        public OooO0O0(o000000O o000000o2) {
            this.f12411OooO00o = o000000o2;
        }
    }

    static {
        oOO0OO0O.Oooo00o(o00O.f33388OooO0O0).OooOo(Priority.LOW).OooOoo0(true);
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList, java.util.List<com.bumptech.glide.OooOOO>] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList, java.util.List<com.bumptech.glide.OooOOO>] */
    public OooOOO(@NonNull OooO0OO oooO0OO, @NonNull o0Oo0oo o0oo0oo2, @NonNull o000000 o000000Var, @NonNull Context context) {
        oOO0OO0O ooo0oo0o;
        o000000O o000000o2 = new o000000O();
        o00O0O o00o0o2 = oooO0OO.f12375OoooO;
        this.f12405OoooO0 = new o00000O0();
        OooO00o oooO00o = new OooO00o();
        this.f12407OoooO0O = oooO00o;
        this.f12401Oooo0o = oooO0OO;
        this.f12403Oooo0oo = o0oo0oo2;
        this.f12406OoooO00 = o000000Var;
        this.f12400Oooo = o000000o2;
        this.f12402Oooo0oO = context;
        Context applicationContext = context.getApplicationContext();
        OooO0O0 oooO0O0 = new OooO0O0(o000000o2);
        Objects.requireNonNull((o00Ooo) o00o0o2);
        boolean z = o000O000.OooO00o.OooO00o(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        o0OoOo0 o00oo1 = z ? new o00Oo0(applicationContext, oooO0O0) : new oo0o0Oo();
        this.f12404OoooO = o00oo1;
        if (o000O000.OooO0oo()) {
            o000O000.OooO0o().post(oooO00o);
        } else {
            o0oo0oo2.OooO0O0(this);
        }
        o0oo0oo2.OooO0O0(o00oo1);
        this.f12408OoooOO0 = new CopyOnWriteArrayList<>(oooO0OO.f12371Oooo.f12365OooO0o0);
        OooO oooO = oooO0OO.f12371Oooo;
        synchronized (oooO) {
            if (oooO.f12368OooOO0 == null) {
                Objects.requireNonNull((OooO0o.OooO00o) oooO.f12363OooO0Oo);
                oOO0OO0O ooo0oo0o2 = new oOO0OO0O();
                ooo0oo0o2.f33978OooooOo = true;
                oooO.f12368OooOO0 = ooo0oo0o2;
            }
            ooo0oo0o = oooO.f12368OooOO0;
        }
        OooOO0o(ooo0oo0o);
        synchronized (oooO0OO.f12379OoooOO0) {
            if (oooO0OO.f12379OoooOO0.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            oooO0OO.f12379OoooOO0.add(this);
        }
    }

    @NonNull
    @CheckResult
    public OooOOO0 OooO() {
        return OooO0OO().OoooOO0();
    }

    @NonNull
    @CheckResult
    public <ResourceType> OooOOO0<ResourceType> OooO00o(@NonNull Class<ResourceType> cls) {
        return new OooOOO0<>(this.f12401Oooo0o, this, cls, this.f12402Oooo0oO);
    }

    @NonNull
    @CheckResult
    public OooOOO0<Bitmap> OooO0O0() {
        return OooO00o(Bitmap.class).OooO0OO(f12398OoooOOO);
    }

    @NonNull
    @CheckResult
    public OooOOO0<Drawable> OooO0OO() {
        return OooO00o(Drawable.class);
    }

    @NonNull
    @CheckResult
    public OooOOO0<oOOOOo0O> OooO0Oo() {
        return OooO00o(oOOOOo0O.class).OooO0OO(f12399OoooOOo);
    }

    @NonNull
    @CheckResult
    public OooOOO0 OooO0o() {
        return OooO0OO().Oooo0oo();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.bumptech.glide.OooOOO>] */
    public final void OooO0o0(@Nullable oOOO0O0o<?> oooo0o0o) {
        boolean z;
        if (oooo0o0o == null) {
            return;
        }
        boolean zOooOOO0 = OooOOO0(oooo0o0o);
        oOO0O0O0 request = oooo0o0o.getRequest();
        if (zOooOOO0) {
            return;
        }
        OooO0OO oooO0OO = this.f12401Oooo0o;
        synchronized (oooO0OO.f12379OoooOO0) {
            Iterator it = oooO0OO.f12379OoooOO0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                } else if (((OooOOO) it.next()).OooOOO0(oooo0o0o)) {
                    z = true;
                    break;
                }
            }
        }
        if (z || request == null) {
            return;
        }
        oooo0o0o.setRequest(null);
        request.clear();
    }

    @NonNull
    @CheckResult
    public OooOOO0<Drawable> OooO0oO(@Nullable @DrawableRes @RawRes Integer num) {
        return OooO0OO().OoooO00(num);
    }

    @NonNull
    @CheckResult
    public OooOOO0<Drawable> OooO0oo(@Nullable String str) {
        return OooO0OO().OoooO(str);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList, java.util.List<o00oOoOO.oOO0O0O0>] */
    public final synchronized void OooOO0() {
        o000000O o000000o2 = this.f12400Oooo;
        o000000o2.f33920OooO0OO = true;
        for (oOO0O0O0 ooo0o0o0 : (ArrayList) o000O000.OooO0o0(o000000o2.f33918OooO00o)) {
            if (ooo0o0o0.isRunning()) {
                ooo0o0o0.pause();
                o000000o2.f33919OooO0O0.add(ooo0o0o0);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<o00oOoOO.oOO0O0O0>] */
    public final synchronized void OooOO0O() {
        o000000O o000000o2 = this.f12400Oooo;
        o000000o2.f33920OooO0OO = false;
        for (oOO0O0O0 ooo0o0o0 : (ArrayList) o000O000.OooO0o0(o000000o2.f33918OooO00o)) {
            if (!ooo0o0o0.OooOO0() && !ooo0o0o0.isRunning()) {
                ooo0o0o0.OooO0oo();
            }
        }
        o000000o2.f33919OooO0O0.clear();
    }

    public synchronized void OooOO0o(@NonNull oOO0OO0O ooo0oo0o) {
        this.f12409o000oOoO = ooo0oo0o.clone().OooO0Oo();
    }

    public final synchronized boolean OooOOO0(@NonNull oOOO0O0o<?> oooo0o0o) {
        oOO0O0O0 request = oooo0o0o.getRequest();
        if (request == null) {
            return true;
        }
        if (!this.f12400Oooo.OooO00o(request)) {
            return false;
        }
        this.f12405OoooO0.f33921Oooo0o.remove(oooo0o0o);
        oooo0o0o.setRequest(null);
        return true;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.ArrayList, java.util.List<o00oOoOO.oOO0O0O0>] */
    @Override // p231o00oOo0o.o0OO00O
    public final synchronized void onDestroy() {
        this.f12405OoooO0.onDestroy();
        Iterator it = ((ArrayList) o000O000.OooO0o0(this.f12405OoooO0.f33921Oooo0o)).iterator();
        while (it.hasNext()) {
            OooO0o0((oOOO0O0o) it.next());
        }
        this.f12405OoooO0.f33921Oooo0o.clear();
        o000000O o000000o2 = this.f12400Oooo;
        Iterator it2 = ((ArrayList) o000O000.OooO0o0(o000000o2.f33918OooO00o)).iterator();
        while (it2.hasNext()) {
            o000000o2.OooO00o((oOO0O0O0) it2.next());
        }
        o000000o2.f33919OooO0O0.clear();
        this.f12403Oooo0oo.OooO00o(this);
        this.f12403Oooo0oo.OooO00o(this.f12404OoooO);
        o000O000.OooO0o().removeCallbacks(this.f12407OoooO0O);
        this.f12401Oooo0o.OooO0oo(this);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // p231o00oOo0o.o0OO00O
    public final synchronized void onStart() {
        OooOO0O();
        this.f12405OoooO0.onStart();
    }

    @Override // p231o00oOo0o.o0OO00O
    public final synchronized void onStop() {
        OooOO0();
        this.f12405OoooO0.onStop();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f12400Oooo + ", treeNode=" + this.f12406OoooO00 + "}";
    }
}
