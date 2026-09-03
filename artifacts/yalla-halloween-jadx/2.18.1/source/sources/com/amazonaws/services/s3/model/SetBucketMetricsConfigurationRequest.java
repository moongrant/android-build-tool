package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.services.s3.model.metrics.MetricsConfiguration;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class SetBucketMetricsConfigurationRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public String f10922Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public MetricsConfiguration f10923OoooO00;

    public SetBucketMetricsConfigurationRequest() {
    }

    public SetBucketMetricsConfigurationRequest(String str, MetricsConfiguration metricsConfiguration) {
        this.f10922Oooo = str;
        this.f10923OoooO00 = metricsConfiguration;
    }
}
