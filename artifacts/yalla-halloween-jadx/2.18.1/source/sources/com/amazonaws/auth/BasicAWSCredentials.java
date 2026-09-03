package com.amazonaws.auth;

/* JADX INFO: loaded from: classes.dex */
public class BasicAWSCredentials implements AWSCredentials {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f10328OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f10329OooO0O0;

    public BasicAWSCredentials(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Access key cannot be null.");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("Secret key cannot be null.");
        }
        this.f10328OooO00o = str;
        this.f10329OooO0O0 = str2;
    }

    @Override // com.amazonaws.auth.AWSCredentials
    public final String OooO0O0() {
        return this.f10328OooO00o;
    }

    @Override // com.amazonaws.auth.AWSCredentials
    public final String OooO0OO() {
        return this.f10329OooO0O0;
    }
}
