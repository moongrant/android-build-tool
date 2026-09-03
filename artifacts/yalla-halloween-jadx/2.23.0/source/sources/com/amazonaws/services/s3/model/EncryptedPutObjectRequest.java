package com.amazonaws.services.s3.model;

import androidx.compose.material.OooO;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class EncryptedPutObjectRequest extends PutObjectRequest {

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public Map<String, String> f9389OooOOoo;

    @Override // com.amazonaws.services.s3.model.PutObjectRequest, com.amazonaws.services.s3.model.AbstractPutObjectRequest, com.amazonaws.AmazonWebServiceRequest
    /* JADX INFO: renamed from: OooOOOO, reason: merged with bridge method [inline-methods] */
    public final EncryptedPutObjectRequest clone() {
        EncryptedPutObjectRequest encryptedPutObjectRequest = new EncryptedPutObjectRequest(this.f9351OooO0oO, this.f9352OooO0oo, this.f9350OooO);
        OooO0o0(encryptedPutObjectRequest);
        Map<String, String> map = this.f9389OooOOoo;
        HashMap map2 = map == null ? null : new HashMap(map);
        encryptedPutObjectRequest.f9389OooOOoo = map2 != null ? OooO.OooO0O0(map2) : null;
        return encryptedPutObjectRequest;
    }
}
