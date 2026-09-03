package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class AbortMultipartUploadRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final String f9347OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String f9348OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f9349OooO0oo;

    public AbortMultipartUploadRequest(String str, String str2, String str3) {
        this.f9348OooO0oO = str;
        this.f9349OooO0oo = str2;
        this.f9347OooO = str3;
    }
}
