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
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p609o0oo0OOO.h5;
import p609o0oo0OOO.k5;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final WebView f154OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f155OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public WebBrowser.OooO0o f156OooO0OO;

    public o00O0O(@NotNull BaseWebView webView, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.f154OooO00o = webView;
        this.f155OooO0O0 = new LinkedHashMap();
    }

    public final void OooO00o(String str, NativeFuncInvokeError nativeFuncInvokeError) {
        String strOooO0O0;
        if (nativeFuncInvokeError != null) {
            StringBuilder sbOooO0O0 = o0OoOo0.OooO0O0("functionPool.callFunction('", str, "', '");
            sbOooO0O0.append((Object) k5.f57417OooO00o.OooO0oo(nativeFuncInvokeError));
            sbOooO0O0.append("');");
            strOooO0O0 = sbOooO0O0.toString();
        } else {
            strOooO0O0 = o000oOoO.OooO0O0("functionPool.callFunction('", str, "');");
        }
        this.f154OooO00o.evaluateJavascript(OooO0O0.OooO00o(new Object[0], 0, strOooO0O0, "java.lang.String.format(this, *args)"), null);
    }

    @JavascriptInterface
    public final void call(@NotNull String data) throws NoSuchMethodException {
        BridgeBean bridgeBean;
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            bridgeBean = (BridgeBean) k5.f57417OooO00o.OooO0OO(data, BridgeBean.class);
        } catch (JsonSyntaxException unused) {
            String str = "Failed to parse the JSON data passed from JS. {json = " + data + '}';
            WebBrowser.OooO0o oooO0o = this.f156OooO0OO;
            if (oooO0o != null) {
                oooO0o.invoke(str);
            }
            bridgeBean = null;
        }
        final BridgeBean bridgeBean2 = bridgeBean;
        if (bridgeBean2 == null) {
            return;
        }
        String message = Intrinsics.stringPlus("Bridge: ", bridgeBean2);
        Intrinsics.checkNotNullParameter(message, "message");
        if (h5.f57416OooO0O0) {
            Log.d(h5.f57415OooO00o, message);
        }
        final BridgeFunction callback = bridgeBean2.getCallback();
        final o00Oo0 o00oo1 = (o00Oo0) this.f155OooO0O0.get(bridgeBean2.getBridge());
        if (o00oo1 == null) {
            OooO00o(callback.getFunctionID(), new NativeFuncInvokeError(null, 1, NativeFuncInvokeError.code_1_msg, 1, null));
            String str2 = "The bridge " + bridgeBean2.getBridge() + " not found";
            WebBrowser.OooO0o oooO0o2 = this.f156OooO0OO;
            if (oooO0o2 == null) {
                return;
            }
            oooO0o2.invoke(str2);
            return;
        }
        String api = bridgeBean2.getApi();
        final Method method = o00oo1.getClass().getMethod(api, String.class);
        if (method == null) {
            OooO00o(callback.getFunctionID(), new NativeFuncInvokeError(null, 2, NativeFuncInvokeError.code_2_msg, 1, null));
            String str3 = "Method " + api + " not found";
            WebBrowser.OooO0o oooO0o3 = this.f156OooO0OO;
            if (oooO0o3 == null) {
                return;
            }
            oooO0o3.invoke(str3);
            return;
        }
        if (((JavascriptInterface) method.getAnnotation(JavascriptInterface.class)) != null) {
            YCSDKOpenKit.INSTANCE.dispatchToMain$lib_release(new Runnable() { // from class: OooO0oO.Oooo0
                @Override // java.lang.Runnable
                public final void run() {
                    String str4;
                    NativeFuncInvokeError nativeFuncInvokeError;
                    WebBrowser.OooO0o oooO0o4;
                    Method targetMethod = method;
                    Intrinsics.checkNotNullParameter(targetMethod, "$targetMethod");
                    o00Oo0 targetInterface = o00oo1;
                    Intrinsics.checkNotNullParameter(targetInterface, "$targetInterface");
                    BridgeBean bridgeBean3 = bridgeBean2;
                    Intrinsics.checkNotNullParameter(bridgeBean3, "$bridgeBean");
                    o00O0O this$0 = this;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    BridgeFunction callback2 = callback;
                    Intrinsics.checkNotNullParameter(callback2, "$callback");
                    try {
                        nativeFuncInvokeError = Intrinsics.areEqual(targetMethod.invoke(targetInterface, bridgeBean3.getParams()), Boolean.TRUE) ? null : new NativeFuncInvokeError(null, 3, NativeFuncInvokeError.code_3_msg, 1, null);
                    } catch (Throwable th) {
                        if (th instanceof JsonSyntaxException) {
                            th.printStackTrace();
                            String msg = Intrinsics.stringPlus("Json parse failed! \n", Unit.INSTANCE);
                            Intrinsics.checkNotNullParameter(msg, "msg");
                            if (h5.f57416OooO0O0) {
                                Log.e(h5.f57415OooO00o, msg);
                            }
                            str4 = "Json parse failed!";
                        } else {
                            str4 = NativeFuncInvokeError.code_3_msg;
                        }
                        nativeFuncInvokeError = new NativeFuncInvokeError(null, 3, str4, 1, null);
                    }
                    this$0.OooO00o(callback2.getFunctionID(), nativeFuncInvokeError);
                    if (nativeFuncInvokeError == null || (oooO0o4 = this$0.f156OooO0OO) == null) {
                        return;
                    }
                    oooO0o4.invoke(nativeFuncInvokeError.getMessage() + "\n BridgeBean = " + bridgeBean3);
                }
            });
            return;
        }
        OooO00o(callback.getFunctionID(), new NativeFuncInvokeError(null, 2, NativeFuncInvokeError.code_2_msg, 1, null));
        String str4 = "Method  " + api + " is not invoked, since it is not declared with JavascriptInterface annotation!";
        WebBrowser.OooO0o oooO0o4 = this.f156OooO0OO;
        if (oooO0o4 == null) {
            return;
        }
        oooO0o4.invoke(str4);
    }
}
