package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.Priority;
import java.util.Map;
import p249o00oo0oO.o000O0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o extends SchedulerConfig {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000O0Oo f13926OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Map<Priority, SchedulerConfig.OooO00o> f13927OooO0O0;

    public OooO00o(o000O0Oo o000o0oo2, Map<Priority, SchedulerConfig.OooO00o> map) {
        if (o000o0oo2 == null) {
            throw new NullPointerException("Null clock");
        }
        this.f13926OooO00o = o000o0oo2;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f13927OooO0O0 = map;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public final o000O0Oo OooO00o() {
        return this.f13926OooO00o;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public final Map<Priority, SchedulerConfig.OooO00o> OooO0OO() {
        return this.f13927OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig)) {
            return false;
        }
        SchedulerConfig schedulerConfig = (SchedulerConfig) obj;
        return this.f13926OooO00o.equals(schedulerConfig.OooO00o()) && this.f13927OooO0O0.equals(schedulerConfig.OooO0OO());
    }

    public final int hashCode() {
        return ((this.f13926OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f13927OooO0O0.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f13926OooO00o + ", values=" + this.f13927OooO0O0 + "}";
    }
}
