package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonClientException;
import com.amazonaws.retry.RetryPolicy;
import com.amazonaws.services.s3.model.AmazonS3Exception;

/* JADX INFO: loaded from: classes2.dex */
public class CompleteMultipartUploadRetryCondition implements RetryPolicy.RetryCondition {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f12396OooO0O0 = 3;

    @Override // com.amazonaws.retry.RetryPolicy.RetryCondition
    public final boolean OooO00o(AmazonClientException amazonClientException, int i) {
        if (!(amazonClientException instanceof AmazonS3Exception)) {
            return false;
        }
        AmazonS3Exception amazonS3Exception = (AmazonS3Exception) amazonClientException;
        return (amazonS3Exception != null && amazonS3Exception.OooO00o() != null && amazonS3Exception.f12039OooO0o != null && amazonS3Exception.OooO00o().contains("InternalError") && amazonS3Exception.f12039OooO0o.contains("Please try again.")) && i < this.f12396OooO0O0;
    }
}
