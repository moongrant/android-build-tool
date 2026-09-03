package p080o000OoO;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class o0000O00 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public static o0000O00 f34940OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Handler f34941OooO00o = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final CopyOnWriteArrayList<WeakReference<OooO00o>> f34942OooO0O0 = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object f34943OooO0OO = new Object();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @GuardedBy("networkTypeLock")
    public int f34944OooO0Oo = 0;

    public interface OooO00o {
        void OooO00o(int i);
    }

    public final class OooO0O0 extends BroadcastReceiver {
        public OooO0O0() {
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0033  */
        /* JADX WARN: Code duplicated, block: B:22:0x003a  */
        /* JADX WARN: Code duplicated, block: B:23:0x003c  */
        /* JADX WARN: Code duplicated, block: B:25:0x0042  */
        /* JADX WARN: Code duplicated, block: B:26:0x0044  */
        /* JADX WARN: Code duplicated, block: B:27:0x0046  */
        /* JADX WARN: Code duplicated, block: B:28:0x0048  */
        /* JADX WARN: Code duplicated, block: B:29:0x004a  */
        /* JADX WARN: Code duplicated, block: B:30:0x004c  */
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            int i;
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                i = 0;
            } else {
                try {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    i = 1;
                    if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                        int type = activeNetworkInfo.getType();
                        if (type == 0) {
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    i = 3;
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 14:
                                case 15:
                                case 17:
                                    i = 4;
                                    break;
                                case 13:
                                    i = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i = 6;
                                    break;
                                case 18:
                                    i = 2;
                                    break;
                                case 20:
                                    if (o000OO00.f34965OooO00o >= 29) {
                                        i = 0;
                                    } else {
                                        i = 9;
                                    }
                                    break;
                            }
                        } else if (type == 1) {
                            i = 2;
                        } else if (type == 4 || type == 5) {
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    i = 3;
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 14:
                                case 15:
                                case 17:
                                    i = 4;
                                    break;
                                case 13:
                                    i = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i = 6;
                                    break;
                                case 18:
                                    i = 2;
                                    break;
                                case 20:
                                    if (o000OO00.f34965OooO00o >= 29) {
                                        i = 0;
                                    } else {
                                        i = 9;
                                    }
                                    break;
                            }
                        } else if (type != 6) {
                            i = type != 9 ? 8 : 7;
                        } else {
                            i = 5;
                        }
                    }
                } catch (SecurityException unused) {
                }
            }
            int i2 = o000OO00.f34965OooO00o;
            o0000O00 o0000o00 = o0000O00.this;
            if (i2 < 31 || i != 5) {
                o0000O00.OooO00o(o0000o00, i);
                return;
            }
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                telephonyManager.getClass();
                o0000 o0000Var = new o0000(o0000o00);
                telephonyManager.registerTelephonyCallback(context.getMainExecutor(), o0000Var);
                telephonyManager.unregisterTelephonyCallback(o0000Var);
            } catch (RuntimeException unused2) {
                o0000O00.OooO00o(o0000o00, 5);
            }
        }
    }

    public o0000O00(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new OooO0O0(), intentFilter);
    }

    public static void OooO00o(o0000O00 o0000o00, int i) {
        synchronized (o0000o00.f34943OooO0OO) {
            if (o0000o00.f34944OooO0Oo == i) {
                return;
            }
            o0000o00.f34944OooO0Oo = i;
            for (WeakReference<OooO00o> weakReference : o0000o00.f34942OooO0O0) {
                OooO00o oooO00o = weakReference.get();
                if (oooO00o != null) {
                    oooO00o.OooO00o(i);
                } else {
                    o0000o00.f34942OooO0O0.remove(weakReference);
                }
            }
        }
    }

    public static synchronized o0000O00 OooO0O0(Context context) {
        if (f34940OooO0o0 == null) {
            f34940OooO0o0 = new o0000O00(context);
        }
        return f34940OooO0o0;
    }

    public final int OooO0OO() {
        int i;
        synchronized (this.f34943OooO0OO) {
            i = this.f34944OooO0Oo;
        }
        return i;
    }
}
