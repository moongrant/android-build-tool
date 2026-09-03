package com.amazonaws.services.s3.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class CloudFunctionConfiguration extends NotificationConfiguration implements Serializable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final String f10748Oooo;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final String f10749Oooo0oo;

    public CloudFunctionConfiguration(String str, String str2, String... strArr) {
        super(strArr);
        this.f10749Oooo0oo = str;
        this.f10748Oooo = str2;
    }
}
