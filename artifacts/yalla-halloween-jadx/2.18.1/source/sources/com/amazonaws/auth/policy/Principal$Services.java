package com.amazonaws.auth.policy;

/* JADX INFO: loaded from: classes.dex */
public enum Principal$Services {
    AWSDataPipeline("datapipeline.amazonaws.com"),
    AmazonElasticTranscoder("elastictranscoder.amazonaws.com"),
    AmazonEC2("ec2.amazonaws.com"),
    AWSOpsWorks("opsworks.amazonaws.com"),
    AWSCloudHSM("cloudhsm.amazonaws.com"),
    AllServices("*");

    private String serviceId;

    Principal$Services(String str) {
        this.serviceId = str;
    }
}
