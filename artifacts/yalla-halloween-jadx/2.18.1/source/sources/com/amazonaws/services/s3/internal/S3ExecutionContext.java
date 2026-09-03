package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.auth.Signer;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.http.ExecutionContext;
import java.net.URI;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class S3ExecutionContext extends ExecutionContext {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Signer f10665OooO0o0;

    public S3ExecutionContext(List<RequestHandler2> list, boolean z, AmazonWebServiceClient amazonWebServiceClient) {
        super(list, z, amazonWebServiceClient);
    }

    @Override // com.amazonaws.http.ExecutionContext
    public final Signer OooO00o(URI uri) {
        return this.f10665OooO0o0;
    }

    @Override // com.amazonaws.http.ExecutionContext
    public final void OooO0O0(Signer signer) {
        this.f10665OooO0o0 = signer;
    }
}
