package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.s3.model.ObjectMetadata;

/* JADX INFO: loaded from: classes.dex */
public class S3MetadataResponseHandler extends AbstractS3ResponseHandler<ObjectMetadata> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, com.amazonaws.services.s3.model.ObjectMetadata] */
    @Override // com.amazonaws.http.HttpResponseHandler
    public final Object OooO00o(HttpResponse httpResponse) throws Exception {
        ?? objectMetadata = new ObjectMetadata();
        OooO0Oo(httpResponse, objectMetadata);
        AmazonWebServiceResponse amazonWebServiceResponseOooO0OO = OooO0OO(httpResponse);
        amazonWebServiceResponseOooO0OO.f10275OooO00o = objectMetadata;
        return amazonWebServiceResponseOooO0OO;
    }
}
