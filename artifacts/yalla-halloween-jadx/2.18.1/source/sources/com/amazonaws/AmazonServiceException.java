package com.amazonaws;

import p058o0000OoO.OooO;

/* JADX INFO: loaded from: classes.dex */
public class AmazonServiceException extends AmazonClientException {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f10267Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public String f10268Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public String f10269Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public String f10270Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public String f10271OoooO00;

    public enum ErrorType {
        Client,
        Service,
        Unknown
    }

    public AmazonServiceException(String str) {
        super(str);
        ErrorType errorType = ErrorType.Unknown;
        this.f10270Oooo0oo = str;
    }

    public String OooO0O0() {
        return this.f10269Oooo0oO;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10270Oooo0oo);
        sb.append(" (Service: ");
        sb.append(this.f10271OoooO00);
        sb.append("; Status Code: ");
        sb.append(this.f10267Oooo);
        sb.append("; Error Code: ");
        sb.append(OooO0O0());
        sb.append("; Request ID: ");
        return OooO.OooO00o(sb, this.f10268Oooo0o, ")");
    }
}
