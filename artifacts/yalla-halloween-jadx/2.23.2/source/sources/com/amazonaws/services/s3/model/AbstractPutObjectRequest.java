package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractPutObjectRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final File f12440OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String f12441OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f12442OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public transient InputStream f12443OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public ObjectMetadata f12444OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public CannedAccessControlList f12445OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public String f12446OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public AccessControlList f12447OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public String f12448OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public SSEAwsKeyManagementParams f12449OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public ObjectTagging f12450OooOOo0;

    public AbstractPutObjectRequest(String str, String str2, File file) {
        this.f12441OooO0oO = str;
        this.f12442OooO0oo = str2;
        this.f12440OooO = file;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends AbstractPutObjectRequest> T OooO(ObjectMetadata objectMetadata) {
        this.f12444OooOO0O = objectMetadata;
        return this;
    }

    @Override // com.amazonaws.AmazonWebServiceRequest
    /* JADX INFO: renamed from: OooO0Oo, reason: merged with bridge method [inline-methods] */
    public AbstractPutObjectRequest clone() {
        return (AbstractPutObjectRequest) super.clone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends AbstractPutObjectRequest> T OooO0o(AccessControlList accessControlList) {
        this.f12447OooOOO0 = accessControlList;
        return this;
    }

    public final <T extends AbstractPutObjectRequest> T OooO0o0(T t) {
        t.f12052OooO0Oo = this.f12052OooO0Oo;
        t.f12053OooO0o = this.f12053OooO0o;
        ObjectMetadata objectMetadata = this.f12444OooOO0O;
        return (T) t.OooO0o(this.f12447OooOOO0).OooO0oO(this.f12445OooOO0o).OooO0oo(this.f12443OooOO0).OooO(objectMetadata == null ? null : new ObjectMetadata(objectMetadata)).OooOO0(this.f12448OooOOOO).OooOOO0(this.f12446OooOOO).OooOO0O(this.f12449OooOOOo).OooOO0o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends AbstractPutObjectRequest> T OooO0oO(CannedAccessControlList cannedAccessControlList) {
        this.f12445OooOO0o = cannedAccessControlList;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends AbstractPutObjectRequest> T OooO0oo(InputStream inputStream) {
        this.f12443OooOO0 = inputStream;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends AbstractPutObjectRequest> T OooOO0(String str) {
        this.f12448OooOOOO = str;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends AbstractPutObjectRequest> T OooOO0O(SSEAwsKeyManagementParams sSEAwsKeyManagementParams) {
        this.f12449OooOOOo = sSEAwsKeyManagementParams;
        return this;
    }

    public AbstractPutObjectRequest OooOO0o() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends AbstractPutObjectRequest> T OooOOO0(String str) {
        this.f12446OooOOO = str;
        return this;
    }

    public AbstractPutObjectRequest(String str, String str2, FileInputStream fileInputStream, ObjectMetadata objectMetadata) {
        this.f12441OooO0oO = str;
        this.f12442OooO0oo = str2;
        this.f12443OooOO0 = fileInputStream;
        this.f12444OooOO0O = objectMetadata;
    }
}
