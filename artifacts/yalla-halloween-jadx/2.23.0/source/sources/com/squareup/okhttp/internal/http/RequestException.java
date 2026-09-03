package com.squareup.okhttp.internal.http;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class RequestException extends Exception {
    public RequestException(IOException iOException) {
        super(iOException);
    }

    @Override // java.lang.Throwable
    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final IOException getCause() {
        return (IOException) super.getCause();
    }
}
