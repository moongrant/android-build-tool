package com.amazonaws.services.s3.internal;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.s3.internal.S3VersionResult;

/* JADX INFO: loaded from: classes.dex */
public class S3VersionHeaderHandler<T extends S3VersionResult> implements HeaderHandler<T> {
    @Override // com.amazonaws.services.s3.internal.HeaderHandler
    public final void OooO00o(Object obj, HttpResponse httpResponse) {
        ((S3VersionResult) obj).OooO00o(httpResponse.f10399OooO0Oo.get("x-amz-version-id"));
    }
}
