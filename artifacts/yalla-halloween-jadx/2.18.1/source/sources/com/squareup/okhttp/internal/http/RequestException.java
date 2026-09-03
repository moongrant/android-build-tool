package com.squareup.okhttp.internal.http;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class RequestException extends Exception {
    public RequestException(IOException iOException) {
        super(iOException);
    }

    public final IOException OooO00o() {
        return (IOException) super.getCause();
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return (IOException) super.getCause();
    }
}
