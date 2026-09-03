package com.amazonaws.services.s3.model;

import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class PutObjectRequest extends AbstractPutObjectRequest {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f9423OooOOo;

    @Override // com.amazonaws.services.s3.model.AbstractPutObjectRequest
    public final AbstractPutObjectRequest OooO(ObjectMetadata objectMetadata) {
        this.f9354OooOO0O = objectMetadata;
        return this;
    }

    @Override // com.amazonaws.services.s3.model.AbstractPutObjectRequest
    public final AbstractPutObjectRequest OooO0o(AccessControlList accessControlList) {
        this.f9357OooOOO0 = accessControlList;
        return this;
    }

    @Override // com.amazonaws.services.s3.model.AbstractPutObjectRequest
    public final AbstractPutObjectRequest OooO0oO(CannedAccessControlList cannedAccessControlList) {
        this.f9355OooOO0o = cannedAccessControlList;
        return this;
    }

    @Override // com.amazonaws.services.s3.model.AbstractPutObjectRequest
    public final AbstractPutObjectRequest OooO0oo(InputStream inputStream) {
        this.f9353OooOO0 = inputStream;
        return this;
    }

    @Override // com.amazonaws.services.s3.model.AbstractPutObjectRequest
    public final AbstractPutObjectRequest OooOO0(String str) {
        this.f9358OooOOOO = str;
        return this;
    }

    @Override // com.amazonaws.services.s3.model.AbstractPutObjectRequest
    public final AbstractPutObjectRequest OooOO0O(SSEAwsKeyManagementParams sSEAwsKeyManagementParams) {
        this.f9359OooOOOo = sSEAwsKeyManagementParams;
        return this;
    }

    @Override // com.amazonaws.services.s3.model.AbstractPutObjectRequest
    public final AbstractPutObjectRequest OooOO0o() {
        return this;
    }

    @Override // com.amazonaws.services.s3.model.AbstractPutObjectRequest, com.amazonaws.AmazonWebServiceRequest
    /* JADX INFO: renamed from: OooOOO, reason: merged with bridge method [inline-methods] */
    public PutObjectRequest clone() {
        return (PutObjectRequest) OooO0o0((PutObjectRequest) super.clone());
    }

    @Override // com.amazonaws.services.s3.model.AbstractPutObjectRequest
    public final AbstractPutObjectRequest OooOOO0(String str) {
        this.f9356OooOOO = str;
        return this;
    }
}
