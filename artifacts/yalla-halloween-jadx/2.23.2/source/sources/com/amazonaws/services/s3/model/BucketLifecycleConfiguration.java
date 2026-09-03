package com.amazonaws.services.s3.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class BucketLifecycleConfiguration implements Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<Rule> f12460OooO0Oo;

    public static class NoncurrentVersionTransition implements Serializable {
    }

    public static class Rule implements Serializable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public ArrayList f12461OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public ArrayList f12462OooO0o0;
    }

    public static class Transition implements Serializable {
    }

    public BucketLifecycleConfiguration(ArrayList arrayList) {
        this.f12460OooO0Oo = arrayList;
    }

    public BucketLifecycleConfiguration() {
    }
}
