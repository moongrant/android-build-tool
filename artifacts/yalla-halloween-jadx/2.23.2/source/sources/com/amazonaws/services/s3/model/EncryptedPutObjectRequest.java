package com.amazonaws.services.s3.model;

import java.util.HashMap;
import java.util.Map;
import o00OOOO0.OooO00o;

/* JADX INFO: loaded from: classes2.dex */
public class EncryptedPutObjectRequest extends PutObjectRequest {

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public Map<String, String> f12479OooOOoo;

    @Override // com.amazonaws.services.s3.model.PutObjectRequest, com.amazonaws.services.s3.model.AbstractPutObjectRequest, com.amazonaws.AmazonWebServiceRequest
    /* JADX INFO: renamed from: OooOOOO, reason: merged with bridge method [inline-methods] */
    public final EncryptedPutObjectRequest clone() {
        EncryptedPutObjectRequest encryptedPutObjectRequest = new EncryptedPutObjectRequest(this.f12441OooO0oO, this.f12442OooO0oo, this.f12440OooO);
        OooO0o0(encryptedPutObjectRequest);
        Map<String, String> map = this.f12479OooOOoo;
        HashMap map2 = map == null ? null : new HashMap(map);
        encryptedPutObjectRequest.f12479OooOOoo = map2 != null ? OooO00o.OooO00o(map2) : null;
        return encryptedPutObjectRequest;
    }
}
