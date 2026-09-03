package com.amazonaws.services.s3.model;

import OooO00o.OooO00o;
import java.io.Serializable;
import p708oo000o.Oooo0;

/* JADX INFO: loaded from: classes.dex */
public class BucketLoggingConfiguration implements Serializable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public String f10730Oooo0o = null;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public String f10731Oooo0oO = null;

    public final boolean OooO00o() {
        return (this.f10730Oooo0o == null || this.f10731Oooo0oO == null) ? false : true;
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("LoggingConfiguration enabled=");
        sbOooO0o0.append(OooO00o());
        String string = sbOooO0o0.toString();
        if (!OooO00o()) {
            return string;
        }
        StringBuilder sbOooO00o = Oooo0.OooO00o(string, ", destinationBucketName=");
        sbOooO00o.append(this.f10730Oooo0o);
        sbOooO00o.append(", logFilePrefix=");
        sbOooO00o.append(this.f10731Oooo0oO);
        return sbOooO00o.toString();
    }
}
