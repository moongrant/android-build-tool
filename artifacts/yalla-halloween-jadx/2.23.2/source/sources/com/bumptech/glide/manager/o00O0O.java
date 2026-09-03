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
import p174o00OooOo.o00O0OO;
import p174o00OooOo.o00OO0O0;
import p174o00OooOo.oo0o0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static volatile o00O0O f13128OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0OO f13129OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("this")
    public final HashSet f13130OooO0O0 = new HashSet();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f13131OooO0OO;

    public static final class OooO implements OooO0OO {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final Executor f13132OooO0oO = AsyncTask.SERIAL_EXECUTOR;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f13133OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final com.bumptech.glide.manager.OooO0O0.OooO00o f13134OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o00O0OO<ConnectivityManager> f13135OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public volatile boolean f13136OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final OooO00o f13137OooO0o = new OooO00o();

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public volatile boolean f13138OooO0o0;

        public class OooO00o extends BroadcastReceiver {
            public OooO00o() {
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(@NonNull Context context, Intent intent) {
                OooO oooO = OooO.this;
                oooO.getClass();
                OooO.f13132OooO0oO.execute(new oo000o(oooO));
            }
        }

        public class OooO0O0 implements Runnable {
            public OooO0O0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                OooO oooO = OooO.this;
                oooO.f13136OooO0Oo = oooO.OooO0O0();
                try {
                    OooO oooO2 = OooO.this;
                    oooO2.f13133OooO00o.registerReceiver(oooO2.f13137OooO0o, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    OooO.this.f13138OooO0o0 = true;
                } catch (SecurityException e) {
                    if (Log.isLoggable("ConnectivityMonitor", 5)) {
                        Log.w("ConnectivityMonitor", "Failed to register", e);
                    }
                    OooO.this.f13138OooO0o0 = false;
                }
            }
        }

        public class OooO0OO implements Runnable {
            public OooO0OO() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (OooO.this.f13138OooO0o0) {
                    OooO.this.f13138OooO0o0 = false;
                    OooO oooO = OooO.this;
                    oooO.f13133OooO00o.unregisterReceiver(oooO.f13137OooO0o);
                }
            }
        }

        public OooO(Context context, oo0o0O0 oo0o0o0, OooO0O0 oooO0O0) {
            this.f13133OooO00o = context.getApplicationContext();
            this.f13135OooO0OO = oo0o0o0;
            this.f13134OooO0O0 = oooO0O0;
        }

        @Override // com.bumptech.glide.manager.o00O0O.OooO0OO
        public final boolean OooO00o() {
            f13132OooO0oO.execute(new OooO0O0());
            return true;
        }

        @SuppressLint({"MissingPermission"})
        public final boolean OooO0O0() {
            try {
                NetworkInfo activeNetworkInfo = this.f13135OooO0OO.get().getActiveNetworkInfo();
                return activeNetworkInfo != null && activeNetworkInfo.isConnected();
            } catch (RuntimeException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e);
                }
                return true;
            }
        }

        @Override // com.bumptech.glide.manager.o00O0O.OooO0OO
        public final void unregister() {
            f13132OooO0oO.execute(new OooO0OO());
        }
    }

    public class OooO00o implements o00O0OO<ConnectivityManager> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Context f13142OooO00o;

        public OooO00o(Context context) {
            this.f13142OooO00o = context;
        }

        @Override // p174o00OooOo.o00O0OO
        public final ConnectivityManager get() {
            return (ConnectivityManager) this.f13142OooO00o.getSystemService("connectivity");
        }
    }

    public class OooO0O0 implements com.bumptech.glide.manager.OooO0O0.OooO00o {
        public OooO0O0() {
        }

        @Override // com.bumptech.glide.manager.OooO0O0.OooO00o
        public final void OooO00o(boolean z) {
            ArrayList arrayList;
            o00OO0O0.OooO00o();
            synchronized (o00O0O.this) {
                arrayList = new ArrayList(o00O0O.this.f13130OooO0O0);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((com.bumptech.glide.manager.OooO0O0.OooO00o) it.next()).OooO00o(z);
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
        public boolean f13144OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final com.bumptech.glide.manager.OooO0O0.OooO00o f13145OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o00O0OO<ConnectivityManager> f13146OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooO00o f13147OooO0Oo = new OooO00o();

        public class OooO00o extends ConnectivityManager.NetworkCallback {
            public OooO00o() {
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(@NonNull Network network) {
                o00OO0O0.OooO0o0().post(new o00Ooo(this, true));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(@NonNull Network network) {
                o00OO0O0.OooO0o0().post(new o00Ooo(this, false));
            }
        }

        public OooO0o(oo0o0O0 oo0o0o0, OooO0O0 oooO0O0) {
            this.f13146OooO0OO = oo0o0o0;
            this.f13145OooO0O0 = oooO0O0;
        }

        @Override // com.bumptech.glide.manager.o00O0O.OooO0OO
        @SuppressLint({"MissingPermission"})
        public final boolean OooO00o() {
            o00O0OO<ConnectivityManager> o00o0oo2 = this.f13146OooO0OO;
            this.f13144OooO00o = o00o0oo2.get().getActiveNetwork() != null;
            try {
                o00o0oo2.get().registerDefaultNetworkCallback(this.f13147OooO0Oo);
                return true;
            } catch (RuntimeException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e);
                }
                return false;
            }
        }

        @Override // com.bumptech.glide.manager.o00O0O.OooO0OO
        public final void unregister() {
            this.f13146OooO0OO.get().unregisterNetworkCallback(this.f13147OooO0Oo);
        }
    }

    public o00O0O(@NonNull Context context) {
        oo0o0O0 oo0o0o0 = new oo0o0O0(new OooO00o(context));
        OooO0O0 oooO0O0 = new OooO0O0();
        this.f13129OooO00o = Build.VERSION.SDK_INT >= 24 ? new OooO0o(oo0o0o0, oooO0O0) : new OooO(context, oo0o0o0, oooO0O0);
    }

    public static o00O0O OooO00o(@NonNull Context context) {
        if (f13128OooO0Oo == null) {
            synchronized (o00O0O.class) {
                if (f13128OooO0Oo == null) {
                    f13128OooO0Oo = new o00O0O(context.getApplicationContext());
                }
            }
        }
        return f13128OooO0Oo;
    }
}
