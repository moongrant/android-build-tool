package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractPutObjectRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final File f9350OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String f9351OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f9352OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public transient InputStream f9353OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public ObjectMetadata f9354OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public CannedAccessControlList f9355OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public String f9356OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public AccessControlList f9357OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public String f9358OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public SSEAwsKeyManagementParams f9359OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public ObjectTagging f9360OooOOo0;

    public AbstractPutObjectRequest(String str, String str2, File file) {
        this.f9351OooO0oO = str;
        this.f9352OooO0oo = str2;
        this.f9350OooO = file;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends AbstractPutObjectRequest> T OooO(ObjectMetadata objectMetadata) {
        this.f9354OooOO0O = objectMetadata;
        return this;
    }

    @Override // com.amazonaws.AmazonWebServiceRequest
    /* JADX INFO: renamed from: OooO0Oo, reason: merged with bridge method [inline-methods] */
    public AbstractPutObjectRequest clone() {
        return (AbstractPutObjectRequest) super.clone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends AbstractPutObjectRequest> T OooO0o(AccessControlList accessControlList) {
        this.f9357OooOOO0 = accessControlList;
        return this;
    }

    public final <T extends AbstractPutObjectRequest> T OooO0o0(T t) {
        t.f8962OooO0Oo = this.f8962OooO0Oo;
        t.f8963OooO0o = this.f8963OooO0o;
        ObjectMetadata objectMetadata = this.f9354OooOO0O;
        return (T) t.OooO0o(this.f9357OooOOO0).OooO0oO(this.f9355OooOO0o).OooO0oo(this.f9353OooOO0).OooO(objectMetadata == null ? null : new ObjectMetadata(objectMetadata)).OooOO0(this.f9358OooOOOO).OooOOO0(this.f9356OooOOO).OooOO0O(this.f9359OooOOOo).OooOO0o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends AbstractPutObjectRequest> T OooO0oO(CannedAccessControlList cannedAccessControlList) {
        this.f9355OooOO0o = cannedAccessControlList;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends AbstractPutObjectRequest> T OooO0oo(InputStream inputStream) {
        this.f9353OooOO0 = inputStream;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends AbstractPutObjectRequest> T OooOO0(String str) {
        this.f9358OooOOOO = str;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends AbstractPutObjectRequest> T OooOO0O(SSEAwsKeyManagementParams sSEAwsKeyManagementParams) {
        this.f9359OooOOOo = sSEAwsKeyManagementParams;
        return this;
    }

    public AbstractPutObjectRequest OooOO0o() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends AbstractPutObjectRequest> T OooOOO0(String str) {
        this.f9356OooOOO = str;
        return this;
    }

    public AbstractPutObjectRequest(String str, String str2, FileInputStream fileInputStream, ObjectMetadata objectMetadata) {
        this.f9351OooO0oO = str;
        this.f9352OooO0oo = str2;
        this.f9353OooOO0 = fileInputStream;
        this.f9354OooOO0O = objectMetadata;
    }
}
