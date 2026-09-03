package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.services.s3.model.analytics.AnalyticsConfiguration;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class SetBucketAnalyticsConfigurationRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public String f10914Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public AnalyticsConfiguration f10915OoooO00;

    public SetBucketAnalyticsConfigurationRequest() {
    }

    public SetBucketAnalyticsConfigurationRequest(String str, AnalyticsConfiguration analyticsConfiguration) {
        this.f10914Oooo = str;
        this.f10915OoooO00 = analyticsConfiguration;
    }
}
