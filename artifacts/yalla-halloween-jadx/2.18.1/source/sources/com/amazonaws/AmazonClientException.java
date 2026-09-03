package com.amazonaws;

/* JADX INFO: loaded from: classes.dex */
public class AmazonClientException extends RuntimeException {
    public AmazonClientException(String str, Throwable th) {
        super(str, th);
    }

    public boolean OooO00o() {
        return !(this instanceof AbortedException);
    }

    public AmazonClientException(String str) {
        super(str);
    }
}
