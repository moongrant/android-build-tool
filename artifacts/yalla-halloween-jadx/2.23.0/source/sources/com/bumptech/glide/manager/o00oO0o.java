package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import p532o0o0Oo.o00000;
import p532o0o0Oo.o00000O0;
import p532o0o0Oo.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00oO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static volatile o00oO0o f10039OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0OO f10040OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("this")
    public final HashSet f10041OooO0O0 = new HashSet();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f10042OooO0OO;

    public static final class OooO implements OooO0OO {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final Executor f10043OooO0oO = AsyncTask.SERIAL_EXECUTOR;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f10044OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final com.bumptech.glide.manager.OooO0OO.OooO00o f10045OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o00000O0<ConnectivityManager> f10046OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public volatile boolean f10047OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final OooO00o f10048OooO0o = new OooO00o();

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public volatile boolean f10049OooO0o0;

        public class OooO00o extends BroadcastReceiver {
            public OooO00o() {
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(@NonNull Context context, Intent intent) {
                OooO oooO = OooO.this;
                oooO.getClass();
                OooO.f10043OooO0oO.execute(new o0Oo0oo(oooO));
            }
        }

        public class OooO0O0 implements Runnable {
            public OooO0O0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                OooO oooO = OooO.this;
                oooO.f10047OooO0Oo = oooO.OooO0O0();
                try {
                    OooO oooO2 = OooO.this;
                    oooO2.f10044OooO00o.registerReceiver(oooO2.f10048OooO0o, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    OooO.this.f10049OooO0o0 = true;
                } catch (SecurityException e) {
                    if (Log.isLoggable("ConnectivityMonitor", 5)) {
                        Log.w("ConnectivityMonitor", "Failed to register", e);
                    }
                    OooO.this.f10049OooO0o0 = false;
                }
            }
        }

        public class OooO0OO implements Runnable {
            public OooO0OO() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (OooO.this.f10049OooO0o0) {
                    OooO.this.f10049OooO0o0 = false;
                    OooO oooO = OooO.this;
                    oooO.f10044OooO00o.unregisterReceiver(oooO.f10048OooO0o);
                }
            }
        }

        public OooO(Context context, o00000 o00000Var, OooO0O0 oooO0O0) {
            this.f10044OooO00o = context.getApplicationContext();
            this.f10046OooO0OO = o00000Var;
            this.f10045OooO0O0 = oooO0O0;
        }

        @Override // com.bumptech.glide.manager.o00oO0o.OooO0OO
        public final boolean OooO00o() {
            f10043OooO0oO.execute(new OooO0O0());
            return true;
        }

        @SuppressLint({"MissingPermission"})
        public final boolean OooO0O0() {
            try {
                NetworkInfo activeNetworkInfo = this.f10046OooO0OO.get().getActiveNetworkInfo();
                return activeNetworkInfo != null && activeNetworkInfo.isConnected();
            } catch (RuntimeException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e);
                }
                return true;
            }
        }

        @Override // com.bumptech.glide.manager.o00oO0o.OooO0OO
        public final void unregister() {
            f10043OooO0oO.execute(new OooO0OO());
        }
    }

    public class OooO00o implements o00000O0<ConnectivityManager> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Context f10053OooO00o;

        public OooO00o(Context context) {
            this.f10053OooO00o = context;
        }

        @Override // p532o0o0Oo.o00000O0
        public final ConnectivityManager get() {
            return (ConnectivityManager) this.f10053OooO00o.getSystemService("connectivity");
        }
    }

    public class OooO0O0 implements com.bumptech.glide.manager.OooO0OO.OooO00o {
        public OooO0O0() {
        }

        @Override // com.bumptech.glide.manager.OooO0OO.OooO00o
        public final void OooO00o(boolean z) {
            ArrayList arrayList;
            o0000oo.OooO00o();
            synchronized (o00oO0o.this) {
                arrayList = new ArrayList(o00oO0o.this.f10041OooO0O0);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((com.bumptech.glide.manager.OooO0OO.OooO00o) it.next()).OooO00o(z);
            }
        }
    }

    public interface OooO0OO {
        boolean OooO00o();

        void unregister();
    }

    @RequiresApi(24)
    public static final class OooO0o implements OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f10055OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final com.bumptech.glide.manager.OooO0OO.OooO00o f10056OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o00000O0<ConnectivityManager> f10057OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooO00o f10058OooO0Oo = new OooO00o();

        public class OooO00o extends ConnectivityManager.NetworkCallback {
            public OooO00o() {
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(@NonNull Network network) {
                o0000oo.OooO0o0().post(new o0OOO0o(this, true));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(@NonNull Network network) {
                o0000oo.OooO0o0().post(new o0OOO0o(this, false));
            }
        }

        public OooO0o(o00000 o00000Var, OooO0O0 oooO0O0) {
            this.f10057OooO0OO = o00000Var;
            this.f10056OooO0O0 = oooO0O0;
        }

        @Override // com.bumptech.glide.manager.o00oO0o.OooO0OO
        @SuppressLint({"MissingPermission"})
        public final boolean OooO00o() {
            o00000O0<ConnectivityManager> o00000o1 = this.f10057OooO0OO;
            this.f10055OooO00o = o00000o1.get().getActiveNetwork() != null;
            try {
                o00000o1.get().registerDefaultNetworkCallback(this.f10058OooO0Oo);
                return true;
            } catch (RuntimeException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e);
                }
                return false;
            }
        }

        @Override // com.bumptech.glide.manager.o00oO0o.OooO0OO
        public final void unregister() {
            this.f10057OooO0OO.get().unregisterNetworkCallback(this.f10058OooO0Oo);
        }
    }

    public o00oO0o(@NonNull Context context) {
        o00000 o00000Var = new o00000(new OooO00o(context));
        OooO0O0 oooO0O0 = new OooO0O0();
        this.f10040OooO00o = Build.VERSION.SDK_INT >= 24 ? new OooO0o(o00000Var, oooO0O0) : new OooO(context, o00000Var, oooO0O0);
    }

    public static o00oO0o OooO00o(@NonNull Context context) {
        if (f10039OooO0Oo == null) {
            synchronized (o00oO0o.class) {
                if (f10039OooO0Oo == null) {
                    f10039OooO0Oo = new o00oO0o(context.getApplicationContext());
                }
            }
        }
        return f10039OooO0Oo;
    }
}
