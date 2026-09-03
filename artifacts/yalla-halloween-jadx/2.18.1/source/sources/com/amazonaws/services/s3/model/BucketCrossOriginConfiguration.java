package com.amazonaws.services.s3.model;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class BucketCrossOriginConfiguration implements Serializable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public List<CORSRule> f10712Oooo0o;

    public BucketCrossOriginConfiguration(List<CORSRule> list) {
        this.f10712Oooo0o = list;
    }

    public BucketCrossOriginConfiguration() {
    }
}
