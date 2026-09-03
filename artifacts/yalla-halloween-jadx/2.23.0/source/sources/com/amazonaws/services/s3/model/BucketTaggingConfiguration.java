package com.amazonaws.services.s3.model;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class BucketTaggingConfiguration implements Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList f9377OooO0Oo;

    public BucketTaggingConfiguration() {
        this.f9377OooO0Oo = null;
        this.f9377OooO0Oo = new ArrayList(1);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("{");
        stringBuffer.append("TagSets: " + this.f9377OooO0Oo);
        stringBuffer.append("}");
        return stringBuffer.toString();
    }
}
