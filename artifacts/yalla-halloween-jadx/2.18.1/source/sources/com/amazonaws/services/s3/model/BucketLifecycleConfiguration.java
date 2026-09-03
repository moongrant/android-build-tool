package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.model.lifecycle.LifecycleFilter;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class BucketLifecycleConfiguration implements Serializable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public List<Rule> f10713Oooo0o;

    public static class NoncurrentVersionTransition implements Serializable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f10714Oooo0o = -1;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public String f10715Oooo0oO;
    }

    public static class Rule implements Serializable {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public LifecycleFilter f10716Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public String f10717Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public String f10718Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public String f10719Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public Date f10720OoooO;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public List<Transition> f10724OoooOO0;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public AbortIncompleteMultipartUpload f10725OoooOOO;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public List<NoncurrentVersionTransition> f10726o000oOoO;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f10722OoooO00 = -1;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public boolean f10721OoooO0 = false;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public int f10723OoooO0O = -1;
    }

    public static class Transition implements Serializable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f10727Oooo0o = -1;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public Date f10728Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public String f10729Oooo0oo;
    }

    public BucketLifecycleConfiguration(List<Rule> list) {
        this.f10713Oooo0o = list;
    }

    public BucketLifecycleConfiguration() {
    }
}
