package io.grpc;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0O implements Comparable<OooOO0O> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final OooO00o f26366Oooo = new OooO00o();

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public static final long f26367OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static final long f26368OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final long f26369OoooO0O;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final OooO0O0 f26370Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final long f26371Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public volatile boolean f26372Oooo0oo;

    public static class OooO00o extends OooO0O0 {
    }

    public static abstract class OooO0O0 {
    }

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        f26368OoooO00 = nanos;
        f26367OoooO0 = -nanos;
        f26369OoooO0O = TimeUnit.SECONDS.toNanos(1L);
    }

    public OooOO0O(long j) {
        OooO00o oooO00o = f26366Oooo;
        long jNanoTime = System.nanoTime();
        this.f26370Oooo0o = oooO00o;
        long jMin = Math.min(f26368OoooO00, Math.max(f26367OoooO0, j));
        this.f26371Oooo0oO = jNanoTime + jMin;
        this.f26372Oooo0oo = jMin <= 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(OooOO0O oooOO0O) {
        long j = this.f26371Oooo0oO - oooOO0O.f26371Oooo0oO;
        if (j < 0) {
            return -1;
        }
        return j > 0 ? 1 : 0;
    }

    public final String toString() {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        Objects.requireNonNull((OooO00o) this.f26370Oooo0o);
        long jNanoTime = System.nanoTime();
        if (!this.f26372Oooo0oo && this.f26371Oooo0oO - jNanoTime <= 0) {
            this.f26372Oooo0oo = true;
        }
        long jConvert = timeUnit.convert(this.f26371Oooo0oO - jNanoTime, timeUnit);
        long jAbs = Math.abs(jConvert);
        long j = f26369OoooO0O;
        long j2 = jAbs / j;
        long jAbs2 = Math.abs(jConvert) % j;
        StringBuilder sb = new StringBuilder();
        if (jConvert < 0) {
            sb.append('-');
        }
        sb.append(j2);
        if (jAbs2 > 0) {
            sb.append(String.format(".%09d", Long.valueOf(jAbs2)));
        }
        sb.append("s from now");
        return sb.toString();
    }
}
