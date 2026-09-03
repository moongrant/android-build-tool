package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.Priority;
import java.util.Map;
import java.util.Objects;
import p289o0O0OOoO.o0000Ooo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends SchedulerConfig {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000Ooo f13087OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Map<Priority, SchedulerConfig.OooO00o> f13088OooO0O0;

    public OooO00o(o0000Ooo o0000ooo, Map<Priority, SchedulerConfig.OooO00o> map) {
        Objects.requireNonNull(o0000ooo, "Null clock");
        this.f13087OooO00o = o0000ooo;
        Objects.requireNonNull(map, "Null values");
        this.f13088OooO0O0 = map;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public final o0000Ooo OooO00o() {
        return this.f13087OooO00o;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public final Map<Priority, SchedulerConfig.OooO00o> OooO0OO() {
        return this.f13088OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig)) {
            return false;
        }
        SchedulerConfig schedulerConfig = (SchedulerConfig) obj;
        return this.f13087OooO00o.equals(schedulerConfig.OooO00o()) && this.f13088OooO0O0.equals(schedulerConfig.OooO0OO());
    }

    public final int hashCode() {
        return ((this.f13087OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f13088OooO0O0.hashCode();
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("SchedulerConfig{clock=");
        sbOooO0o0.append(this.f13087OooO00o);
        sbOooO0o0.append(", values=");
        sbOooO0o0.append(this.f13088OooO0O0);
        sbOooO0o0.append("}");
        return sbOooO0o0.toString();
    }
}
