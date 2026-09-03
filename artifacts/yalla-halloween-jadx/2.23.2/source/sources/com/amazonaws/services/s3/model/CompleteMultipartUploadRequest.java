package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class CompleteMultipartUploadRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final String f12474OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String f12475OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f12476OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final List<PartETag> f12477OooOO0;

    public CompleteMultipartUploadRequest() {
        this.f12477OooOO0 = new ArrayList();
    }

    public CompleteMultipartUploadRequest(String str, String str2, String str3, ArrayList arrayList) {
        this.f12477OooOO0 = new ArrayList();
        this.f12475OooO0oO = str;
        this.f12476OooO0oo = str2;
        this.f12474OooO = str3;
        this.f12477OooOO0 = arrayList;
    }
}
