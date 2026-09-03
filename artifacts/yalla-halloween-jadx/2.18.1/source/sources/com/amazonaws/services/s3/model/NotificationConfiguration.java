package com.amazonaws.services.s3.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class NotificationConfiguration {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Set<String> f10853Oooo0o = new HashSet();

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Filter f10854Oooo0oO;

    public NotificationConfiguration() {
        new ArrayList();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    public NotificationConfiguration(String... strArr) {
        new ArrayList();
        if (strArr != null) {
            for (String str : strArr) {
                this.f10853Oooo0o.add(str);
            }
        }
    }
}
