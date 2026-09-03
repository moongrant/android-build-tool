package p005OooO0oO;

import OooO0o.OooO00o;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.ServerProtocol;
import com.yallatech.support.platform.YCSDKOpenKit;
import com.yallatech.support.platform.base.bean.Completion;
import com.yallatech.support.platform.utils.NetUtil$NetworkType;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import p388o0OOoo0O.o00O00;
import p388o0OOoo0O.o00O00O;
import p388o0OOoo0O.o0O0ooO;
import p388o0OOoo0O.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class o0OO00O extends OooO00o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00O(@NotNull WebView webView) {
        super(webView);
        Intrinsics.checkNotNullParameter(webView, "webView");
    }

    @Override // OooO0o.OooOO0
    @NotNull
    public final String OooO00o() {
        return "YLDeviceBridge";
    }

    @JavascriptInterface
    public final boolean getCarrier(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Object systemService = this.f128OooO00o.getContext().getSystemService("phone");
        if (!(systemService instanceof TelephonyManager)) {
            return false;
        }
        String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
        Completion completion = (Completion) OooO0O0(data, Completion.class, "Completion not found in params!");
        if (completion == null) {
            return false;
        }
        o00O00O o00o00o2 = new o00O00O();
        o00o00o2.OooO0oO("name", networkOperatorName);
        o0O0ooO o0o0ooo = new o0O0ooO();
        o0o0ooo.OooO0o0(o00o00o2);
        o00O00O o00o00o3 = new o00O00O();
        o00o00o3.OooO0o0("carriers", o0o0ooo);
        OooO0OO(completion.getCompletion().getFunctionID(), o00o00o3);
        return true;
    }

    @JavascriptInterface
    public final boolean getDeviceID(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Completion completion = (Completion) OooO0O0(data, Completion.class, "Completion not found in params!");
        if (completion == null) {
            return false;
        }
        String uniqueId$lib_release = YCSDKOpenKit.INSTANCE.getUniqueId$lib_release();
        if (!(!StringsKt.isBlank(uniqueId$lib_release))) {
            return true;
        }
        OooO0Oo(completion.getCompletion().getFunctionID(), "{\"deviceID\":\"" + uniqueId$lib_release + "\"}");
        return true;
    }

    @JavascriptInterface
    public final boolean getLanguage(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Completion completion = (Completion) OooO0O0(data, Completion.class, "Completion not found in params!");
        if (completion == null) {
            return false;
        }
        String functionID = completion.getCompletion().getFunctionID();
        StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("{\"language\":\"");
        sbOooO0O0.append((Object) Locale.getDefault().getLanguage());
        sbOooO0O0.append("\"}");
        OooO0Oo(functionID, sbOooO0O0.toString());
        return true;
    }

    @JavascriptInterface
    public final boolean getModel(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Completion completion = (Completion) OooO0O0(data, Completion.class, "Completion not found in params!");
        if (completion == null) {
            return false;
        }
        String functionID = completion.getCompletion().getFunctionID();
        StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("{\"model\":\"");
        sbOooO0O0.append((Object) Build.MODEL);
        sbOooO0O0.append("\"}");
        OooO0Oo(functionID, sbOooO0O0.toString());
        return true;
    }

    @JavascriptInterface
    public final boolean getNetworkStatus(@NotNull String data) {
        NetUtil$NetworkType netUtil$NetworkType;
        Intrinsics.checkNotNullParameter(data, "data");
        Object systemService = this.f128OooO00o.getContext().getSystemService("connectivity");
        if (!(systemService instanceof ConnectivityManager)) {
            return false;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            netUtil$NetworkType = NetUtil$NetworkType.NETWORK_NO;
        } else if (activeNetworkInfo.getType() == 1) {
            netUtil$NetworkType = NetUtil$NetworkType.NETWORK_WIFI;
        } else if (activeNetworkInfo.getType() == 0) {
            switch (activeNetworkInfo.getSubtype()) {
                case 1:
                case 2:
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
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 20:
                    break;
                case 19:
                default:
                    String subtypeName = activeNetworkInfo.getSubtypeName();
                    if (!StringsKt__StringsJVMKt.equals(subtypeName, "TD-SCDMA", true) && !StringsKt__StringsJVMKt.equals(subtypeName, "WCDMA", true)) {
                        StringsKt__StringsJVMKt.equals(subtypeName, "CDMA2000", true);
                    }
                    break;
            }
            netUtil$NetworkType = NetUtil$NetworkType.NETWORK_NO;
        } else {
            netUtil$NetworkType = NetUtil$NetworkType.NETWORK_UNKNOWN;
        }
        int iOrdinal = netUtil$NetworkType.ordinal();
        int i = iOrdinal != 0 ? iOrdinal != 5 ? 1 : 0 : 2;
        Completion completion = (Completion) OooO0O0(data, Completion.class, "Completion not found in params!");
        if (completion == null) {
            return false;
        }
        o00O00O o00o00o2 = new o00O00O();
        Integer numValueOf = Integer.valueOf(i);
        o00o00o2.OooO0o0(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, numValueOf == null ? o00O00.f38904OooO00o : new oOO00O(numValueOf));
        Integer numValueOf2 = Integer.valueOf(netUtil$NetworkType.getValue());
        o00o00o2.OooO0o0("accessTechnology", numValueOf2 == null ? o00O00.f38904OooO00o : new oOO00O(numValueOf2));
        OooO0OO(completion.getCompletion().getFunctionID(), o00o00o2);
        return true;
    }

    @JavascriptInterface
    public final boolean getRegion(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Completion completion = (Completion) OooO0O0(data, Completion.class, "Completion not found in params!");
        if (completion == null) {
            return false;
        }
        String functionID = completion.getCompletion().getFunctionID();
        StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("{\"region\":\"");
        sbOooO0O0.append((Object) Locale.getDefault().getCountry());
        sbOooO0O0.append("\"}");
        OooO0Oo(functionID, sbOooO0O0.toString());
        return true;
    }

    @JavascriptInterface
    public final boolean getSystemInfo(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Completion completion = (Completion) OooO0O0(data, Completion.class, "Completion not found in params!");
        if (completion == null) {
            return false;
        }
        o00O00O o00o00o2 = new o00O00O();
        o00o00o2.OooO0oO("name", "Android");
        o00o00o2.OooO0oO(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, String.valueOf(Build.VERSION.SDK_INT));
        OooO0OO(completion.getCompletion().getFunctionID(), o00o00o2);
        return true;
    }
}
