package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.Priority;
import java.util.Map;
import p201o00o0o00.OooOOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o extends SchedulerConfig {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOOO0 f10878OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Map<Priority, SchedulerConfig.OooO00o> f10879OooO0O0;

    public OooO00o(OooOOO0 oooOOO0, Map<Priority, SchedulerConfig.OooO00o> map) {
        if (oooOOO0 == null) {
            throw new NullPointerException("Null clock");
        }
        this.f10878OooO00o = oooOOO0;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f10879OooO0O0 = map;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public final OooOOO0 OooO00o() {
        return this.f10878OooO00o;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public final Map<Priority, SchedulerConfig.OooO00o> OooO0OO() {
        return this.f10879OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig)) {
            return false;
        }
        SchedulerConfig schedulerConfig = (SchedulerConfig) obj;
        return this.f10878OooO00o.equals(schedulerConfig.OooO00o()) && this.f10879OooO0O0.equals(schedulerConfig.OooO0OO());
    }

    public final int hashCode() {
        return ((this.f10878OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f10879OooO0O0.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f10878OooO00o + ", values=" + this.f10879OooO0O0 + "}";
    }
}
