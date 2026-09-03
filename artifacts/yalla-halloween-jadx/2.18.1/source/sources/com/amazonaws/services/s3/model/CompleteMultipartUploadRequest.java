package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class CompleteMultipartUploadRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public String f10750Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public String f10751OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public String f10752OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public List<PartETag> f10753OoooO0O;

    public CompleteMultipartUploadRequest() {
        this.f10753OoooO0O = new ArrayList();
    }

    public CompleteMultipartUploadRequest(String str, String str2, String str3, List<PartETag> list) {
        new ArrayList();
        this.f10750Oooo = str;
        this.f10752OoooO00 = str2;
        this.f10751OoooO0 = str3;
        this.f10753OoooO0O = list;
    }
}
