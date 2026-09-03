package com.amazonaws.services.s3.model;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import o00OOOO0.OooO00o;

/* JADX INFO: loaded from: classes2.dex */
public class UploadObjectRequest extends AbstractPutObjectRequest {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public ObjectMetadata f12531OooOOo;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public Map<String, String> f12532OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public transient ExecutorService f12533OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public long f12534OooOo00;

    @Override // com.amazonaws.services.s3.model.AbstractPutObjectRequest, com.amazonaws.AmazonWebServiceRequest
    /* JADX INFO: renamed from: OooOOO, reason: merged with bridge method [inline-methods] */
    public final UploadObjectRequest clone() {
        UploadObjectRequest uploadObjectRequest = (UploadObjectRequest) super.clone();
        OooO0o0(uploadObjectRequest);
        Map<String, String> map = this.f12532OooOOoo;
        ObjectMetadata objectMetadata = this.f12531OooOOo;
        HashMap map2 = map == null ? null : new HashMap(map);
        uploadObjectRequest.f12532OooOOoo = map2 == null ? null : OooO00o.OooO00o(map2);
        uploadObjectRequest.f12533OooOo0 = this.f12533OooOo0;
        long j = this.f12534OooOo00;
        if (j < 5242880) {
            throw new IllegalArgumentException("partSize must be at least 5242880");
        }
        uploadObjectRequest.f12534OooOo00 = j;
        uploadObjectRequest.f12531OooOOo = objectMetadata != null ? new ObjectMetadata(objectMetadata) : null;
        return uploadObjectRequest;
    }
}
