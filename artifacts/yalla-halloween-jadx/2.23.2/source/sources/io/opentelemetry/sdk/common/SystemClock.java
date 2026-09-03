package io.opentelemetry.sdk.common;

import io.opentelemetry.sdk.internal.JavaVersionSpecific;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.ThreadSafe;

/* JADX INFO: loaded from: classes5.dex */
@ThreadSafe
final class SystemClock implements Clock {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final SystemClock f32669OooO00o = new SystemClock();

    private SystemClock() {
    }

    @Override // io.opentelemetry.sdk.common.Clock
    public final long OooO00o() {
        JavaVersionSpecific.f32674OooO00o.getClass();
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    @Override // io.opentelemetry.sdk.common.Clock
    public final long nanoTime() {
        return System.nanoTime();
    }
}
