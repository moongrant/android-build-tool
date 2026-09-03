package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
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
import com.bumptech.glide.manager.o00Ooo;
import com.bumptech.glide.manager.o0O0O00;
import com.bumptech.glide.manager.oo000o;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p127o00O0oo.oo0o0Oo;
import p532o0o0Oo.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
public class OooOo00 implements ComponentCallbacks2, Oooo000 {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final o00OO.OooOO0 f9895OooOOO = new o00OO.OooOO0().OooO0oo(Bitmap.class).OooOOOo();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final o00OO.OooOO0 f9896OooOOOO = new o00OO.OooOO0().OooO0oo(p131o00OO0o.OooO.class).OooOOOo();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @GuardedBy("this")
    public final o0O0O00 f9897OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0OO f9898OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final com.bumptech.glide.manager.OooOo f9899OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Context f9900OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @GuardedBy("this")
    public final oo000o f9901OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @GuardedBy("this")
    public final o00Ooo f9902OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final OooO00o f9903OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final com.bumptech.glide.manager.OooO0OO f9904OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final CopyOnWriteArrayList<o00OO.OooO<Object>> f9905OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @GuardedBy("this")
    public o00OO.OooOO0 f9906OooOOO0;

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            OooOo00 oooOo00 = OooOo00.this;
            oooOo00.f9899OooO0o.OooO0O0(oooOo00);
        }
    }

    public class OooO0O0 implements com.bumptech.glide.manager.OooO0OO.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @GuardedBy("RequestManager.this")
        public final oo000o f9908OooO00o;

        public OooO0O0(oo000o oo000oVar) {
            this.f9908OooO00o = oo000oVar;
        }

        @Override // com.bumptech.glide.manager.OooO0OO.OooO00o
        public final void OooO00o(boolean z) {
            if (z) {
                synchronized (OooOo00.this) {
                    this.f9908OooO00o.OooO0O0();
                }
            }
        }
    }

    static {
        new o00OO.OooOO0().OooO(oo0o0Oo.f36939OooO0O0).OooOoO0(Priority.LOW).Oooo000(true);
    }

    public OooOo00(@NonNull OooO0OO oooO0OO, @NonNull com.bumptech.glide.manager.OooOo oooOo, @NonNull o00Ooo o00ooo2, @NonNull Context context) {
        oo000o oo000oVar = new oo000o();
        com.bumptech.glide.manager.OooO0o oooO0o = oooO0OO.f9856OooOO0;
        this.f9897OooO = new o0O0O00();
        OooO00o oooO00o = new OooO00o();
        this.f9903OooOO0 = oooO00o;
        this.f9898OooO0Oo = oooO0OO;
        this.f9899OooO0o = oooOo;
        this.f9902OooO0oo = o00ooo2;
        this.f9901OooO0oO = oo000oVar;
        this.f9900OooO0o0 = context;
        Context applicationContext = context.getApplicationContext();
        OooO0O0 oooO0O0 = new OooO0O0(oo000oVar);
        ((com.bumptech.glide.manager.OooOO0) oooO0o).getClass();
        boolean z = ContextCompat.OooO00o(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        com.bumptech.glide.manager.OooO0OO oooO = z ? new com.bumptech.glide.manager.OooO(applicationContext, oooO0O0) : new o000oOoO();
        this.f9904OooOO0O = oooO;
        synchronized (oooO0OO.f9857OooOO0O) {
            if (oooO0OO.f9857OooOO0O.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            oooO0OO.f9857OooOO0O.add(this);
        }
        if (o0000oo.OooO0oo()) {
            o0000oo.OooO0o0().post(oooO00o);
        } else {
            oooOo.OooO0O0(this);
        }
        oooOo.OooO0O0(oooO);
        this.f9905OooOO0o = new CopyOnWriteArrayList<>(oooO0OO.f9854OooO0oO.f9844OooO0o0);
        OooOo0(oooO0OO.f9854OooO0oO.OooO00o());
    }

    @NonNull
    @CheckResult
    public OooOOOO<Drawable> OooO() {
        return OooO0oO(Drawable.class);
    }

    @NonNull
    @CheckResult
    public <ResourceType> OooOOOO<ResourceType> OooO0oO(@NonNull Class<ResourceType> cls) {
        return new OooOOOO<>(this.f9898OooO0Oo, this, cls, this.f9900OooO0o0);
    }

    @NonNull
    @CheckResult
    public OooOOOO<Bitmap> OooO0oo() {
        return OooO0oO(Bitmap.class).OooO0O0(f9895OooOOO);
    }

    @NonNull
    @CheckResult
    public OooOOOO<p131o00OO0o.OooO> OooOO0o() {
        return OooO0oO(p131o00OO0o.OooO.class).OooO0O0(f9896OooOOOO);
    }

    @NonNull
    @CheckResult
    public OooOOOO OooOOO() {
        return OooO().OoooOO0();
    }

    public final void OooOOO0(@Nullable o00OOO00.OooOOO0<?> oooOOO0) {
        boolean z;
        if (oooOOO0 == null) {
            return;
        }
        boolean zOooOo0O = OooOo0O(oooOOO0);
        o00OO.OooO0OO oooO0OOOooO00o = oooOOO0.OooO00o();
        if (zOooOo0O) {
            return;
        }
        OooO0OO oooO0OO = this.f9898OooO0Oo;
        synchronized (oooO0OO.f9857OooOO0O) {
            Iterator it = oooO0OO.f9857OooOO0O.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                } else if (((OooOo00) it.next()).OooOo0O(oooOOO0)) {
                    z = true;
                    break;
                }
            }
        }
        if (z || oooO0OOOooO00o == null) {
            return;
        }
        oooOOO0.OooO0Oo(null);
        oooO0OOOooO00o.clear();
    }

    @NonNull
    @CheckResult
    public OooOOOO<Drawable> OooOOOO(@Nullable Uri uri) {
        return OooO().o000oOoO(uri);
    }

    @NonNull
    @CheckResult
    public OooOOOO<Drawable> OooOOOo(@Nullable @DrawableRes @RawRes Integer num) {
        return OooO().OoooOOo(num);
    }

    @NonNull
    @CheckResult
    public OooOOOO OooOOo() {
        return OooO().OoooOoO();
    }

    @NonNull
    @CheckResult
    public OooOOOO<Drawable> OooOOo0(@Nullable String str) {
        return OooO().OoooOo0(str);
    }

    public final synchronized void OooOOoo() {
        oo000o oo000oVar = this.f9901OooO0oO;
        oo000oVar.f10075OooO0OO = true;
        for (o00OO.OooO0OO oooO0OO : o0000oo.OooO0Oo(oo000oVar.f10073OooO00o)) {
            if (oooO0OO.isRunning()) {
                oooO0OO.pause();
                oo000oVar.f10074OooO0O0.add(oooO0OO);
            }
        }
    }

    public synchronized void OooOo0(@NonNull o00OO.OooOO0 oooOO1) {
        this.f9906OooOOO0 = oooOO1.clone().OooO0Oo();
    }

    public final synchronized void OooOo00() {
        oo000o oo000oVar = this.f9901OooO0oO;
        oo000oVar.f10075OooO0OO = false;
        for (o00OO.OooO0OO oooO0OO : o0000oo.OooO0Oo(oo000oVar.f10073OooO00o)) {
            if (!oooO0OO.OooO0oo() && !oooO0OO.isRunning()) {
                oooO0OO.OooOO0();
            }
        }
        oo000oVar.f10074OooO0O0.clear();
    }

    public final synchronized boolean OooOo0O(@NonNull o00OOO00.OooOOO0<?> oooOOO0) {
        o00OO.OooO0OO oooO0OOOooO00o = oooOOO0.OooO00o();
        if (oooO0OOOooO00o == null) {
            return true;
        }
        if (!this.f9901OooO0oO.OooO00o(oooO0OOOooO00o)) {
            return false;
        }
        this.f9897OooO.f10060OooO0Oo.remove(oooOOO0);
        oooOOO0.OooO0Oo(null);
        return true;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.bumptech.glide.manager.Oooo000
    public final synchronized void onDestroy() {
        this.f9897OooO.onDestroy();
        Iterator it = o0000oo.OooO0Oo(this.f9897OooO.f10060OooO0Oo).iterator();
        while (it.hasNext()) {
            OooOOO0((o00OOO00.OooOOO0) it.next());
        }
        this.f9897OooO.f10060OooO0Oo.clear();
        oo000o oo000oVar = this.f9901OooO0oO;
        Iterator it2 = o0000oo.OooO0Oo(oo000oVar.f10073OooO00o).iterator();
        while (it2.hasNext()) {
            oo000oVar.OooO00o((o00OO.OooO0OO) it2.next());
        }
        oo000oVar.f10074OooO0O0.clear();
        this.f9899OooO0o.OooO00o(this);
        this.f9899OooO0o.OooO00o(this.f9904OooOO0O);
        o0000oo.OooO0o0().removeCallbacks(this.f9903OooOO0);
        this.f9898OooO0Oo.OooO0oO(this);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // com.bumptech.glide.manager.Oooo000
    public final synchronized void onStart() {
        OooOo00();
        this.f9897OooO.onStart();
    }

    @Override // com.bumptech.glide.manager.Oooo000
    public final synchronized void onStop() {
        OooOOoo();
        this.f9897OooO.onStop();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f9901OooO0oO + ", treeNode=" + this.f9902OooO0oo + "}";
    }
}
