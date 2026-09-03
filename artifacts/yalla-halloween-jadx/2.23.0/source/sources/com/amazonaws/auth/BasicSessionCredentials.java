package com.amazonaws.auth;

/* JADX INFO: loaded from: classes2.dex */
public class BasicSessionCredentials implements AWSSessionCredentials {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f9026OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f9027OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f9028OooO0OO;

    public BasicSessionCredentials(String str, String str2, String str3) {
        this.f9026OooO00o = str;
        this.f9027OooO0O0 = str2;
        this.f9028OooO0OO = str3;
    }

    @Override // com.amazonaws.auth.AWSCredentials
    public final String OooO00o() {
        return this.f9026OooO00o;
    }

    @Override // com.amazonaws.auth.AWSSessionCredentials
    public final String OooO0O0() {
        return this.f9028OooO0OO;
    }

    @Override // com.amazonaws.auth.AWSCredentials
    public final String OooO0OO() {
        return this.f9027OooO0O0;
    }
}
