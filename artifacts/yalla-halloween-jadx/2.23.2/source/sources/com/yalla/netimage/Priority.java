package com.yalla.netimage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
@Retention(RetentionPolicy.SOURCE)
public @interface Priority {
    public static final int HIGH = 2;
    public static final int IMMEDIATE = 1;
    public static final int LOW = 4;
    public static final int NORMAL = 3;
}
