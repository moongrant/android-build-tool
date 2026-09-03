package com.yalla.yalla.model.http;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p435o0OoOOOo.o0O0o;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/yalla/yalla/model/http/ApiError;", "Lo0OoOOOo/o0O0o;", "", "url", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "", "code", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public class ApiError extends o0O0o {
    public static final int $stable = 0;

    @NotNull
    private final String url;

    public ApiError() {
        this(0, null, null, 7, null);
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiError(int i, @NotNull String message, @NotNull String url) {
        super(i, message);
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
    }

    public /* synthetic */ ApiError(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2);
    }
}
