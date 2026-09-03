package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;

/* JADX INFO: loaded from: classes.dex */
public class CreateBucketRequest extends AmazonWebServiceRequest implements S3AccelerateUnsupported {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public String f10768Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public String f10769OoooO00;

    public CreateBucketRequest(String str) {
        String string = Region.US_Standard.toString();
        this.f10768Oooo = str;
        this.f10769OoooO00 = string;
    }

    public CreateBucketRequest(String str, Region region) {
        String string = region.toString();
        this.f10768Oooo = str;
        this.f10769OoooO00 = string;
    }

    public CreateBucketRequest(String str, String str2) {
        this.f10768Oooo = str;
        this.f10769OoooO00 = str2;
    }
}
