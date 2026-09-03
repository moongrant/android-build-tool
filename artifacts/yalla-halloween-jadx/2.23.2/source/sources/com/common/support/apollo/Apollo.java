package com.common.support.apollo;

import android.content.Context;
import com.facebook.internal.NativeProtocol;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p225o00oOOo0.o0000O;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0011\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0086 J\u0011\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0086 ¨\u0006\r"}, d2 = {"Lcom/common/support/apollo/Apollo;", "", "()V", "init", "", "context", "Landroid/content/Context;", NativeProtocol.WEB_DIALOG_PARAMS, "", "initResult", "Lcom/common/support/apollo/InitResult;", "", "q", "keystore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class Apollo {

    @NotNull
    public static final Apollo INSTANCE = new Apollo();

    private Apollo() {
    }

    public final void init(@NotNull Context context, @NotNull String params, @NotNull InitResult initResult) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(initResult, "initResult");
        try {
            o0000O o0000o2 = new o0000O();
            o0000o2.f39714OooO0Oo = true;
            o0000o2.OooO0O0(context.getApplicationContext(), "apollo");
            init(params);
        } catch (Throwable th) {
            initResult.setCode(8);
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            initResult.setMessage(message);
        }
    }

    public final native boolean init(@NotNull String params);

    @NotNull
    public final native String q(@NotNull String params);
}
