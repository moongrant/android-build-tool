package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonClientException;
import com.amazonaws.retry.RetryPolicy;
import com.amazonaws.services.s3.model.AmazonS3Exception;

/* JADX INFO: loaded from: classes.dex */
public class CompleteMultipartUploadRetryCondition implements RetryPolicy.RetryCondition {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f10638OooO0O0 = 3;

    @Override // com.amazonaws.retry.RetryPolicy.RetryCondition
    public final boolean OooO00o(AmazonClientException amazonClientException, int i) {
        if (amazonClientException instanceof AmazonS3Exception) {
            AmazonS3Exception amazonS3Exception = (AmazonS3Exception) amazonClientException;
            if (((amazonS3Exception == null || amazonS3Exception.OooO0O0() == null || amazonS3Exception.f10270Oooo0oo == null || !amazonS3Exception.OooO0O0().contains("InternalError") || !amazonS3Exception.f10270Oooo0oo.contains("Please try again.")) ? false : true) && i < this.f10638OooO0O0) {
                return true;
            }
        }
        return false;
    }
}
