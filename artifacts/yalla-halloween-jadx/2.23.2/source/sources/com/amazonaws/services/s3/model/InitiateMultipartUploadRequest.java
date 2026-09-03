package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class InitiateMultipartUploadRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public ObjectMetadata f12489OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String f12490OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f12491OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public CannedAccessControlList f12492OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public SSEAwsKeyManagementParams f12493OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public ObjectTagging f12494OooOO0o;

    public InitiateMultipartUploadRequest(String str, String str2) {
        this.f12490OooO0oO = str;
        this.f12491OooO0oo = str2;
    }
}
