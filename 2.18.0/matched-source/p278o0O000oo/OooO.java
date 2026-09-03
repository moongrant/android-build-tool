package p278o0O000oo;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.common.support.networkstate.NetworkType;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO f35113OooO00o = new OooO();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public static OooO0OO f35114OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public static OooO0O0 f35115OooO0OO;

    public interface OooO00o {
        void OooO00o(boolean z);
    }

    public static final class OooO0O0 extends MutableLiveData<OooO0o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public WeakReference<Context> f35116OooO00o;

        public OooO0O0(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f35116OooO00o = new WeakReference<>(null);
            this.f35116OooO00o = new WeakReference<>(context.getApplicationContext());
        }

        @Override // androidx.lifecycle.LiveData
        public final void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super OooO0o> observer) {
            Context context;
            OooO0OO oooO0OO;
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(observer, "observer");
            if (!hasObservers() && (context = this.f35116OooO00o.get()) != null && (oooO0OO = OooO.f35114OooO0O0) != null) {
                Object systemService = context.getSystemService("connectivity");
                oooO0OO.OooO00o(systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null);
            }
            super.observe(owner, observer);
        }

        @Override // androidx.lifecycle.LiveData
        public final void observeForever(@NotNull Observer<? super OooO0o> observer) {
            Context context;
            OooO0OO oooO0OO;
            Intrinsics.checkNotNullParameter(observer, "observer");
            if (!hasObservers() && (context = this.f35116OooO00o.get()) != null && (oooO0OO = OooO.f35114OooO0O0) != null) {
                Object systemService = context.getSystemService("connectivity");
                oooO0OO.OooO00o(systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null);
            }
            super.observeForever(observer);
        }

        @Override // androidx.lifecycle.LiveData
        public final void removeObserver(@NotNull Observer<? super OooO0o> observer) {
            Context context;
            OooO0OO oooO0OO;
            Intrinsics.checkNotNullParameter(observer, "observer");
            super.removeObserver(observer);
            if (hasObservers() || (context = this.f35116OooO00o.get()) == null || (oooO0OO = OooO.f35114OooO0O0) == null) {
                return;
            }
            Object systemService = context.getSystemService("connectivity");
            ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            if (connectivityManager == null) {
                return;
            }
            try {
                connectivityManager.unregisterNetworkCallback((ConnectivityManager.NetworkCallback) oooO0OO.f35119OooO0O0.getValue());
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0055  */
    /* JADX WARN: Code duplicated, block: B:36:0x0082  */
    public static final void OooO00o(boolean z) {
        Context context;
        NetworkInfo networkInfoOooO0O0;
        NetworkType networkTypeOooO0Oo;
        OooO oooO = f35113OooO00o;
        OooO0O0 oooO0O0 = f35115OooO0OO;
        if (oooO0O0 == null || (context = oooO0O0.f35116OooO00o.get()) == null) {
            return;
        }
        if (!z) {
            if (oooO.OooO0o0(context)) {
                return;
            }
            oooO0O0.postValue(new OooO0o());
            return;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("phone");
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        if (telephonyManager == null) {
            networkTypeOooO0Oo = NetworkType.NETWORK_NONE;
        } else if (Build.VERSION.SDK_INT < 24) {
            networkInfoOooO0O0 = oooO.OooO0O0(context);
            if (networkInfoOooO0O0 == null && networkInfoOooO0O0.isConnectedOrConnecting()) {
                int type = networkInfoOooO0O0.getType();
                if (type != 0) {
                    networkTypeOooO0Oo = type != 1 ? NetworkType.NETWORK_UNKNOWN : NetworkType.NETWORK_WIFI;
                } else {
                    int subtype = networkInfoOooO0O0.getSubtype();
                    String subtypeName = networkInfoOooO0O0.getSubtypeName();
                    Intrinsics.checkNotNullExpressionValue(subtypeName, "networkInfo.subtypeName");
                    networkTypeOooO0Oo = oooO.OooO0Oo(subtype, subtypeName);
                }
            } else {
                networkTypeOooO0Oo = NetworkType.NETWORK_NONE;
            }
        } else {
            if (o000O000.OooO00o.OooO00o(context, "android.permission.READ_PHONE_STATE") == 0) {
                try {
                    networkTypeOooO0Oo = oooO.OooO0Oo(telephonyManager.getDataNetworkType(), "");
                } catch (Throwable th) {
                    th.printStackTrace();
                    networkTypeOooO0Oo = NetworkType.NETWORK_UNKNOWN;
                }
            } else {
                networkInfoOooO0O0 = oooO.OooO0O0(context);
                if (networkInfoOooO0O0 == null) {
                    networkTypeOooO0Oo = NetworkType.NETWORK_NONE;
                } else {
                    networkTypeOooO0Oo = NetworkType.NETWORK_NONE;
                }
            }
        }
        oooO0O0.postValue(new OooO0o(networkTypeOooO0Oo));
    }

    public final NetworkInfo OooO0O0(Context context) {
        ConnectivityManager connectivityManagerOooO0OO = OooO0OO(context);
        if (connectivityManagerOooO0OO == null) {
            return null;
        }
        return connectivityManagerOooO0OO.getActiveNetworkInfo();
    }

    public final ConnectivityManager OooO0OO(Context context) {
        Object systemService = context.getSystemService("connectivity");
        if (systemService instanceof ConnectivityManager) {
            return (ConnectivityManager) systemService;
        }
        return null;
    }

    public final NetworkType OooO0Oo(int i, String str) {
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return NetworkType.NETWORK_2G;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return NetworkType.NETWORK_3G;
            case 13:
            case 18:
                return NetworkType.NETWORK_4G;
            case 19:
            default:
                return (StringsKt__StringsJVMKt.equals(str, "TD-SCDMA", true) || StringsKt__StringsJVMKt.equals(str, "WCDMA", true) || StringsKt__StringsJVMKt.equals(str, "CDMA2000", true)) ? NetworkType.NETWORK_3G : NetworkType.NETWORK_UNKNOWN;
            case 20:
                return NetworkType.NETWORK_5G;
        }
    }

    public final boolean OooO0o0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT < 23) {
            NetworkInfo networkInfoOooO0O0 = OooO0O0(context);
            if (networkInfoOooO0O0 == null) {
                return false;
            }
            return networkInfoOooO0O0.isConnected();
        }
        try {
            ConnectivityManager connectivityManagerOooO0OO = OooO0OO(context);
            NetworkCapabilities networkCapabilities = connectivityManagerOooO0OO == null ? null : connectivityManagerOooO0OO.getNetworkCapabilities(connectivityManagerOooO0OO.getActiveNetwork());
            if (networkCapabilities == null) {
                return false;
            }
            return networkCapabilities.hasCapability(12);
        } catch (Throwable th) {
            th.printStackTrace();
            NetworkInfo networkInfoOooO0O1 = OooO0O0(context);
            if (networkInfoOooO0O1 == null) {
                return false;
            }
            return networkInfoOooO0O1.isConnected();
        }
    }
}
