package com.amazonaws.services.s3.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class S3KeyFilter implements Serializable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public List<FilterRule> f10896Oooo0o = new ArrayList();

    public enum FilterRuleName {
        Prefix,
        Suffix
    }
}
