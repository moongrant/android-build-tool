package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;

/* JADX INFO: loaded from: classes.dex */
public class SetBucketAccelerateConfigurationRequest extends AmazonWebServiceRequest implements S3AccelerateUnsupported {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public String f10912Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public BucketAccelerateConfiguration f10913OoooO00;

    public SetBucketAccelerateConfigurationRequest(String str, BucketAccelerateConfiguration bucketAccelerateConfiguration) {
        this.f10912Oooo = str;
        this.f10913OoooO00 = bucketAccelerateConfiguration;
    }
}
