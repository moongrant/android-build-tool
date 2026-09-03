package com.amazonaws.services.s3.model;

import androidx.compose.material.OooO;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class UploadObjectRequest extends AbstractPutObjectRequest {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public ObjectMetadata f9441OooOOo;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public Map<String, String> f9442OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public long f9443OooOo00;

    @Override // com.amazonaws.services.s3.model.AbstractPutObjectRequest, com.amazonaws.AmazonWebServiceRequest
    /* JADX INFO: renamed from: OooOOO, reason: merged with bridge method [inline-methods] */
    public final UploadObjectRequest clone() {
        UploadObjectRequest uploadObjectRequest = (UploadObjectRequest) super.clone();
        OooO0o0(uploadObjectRequest);
        Map<String, String> map = this.f9442OooOOoo;
        ObjectMetadata objectMetadata = this.f9441OooOOo;
        HashMap map2 = map == null ? null : new HashMap(map);
        uploadObjectRequest.f9442OooOOoo = map2 == null ? null : OooO.OooO0O0(map2);
        long j = this.f9443OooOo00;
        if (j < 5242880) {
            throw new IllegalArgumentException("partSize must be at least 5242880");
        }
        uploadObjectRequest.f9443OooOo00 = j;
        uploadObjectRequest.f9441OooOOo = objectMetadata != null ? new ObjectMetadata(objectMetadata) : null;
        return uploadObjectRequest;
    }
}
