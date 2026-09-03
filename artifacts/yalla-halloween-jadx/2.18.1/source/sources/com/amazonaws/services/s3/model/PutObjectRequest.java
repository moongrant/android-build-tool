package com.amazonaws.services.s3.model;

import java.io.File;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class PutObjectRequest extends AbstractPutObjectRequest {

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public boolean f10876OoooOoo;

    public PutObjectRequest(String str, String str2, File file) {
        super(str, str2, file);
    }

    @Override // com.amazonaws.services.s3.model.AbstractPutObjectRequest
    public final AbstractPutObjectRequest OooO(InputStream inputStream) {
        this.f10696OoooO0O = inputStream;
        return this;
    }

    @Override // com.amazonaws.services.s3.model.AbstractPutObjectRequest
    public final AbstractPutObjectRequest OooO0o(AccessControlList accessControlList) {
        this.f10702o000oOoO = accessControlList;
        return this;
    }

    @Override // com.amazonaws.services.s3.model.AbstractPutObjectRequest
    public final AbstractPutObjectRequest OooO0oO(CannedAccessControlList cannedAccessControlList) {
        this.f10697OoooOO0 = cannedAccessControlList;
        return this;
    }

    @Override // com.amazonaws.services.s3.model.AbstractPutObjectRequest
    public final AbstractPutObjectRequest OooOO0(ObjectMetadata objectMetadata) {
        this.f10693OoooO = objectMetadata;
        return this;
    }

    @Override // com.amazonaws.services.s3.model.AbstractPutObjectRequest
    public final AbstractPutObjectRequest OooOO0O(String str) {
        this.f10699OoooOOo = str;
        return this;
    }

    @Override // com.amazonaws.services.s3.model.AbstractPutObjectRequest
    public final AbstractPutObjectRequest OooOO0o(SSEAwsKeyManagementParams sSEAwsKeyManagementParams) {
        this.f10700OoooOo0 = sSEAwsKeyManagementParams;
        return this;
    }

    @Override // com.amazonaws.services.s3.model.AbstractPutObjectRequest
    public final AbstractPutObjectRequest OooOOO(String str) {
        this.f10698OoooOOO = str;
        return this;
    }

    @Override // com.amazonaws.services.s3.model.AbstractPutObjectRequest
    public final AbstractPutObjectRequest OooOOO0() {
        return this;
    }

    @Override // com.amazonaws.services.s3.model.AbstractPutObjectRequest, com.amazonaws.AmazonWebServiceRequest
    /* JADX INFO: renamed from: OooOOOO, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PutObjectRequest clone() {
        return (PutObjectRequest) OooO0o0((PutObjectRequest) super.OooO0Oo());
    }

    public PutObjectRequest(String str, String str2, InputStream inputStream, ObjectMetadata objectMetadata) {
        super(str, str2, inputStream, objectMetadata);
    }
}
