package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import androidx.camera.core.impl.OooOOOO;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 extends SchedulerConfig.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f10880OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f10881OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Set<SchedulerConfig.Flag> f10882OooO0OO;

    public static final class OooO00o extends SchedulerConfig.OooO00o.AbstractC0195OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Long f10883OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Long f10884OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Set<SchedulerConfig.Flag> f10885OooO0OO;

        public final OooO0O0 OooO00o() {
            String strOooO00o = this.f10883OooO00o == null ? " delta" : "";
            if (this.f10884OooO0O0 == null) {
                strOooO00o = strOooO00o.concat(" maxAllowedDelay");
            }
            if (this.f10885OooO0OO == null) {
                strOooO00o = OooOOOO.OooO00o(strOooO00o, " flags");
            }
            if (strOooO00o.isEmpty()) {
                return new OooO0O0(this.f10883OooO00o.longValue(), this.f10884OooO0O0.longValue(), this.f10885OooO0OO);
            }
            throw new IllegalStateException("Missing required properties:".concat(strOooO00o));
        }
    }

    public OooO0O0(long j, long j2, Set set) {
        this.f10880OooO00o = j;
        this.f10881OooO0O0 = j2;
        this.f10882OooO0OO = set;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.OooO00o
    public final long OooO00o() {
        return this.f10880OooO00o;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.OooO00o
    public final Set<SchedulerConfig.Flag> OooO0O0() {
        return this.f10882OooO0OO;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.OooO00o
    public final long OooO0OO() {
        return this.f10881OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig.OooO00o)) {
            return false;
        }
        SchedulerConfig.OooO00o oooO00o = (SchedulerConfig.OooO00o) obj;
        return this.f10880OooO00o == oooO00o.OooO00o() && this.f10881OooO0O0 == oooO00o.OooO0OO() && this.f10882OooO0OO.equals(oooO00o.OooO0O0());
    }

    public final int hashCode() {
        long j = this.f10880OooO00o;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.f10881OooO0O0;
        return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f10882OooO0OO.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f10880OooO00o + ", maxAllowedDelay=" + this.f10881OooO0O0 + ", flags=" + this.f10882OooO0OO + "}";
    }
}
