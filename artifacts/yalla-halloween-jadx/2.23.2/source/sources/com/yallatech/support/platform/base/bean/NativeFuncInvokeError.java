package com.yallatech.support.platform.base.bean;

import androidx.annotation.Keep;
import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B!\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0019\u0010\n\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/yallatech/support/platform/base/bean/NativeFuncInvokeError;", "", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "domain", "getDomain", "", "code", "I", "getCode", "()I", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "OooO00o", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class NativeFuncInvokeError {
    public static final int code_1 = 1;

    @NotNull
    public static final String code_1_msg = "Bridge not found";
    public static final int code_2 = 2;

    @NotNull
    public static final String code_2_msg = "API not found";
    public static final int code_3 = 3;

    @NotNull
    public static final String code_3_msg = "Native function invoke error";

    @NotNull
    public static final String domain_native = "native";
    private final int code;

    @NotNull
    private final String domain;

    @NotNull
    private final String message;

    public NativeFuncInvokeError(@NotNull String domain, int i, @NotNull String message) {
        Intrinsics.checkNotNullParameter(domain, "domain");
        Intrinsics.checkNotNullParameter(message, "message");
        this.domain = domain;
        this.code = i;
        this.message = message;
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getDomain() {
        return this.domain;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public /* synthetic */ NativeFuncInvokeError(String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "native" : str, i, str2);
    }
}
