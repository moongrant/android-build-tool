package p004OooO0oO;

import android.util.Log;
import android.webkit.WebView;
import com.google.gson.o0OoOo0;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p605o0oo0OO0.o00;
import p605o0oo0OO0.o000O;

/* JADX INFO: loaded from: classes.dex */
public abstract class Oooo000 implements o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final WebView f157OooO00o;

    public Oooo000(@NotNull WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.f157OooO00o = webView;
    }

    @Nullable
    public static Object OooO0O0(@NotNull Class clazz, @NotNull String data, @NotNull String failedMessage) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(failedMessage, "failedMessage");
        return o00.f56900OooO00o.OooO0OO(data, clazz);
    }

    public final void OooO0OO(@Nullable o0OoOo0 o0oooo0, @NotNull String methodID) {
        Unit unit;
        Intrinsics.checkNotNullParameter(methodID, "methodID");
        if (o0oooo0 == null) {
            unit = null;
        } else {
            String strOooO0oo = o00.f56900OooO00o.OooO0oo(o0oooo0);
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
        if (o000O.f56902OooO0O0) {
            Log.d(o000O.f56901OooO00o, message);
        }
        String str2 = String.format(str, Arrays.copyOf(new Object[0], 0));
        Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(this, *args)");
        this.f157OooO00o.evaluateJavascript(str2, null);
    }
}
