package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.Set;
import p016OooOoO0.OooOo00;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 extends SchedulerConfig.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f13089OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f13090OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Set<SchedulerConfig.Flag> f13091OooO0OO;

    /* JADX INFO: renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class C0093OooO0O0 extends SchedulerConfig.OooO00o.AbstractC0094OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Long f13092OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Long f13093OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Set<SchedulerConfig.Flag> f13094OooO0OO;

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.OooO00o.AbstractC0094OooO00o
        public final SchedulerConfig.OooO00o OooO00o() {
            String strOooO0Oo = this.f13092OooO00o == null ? " delta" : "";
            if (this.f13093OooO0O0 == null) {
                strOooO0Oo = OooOo00.OooO0Oo(strOooO0Oo, " maxAllowedDelay");
            }
            if (this.f13094OooO0OO == null) {
                strOooO0Oo = OooOo00.OooO0Oo(strOooO0Oo, " flags");
            }
            if (strOooO0Oo.isEmpty()) {
                return new OooO0O0(this.f13092OooO00o.longValue(), this.f13093OooO0O0.longValue(), this.f13094OooO0OO, null);
            }
            throw new IllegalStateException(OooOo00.OooO0Oo("Missing required properties:", strOooO0Oo));
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.OooO00o.AbstractC0094OooO00o
        public final SchedulerConfig.OooO00o.AbstractC0094OooO00o OooO0O0(long j) {
            this.f13092OooO00o = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.OooO00o.AbstractC0094OooO00o
        public final SchedulerConfig.OooO00o.AbstractC0094OooO00o OooO0OO() {
            this.f13093OooO0O0 = 86400000L;
            return this;
        }
    }

    public OooO0O0(long j, long j2, Set set, OooO00o oooO00o) {
        this.f13089OooO00o = j;
        this.f13090OooO0O0 = j2;
        this.f13091OooO0OO = set;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.OooO00o
    public final long OooO0O0() {
        return this.f13089OooO00o;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.OooO00o
    public final Set<SchedulerConfig.Flag> OooO0OO() {
        return this.f13091OooO0OO;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.OooO00o
    public final long OooO0Oo() {
        return this.f13090OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig.OooO00o)) {
            return false;
        }
        SchedulerConfig.OooO00o oooO00o = (SchedulerConfig.OooO00o) obj;
        return this.f13089OooO00o == oooO00o.OooO0O0() && this.f13090OooO0O0 == oooO00o.OooO0Oo() && this.f13091OooO0OO.equals(oooO00o.OooO0OO());
    }

    public final int hashCode() {
        long j = this.f13089OooO00o;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.f13090OooO0O0;
        return this.f13091OooO0OO.hashCode() ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ConfigValue{delta=");
        sbOooO0o0.append(this.f13089OooO00o);
        sbOooO0o0.append(", maxAllowedDelay=");
        sbOooO0o0.append(this.f13090OooO0O0);
        sbOooO0o0.append(", flags=");
        sbOooO0o0.append(this.f13091OooO0OO);
        sbOooO0o0.append("}");
        return sbOooO0o0.toString();
    }
}
