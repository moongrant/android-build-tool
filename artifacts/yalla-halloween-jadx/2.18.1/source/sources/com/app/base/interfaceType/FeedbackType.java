package com.app.base.interfaceType;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.SOURCE)
public @interface FeedbackType {
    public static final String AppProblems = "1";
    public static final String Others = "5";
    public static final String Recharge = "3";
    public static final String Suggestions = "2";
}
