package OooO0o;

import android.util.Log;
import android.webkit.WebView;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p625o0oo0oo.o000OO00;
import p625o0oo0oo.o000OO0O;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO00o implements OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final WebView f128OooO00o;

    public OooO00o(@NotNull WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.f128OooO00o = webView;
    }

    @Nullable
    public final <T> T OooO0O0(@NotNull String data, @NotNull Class<T> clazz, @NotNull String failedMessage) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(failedMessage, "failedMessage");
        return (T) o000OO00.f48668OooO00o.OooO0OO(data, clazz);
    }

    public final void OooO0OO(@NotNull String methodID, @Nullable Object obj) {
        Unit unit;
        Intrinsics.checkNotNullParameter(methodID, "methodID");
        if (obj == null) {
            unit = null;
        } else {
            String strOooO0oo = o000OO00.f48668OooO00o.OooO0oo(obj);
            Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(this)");
            OooO0Oo(methodID, strOooO0oo);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            OooO0Oo(methodID, "");
        }
    }

    public final void OooO0Oo(@NotNull String methodID, @NotNull String json) {
        Intrinsics.checkNotNullParameter(methodID, "methodID");
        Intrinsics.checkNotNullParameter(json, "json");
        String str = "functionPool.callFunction('" + methodID + "', '" + json + "');";
        String message = Intrinsics.stringPlus("Invoke js method : ", str);
        Intrinsics.checkNotNullParameter(message, "message");
        if (o000OO0O.f48670OooO0O0) {
            Log.d(o000OO0O.f48669OooO00o, message);
        }
        WebView webView = this.f128OooO00o;
        String str2 = String.format(str, Arrays.copyOf(new Object[0], 0));
        Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(this, *args)");
        webView.evaluateJavascript(str2, null);
    }
}
