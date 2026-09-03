package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.manager.Oooo000;
import com.bumptech.glide.manager.o000oOoO;
import com.bumptech.glide.manager.o0OoOo0;
import com.bumptech.glide.manager.o0ooOOo;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p144o00Oo.o000O00O;
import p165o00OoOoo.o00;
import p170o00Ooo0o.Oooo0;
import p170o00Ooo0o.o00O0O;
import p172o00OooO0.o00000OO;
import p174o00OooOo.o00OO0O0;

/* JADX INFO: loaded from: classes2.dex */
public class OooOo00 implements ComponentCallbacks2, com.bumptech.glide.manager.OooOo00 {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final o00O0O f12986OooOOO = new o00O0O().OooO0oo(Bitmap.class).OooOOo0();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final o00O0O f12987OooOOOO = new o00O0O().OooO0oo(o00.class).OooOOo0();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @GuardedBy("this")
    public final o0ooOOo f12988OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0OO f12989OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final com.bumptech.glide.manager.OooOOOO f12990OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Context f12991OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @GuardedBy("this")
    public final o0OoOo0 f12992OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @GuardedBy("this")
    public final o000oOoO f12993OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final OooO00o f12994OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final com.bumptech.glide.manager.OooO0O0 f12995OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final CopyOnWriteArrayList<p170o00Ooo0o.o0OoOo0<Object>> f12996OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @GuardedBy("this")
    public o00O0O f12997OooOOO0;

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            OooOo00 oooOo00 = OooOo00.this;
            oooOo00.f12990OooO0o.OooO0O0(oooOo00);
        }
    }

    public class OooO0O0 implements com.bumptech.glide.manager.OooO0O0.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @GuardedBy("RequestManager.this")
        public final o0OoOo0 f12999OooO00o;

        public OooO0O0(o0OoOo0 o0oooo1) {
            this.f12999OooO00o = o0oooo1;
        }

        @Override // com.bumptech.glide.manager.OooO0O0.OooO00o
        public final void OooO00o(boolean z) {
            if (z) {
                synchronized (OooOo00.this) {
                    this.f12999OooO00o.OooO0O0();
                }
            }
        }
    }

    static {
        new o00O0O().OooO(o000O00O.f37589OooO0O0).OooOoO0(Priority.LOW).Oooo000(true);
    }

    public OooOo00(@NonNull OooO0OO oooO0OO, @NonNull com.bumptech.glide.manager.OooOOOO oooOOOO, @NonNull o000oOoO o000oooo2, @NonNull Context context) {
        o0OoOo0 o0oooo1 = new o0OoOo0();
        com.bumptech.glide.manager.OooO0OO oooO0OO2 = oooO0OO.f12947OooOO0;
        this.f12988OooO = new o0ooOOo();
        OooO00o oooO00o = new OooO00o();
        this.f12994OooOO0 = oooO00o;
        this.f12989OooO0Oo = oooO0OO;
        this.f12990OooO0o = oooOOOO;
        this.f12993OooO0oo = o000oooo2;
        this.f12992OooO0oO = o0oooo1;
        this.f12991OooO0o0 = context;
        Context applicationContext = context.getApplicationContext();
        OooO0O0 oooO0O0 = new OooO0O0(o0oooo1);
        ((com.bumptech.glide.manager.OooO) oooO0OO2).getClass();
        boolean z = ContextCompat.OooO00o(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        com.bumptech.glide.manager.OooO0O0 oooO0o = z ? new com.bumptech.glide.manager.OooO0o(applicationContext, oooO0O0) : new Oooo000();
        this.f12995OooOO0O = oooO0o;
        synchronized (oooO0OO.f12948OooOO0O) {
            if (oooO0OO.f12948OooOO0O.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            oooO0OO.f12948OooOO0O.add(this);
        }
        char[] cArr = o00OO0O0.f38351OooO00o;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            o00OO0O0.OooO0o0().post(oooO00o);
        } else {
            oooOOOO.OooO0O0(this);
        }
        oooOOOO.OooO0O0(oooO0o);
        this.f12996OooOO0o = new CopyOnWriteArrayList<>(oooO0OO.f12945OooO0oO.f12935OooO0o0);
        OooOo0O(oooO0OO.f12945OooO0oO.OooO00o());
    }

    @NonNull
    @CheckResult
    public <ResourceType> OooOOOO<ResourceType> OooO0o0(@NonNull Class<ResourceType> cls) {
        return new OooOOOO<>(this.f12989OooO0Oo, this, cls, this.f12991OooO0o0);
    }

    @NonNull
    @CheckResult
    public OooOOOO<Bitmap> OooO0oO() {
        return OooO0o0(Bitmap.class).OooO0O0(f12986OooOOO);
    }

    @NonNull
    @CheckResult
    public OooOOOO<Drawable> OooO0oo() {
        return OooO0o0(Drawable.class);
    }

    @NonNull
    @CheckResult
    public OooOOOO<o00> OooOO0o() {
        return OooO0o0(o00.class).OooO0O0(f12987OooOOOO);
    }

    public final synchronized void OooOOO() {
        Iterator it = o00OO0O0.OooO0Oo(this.f12988OooO.f13156OooO0Oo).iterator();
        while (it.hasNext()) {
            OooOOO0((o00000OO) it.next());
        }
        this.f12988OooO.f13156OooO0Oo.clear();
    }

    public final void OooOOO0(@Nullable o00000OO<?> o00000oo2) {
        boolean z;
        if (o00000oo2 == null) {
            return;
        }
        boolean zOooOo0o = OooOo0o(o00000oo2);
        Oooo0 oooo0OooO00o = o00000oo2.OooO00o();
        if (zOooOo0o) {
            return;
        }
        OooO0OO oooO0OO = this.f12989OooO0Oo;
        synchronized (oooO0OO.f12948OooOO0O) {
            Iterator it = oooO0OO.f12948OooOO0O.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                } else if (((OooOo00) it.next()).OooOo0o(o00000oo2)) {
                    z = true;
                    break;
                }
            }
        }
        if (z || oooo0OooO00o == null) {
            return;
        }
        o00000oo2.OooO(null);
        oooo0OooO00o.clear();
    }

    @NonNull
    @CheckResult
    public OooOOOO OooOOOO() {
        return OooO0oo().OoooOO0();
    }

    @NonNull
    @CheckResult
    public OooOOOO<Drawable> OooOOOo(@Nullable Uri uri) {
        return OooO0oo().o000oOoO(uri);
    }

    @NonNull
    @CheckResult
    public OooOOOO<Drawable> OooOOo(@Nullable String str) {
        return OooO0oo().OoooOoO(str);
    }

    @NonNull
    @CheckResult
    public OooOOOO<Drawable> OooOOo0(@Nullable @DrawableRes @RawRes Integer num) {
        return OooO0oo().OoooOo0(num);
    }

    @NonNull
    @CheckResult
    public OooOOOO OooOOoo() {
        return OooO0oo().OoooOoo();
    }

    public final synchronized void OooOo0() {
        o0OoOo0 o0oooo1 = this.f12992OooO0oO;
        o0oooo1.f13155OooO0OO = false;
        for (Oooo0 oooo0 : o00OO0O0.OooO0Oo(o0oooo1.f13153OooO00o)) {
            if (!oooo0.OooO0Oo() && !oooo0.isRunning()) {
                oooo0.OooOO0();
            }
        }
        o0oooo1.f13154OooO0O0.clear();
    }

    public final synchronized void OooOo00() {
        o0OoOo0 o0oooo1 = this.f12992OooO0oO;
        o0oooo1.f13155OooO0OO = true;
        for (Oooo0 oooo0 : o00OO0O0.OooO0Oo(o0oooo1.f13153OooO00o)) {
            if (oooo0.isRunning()) {
                oooo0.pause();
                o0oooo1.f13154OooO0O0.add(oooo0);
            }
        }
    }

    public synchronized void OooOo0O(@NonNull o00O0O o00o0o2) {
        this.f12997OooOOO0 = o00o0o2.clone().OooO0Oo();
    }

    public final synchronized boolean OooOo0o(@NonNull o00000OO<?> o00000oo2) {
        Oooo0 oooo0OooO00o = o00000oo2.OooO00o();
        if (oooo0OooO00o == null) {
            return true;
        }
        if (!this.f12992OooO0oO.OooO00o(oooo0OooO00o)) {
            return false;
        }
        this.f12988OooO.f13156OooO0Oo.remove(o00000oo2);
        o00000oo2.OooO(null);
        return true;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.bumptech.glide.manager.OooOo00
    public final synchronized void onDestroy() {
        this.f12988OooO.onDestroy();
        OooOOO();
        o0OoOo0 o0oooo1 = this.f12992OooO0oO;
        Iterator it = o00OO0O0.OooO0Oo(o0oooo1.f13153OooO00o).iterator();
        while (it.hasNext()) {
            o0oooo1.OooO00o((Oooo0) it.next());
        }
        o0oooo1.f13154OooO0O0.clear();
        this.f12990OooO0o.OooO00o(this);
        this.f12990OooO0o.OooO00o(this.f12995OooOO0O);
        o00OO0O0.OooO0o0().removeCallbacks(this.f12994OooOO0);
        this.f12989OooO0Oo.OooO0oO(this);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // com.bumptech.glide.manager.OooOo00
    public final synchronized void onStart() {
        OooOo0();
        this.f12988OooO.onStart();
    }

    @Override // com.bumptech.glide.manager.OooOo00
    public final synchronized void onStop() {
        this.f12988OooO.onStop();
        OooOo00();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f12992OooO0oO + ", treeNode=" + this.f12993OooO0oo + "}";
    }
}
