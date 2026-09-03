package p005OooO0oo;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.webkit.JavascriptInterface;
import com.common.support.apm.Constants;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.ServerProtocol;
import com.google.gson.OooOo00;
import com.google.gson.o00O0O;
import com.google.gson.o00Ooo;
import com.google.gson.o0OoOo0;
import com.yallatech.support.platform.YCSDKOpenKit;
import com.yallatech.support.platform.base.bean.Completion;
import com.yallatech.support.platform.base.web.BaseWebView;
import com.yallatech.support.platform.utils.NetUtil$NetworkType;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import p004OooO0oO.Oooo000;

/* JADX INFO: loaded from: classes.dex */
public final class o00oO0o extends Oooo000 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oO0o(@NotNull BaseWebView webView) {
        super(webView);
        Intrinsics.checkNotNullParameter(webView, "webView");
    }

    @Override // p004OooO0oO.o00Oo0
    @NotNull
    public final String OooO00o() {
        return "YLDeviceBridge";
    }

    @JavascriptInterface
    public final boolean getCarrier(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Object systemService = this.f153OooO00o.getContext().getSystemService("phone");
        if (systemService instanceof TelephonyManager) {
            String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
            Completion completion = (Completion) Oooo000.OooO0O0(Completion.class, data, "Completion not found in params!");
            if (completion != null) {
                o00O0O o00o0o2 = new o00O0O();
                o00o0o2.OooO0Oo("name", networkOperatorName);
                OooOo00 oooOo00 = new OooOo00();
                oooOo00.f20129OooO0Oo.add(o00o0o2);
                o00O0O o00o0o3 = new o00O0O();
                o00o0o3.OooO0OO("carriers", oooOo00);
                OooO0OO(o00o0o3, completion.getCompletion().getFunctionID());
                return true;
            }
        }
        return false;
    }

    @JavascriptInterface
    public final boolean getDeviceID(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Completion completion = (Completion) Oooo000.OooO0O0(Completion.class, data, "Completion not found in params!");
        if (completion == null) {
            return false;
        }
        String uniqueId$lib_release = YCSDKOpenKit.INSTANCE.getUniqueId$lib_release();
        if (!StringsKt.isBlank(uniqueId$lib_release)) {
            OooO0Oo(completion.getCompletion().getFunctionID(), "{\"deviceID\":\"" + uniqueId$lib_release + "\"}");
        }
        return true;
    }

    @JavascriptInterface
    public final boolean getLanguage(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Completion completion = (Completion) Oooo000.OooO0O0(Completion.class, data, "Completion not found in params!");
        if (completion == null) {
            return false;
        }
        OooO0Oo(completion.getCompletion().getFunctionID(), "{\"language\":\"" + ((Object) Locale.getDefault().getLanguage()) + "\"}");
        return true;
    }

    @JavascriptInterface
    public final boolean getModel(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Completion completion = (Completion) Oooo000.OooO0O0(Completion.class, data, "Completion not found in params!");
        if (completion == null) {
            return false;
        }
        OooO0Oo(completion.getCompletion().getFunctionID(), "{\"model\":\"" + ((Object) Build.MODEL) + "\"}");
        return true;
    }

    @JavascriptInterface
    public final boolean getNetworkStatus(@NotNull String data) {
        NetUtil$NetworkType netUtil$NetworkType;
        Intrinsics.checkNotNullParameter(data, "data");
        Object systemService = this.f153OooO00o.getContext().getSystemService("connectivity");
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
        Completion completion = (Completion) Oooo000.OooO0O0(Completion.class, data, "Completion not found in params!");
        if (completion == null) {
            return false;
        }
        o00O0O o00o0o2 = new o00O0O();
        Integer numValueOf = Integer.valueOf(i);
        o00o0o2.OooO0OO(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, numValueOf == null ? o0OoOo0.f20242OooO0Oo : new o00Ooo(numValueOf));
        Integer numValueOf2 = Integer.valueOf(netUtil$NetworkType.getValue());
        o00o0o2.OooO0OO("accessTechnology", numValueOf2 == null ? o0OoOo0.f20242OooO0Oo : new o00Ooo(numValueOf2));
        OooO0OO(o00o0o2, completion.getCompletion().getFunctionID());
        return true;
    }

    @JavascriptInterface
    public final boolean getRegion(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Completion completion = (Completion) Oooo000.OooO0O0(Completion.class, data, "Completion not found in params!");
        if (completion == null) {
            return false;
        }
        OooO0Oo(completion.getCompletion().getFunctionID(), "{\"region\":\"" + ((Object) Locale.getDefault().getCountry()) + "\"}");
        return true;
    }

    @JavascriptInterface
    public final boolean getSystemInfo(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Completion completion = (Completion) Oooo000.OooO0O0(Completion.class, data, "Completion not found in params!");
        if (completion == null) {
            return false;
        }
        o00O0O o00o0o2 = new o00O0O();
        o00o0o2.OooO0Oo("name", Constants.OS);
        o00o0o2.OooO0Oo(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, String.valueOf(Build.VERSION.SDK_INT));
        OooO0OO(o00o0o2, completion.getCompletion().getFunctionID());
        return true;
    }
}
