package p666o0oooO0o;

import com.qiniu.android.http.request.Request;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class oO00o0 {
    @JvmStatic
    public static final boolean OooO00o(@NotNull String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return (Intrinsics.areEqual(method, Request.HttpMethodGet) || Intrinsics.areEqual(method, Request.HttpMethodHEAD)) ? false : true;
    }
}
