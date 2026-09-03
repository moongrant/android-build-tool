package com.common.support.networkstate;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002*+B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0003J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\nH\u0002J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\nH\u0002J\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0018\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\nH\u0002J\u000e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u001b\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u001c\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u001d\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\nJ\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010 \u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010 \u001a\u00020\u00102\b\u0010!\u001a\u0004\u0018\u00010\fH\u0002J\u0010\u0010 \u001a\u00020\u00102\u0006\u0010\"\u001a\u00020#H\u0003J\u0010\u0010$\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nH\u0007J\u000e\u0010%\u001a\u00020&2\u0006\u0010\t\u001a\u00020'J\u0016\u0010%\u001a\u00020&2\u0006\u0010\t\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0012J\u0010\u0010)\u001a\u00020&2\u0006\u0010\u0018\u001a\u00020\u0016H\u0002J\u0012\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\t\u001a\u00020\nH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/common/support/networkstate/NetworkStateUtil;", "", "()V", "networkRequestState", "Lcom/common/support/networkstate/NetworkRequestState;", "networkStateLiveData", "Lcom/common/support/networkstate/NetworkStateUtil$NetworkStateLiveData;", "activeNetworkCapabilities", "Landroid/net/NetworkCapabilities;", "context", "Landroid/content/Context;", "activeNetworkInfo", "Landroid/net/NetworkInfo;", "connectivityManager", "Landroid/net/ConnectivityManager;", "convert2NetworkType", "Lcom/common/support/networkstate/NetworkType;", "type", "", "name", "", "hasPermission", "", "hasSim", "isConnected", "isConnectedBelowM", "isMobileConnected", "isRealConnected", "isWifiConnected", "networkOperatorName", "Landroidx/lifecycle/MutableLiveData;", "Lcom/common/support/networkstate/NetworkState;", "networkType", "networkInfo", "telephonyManager", "Landroid/telephony/TelephonyManager;", "networkTypeN", "openNetworkSetting", "", "Landroid/app/Activity;", "requestCode", "stateChange", "NetworkStateChangeListener", "NetworkStateLiveData", "networkstate_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class NetworkStateUtil {

    @NotNull
    public static final NetworkStateUtil INSTANCE = new NetworkStateUtil();

    @Nullable
    private static NetworkRequestState networkRequestState;

    @Nullable
    private static NetworkStateLiveData networkStateLiveData;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/common/support/networkstate/NetworkStateUtil$NetworkStateChangeListener;", "", "onStateChange", "", "isConnected", "", "networkstate_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface NetworkStateChangeListener {
        void onStateChange(boolean isConnected);
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\r2\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u0011H\u0016J\u0018\u0010\u0013\u001a\u00020\r2\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u0011H\u0016R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/common/support/networkstate/NetworkStateUtil$NetworkStateLiveData;", "Landroidx/lifecycle/MutableLiveData;", "Lcom/common/support/networkstate/NetworkState;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "contextRef", "Ljava/lang/ref/WeakReference;", "getContextRef", "()Ljava/lang/ref/WeakReference;", "setContextRef", "(Ljava/lang/ref/WeakReference;)V", "observe", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "observeForever", "removeObserver", "networkstate_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class NetworkStateLiveData extends MutableLiveData<NetworkState> {

        @NotNull
        private WeakReference<Context> contextRef;

        public NetworkStateLiveData(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.contextRef = new WeakReference<>(null);
            this.contextRef = new WeakReference<>(context.getApplicationContext());
        }

        @NotNull
        public final WeakReference<Context> getContextRef() {
            return this.contextRef;
        }

        @Override // androidx.lifecycle.LiveData
        public void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super NetworkState> observer) {
            Context context;
            NetworkRequestState networkRequestState;
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(observer, "observer");
            if (!hasObservers() && (context = this.contextRef.get()) != null && (networkRequestState = NetworkStateUtil.networkRequestState) != null) {
                networkRequestState.subscribe$networkstate_release(NetworkStateUtil.INSTANCE.connectivityManager(context));
            }
            super.observe(owner, observer);
        }

        @Override // androidx.lifecycle.LiveData
        public void observeForever(@NotNull Observer<? super NetworkState> observer) {
            Context context;
            NetworkRequestState networkRequestState;
            Intrinsics.checkNotNullParameter(observer, "observer");
            if (!hasObservers() && (context = this.contextRef.get()) != null && (networkRequestState = NetworkStateUtil.networkRequestState) != null) {
                networkRequestState.subscribe$networkstate_release(NetworkStateUtil.INSTANCE.connectivityManager(context));
            }
            super.observeForever(observer);
        }

        @Override // androidx.lifecycle.LiveData
        public void removeObserver(@NotNull Observer<? super NetworkState> observer) {
            Context context;
            NetworkRequestState networkRequestState;
            Intrinsics.checkNotNullParameter(observer, "observer");
            super.removeObserver(observer);
            if (hasObservers() || (context = this.contextRef.get()) == null || (networkRequestState = NetworkStateUtil.networkRequestState) == null) {
                return;
            }
            networkRequestState.unsubscribe$networkstate_release(NetworkStateUtil.INSTANCE.connectivityManager(context));
        }

        public final void setContextRef(@NotNull WeakReference<Context> weakReference) {
            Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
            this.contextRef = weakReference;
        }
    }

    private NetworkStateUtil() {
    }

    @RequiresApi(23)
    private final NetworkCapabilities activeNetworkCapabilities(Context context) {
        ConnectivityManager connectivityManager = connectivityManager(context);
        if (connectivityManager == null) {
            return null;
        }
        return connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
    }

    private final NetworkInfo activeNetworkInfo(Context context) {
        ConnectivityManager connectivityManager = connectivityManager(context);
        if (connectivityManager == null) {
            return null;
        }
        return connectivityManager.getActiveNetworkInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConnectivityManager connectivityManager(Context context) {
        Object systemService = context.getSystemService("connectivity");
        if (systemService instanceof ConnectivityManager) {
            return (ConnectivityManager) systemService;
        }
        return null;
    }

    private final NetworkType convert2NetworkType(int type, String name) {
        switch (type) {
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
                return (StringsKt.OooOO0o(name, "TD-SCDMA") || StringsKt.OooOO0o(name, "WCDMA") || StringsKt.OooOO0o(name, "CDMA2000")) ? NetworkType.NETWORK_3G : NetworkType.NETWORK_UNKNOWN;
            case 20:
                return NetworkType.NETWORK_5G;
        }
    }

    public static /* synthetic */ NetworkType convert2NetworkType$default(NetworkStateUtil networkStateUtil, int i, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = "";
        }
        return networkStateUtil.convert2NetworkType(i, str);
    }

    private final boolean hasPermission(Context context) {
        return ContextCompat.OooO00o(context, "android.permission.READ_PHONE_STATE") == 0;
    }

    private final boolean isConnectedBelowM(Context context) {
        try {
            NetworkInfo networkInfoActiveNetworkInfo = activeNetworkInfo(context);
            if (networkInfoActiveNetworkInfo == null) {
                return false;
            }
            return networkInfoActiveNetworkInfo.isConnected();
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stateChange(boolean isConnected) {
        Context context;
        NetworkStateLiveData networkStateLiveData2 = networkStateLiveData;
        if (networkStateLiveData2 == null || (context = networkStateLiveData2.getContextRef().get()) == null) {
            return;
        }
        if (isConnected) {
            networkStateLiveData2.postValue(new NetworkState(true, INSTANCE.networkType(context)));
        } else {
            if (INSTANCE.isConnected(context)) {
                return;
            }
            networkStateLiveData2.postValue(new NetworkState(false, null, 2, null));
        }
    }

    private final TelephonyManager telephonyManager(Context context) {
        Object systemService = context.getSystemService("phone");
        if (systemService instanceof TelephonyManager) {
            return (TelephonyManager) systemService;
        }
        return null;
    }

    public final boolean hasSim(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("phone");
        return !(systemService instanceof TelephonyManager) || ((TelephonyManager) systemService).getSimState() == 5;
    }

    public final boolean isConnected(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            NetworkCapabilities networkCapabilitiesActiveNetworkCapabilities = activeNetworkCapabilities(context);
            if (networkCapabilitiesActiveNetworkCapabilities == null) {
                return false;
            }
            return networkCapabilitiesActiveNetworkCapabilities.hasCapability(12);
        } catch (Throwable th) {
            th.printStackTrace();
            return isConnectedBelowM(context);
        }
    }

    public final boolean isMobileConnected(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        NetworkCapabilities networkCapabilitiesActiveNetworkCapabilities = activeNetworkCapabilities(context);
        if (networkCapabilitiesActiveNetworkCapabilities == null) {
            return false;
        }
        return networkCapabilitiesActiveNetworkCapabilities.hasTransport(0);
    }

    public final boolean isRealConnected(@NotNull Context context) {
        Boolean boolValueOf;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            NetworkCapabilities networkCapabilitiesActiveNetworkCapabilities = activeNetworkCapabilities(context);
            if (networkCapabilitiesActiveNetworkCapabilities == null) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(networkCapabilitiesActiveNetworkCapabilities.hasCapability(12) && networkCapabilitiesActiveNetworkCapabilities.hasCapability(16));
            }
            if (boolValueOf == null) {
                return false;
            }
            return boolValueOf.booleanValue();
        } catch (Throwable th) {
            th.printStackTrace();
            return isConnectedBelowM(context);
        }
    }

    public final boolean isWifiConnected(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        NetworkCapabilities networkCapabilitiesActiveNetworkCapabilities = activeNetworkCapabilities(context);
        if (networkCapabilitiesActiveNetworkCapabilities == null) {
            return false;
        }
        return networkCapabilitiesActiveNetworkCapabilities.hasTransport(1);
    }

    @NotNull
    public final String networkOperatorName(@NotNull Context context) {
        String networkOperatorName;
        Intrinsics.checkNotNullParameter(context, "context");
        TelephonyManager telephonyManager = telephonyManager(context);
        return (telephonyManager == null || (networkOperatorName = telephonyManager.getNetworkOperatorName()) == null) ? "" : networkOperatorName;
    }

    @NotNull
    public final synchronized MutableLiveData<NetworkState> networkStateLiveData(@NotNull Context context) {
        NetworkStateLiveData networkStateLiveData2;
        Intrinsics.checkNotNullParameter(context, "context");
        if (networkRequestState == null) {
            networkRequestState = new NetworkRequestState(new NetworkStateChangeListener() { // from class: com.common.support.networkstate.NetworkStateUtil.networkStateLiveData.1
                @Override // com.common.support.networkstate.NetworkStateUtil.NetworkStateChangeListener
                public void onStateChange(boolean isConnected) {
                    NetworkStateUtil.INSTANCE.stateChange(isConnected);
                }
            });
        }
        if (networkStateLiveData == null) {
            networkStateLiveData = new NetworkStateLiveData(context);
        }
        networkStateLiveData2 = networkStateLiveData;
        Intrinsics.checkNotNull(networkStateLiveData2);
        return networkStateLiveData2;
    }

    @NotNull
    public final NetworkType networkType(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        TelephonyManager telephonyManager = telephonyManager(context);
        if (telephonyManager == null) {
            return NetworkType.NETWORK_NONE;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            NetworkStateUtil networkStateUtil = INSTANCE;
            if (networkStateUtil.hasPermission(context)) {
                return networkStateUtil.networkType(telephonyManager);
            }
        }
        try {
            NetworkStateUtil networkStateUtil2 = INSTANCE;
            return networkStateUtil2.networkType(networkStateUtil2.activeNetworkInfo(context));
        } catch (Throwable th) {
            th.printStackTrace();
            return NetworkType.NETWORK_NONE;
        }
    }

    @RequiresPermission("android.permission.READ_PHONE_STATE")
    @RequiresApi(24)
    @NotNull
    public final NetworkType networkTypeN(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        TelephonyManager telephonyManager = telephonyManager(context);
        if (telephonyManager == null) {
            return NetworkType.NETWORK_NONE;
        }
        try {
            return convert2NetworkType$default(INSTANCE, telephonyManager.getDataNetworkType(), null, 2, null);
        } catch (Throwable th) {
            th.printStackTrace();
            return NetworkType.NETWORK_UNKNOWN;
        }
    }

    public final void openNetworkSetting(@NotNull Activity context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            context.startActivity(new Intent("android.settings.WIFI_SETTINGS"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void openNetworkSetting(@NotNull Activity context, int requestCode) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            context.startActivityForResult(new Intent("android.settings.WIFI_SETTINGS"), requestCode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequiresApi(24)
    @SuppressLint({"MissingPermission"})
    private final NetworkType networkType(TelephonyManager telephonyManager) {
        try {
            return convert2NetworkType$default(this, telephonyManager.getDataNetworkType(), null, 2, null);
        } catch (Throwable th) {
            th.printStackTrace();
            return NetworkType.NETWORK_UNKNOWN;
        }
    }

    private final NetworkType networkType(NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isConnectedOrConnecting()) {
            int type = networkInfo.getType();
            if (type != 0) {
                if (type != 1) {
                    return NetworkType.NETWORK_UNKNOWN;
                }
                return NetworkType.NETWORK_WIFI;
            }
            int subtype = networkInfo.getSubtype();
            String subtypeName = networkInfo.getSubtypeName();
            Intrinsics.checkNotNullExpressionValue(subtypeName, "networkInfo.subtypeName");
            return convert2NetworkType(subtype, subtypeName);
        }
        return NetworkType.NETWORK_NONE;
    }
}
