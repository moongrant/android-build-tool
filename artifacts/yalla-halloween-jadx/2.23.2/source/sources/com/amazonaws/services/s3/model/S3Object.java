package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.internal.S3RequesterChargedResult;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import p028Oooo0oO.o0oOO;

/* JADX INFO: loaded from: classes2.dex */
public class S3Object implements Closeable, Serializable, S3RequesterChargedResult {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public transient S3ObjectInputStream f12517OooO0oO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f12514OooO0Oo = null;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public String f12516OooO0o0 = null;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ObjectMetadata f12515OooO0o = new ObjectMetadata();

    @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
    public final void OooO0oO(boolean z) {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        S3ObjectInputStream s3ObjectInputStream = this.f12517OooO0oO;
        if (s3ObjectInputStream != null) {
            s3ObjectInputStream.close();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("S3Object [key=");
        sb.append(this.f12514OooO0Oo);
        sb.append(",bucket=");
        String str = this.f12516OooO0o0;
        if (str == null) {
            str = "<Unknown>";
        }
        return o0oOO.OooO0O0(sb, str, "]");
    }
}
