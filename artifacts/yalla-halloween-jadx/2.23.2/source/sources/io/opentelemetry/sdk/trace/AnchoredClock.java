package io.opentelemetry.sdk.trace;

import io.opentelemetry.sdk.common.Clock;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes5.dex */
@Immutable
final class AnchoredClock {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Clock f32915OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f32916OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f32917OooO0OO;

    public AnchoredClock(Clock clock, long j, long j2) {
        this.f32915OooO00o = clock;
        this.f32916OooO0O0 = j;
        this.f32917OooO0OO = j2;
    }
}
