package com.amazonaws.internal;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;

/* JADX INFO: loaded from: classes.dex */
public class StaticCredentialsProvider implements AWSCredentialsProvider {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AWSCredentials f10413OooO00o;

    public StaticCredentialsProvider(AWSCredentials aWSCredentials) {
        this.f10413OooO00o = aWSCredentials;
    }

    @Override // com.amazonaws.auth.AWSCredentialsProvider
    public final AWSCredentials OooO00o() {
        return this.f10413OooO00o;
    }
}
