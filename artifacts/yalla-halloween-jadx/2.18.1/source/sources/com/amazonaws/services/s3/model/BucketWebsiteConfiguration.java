package com.amazonaws.services.s3.model;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class BucketWebsiteConfiguration implements Serializable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public List<RoutingRule> f10737Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public String f10738Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public String f10739Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public RedirectRule f10740Oooo0oo;

    public BucketWebsiteConfiguration() {
        this.f10737Oooo = new LinkedList();
    }

    public BucketWebsiteConfiguration(String str) {
        this.f10737Oooo = new LinkedList();
        this.f10738Oooo0o = null;
    }
}
