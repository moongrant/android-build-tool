package com.common.support.apm.otlp.exceptions;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/common/support/apm/otlp/exceptions/RetryRequestException;", "Lcom/common/support/apm/otlp/exceptions/BaseResponseException;", "waitTime", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "(ILjava/util/concurrent/TimeUnit;)V", "getTimeUnit", "()Ljava/util/concurrent/TimeUnit;", "getWaitTime", "()I", "sailfish_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class RetryRequestException extends BaseResponseException {

    @NotNull
    private final TimeUnit timeUnit;
    private final int waitTime;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetryRequestException(int i, @NotNull TimeUnit timeUnit) {
        super("Please retry after " + i + ' ' + timeUnit);
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.waitTime = i;
        this.timeUnit = timeUnit;
    }

    @NotNull
    public final TimeUnit getTimeUnit() {
        return this.timeUnit;
    }

    public final int getWaitTime() {
        return this.waitTime;
    }
}
