package com.common.support.apollo;

import android.content.Context;
import com.facebook.internal.NativeProtocol;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import oo00oO.OooO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0011\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\bH\u0086 J\u0011\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0086 ¨\u0006\u000b"}, d2 = {"Lcom/common/support/apollo/Apollo;", "", "()V", "init", "", "context", "Landroid/content/Context;", NativeProtocol.WEB_DIALOG_PARAMS, "", "", "q", "keystore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class Apollo {

    @NotNull
    public static final Apollo INSTANCE = new Apollo();

    private Apollo() {
    }

    public final void init(@NotNull Context context, @NotNull String params) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
        OooO oooO = new OooO();
        oooO.f60875OooO0Oo = true;
        oooO.OooO0O0(context.getApplicationContext(), "apollo");
        init(params);
    }

    public final native boolean init(@NotNull String params);

    @NotNull
    public final native String q(@NotNull String params);
}
