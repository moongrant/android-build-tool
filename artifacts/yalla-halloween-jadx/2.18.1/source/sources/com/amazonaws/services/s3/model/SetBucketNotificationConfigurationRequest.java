package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;

/* JADX INFO: loaded from: classes.dex */
public class SetBucketNotificationConfigurationRequest extends AmazonWebServiceRequest {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public BucketNotificationConfiguration f10924Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public String f10925OoooO00;

    public SetBucketNotificationConfigurationRequest(String str, BucketNotificationConfiguration bucketNotificationConfiguration) {
        this.f10925OoooO00 = str;
        this.f10924Oooo = bucketNotificationConfiguration;
    }
}
