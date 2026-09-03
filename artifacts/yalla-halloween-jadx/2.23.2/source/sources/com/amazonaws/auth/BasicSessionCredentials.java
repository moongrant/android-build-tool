package com.amazonaws.auth;

/* JADX INFO: loaded from: classes2.dex */
public class BasicSessionCredentials implements AWSSessionCredentials {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f12116OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f12117OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f12118OooO0OO;

    public BasicSessionCredentials(String str, String str2, String str3) {
        this.f12116OooO00o = str;
        this.f12117OooO0O0 = str2;
        this.f12118OooO0OO = str3;
    }

    @Override // com.amazonaws.auth.AWSCredentials
    public final String OooO00o() {
        return this.f12116OooO00o;
    }

    @Override // com.amazonaws.auth.AWSSessionCredentials
    public final String OooO0O0() {
        return this.f12118OooO0OO;
    }

    @Override // com.amazonaws.auth.AWSCredentials
    public final String OooO0OO() {
        return this.f12117OooO0O0;
    }
}
