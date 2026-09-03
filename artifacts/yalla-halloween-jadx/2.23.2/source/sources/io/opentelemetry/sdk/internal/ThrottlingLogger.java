package io.opentelemetry.sdk.internal;

import io.opentelemetry.sdk.common.Clock;
import io.opentelemetry.sdk.common.OooO00o;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
public class ThrottlingLogger {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final TimeUnit f32679OooO0o0 = TimeUnit.MINUTES;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Logger f32680OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AtomicBoolean f32681OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final RateLimiter f32682OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final RateLimiter f32683OooO0Oo;

    public ThrottlingLogger(Logger logger) {
        Clock clockOooO00o = OooO00o.OooO00o();
        this.f32681OooO0O0 = new AtomicBoolean(false);
        this.f32680OooO00o = logger;
        TimeUnit timeUnit = f32679OooO0o0;
        this.f32682OooO0OO = new RateLimiter(5.0d / timeUnit.toSeconds(1L), 5.0d, clockOooO00o);
        this.f32683OooO0Oo = new RateLimiter(5.0d / timeUnit.toSeconds(1L), 1.0d, clockOooO00o);
    }

    public final void OooO00o(Level level, String str) {
        Logger logger = this.f32680OooO00o;
        if (logger.isLoggable(level)) {
            AtomicBoolean atomicBoolean = this.f32681OooO0O0;
            boolean z = atomicBoolean.get();
            RateLimiter rateLimiter = this.f32683OooO0Oo;
            if (z) {
                if (rateLimiter.OooO00o()) {
                    logger.log(level, str);
                }
            } else if (this.f32682OooO0OO.OooO00o()) {
                logger.log(level, str);
            } else if (atomicBoolean.compareAndSet(false, true)) {
                rateLimiter.OooO00o();
                logger.log(level, "Too many log messages detected. Will only log once per minute from now on.");
                logger.log(level, str);
            }
        }
    }
}
