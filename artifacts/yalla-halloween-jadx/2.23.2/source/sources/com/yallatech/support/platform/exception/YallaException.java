package com.yallatech.support.platform.exception;

import java.io.IOException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yallatech/support/platform/exception/YallaException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public class YallaException extends RuntimeException {
    public YallaException() {
    }

    @Override // java.lang.Throwable
    @NotNull
    public final String toString() {
        String message = getMessage();
        return message == null ? "" : message;
    }

    public YallaException(@Nullable IOException iOException) {
        super(iOException);
    }
}
