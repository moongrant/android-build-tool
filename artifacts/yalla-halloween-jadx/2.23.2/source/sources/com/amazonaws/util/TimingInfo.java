package com.amazonaws.util;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class TimingInfo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f12682OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Long f12683OooO0O0;

    public TimingInfo(long j, Long l) {
        this.f12682OooO00o = j;
        this.f12683OooO0O0 = l;
    }

    public void OooO00o(String str, TimingInfo timingInfo) {
    }

    public void OooO0O0() {
        this.f12683OooO0O0 = Long.valueOf(System.nanoTime());
    }

    public Map<String, Number> OooO0OO() {
        return Collections.emptyMap();
    }

    public Map<String, List<TimingInfo>> OooO0Oo() {
        return Collections.emptyMap();
    }

    public void OooO0o(long j, String str) {
    }

    public void OooO0o0(String str) {
    }

    public final String toString() {
        Double dValueOf;
        Long l = this.f12683OooO0O0;
        if (l != null) {
            dValueOf = Double.valueOf(TimeUnit.NANOSECONDS.toMicros(l.longValue() - this.f12682OooO00o) / 1000.0d);
        } else {
            dValueOf = null;
        }
        return String.valueOf(dValueOf == null ? -1.0d : dValueOf.doubleValue());
    }
}
