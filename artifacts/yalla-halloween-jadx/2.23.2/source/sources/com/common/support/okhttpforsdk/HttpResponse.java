package com.common.support.okhttpforsdk;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u0012*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0012B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0010\u001a\u00020\u0011R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/common/support/okhttpforsdk/HttpResponse;", "T", "", "code", "", "data", "throwable", "", "(ILjava/lang/Object;Ljava/lang/Throwable;)V", "getCode", "()I", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getThrowable", "()Ljava/lang/Throwable;", "isSuccessful", "", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class HttpResponse<T> {
    public static final int SOCKET_TIME_OUT = -200;
    public static final int UNKNOWN_ERROR = -100;
    private final int code;

    @Nullable
    private final T data;

    @Nullable
    private final Throwable throwable;

    public HttpResponse(int i, @Nullable T t, @Nullable Throwable th) {
        this.code = i;
        this.data = t;
        this.throwable = th;
    }

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final T getData() {
        return this.data;
    }

    @Nullable
    public final Throwable getThrowable() {
        return this.throwable;
    }

    public final boolean isSuccessful() {
        int i = this.code;
        return 200 <= i && i <= 299;
    }

    public /* synthetic */ HttpResponse(int i, Object obj, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : obj, (i2 & 4) != 0 ? null : th);
    }
}
