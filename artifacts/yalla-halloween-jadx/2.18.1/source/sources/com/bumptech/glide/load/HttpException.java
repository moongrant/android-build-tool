package com.bumptech.glide.load;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class HttpException extends IOException {
    public HttpException(String str, int i, @Nullable Throwable th) {
        super(str + ", status code: " + i, th);
    }
}
