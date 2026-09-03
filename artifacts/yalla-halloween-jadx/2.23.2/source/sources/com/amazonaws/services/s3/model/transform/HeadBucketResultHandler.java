package com.amazonaws.services.s3.model.transform;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.s3.internal.AbstractS3ResponseHandler;
import com.amazonaws.services.s3.model.HeadBucketResult;

/* JADX INFO: loaded from: classes2.dex */
public class HeadBucketResultHandler extends AbstractS3ResponseHandler<HeadBucketResult> {
    /* JADX WARN: Type inference failed for: r1v0, types: [T, com.amazonaws.services.s3.model.HeadBucketResult] */
    @Override // com.amazonaws.http.HttpResponseHandler
    public final Object OooO00o(HttpResponse httpResponse) throws Exception {
        AmazonWebServiceResponse amazonWebServiceResponse = new AmazonWebServiceResponse();
        ?? headBucketResult = new HeadBucketResult();
        headBucketResult.f12488OooO00o = httpResponse.f12183OooO0Oo.get("x-amz-bucket-region");
        amazonWebServiceResponse.f12055OooO00o = headBucketResult;
        return amazonWebServiceResponse;
    }
}
