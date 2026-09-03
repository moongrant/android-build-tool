package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Ooo extends CrashlyticsReport.OooO.OooO0o.OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Double f19059OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f19060OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f19061OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f19062OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f19063OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f19064OooO0o0;

    public static final class OooO00o extends CrashlyticsReport.OooO.OooO0o.OooO0OO.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Double f19065OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Integer f19066OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Boolean f19067OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Integer f19068OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Long f19069OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Long f19070OooO0o0;

        public final CrashlyticsReport.OooO.OooO0o.OooO0OO OooO00o() {
            String strOooO0Oo = this.f19066OooO0O0 == null ? " batteryVelocity" : "";
            if (this.f19067OooO0OO == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " proximityOn");
            }
            if (this.f19068OooO0Oo == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " orientation");
            }
            if (this.f19070OooO0o0 == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " ramUsed");
            }
            if (this.f19069OooO0o == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " diskUsed");
            }
            if (strOooO0Oo.isEmpty()) {
                return new o00Ooo(this.f19065OooO00o, this.f19066OooO0O0.intValue(), this.f19067OooO0OO.booleanValue(), this.f19068OooO0Oo.intValue(), this.f19070OooO0o0.longValue(), this.f19069OooO0o.longValue());
            }
            throw new IllegalStateException(p016OooOoO0.OooOo00.OooO0Oo("Missing required properties:", strOooO0Oo));
        }
    }

    public o00Ooo(Double d, int i, boolean z, int i2, long j, long j2) {
        this.f19059OooO00o = d;
        this.f19060OooO0O0 = i;
        this.f19061OooO0OO = z;
        this.f19062OooO0Oo = i2;
        this.f19064OooO0o0 = j;
        this.f19063OooO0o = j2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO0OO
    @Nullable
    public final Double OooO00o() {
        return this.f19059OooO00o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO0OO
    public final int OooO0O0() {
        return this.f19060OooO0O0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO0OO
    public final long OooO0OO() {
        return this.f19063OooO0o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO0OO
    public final int OooO0Oo() {
        return this.f19062OooO0Oo;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO0OO
    public final boolean OooO0o() {
        return this.f19061OooO0OO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO0OO
    public final long OooO0o0() {
        return this.f19064OooO0o0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.OooO.OooO0o.OooO0OO)) {
            return false;
        }
        CrashlyticsReport.OooO.OooO0o.OooO0OO oooO0OO = (CrashlyticsReport.OooO.OooO0o.OooO0OO) obj;
        Double d = this.f19059OooO00o;
        if (d != null ? d.equals(oooO0OO.OooO00o()) : oooO0OO.OooO00o() == null) {
            if (this.f19060OooO0O0 == oooO0OO.OooO0O0() && this.f19061OooO0OO == oooO0OO.OooO0o() && this.f19062OooO0Oo == oooO0OO.OooO0Oo() && this.f19064OooO0o0 == oooO0OO.OooO0o0() && this.f19063OooO0o == oooO0OO.OooO0OO()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Double d = this.f19059OooO00o;
        int iHashCode = ((((((((d == null ? 0 : d.hashCode()) ^ 1000003) * 1000003) ^ this.f19060OooO0O0) * 1000003) ^ (this.f19061OooO0OO ? 1231 : 1237)) * 1000003) ^ this.f19062OooO0Oo) * 1000003;
        long j = this.f19064OooO0o0;
        long j2 = this.f19063OooO0o;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Device{batteryLevel=");
        sbOooO0o0.append(this.f19059OooO00o);
        sbOooO0o0.append(", batteryVelocity=");
        sbOooO0o0.append(this.f19060OooO0O0);
        sbOooO0o0.append(", proximityOn=");
        sbOooO0o0.append(this.f19061OooO0OO);
        sbOooO0o0.append(", orientation=");
        sbOooO0o0.append(this.f19062OooO0Oo);
        sbOooO0o0.append(", ramUsed=");
        sbOooO0o0.append(this.f19064OooO0o0);
        sbOooO0o0.append(", diskUsed=");
        return android.support.v4.media.session.OooOOO0.OooO00o(sbOooO0o0, this.f19063OooO0o, "}");
    }
}
