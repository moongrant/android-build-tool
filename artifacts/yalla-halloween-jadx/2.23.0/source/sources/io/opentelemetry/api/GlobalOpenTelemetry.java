package io.opentelemetry.api;

import io.opentelemetry.sdk.OpenTelemetrySdk;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

/* JADX INFO: loaded from: classes5.dex */
public final class GlobalOpenTelemetry {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Object f33016OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public static volatile ObfuscatedOpenTelemetry f33017OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public static Throwable f33018OooO0OO;

    @ThreadSafe
    public static class ObfuscatedOpenTelemetry implements OpenTelemetry {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OpenTelemetry f33019OooO00o;

        public ObfuscatedOpenTelemetry(OpenTelemetrySdk openTelemetrySdk) {
            this.f33019OooO00o = openTelemetrySdk;
        }
    }

    static {
        Logger.getLogger(GlobalOpenTelemetry.class.getName());
        f33016OooO00o = new Object();
    }

    private GlobalOpenTelemetry() {
    }

    public static void OooO00o(OpenTelemetrySdk openTelemetrySdk) {
        synchronized (f33016OooO00o) {
            if (f33017OooO0O0 != null) {
                throw new IllegalStateException("GlobalOpenTelemetry.set has already been called. GlobalOpenTelemetry.set must be called only once before any calls to GlobalOpenTelemetry.get. If you are using the OpenTelemetrySdk, use OpenTelemetrySdkBuilder.buildAndRegisterGlobal instead. Previous invocation set to cause of this exception.", f33018OooO0OO);
            }
            f33017OooO0O0 = new ObfuscatedOpenTelemetry(openTelemetrySdk);
            f33018OooO0OO = new Throwable();
        }
    }
}
