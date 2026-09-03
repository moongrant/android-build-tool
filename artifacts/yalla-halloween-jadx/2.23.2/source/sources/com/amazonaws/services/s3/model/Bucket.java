package com.amazonaws.services.s3.model;

import java.io.Serializable;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public class Bucket implements Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f12456OooO0Oo = null;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Owner f12458OooO0o0 = null;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Date f12457OooO0o = null;

    public final String toString() {
        return "S3Bucket [name=" + this.f12456OooO0Oo + ", creationDate=" + this.f12457OooO0o + ", owner=" + this.f12458OooO0o0 + "]";
    }
}
