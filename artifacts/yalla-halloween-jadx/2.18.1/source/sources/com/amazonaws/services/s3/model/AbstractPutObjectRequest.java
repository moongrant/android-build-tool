package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractPutObjectRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public String f10692Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public ObjectMetadata f10693OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public File f10694OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public String f10695OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public transient InputStream f10696OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public CannedAccessControlList f10697OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public String f10698OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public String f10699OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public SSEAwsKeyManagementParams f10700OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public ObjectTagging f10701OoooOoO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public AccessControlList f10702o000oOoO;

    public AbstractPutObjectRequest(String str, String str2, File file) {
        this.f10692Oooo = str;
        this.f10695OoooO00 = str2;
        this.f10694OoooO0 = file;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends AbstractPutObjectRequest> T OooO(InputStream inputStream) {
        this.f10696OoooO0O = inputStream;
        return this;
    }

    @Override // com.amazonaws.AmazonWebServiceRequest
    public AbstractPutObjectRequest clone() {
        return (AbstractPutObjectRequest) super.clone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends AbstractPutObjectRequest> T OooO0o(AccessControlList accessControlList) {
        this.f10702o000oOoO = accessControlList;
        return this;
    }

    public final <T extends AbstractPutObjectRequest> T OooO0o0(T t) {
        t.f10272Oooo0o = this.f10272Oooo0o;
        t.f10274Oooo0oo = this.f10274Oooo0oo;
        ObjectMetadata objectMetadata = this.f10693OoooO;
        return (T) t.OooO0o(this.f10702o000oOoO).OooO0oO(this.f10697OoooOO0).OooO(this.f10696OoooO0O).OooOO0(objectMetadata != null ? new ObjectMetadata(objectMetadata) : null).OooOO0O(this.f10699OoooOOo).OooOOO(this.f10698OoooOOO).OooOO0o(this.f10700OoooOo0).OooOOO0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends AbstractPutObjectRequest> T OooO0oO(CannedAccessControlList cannedAccessControlList) {
        this.f10697OoooOO0 = cannedAccessControlList;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends AbstractPutObjectRequest> T OooOO0(ObjectMetadata objectMetadata) {
        this.f10693OoooO = objectMetadata;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends AbstractPutObjectRequest> T OooOO0O(String str) {
        this.f10699OoooOOo = str;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends AbstractPutObjectRequest> T OooOO0o(SSEAwsKeyManagementParams sSEAwsKeyManagementParams) {
        this.f10700OoooOo0 = sSEAwsKeyManagementParams;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends AbstractPutObjectRequest> T OooOOO(String str) {
        this.f10698OoooOOO = str;
        return this;
    }

    public AbstractPutObjectRequest OooOOO0() {
        return this;
    }

    public AbstractPutObjectRequest(String str, String str2, InputStream inputStream, ObjectMetadata objectMetadata) {
        this.f10692Oooo = str;
        this.f10695OoooO00 = str2;
        this.f10696OoooO0O = inputStream;
        this.f10693OoooO = objectMetadata;
    }
}
