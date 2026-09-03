package com.amazonaws.services.s3.internal;

import com.amazonaws.auth.Signer;
import com.amazonaws.http.ExecutionContext;
import java.net.URI;

/* JADX INFO: loaded from: classes2.dex */
public class S3ExecutionContext extends ExecutionContext {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Signer f12422OooO0o0;

    @Override // com.amazonaws.http.ExecutionContext
    public final Signer OooO00o(URI uri) {
        return this.f12422OooO0o0;
    }
}
