package com.bumptech.glide.load;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class HttpException extends IOException {
    public HttpException() {
        throw null;
    }

    public HttpException(@Nullable IOException iOException, int i, String str) {
        super(str + ", status code: " + i, iOException);
    }
}
