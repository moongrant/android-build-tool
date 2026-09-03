package com.common.support.apollo;

import com.facebook.internal.NativeProtocol;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086 J\u0011\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0086 ¨\u0006\u0007"}, d2 = {"Lcom/common/support/apollo/Apollo;", "", "", NativeProtocol.WEB_DIALOG_PARAMS, "", "init", "q", "keystore_release"}, k = 1, mv = {1, 7, 1})
public final class Apollo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Apollo f12658OooO00o = new Apollo();

    static {
        System.loadLibrary("zeuscommon");
        System.loadLibrary("apollo");
    }

    public final native boolean init(@NotNull String params);

    @NotNull
    public final native String q(@NotNull String params);
}
