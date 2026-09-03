package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;

/* JADX INFO: loaded from: classes.dex */
public class S3ObjectResponseHandler extends AbstractS3ResponseHandler<S3Object> {
    /* JADX WARN: Type inference failed for: r0v0, types: [T, com.amazonaws.services.s3.model.S3Object] */
    @Override // com.amazonaws.http.HttpResponseHandler
    public final Object OooO00o(HttpResponse httpResponse) throws Exception {
        ?? s3Object = new S3Object();
        AmazonWebServiceResponse<S3Object> amazonWebServiceResponseOooO0OO = OooO0OO(httpResponse);
        if (httpResponse.f10399OooO0Oo.get("x-amz-website-redirect-location") != null) {
            httpResponse.f10399OooO0Oo.get("x-amz-website-redirect-location");
        }
        httpResponse.f10399OooO0Oo.get("x-amz-request-charged");
        if (httpResponse.f10399OooO0Oo.get("x-amz-tagging-count") != null) {
            Integer.parseInt(httpResponse.f10399OooO0Oo.get("x-amz-tagging-count"));
        }
        OooO0Oo(httpResponse, s3Object.f10900Oooo0oo);
        s3Object.f10897Oooo = new S3ObjectInputStream(httpResponse.OooO00o());
        amazonWebServiceResponseOooO0OO.f10275OooO00o = s3Object;
        return amazonWebServiceResponseOooO0OO;
    }
}
