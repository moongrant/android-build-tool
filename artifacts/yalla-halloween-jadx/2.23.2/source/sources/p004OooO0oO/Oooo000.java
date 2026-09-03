package p004OooO0oO;

import android.util.Log;
import android.webkit.WebView;
import com.google.gson.o00O0O;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p609o0oo0OOO.h5;
import p609o0oo0OOO.k5;

/* JADX INFO: loaded from: classes.dex */
public abstract class Oooo000 implements o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final WebView f153OooO00o;

    public Oooo000(@NotNull WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.f153OooO00o = webView;
    }

    @Nullable
    public static Object OooO0O0(@NotNull Class clazz, @NotNull String data, @NotNull String failedMessage) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(failedMessage, "failedMessage");
        return k5.f57417OooO00o.OooO0OO(data, clazz);
    }

    public final void OooO0OO(@Nullable o00O0O o00o0o2, @NotNull String methodID) {
        Unit unit;
        Intrinsics.checkNotNullParameter(methodID, "methodID");
        if (o00o0o2 == null) {
            unit = null;
        } else {
            String strOooO0oo = k5.f57417OooO00o.OooO0oo(o00o0o2);
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
        if (h5.f57416OooO0O0) {
            Log.d(h5.f57415OooO00o, message);
        }
        String str2 = String.format(str, Arrays.copyOf(new Object[0], 0));
        Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(this, *args)");
        this.f153OooO00o.evaluateJavascript(str2, null);
    }
}
