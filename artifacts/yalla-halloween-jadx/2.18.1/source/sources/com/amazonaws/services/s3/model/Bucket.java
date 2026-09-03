package com.amazonaws.services.s3.model;

import OooO00o.OooO00o;
import java.io.Serializable;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class Bucket implements Serializable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public String f10708Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Owner f10709Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public Date f10710Oooo0oo;

    public Bucket() {
        this.f10708Oooo0o = null;
        this.f10709Oooo0oO = null;
        this.f10710Oooo0oo = null;
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("S3Bucket [name=");
        sbOooO0o0.append(this.f10708Oooo0o);
        sbOooO0o0.append(", creationDate=");
        sbOooO0o0.append(this.f10710Oooo0oo);
        sbOooO0o0.append(", owner=");
        sbOooO0o0.append(this.f10709Oooo0oO);
        sbOooO0o0.append("]");
        return sbOooO0o0.toString();
    }

    public Bucket(String str) {
        this.f10709Oooo0oO = null;
        this.f10710Oooo0oo = null;
        this.f10708Oooo0o = str;
    }
}
