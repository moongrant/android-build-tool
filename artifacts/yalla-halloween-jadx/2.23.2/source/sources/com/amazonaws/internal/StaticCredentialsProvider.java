package com.amazonaws.internal;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AnonymousAWSCredentials;

/* JADX INFO: loaded from: classes2.dex */
public class StaticCredentialsProvider implements AWSCredentialsProvider {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AWSCredentials f12197OooO00o;

    public StaticCredentialsProvider(AnonymousAWSCredentials anonymousAWSCredentials) {
        this.f12197OooO00o = anonymousAWSCredentials;
    }

    @Override // com.amazonaws.auth.AWSCredentialsProvider
    public final AWSCredentials OooO00o() {
        return this.f12197OooO00o;
    }
}
