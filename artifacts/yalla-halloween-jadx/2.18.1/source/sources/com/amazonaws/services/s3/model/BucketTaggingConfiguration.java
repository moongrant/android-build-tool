package com.amazonaws.services.s3.model;

import OooO00o.OooO00o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class BucketTaggingConfiguration implements Serializable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public List<TagSet> f10735Oooo0o;

    public BucketTaggingConfiguration() {
        this.f10735Oooo0o = null;
        this.f10735Oooo0o = new ArrayList(1);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("{");
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("TagSets: ");
        sbOooO0o0.append(this.f10735Oooo0o);
        stringBuffer.append(sbOooO0o0.toString());
        stringBuffer.append("}");
        return stringBuffer.toString();
    }
}
