package io.opentelemetry.api.trace;

import io.opentelemetry.api.internal.OtelEncodingUtils;
import javax.annotation.concurrent.Immutable;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes5.dex */
@Immutable
final class ImmutableTraceFlags implements TraceFlags {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final ImmutableTraceFlags f33063OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final ImmutableTraceFlags f33064OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f33065OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final byte f33066OooO0O0;

    static {
        ImmutableTraceFlags[] immutableTraceFlagsArr = new ImmutableTraceFlags[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        for (int i = 0; i < 256; i++) {
            immutableTraceFlagsArr[i] = new ImmutableTraceFlags((byte) i);
        }
        f33063OooO0OO = immutableTraceFlagsArr[0];
        f33064OooO0Oo = immutableTraceFlagsArr[1];
    }

    public ImmutableTraceFlags(byte b) {
        char[] cArr = new char[2];
        OtelEncodingUtils.OooO0O0(b, cArr, 0);
        this.f33065OooO00o = new String(cArr);
        this.f33066OooO0O0 = b;
    }

    @Override // io.opentelemetry.api.trace.TraceFlags
    public final boolean OooO00o() {
        return (this.f33066OooO0O0 & 1) != 0;
    }

    @Override // io.opentelemetry.api.trace.TraceFlags
    public final String OooO0O0() {
        return this.f33065OooO00o;
    }

    public final String toString() {
        return this.f33065OooO00o;
    }
}
