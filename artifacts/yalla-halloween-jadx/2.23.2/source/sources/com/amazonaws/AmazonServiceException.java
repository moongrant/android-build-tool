package com.amazonaws;

import p028Oooo0oO.o0oOO;

/* JADX INFO: loaded from: classes2.dex */
public class AmazonServiceException extends AmazonClientException {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f12038OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public String f12039OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public String f12040OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f12041OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public String f12042OooO0oo;

    public enum ErrorType {
        Client,
        Service,
        Unknown
    }

    public AmazonServiceException(String str) {
        super(str);
        ErrorType errorType = ErrorType.Client;
        this.f12039OooO0o = str;
    }

    public String OooO00o() {
        return this.f12040OooO0o0;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12039OooO0o);
        sb.append(" (Service: ");
        sb.append(this.f12042OooO0oo);
        sb.append("; Status Code: ");
        sb.append(this.f12041OooO0oO);
        sb.append("; Error Code: ");
        sb.append(OooO00o());
        sb.append("; Request ID: ");
        return o0oOO.OooO0O0(sb, this.f12038OooO0Oo, ")");
    }
}
