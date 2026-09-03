package com.app.base.application;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.SOURCE)
public @interface UrlType {
    public static final int BONUS = 8;
    public static final int CRYSTAL_HISTORY = 7;
    public static final int LEVEL = 2;
    public static final int LOGIN_FEEDBACK = 3;
    public static final int NULL = 0;
    public static final int PRIVILEGE = 1;
    public static final int STORE_CRYSTAL = 6;
}
