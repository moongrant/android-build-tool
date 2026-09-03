package com.amazonaws.services.s3.model;

import OooO00o.OooO00o;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class S3ObjectSummary {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f10904OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f10905OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public String f10906OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f10907OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public String f10908OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Date f10909OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Owner f10910OooO0oO;

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("S3ObjectSummary{bucketName='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.f10904OooO00o, '\'', ", key='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.f10905OooO0O0, '\'', ", eTag='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.f10906OooO0OO, '\'', ", size=");
        sbOooO0o0.append(this.f10907OooO0Oo);
        sbOooO0o0.append(", lastModified=");
        sbOooO0o0.append(this.f10909OooO0o0);
        sbOooO0o0.append(", storageClass='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.f10908OooO0o, '\'', ", owner=");
        sbOooO0o0.append(this.f10910OooO0oO);
        sbOooO0o0.append('}');
        return sbOooO0o0.toString();
    }
}
