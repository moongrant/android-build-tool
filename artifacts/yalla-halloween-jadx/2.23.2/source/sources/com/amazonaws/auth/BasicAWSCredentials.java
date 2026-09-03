package com.amazonaws.auth;

/* JADX INFO: loaded from: classes2.dex */
public class BasicAWSCredentials implements AWSCredentials {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f12114OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f12115OooO0O0;

    public BasicAWSCredentials(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Access key cannot be null.");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("Secret key cannot be null.");
        }
        this.f12114OooO00o = str;
        this.f12115OooO0O0 = str2;
    }

    @Override // com.amazonaws.auth.AWSCredentials
    public final String OooO00o() {
        return this.f12114OooO00o;
    }

    @Override // com.amazonaws.auth.AWSCredentials
    public final String OooO0OO() {
        return this.f12115OooO0O0;
    }
}
