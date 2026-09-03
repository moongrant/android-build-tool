package com.amazonaws.services.s3.model;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import o00O.OooO00o;

/* JADX INFO: loaded from: classes.dex */
public class EncryptedPutObjectRequest extends PutObjectRequest {

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public Map<String, String> f10784Ooooo00;

    public EncryptedPutObjectRequest(String str, String str2, File file) {
        super(str, str2, file);
    }

    @Override // com.amazonaws.services.s3.model.PutObjectRequest, com.amazonaws.services.s3.model.AbstractPutObjectRequest, com.amazonaws.AmazonWebServiceRequest
    /* JADX INFO: renamed from: OooOOOo, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final EncryptedPutObjectRequest clone() {
        EncryptedPutObjectRequest encryptedPutObjectRequest = new EncryptedPutObjectRequest(this.f10692Oooo, this.f10695OoooO00, this.f10694OoooO0);
        OooO0o0(encryptedPutObjectRequest);
        Map<String, String> map = this.f10784Ooooo00;
        HashMap map2 = map == null ? null : new HashMap(map);
        encryptedPutObjectRequest.f10784Ooooo00 = map2 != null ? OooO00o.OooO00o(map2) : null;
        return encryptedPutObjectRequest;
    }
}
