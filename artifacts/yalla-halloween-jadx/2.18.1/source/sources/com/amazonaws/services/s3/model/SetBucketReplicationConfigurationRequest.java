package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;

/* JADX INFO: loaded from: classes.dex */
public class SetBucketReplicationConfigurationRequest extends AmazonWebServiceRequest {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public String f10926Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public BucketReplicationConfiguration f10927OoooO00;

    public SetBucketReplicationConfigurationRequest(String str, BucketReplicationConfiguration bucketReplicationConfiguration) {
        this.f10926Oooo = str;
        this.f10927OoooO00 = bucketReplicationConfiguration;
    }
}
