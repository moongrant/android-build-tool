package p004OooO0oO;

import OooO0O0.OooO0O0;
import android.content.Context;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.gson.JsonSyntaxException;
import com.yallatech.support.platform.YCSDKOpenKit;
import com.yallatech.support.platform.base.bean.BridgeBean;
import com.yallatech.support.platform.base.bean.BridgeFunction;
import com.yallatech.support.platform.base.bean.NativeFuncInvokeError;
import com.yallatech.support.platform.base.web.BaseWebView;
import com.yallatech.support.platform.base.web.WebBrowser;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p605o0oo0OO0.o00;
import p605o0oo0OO0.o000O;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final WebView f158OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f159OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public WebBrowser.OooO0o f160OooO0OO;

    public o00O0O(@NotNull BaseWebView webView, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.f158OooO00o = webView;
        this.f159OooO0O0 = new LinkedHashMap();
    }

    public final void OooO00o(String str, NativeFuncInvokeError nativeFuncInvokeError) {
        String strOooO00o;
        if (nativeFuncInvokeError != null) {
            StringBuilder sbOooO00o = o0OoOo0.OooO00o("functionPool.callFunction('", str, "', '");
            sbOooO00o.append((Object) o00.f56900OooO00o.OooO0oo(nativeFuncInvokeError));
            sbOooO00o.append("');");
            strOooO00o = sbOooO00o.toString();
        } else {
            strOooO00o = o000oOoO.OooO00o("functionPool.callFunction('", str, "');");
        }
        this.f158OooO00o.evaluateJavascript(OooO0O0.OooO00o(new Object[0], 0, strOooO00o, "java.lang.String.format(this, *args)"), null);
    }

    @JavascriptInterface
    public final void call(@NotNull String data) throws NoSuchMethodException {
        BridgeBean bridgeBean;
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            bridgeBean = (BridgeBean) o00.f56900OooO00o.OooO0OO(data, BridgeBean.class);
        } catch (JsonSyntaxException unused) {
            String str = "Failed to parse the JSON data passed from JS. {json = " + data + '}';
            WebBrowser.OooO0o oooO0o = this.f160OooO0OO;
            if (oooO0o != null) {
                oooO0o.invoke(str);
            }
            bridgeBean = null;
        }
        BridgeBean bridgeBean2 = bridgeBean;
        if (bridgeBean2 == null) {
            return;
        }
        String message = Intrinsics.stringPlus("Bridge: ", bridgeBean2);
        Intrinsics.checkNotNullParameter(message, "message");
        if (o000O.f56902OooO0O0) {
            Log.d(o000O.f56901OooO00o, message);
        }
        BridgeFunction callback = bridgeBean2.getCallback();
        o00Oo0 o00oo1 = (o00Oo0) this.f159OooO0O0.get(bridgeBean2.getBridge());
        if (o00oo1 == null) {
            OooO00o(callback.getFunctionID(), new NativeFuncInvokeError(null, 1, NativeFuncInvokeError.code_1_msg, 1, null));
            String str2 = "The bridge " + bridgeBean2.getBridge() + " not found";
            WebBrowser.OooO0o oooO0o2 = this.f160OooO0OO;
            if (oooO0o2 == null) {
                return;
            }
            oooO0o2.invoke(str2);
            return;
        }
        String api = bridgeBean2.getApi();
        Method method = o00oo1.getClass().getMethod(api, String.class);
        if (method == null) {
            OooO00o(callback.getFunctionID(), new NativeFuncInvokeError(null, 2, NativeFuncInvokeError.code_2_msg, 1, null));
            String str3 = "Method " + api + " not found";
            WebBrowser.OooO0o oooO0o3 = this.f160OooO0OO;
            if (oooO0o3 == null) {
                return;
            }
            oooO0o3.invoke(str3);
            return;
        }
        if (((JavascriptInterface) method.getAnnotation(JavascriptInterface.class)) != null) {
            YCSDKOpenKit.INSTANCE.dispatchToMain$lib_release(new Oooo0(method, o00oo1, bridgeBean2, this, callback, 0));
            return;
        }
        OooO00o(callback.getFunctionID(), new NativeFuncInvokeError(null, 2, NativeFuncInvokeError.code_2_msg, 1, null));
        String str4 = "Method  " + api + " is not invoked, since it is not declared with JavascriptInterface annotation!";
        WebBrowser.OooO0o oooO0o4 = this.f160OooO0OO;
        if (oooO0o4 == null) {
            return;
        }
        oooO0o4.invoke(str4);
    }
}
