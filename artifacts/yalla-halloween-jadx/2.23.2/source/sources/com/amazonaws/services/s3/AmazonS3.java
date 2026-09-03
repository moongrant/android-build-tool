package com.amazonaws.services.s3;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadResult;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadResult;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.model.UploadPartResult;

/* JADX INFO: loaded from: classes2.dex */
public interface AmazonS3 {
    CompleteMultipartUploadResult OooO00o(CompleteMultipartUploadRequest completeMultipartUploadRequest) throws AmazonClientException;

    InitiateMultipartUploadResult OooO0O0(InitiateMultipartUploadRequest initiateMultipartUploadRequest) throws AmazonClientException;

    S3Object OooO0OO(GetObjectRequest getObjectRequest) throws AmazonClientException;

    UploadPartResult OooO0Oo(UploadPartRequest uploadPartRequest) throws AmazonClientException;

    PutObjectResult OooO0o(PutObjectRequest putObjectRequest) throws AmazonClientException;

    void OooO0o0(AbortMultipartUploadRequest abortMultipartUploadRequest) throws AmazonClientException;
}
