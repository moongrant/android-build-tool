package OooO0o;

import android.content.Context;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.gson.JsonSyntaxException;
import com.yallatech.support.platform.YCSDKOpenKit;
import com.yallatech.support.platform.base.bean.BridgeBean;
import com.yallatech.support.platform.base.bean.BridgeFunction;
import com.yallatech.support.platform.base.bean.NativeFuncInvokeError;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p625o0oo0oo.o000OO00;
import p625o0oo0oo.o000OO0O;

/* JADX INFO: loaded from: classes.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final WebView f125OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Map<String, OooOO0> f126OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Function1<? super String, Unit> f127OooO0OO;

    public OooO(@NotNull Context context, @NotNull WebView webView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.f125OooO00o = webView;
        this.f126OooO0O0 = new LinkedHashMap();
    }

    public final void OooO00o(String str, NativeFuncInvokeError nativeFuncInvokeError) {
        String strOooO00o;
        if (nativeFuncInvokeError != null) {
            StringBuilder sbOooO0OO = OooO0o.OooO0OO("functionPool.callFunction('", str, "', '");
            sbOooO0OO.append((Object) o000OO00.f48668OooO00o.OooO0oo(nativeFuncInvokeError));
            sbOooO0OO.append("');");
            strOooO00o = sbOooO0OO.toString();
        } else {
            strOooO00o = OooO0OO.OooO00o("functionPool.callFunction('", str, "');");
        }
        WebView webView = this.f125OooO00o;
        String str2 = String.format(strOooO00o, Arrays.copyOf(new Object[0], 0));
        Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(this, *args)");
        webView.evaluateJavascript(str2, null);
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, OooO0o.OooOO0>] */
    @JavascriptInterface
    public final void call(@NotNull String data) throws NoSuchMethodException {
        BridgeBean bridgeBean;
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            bridgeBean = (BridgeBean) o000OO00.f48668OooO00o.OooO0OO(data, BridgeBean.class);
        } catch (JsonSyntaxException unused) {
            String str = "Failed to parse the JSON data passed from JS. {json = " + data + '}';
            Function1<? super String, Unit> function1 = this.f127OooO0OO;
            if (function1 != null) {
                function1.invoke(str);
            }
            bridgeBean = null;
        }
        final BridgeBean bridgeBean2 = bridgeBean;
        if (bridgeBean2 == null) {
            return;
        }
        String message = Intrinsics.stringPlus("Bridge: ", bridgeBean2);
        Intrinsics.checkNotNullParameter(message, "message");
        if (o000OO0O.f48670OooO0O0) {
            Log.d(o000OO0O.f48669OooO00o, message);
        }
        final BridgeFunction callback = bridgeBean2.getCallback();
        final OooOO0 oooOO1 = (OooOO0) this.f126OooO0O0.get(bridgeBean2.getBridge());
        if (oooOO1 == null) {
            OooO00o(callback.getFunctionID(), new NativeFuncInvokeError(null, 1, NativeFuncInvokeError.code_1_msg, 1, null));
            String str2 = "The bridge " + bridgeBean2.getBridge() + " not found";
            Function1<? super String, Unit> function2 = this.f127OooO0OO;
            if (function2 == null) {
                return;
            }
            function2.invoke(str2);
            return;
        }
        String api = bridgeBean2.getApi();
        final Method method = oooOO1.getClass().getMethod(api, String.class);
        if (method == null) {
            OooO00o(callback.getFunctionID(), new NativeFuncInvokeError(null, 2, NativeFuncInvokeError.code_2_msg, 1, null));
            String str3 = "Method " + api + " not found";
            Function1<? super String, Unit> function3 = this.f127OooO0OO;
            if (function3 == null) {
                return;
            }
            function3.invoke(str3);
            return;
        }
        if (((JavascriptInterface) method.getAnnotation(JavascriptInterface.class)) != null) {
            YCSDKOpenKit.INSTANCE.dispatchToMain$lib_release(new Runnable() { // from class: OooO0o.OooO0O0
                @Override // java.lang.Runnable
                public final void run() {
                    String str4;
                    NativeFuncInvokeError nativeFuncInvokeError;
                    Function1<? super String, Unit> function4;
                    Method targetMethod = method;
                    OooOO0 targetInterface = oooOO1;
                    BridgeBean bridgeBean3 = bridgeBean2;
                    OooO this$0 = this;
                    BridgeFunction callback2 = callback;
                    Intrinsics.checkNotNullParameter(targetMethod, "$targetMethod");
                    Intrinsics.checkNotNullParameter(targetInterface, "$targetInterface");
                    Intrinsics.checkNotNullParameter(bridgeBean3, "$bridgeBean");
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(callback2, "$callback");
                    try {
                        nativeFuncInvokeError = Intrinsics.areEqual(targetMethod.invoke(targetInterface, bridgeBean3.getParams()), Boolean.TRUE) ? null : new NativeFuncInvokeError(null, 3, NativeFuncInvokeError.code_3_msg, 1, null);
                    } catch (Throwable th) {
                        if (th instanceof JsonSyntaxException) {
                            th.printStackTrace();
                            String msg = Intrinsics.stringPlus("Json parse failed! \n", Unit.INSTANCE);
                            Intrinsics.checkNotNullParameter(msg, "msg");
                            if (o000OO0O.f48670OooO0O0) {
                                Log.e(o000OO0O.f48669OooO00o, msg);
                            }
                            str4 = "Json parse failed!";
                        } else {
                            str4 = NativeFuncInvokeError.code_3_msg;
                        }
                        nativeFuncInvokeError = new NativeFuncInvokeError(null, 3, str4, 1, null);
                    }
                    this$0.OooO00o(callback2.getFunctionID(), nativeFuncInvokeError);
                    if (nativeFuncInvokeError == null || (function4 = this$0.f127OooO0OO) == null) {
                        return;
                    }
                    function4.invoke(nativeFuncInvokeError.getMessage() + "\n BridgeBean = " + bridgeBean3);
                }
            });
            return;
        }
        OooO00o(callback.getFunctionID(), new NativeFuncInvokeError(null, 2, NativeFuncInvokeError.code_2_msg, 1, null));
        String str4 = "Method  " + api + " is not invoked, since it is not declared with JavascriptInterface annotation!";
        Function1<? super String, Unit> function4 = this.f127OooO0OO;
        if (function4 == null) {
            return;
        }
        function4.invoke(str4);
    }
}
