package com.yalla.support.common.util;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.telephony.TelephonyManager;
import androidx.lifecycle.MutableLiveData;
import com.umeng.analytics.pro.d;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p031OoooO.o0000O;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/yalla/support/common/util/NetworkUtil;", "", "<init>", "()V", "NetStatus", "NetworkReceiver", "NetworkType", "Common_release"}, k = 1, mv = {1, 7, 1})
public final class NetworkUtil {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final NetworkUtil f20518OooO00o = new NetworkUtil();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Lazy f20519OooO0O0 = LazyKt.lazy(new Function0<NetworkReceiver>() { // from class: com.yalla.support.common.util.NetworkUtil$netReceiver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final NetworkUtil.NetworkReceiver invoke() {
            return new NetworkUtil.NetworkReceiver();
        }
    });

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final MutableLiveData<NetStatus> f20520OooO0OO = new NetworkUtil$netStatusLiveData$1();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final Lazy f20521OooO0Oo = LazyKt.lazy(new Function0<NetworkUtil$netCallback$2.AnonymousClass1>() { // from class: com.yalla.support.common.util.NetworkUtil$netCallback$2
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.yalla.support.common.util.NetworkUtil$netCallback$2$1] */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final AnonymousClass1 invoke() {
            return new ConnectivityManager.NetworkCallback() { // from class: com.yalla.support.common.util.NetworkUtil$netCallback$2.1
                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(@NotNull Network network) {
                    Intrinsics.checkNotNullParameter(network, "network");
                    super.onAvailable(network);
                    NetworkUtil networkUtil = NetworkUtil.f20518OooO00o;
                    Objects.requireNonNull(networkUtil);
                    NetworkUtil.f20520OooO0OO.postValue(new NetworkUtil.NetStatus(true, networkUtil.OooO0OO()));
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLost(@NotNull Network network) {
                    Intrinsics.checkNotNullParameter(network, "network");
                    super.onLost(network);
                    Objects.requireNonNull(NetworkUtil.f20518OooO00o);
                    NetworkUtil.f20520OooO0OO.postValue(new NetworkUtil.NetStatus(false, null, 2, 0 == true ? 1 : 0));
                }
            };
        }
    });

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/yalla/support/common/util/NetworkUtil$NetStatus;", "", "isConnected", "", "netType", "Lcom/yalla/support/common/util/NetworkUtil$NetworkType;", "(ZLcom/yalla/support/common/util/NetworkUtil$NetworkType;)V", "()Z", "getNetType", "()Lcom/yalla/support/common/util/NetworkUtil$NetworkType;", "Common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class NetStatus {
        private final boolean isConnected;

        @NotNull
        private final NetworkType netType;

        public NetStatus(boolean z, @NotNull NetworkType netType) {
            Intrinsics.checkNotNullParameter(netType, "netType");
            this.isConnected = z;
            this.netType = netType;
        }

        @NotNull
        public final NetworkType getNetType() {
            return this.netType;
        }

        /* JADX INFO: renamed from: isConnected, reason: from getter */
        public final boolean getIsConnected() {
            return this.isConnected;
        }

        public /* synthetic */ NetStatus(boolean z, NetworkType networkType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? NetworkType.NETWORK_NO : networkType);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/yalla/support/common/util/NetworkUtil$NetworkReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", d.R, "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @TargetApi(17)
    public static final class NetworkReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yalla/support/common/util/NetworkUtil$NetworkType;", "", "(Ljava/lang/String;I)V", "NETWORK_WIFI", "NETWORK_5G", "NETWORK_4G", "NETWORK_3G", "NETWORK_2G", "NETWORK_UNKNOWN", "NETWORK_NO", "Common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum NetworkType {
        NETWORK_WIFI,
        NETWORK_5G,
        NETWORK_4G,
        NETWORK_3G,
        NETWORK_2G,
        NETWORK_UNKNOWN,
        NETWORK_NO
    }

    private NetworkUtil() {
    }

    public final ConnectivityManager OooO00o() {
        Context context = o0000O.f2671OooO00o;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(d.R);
            context = null;
        }
        Object systemService = context.getSystemService("connectivity");
        if (systemService instanceof ConnectivityManager) {
            return (ConnectivityManager) systemService;
        }
        return null;
    }

    public final boolean OooO0O0() {
        ConnectivityManager connectivityManagerOooO00o = OooO00o();
        NetworkInfo activeNetworkInfo = connectivityManagerOooO00o != null ? connectivityManagerOooO00o.getActiveNetworkInfo() : null;
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.isConnected();
        }
        return false;
    }

    @NotNull
    public final NetworkType OooO0OO() {
        ConnectivityManager connectivityManagerOooO00o = OooO00o();
        NetworkInfo activeNetworkInfo = connectivityManagerOooO00o != null ? connectivityManagerOooO00o.getActiveNetworkInfo() : null;
        if (activeNetworkInfo == null) {
            return NetworkType.NETWORK_NO;
        }
        if (activeNetworkInfo.getType() == 1) {
            return NetworkType.NETWORK_WIFI;
        }
        if (activeNetworkInfo.getType() != 0) {
            return NetworkType.NETWORK_UNKNOWN;
        }
        switch (activeNetworkInfo.getSubtype()) {
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
                String subtypeName = activeNetworkInfo.getSubtypeName();
                return (StringsKt__StringsJVMKt.equals(subtypeName, "TD-SCDMA", true) || StringsKt__StringsJVMKt.equals(subtypeName, "WCDMA", true) || StringsKt__StringsJVMKt.equals(subtypeName, "CDMA2000", true)) ? NetworkType.NETWORK_3G : NetworkType.NETWORK_UNKNOWN;
            case 20:
                return NetworkType.NETWORK_5G;
        }
    }

    @NotNull
    public final String OooO0Oo() {
        Context context = o0000O.f2671OooO00o;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(d.R);
            context = null;
        }
        Object systemService = context.getSystemService("phone");
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
        return networkOperatorName == null ? "" : networkOperatorName;
    }

    public final void OooO0o0() {
        NetworkRequest networkRequestBuild = new NetworkRequest.Builder().build();
        ConnectivityManager connectivityManagerOooO00o = OooO00o();
        if (connectivityManagerOooO00o != null) {
            connectivityManagerOooO00o.registerNetworkCallback(networkRequestBuild, (ConnectivityManager.NetworkCallback) f20521OooO0Oo.getValue());
        }
    }
}
