package com.amazonaws.services.s3.model;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class S3KeyFilter implements Serializable {

    public enum FilterRuleName {
        Prefix,
        Suffix
    }

    public S3KeyFilter() {
        new ArrayList();
    }
}
