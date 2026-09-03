package com.amazonaws.services.s3.model;

import java.io.Serializable;
import p037OoooOo0.o000O0o;

/* JADX INFO: loaded from: classes2.dex */
public class BucketLoggingConfiguration implements Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f12463OooO0Oo = null;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public String f12464OooO0o0 = null;

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoggingConfiguration enabled=");
        sb.append((this.f12463OooO0Oo == null || this.f12464OooO0o0 == null) ? false : true);
        String string = sb.toString();
        if (!((this.f12463OooO0Oo == null || this.f12464OooO0o0 == null) ? false : true)) {
            return string;
        }
        StringBuilder sbOooO0O0 = o000O0o.OooO0O0(string, ", destinationBucketName=");
        sbOooO0O0.append(this.f12463OooO0Oo);
        sbOooO0O0.append(", logFilePrefix=");
        sbOooO0O0.append(this.f12464OooO0o0);
        return sbOooO0O0.toString();
    }
}
