package com.amazonaws.services.s3.internal;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.s3.internal.ServerSideEncryptionResult;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ServerSideEncryptionHeaderHandler<T extends ServerSideEncryptionResult> implements HeaderHandler<T> {
    @Override // com.amazonaws.services.s3.internal.HeaderHandler
    public final void OooO00o(Object obj, HttpResponse httpResponse) {
        ServerSideEncryptionResult serverSideEncryptionResult = (ServerSideEncryptionResult) obj;
        Map<String, String> map = httpResponse.f9093OooO0Oo;
        serverSideEncryptionResult.OooO0o(map.get("x-amz-server-side-encryption"));
        serverSideEncryptionResult.OooO0O0(map.get("x-amz-server-side-encryption-customer-algorithm"));
        serverSideEncryptionResult.OooO(map.get("x-amz-server-side-encryption-customer-key-MD5"));
    }
}
