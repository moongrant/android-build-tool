package com.amazonaws.services.s3.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import p386o0OOoo0O.o000OOo0;

/* JADX INFO: loaded from: classes.dex */
public class BucketNotificationConfiguration implements Serializable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Map<String, NotificationConfiguration> f10732Oooo0o;

    @Deprecated
    public static class TopicConfiguration extends com.amazonaws.services.s3.model.TopicConfiguration {
        public final String toString() {
            return new o000OOo0().OooO0oo(this);
        }
    }

    public BucketNotificationConfiguration() {
        this.f10732Oooo0o = null;
        this.f10732Oooo0o = new HashMap();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.amazonaws.services.s3.model.NotificationConfiguration>] */
    public final BucketNotificationConfiguration OooO00o(String str, NotificationConfiguration notificationConfiguration) {
        this.f10732Oooo0o.put(str, notificationConfiguration);
        return this;
    }

    public final String toString() {
        return new o000OOo0().OooO0oo(this.f10732Oooo0o);
    }
}
