package com.amazonaws.util;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class TimingInfo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f11187OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Long f11188OooO0O0;

    public TimingInfo(long j, Long l) {
        this.f11187OooO00o = j;
        this.f11188OooO0O0 = l;
    }

    public void OooO00o(String str, TimingInfo timingInfo) {
    }

    public TimingInfo OooO0O0() {
        this.f11188OooO0O0 = Long.valueOf(System.nanoTime());
        return this;
    }

    public Map<String, Number> OooO0OO() {
        return Collections.emptyMap();
    }

    public Map<String, List<TimingInfo>> OooO0Oo() {
        return Collections.emptyMap();
    }

    public void OooO0o(String str, long j) {
    }

    public void OooO0o0(String str) {
    }

    public final String toString() {
        Double dValueOf;
        Long l = this.f11188OooO0O0;
        if (l != null) {
            dValueOf = Double.valueOf(TimeUnit.NANOSECONDS.toMicros(l.longValue() - this.f11187OooO00o) / 1000.0d);
        } else {
            dValueOf = null;
        }
        return String.valueOf(dValueOf == null ? -1.0d : dValueOf.doubleValue());
    }
}
