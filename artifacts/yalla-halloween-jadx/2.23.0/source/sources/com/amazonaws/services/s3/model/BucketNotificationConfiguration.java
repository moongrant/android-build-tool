package com.amazonaws.services.s3.model;

import com.google.gson.OooOOO0;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class BucketNotificationConfiguration implements Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final HashMap f9375OooO0Oo;

    @Deprecated
    public static class TopicConfiguration extends com.amazonaws.services.s3.model.TopicConfiguration {
        public final String toString() {
            return new OooOOO0().OooO0oo(this);
        }
    }

    public BucketNotificationConfiguration() {
        this.f9375OooO0Oo = null;
        this.f9375OooO0Oo = new HashMap();
    }

    public final String toString() {
        return new OooOOO0().OooO0oo(this.f9375OooO0Oo);
    }
}
