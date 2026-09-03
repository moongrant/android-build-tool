package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class CompleteMultipartUploadRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final String f9384OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String f9385OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f9386OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final List<PartETag> f9387OooOO0;

    public CompleteMultipartUploadRequest() {
        this.f9387OooOO0 = new ArrayList();
    }

    public CompleteMultipartUploadRequest(String str, String str2, String str3, ArrayList arrayList) {
        this.f9387OooOO0 = new ArrayList();
        this.f9385OooO0oO = str;
        this.f9386OooO0oo = str2;
        this.f9384OooO = str3;
        this.f9387OooOO0 = arrayList;
    }
}
