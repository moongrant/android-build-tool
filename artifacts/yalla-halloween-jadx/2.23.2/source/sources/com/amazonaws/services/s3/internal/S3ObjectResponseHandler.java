package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class S3ObjectResponseHandler extends AbstractS3ResponseHandler<S3Object> {
    /* JADX WARN: Type inference failed for: r0v0, types: [T, com.amazonaws.services.s3.model.S3Object] */
    @Override // com.amazonaws.http.HttpResponseHandler
    public final Object OooO00o(HttpResponse httpResponse) throws Exception {
        ?? s3Object = new S3Object();
        AmazonWebServiceResponse amazonWebServiceResponseOooO0OO = AbstractS3ResponseHandler.OooO0OO(httpResponse);
        Map<String, String> map = httpResponse.f12183OooO0Oo;
        if (map.get("x-amz-website-redirect-location") != null) {
            map.get("x-amz-website-redirect-location");
        }
        map.get("x-amz-request-charged");
        if (map.get("x-amz-tagging-count") != null) {
            Integer.parseInt(map.get("x-amz-tagging-count"));
        }
        AbstractS3ResponseHandler.OooO0Oo(httpResponse, s3Object.f12515OooO0o);
        s3Object.f12517OooO0oO = new S3ObjectInputStream(httpResponse.OooO00o());
        amazonWebServiceResponseOooO0OO.f12055OooO00o = s3Object;
        return amazonWebServiceResponseOooO0OO;
    }
}
