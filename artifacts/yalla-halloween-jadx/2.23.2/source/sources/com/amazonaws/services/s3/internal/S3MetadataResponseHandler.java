package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.s3.model.ObjectMetadata;

/* JADX INFO: loaded from: classes2.dex */
public class S3MetadataResponseHandler extends AbstractS3ResponseHandler<ObjectMetadata> {
    /* JADX WARN: Type inference failed for: r0v0, types: [T, com.amazonaws.services.s3.model.ObjectMetadata] */
    @Override // com.amazonaws.http.HttpResponseHandler
    public final Object OooO00o(HttpResponse httpResponse) throws Exception {
        ?? objectMetadata = new ObjectMetadata();
        AbstractS3ResponseHandler.OooO0Oo(httpResponse, objectMetadata);
        AmazonWebServiceResponse amazonWebServiceResponseOooO0OO = AbstractS3ResponseHandler.OooO0OO(httpResponse);
        amazonWebServiceResponseOooO0OO.f12055OooO00o = objectMetadata;
        return amazonWebServiceResponseOooO0OO;
    }
}
