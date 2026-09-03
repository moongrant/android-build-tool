package com.yalla.yalla.model.http;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Deprecated(message = "使用ApiResult")
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u001e\u0010\u0005\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/yalla/yalla/model/http/Response;", "T", "", "isSuccess", "", "data", "noMoreData", "error", "Lcom/yalla/yalla/model/http/Error;", "(ZLjava/lang/Object;ZLcom/yalla/yalla/model/http/Error;)V", "getData", "()Ljava/lang/Object;", "setData", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "getError", "()Lcom/yalla/yalla/model/http/Error;", "setError", "(Lcom/yalla/yalla/model/http/Error;)V", "()Z", "setSuccess", "(Z)V", "getNoMoreData", "setNoMoreData", "page", "Lcom/yalla/yalla/model/http/ApiPage;", "getPage", "()Lcom/yalla/yalla/model/http/ApiPage;", "setPage", "(Lcom/yalla/yalla/model/http/ApiPage;)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class Response<T> {
    public static final int $stable = 8;

    @Nullable
    private T data;

    @Nullable
    private Error error;
    private boolean isSuccess;
    private boolean noMoreData;

    @NotNull
    private ApiPage page;

    public Response() {
        this(false, null, false, null, 15, null);
    }

    @Nullable
    public final T getData() {
        return this.data;
    }

    @Nullable
    public final Error getError() {
        return this.error;
    }

    public final boolean getNoMoreData() {
        return this.noMoreData;
    }

    @NotNull
    public final ApiPage getPage() {
        return this.page;
    }

    /* JADX INFO: renamed from: isSuccess, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    public final void setData(@Nullable T t) {
        this.data = t;
    }

    public final void setError(@Nullable Error error) {
        this.error = error;
    }

    public final void setNoMoreData(boolean z) {
        this.noMoreData = z;
    }

    public final void setPage(@NotNull ApiPage apiPage) {
        Intrinsics.checkNotNullParameter(apiPage, "<set-?>");
        this.page = apiPage;
    }

    public final void setSuccess(boolean z) {
        this.isSuccess = z;
    }

    public Response(boolean z, @Nullable T t, boolean z2, @Nullable Error error) {
        this.isSuccess = z;
        this.data = t;
        this.noMoreData = z2;
        this.error = error;
        this.page = new ApiPage(0, 0, null, 7, null);
    }

    public /* synthetic */ Response(boolean z, Object obj, boolean z2, Error error, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : obj, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : error);
    }
}
