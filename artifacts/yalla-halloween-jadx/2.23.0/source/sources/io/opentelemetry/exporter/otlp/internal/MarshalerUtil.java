package io.opentelemetry.exporter.otlp.internal;

import com.fasterxml.jackson.core.JsonFactory;

/* JADX INFO: loaded from: classes5.dex */
final class MarshalerUtil {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final byte[] f33121OooO00o;

    static {
        int i = CodedOutputStream.f33117OooO00o;
        f33121OooO00o = new byte[0];
        try {
            int i2 = JsonFactory.f10733OooO0Oo;
        } catch (ClassNotFoundException unused) {
        }
    }

    private MarshalerUtil() {
    }
}
