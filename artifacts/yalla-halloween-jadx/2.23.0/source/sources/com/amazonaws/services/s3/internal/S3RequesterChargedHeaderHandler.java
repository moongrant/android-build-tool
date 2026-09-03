package com.amazonaws.services.s3.internal;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.s3.internal.S3RequesterChargedResult;

/* JADX INFO: loaded from: classes2.dex */
public class S3RequesterChargedHeaderHandler<T extends S3RequesterChargedResult> implements HeaderHandler<T> {
    @Override // com.amazonaws.services.s3.internal.HeaderHandler
    public final void OooO00o(Object obj, HttpResponse httpResponse) {
        ((S3RequesterChargedResult) obj).OooO0oO(httpResponse.f9093OooO0Oo.get("x-amz-request-charged") != null);
    }
}
