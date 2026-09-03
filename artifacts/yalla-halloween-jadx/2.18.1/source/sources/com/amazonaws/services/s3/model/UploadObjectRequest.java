package com.amazonaws.services.s3.model;

import java.util.HashMap;
import java.util.Map;
import o00O.OooO00o;

/* JADX INFO: loaded from: classes.dex */
public class UploadObjectRequest extends AbstractPutObjectRequest {

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public ObjectMetadata f10943OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public Map<String, String> f10944Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public long f10945Ooooo0o;

    @Override // com.amazonaws.services.s3.model.AbstractPutObjectRequest, com.amazonaws.AmazonWebServiceRequest
    /* JADX INFO: renamed from: OooOOOO, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final UploadObjectRequest clone() {
        UploadObjectRequest uploadObjectRequest = (UploadObjectRequest) super.clone();
        OooO0o0(uploadObjectRequest);
        Map<String, String> map = this.f10944Ooooo00;
        ObjectMetadata objectMetadata = this.f10943OoooOoo;
        HashMap map2 = map == null ? null : new HashMap(map);
        uploadObjectRequest.f10944Ooooo00 = map2 == null ? null : OooO00o.OooO00o(map2);
        long j = this.f10945Ooooo0o;
        if (j < 5242880) {
            throw new IllegalArgumentException("partSize must be at least 5242880");
        }
        uploadObjectRequest.f10945Ooooo0o = j;
        uploadObjectRequest.f10943OoooOoo = objectMetadata != null ? new ObjectMetadata(objectMetadata) : null;
        return uploadObjectRequest;
    }
}
