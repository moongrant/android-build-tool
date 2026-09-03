package com.amazonaws.services.s3.internal;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.s3.internal.ServerSideEncryptionResult;

/* JADX INFO: loaded from: classes.dex */
public class ServerSideEncryptionHeaderHandler<T extends ServerSideEncryptionResult> implements HeaderHandler<T> {
    @Override // com.amazonaws.services.s3.internal.HeaderHandler
    public final void OooO00o(Object obj, HttpResponse httpResponse) {
        ServerSideEncryptionResult serverSideEncryptionResult = (ServerSideEncryptionResult) obj;
        serverSideEncryptionResult.OooO0Oo(httpResponse.f10399OooO0Oo.get("x-amz-server-side-encryption"));
        serverSideEncryptionResult.OooO0OO(httpResponse.f10399OooO0Oo.get("x-amz-server-side-encryption-customer-algorithm"));
        serverSideEncryptionResult.OooO(httpResponse.f10399OooO0Oo.get("x-amz-server-side-encryption-customer-key-MD5"));
    }
}
