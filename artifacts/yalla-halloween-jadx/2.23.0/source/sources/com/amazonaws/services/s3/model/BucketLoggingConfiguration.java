package com.amazonaws.services.s3.model;

import java.io.Serializable;
import p037OoooOo0.o000Oo0;

/* JADX INFO: loaded from: classes2.dex */
public class BucketLoggingConfiguration implements Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f9373OooO0Oo = null;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public String f9374OooO0o0 = null;

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoggingConfiguration enabled=");
        sb.append((this.f9373OooO0Oo == null || this.f9374OooO0o0 == null) ? false : true);
        String string = sb.toString();
        if (!((this.f9373OooO0Oo == null || this.f9374OooO0o0 == null) ? false : true)) {
            return string;
        }
        StringBuilder sbOooO0O0 = o000Oo0.OooO0O0(string, ", destinationBucketName=");
        sbOooO0O0.append(this.f9373OooO0Oo);
        sbOooO0O0.append(", logFilePrefix=");
        sbOooO0O0.append(this.f9374OooO0o0);
        return sbOooO0O0.toString();
    }
}
