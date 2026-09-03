package com.amazonaws.auth;

/* JADX INFO: loaded from: classes.dex */
public class BasicSessionCredentials implements AWSSessionCredentials {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f10330OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f10331OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f10332OooO0OO;

    public BasicSessionCredentials(String str, String str2, String str3) {
        this.f10330OooO00o = str;
        this.f10331OooO0O0 = str2;
        this.f10332OooO0OO = str3;
    }

    @Override // com.amazonaws.auth.AWSSessionCredentials
    public final String OooO00o() {
        return this.f10332OooO0OO;
    }

    @Override // com.amazonaws.auth.AWSCredentials
    public final String OooO0O0() {
        return this.f10330OooO00o;
    }

    @Override // com.amazonaws.auth.AWSCredentials
    public final String OooO0OO() {
        return this.f10331OooO0O0;
    }
}
