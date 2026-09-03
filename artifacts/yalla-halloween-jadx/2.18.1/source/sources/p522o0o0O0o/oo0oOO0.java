package p522o0o0O0o;

import android.content.Context;
import android.content.res.Resources;
import com.code.android.util.ToastUtil;
import com.umeng.analytics.pro.d;
import com.yalla.support.common.util.OooO0O0;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p031OoooO.o0000O;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0oOO0 {
    @Deprecated(message = "使用AndroidUtil包")
    public static final int OooO00o(float f) {
        return (int) ((f * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static final void OooO0O0(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        ToastUtil.f12567OooO00o.OooO0O0(message);
    }

    @Deprecated(message = "使用AndroidUtil包")
    @NotNull
    public static final String OooO0OO(int i) {
        Context contextOooO0O0 = OooO0O0.f20502OooO00o.OooO0O0();
        if (contextOooO0O0 == null && (contextOooO0O0 = o0000O.f2657OooO00o) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(d.R);
            contextOooO0O0 = null;
        }
        String string = contextOooO0O0.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "Utils.uiContext.getString(strId)");
        return string;
    }
}
