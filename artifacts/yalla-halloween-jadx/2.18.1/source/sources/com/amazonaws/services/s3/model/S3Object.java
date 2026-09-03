package com.amazonaws.services.s3.model;

import OooO00o.OooO00o;
import com.amazonaws.services.s3.internal.S3RequesterChargedResult;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import p058o0000OoO.OooO;

/* JADX INFO: loaded from: classes.dex */
public class S3Object implements Closeable, Serializable, S3RequesterChargedResult {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public transient S3ObjectInputStream f10897Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public String f10898Oooo0o = null;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public String f10899Oooo0oO = null;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public ObjectMetadata f10900Oooo0oo = new ObjectMetadata();

    @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
    public final void OooO0o(boolean z) {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        S3ObjectInputStream s3ObjectInputStream = this.f10897Oooo;
        if (s3ObjectInputStream != null) {
            s3ObjectInputStream.close();
        }
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("S3Object [key=");
        sbOooO0o0.append(this.f10898Oooo0o);
        sbOooO0o0.append(",bucket=");
        String str = this.f10899Oooo0oO;
        if (str == null) {
            str = "<Unknown>";
        }
        return OooO.OooO00o(sbOooO0o0, str, "]");
    }
}
