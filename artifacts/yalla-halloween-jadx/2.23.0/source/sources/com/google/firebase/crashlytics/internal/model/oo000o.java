package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class oo000o extends CrashlyticsReport.OooO.OooO0o.OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Double f20140OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f20141OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f20142OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f20143OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f20144OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f20145OooO0o0;

    public static final class OooO00o extends CrashlyticsReport.OooO.OooO0o.OooO0OO.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Double f20146OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Integer f20147OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Boolean f20148OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Integer f20149OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Long f20150OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Long f20151OooO0o0;

        public final oo000o OooO00o() {
            String strOooO00o = this.f20147OooO0O0 == null ? " batteryVelocity" : "";
            if (this.f20148OooO0OO == null) {
                strOooO00o = strOooO00o.concat(" proximityOn");
            }
            if (this.f20149OooO0Oo == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " orientation");
            }
            if (this.f20151OooO0o0 == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " ramUsed");
            }
            if (this.f20150OooO0o == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " diskUsed");
            }
            if (strOooO00o.isEmpty()) {
                return new oo000o(this.f20146OooO00o, this.f20147OooO0O0.intValue(), this.f20148OooO0OO.booleanValue(), this.f20149OooO0Oo.intValue(), this.f20151OooO0o0.longValue(), this.f20150OooO0o.longValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strOooO00o));
        }
    }

    public oo000o(Double d, int i, boolean z, int i2, long j, long j2) {
        this.f20140OooO00o = d;
        this.f20141OooO0O0 = i;
        this.f20142OooO0OO = z;
        this.f20143OooO0Oo = i2;
        this.f20145OooO0o0 = j;
        this.f20144OooO0o = j2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO0OO
    @Nullable
    public final Double OooO00o() {
        return this.f20140OooO00o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO0OO
    public final int OooO0O0() {
        return this.f20141OooO0O0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO0OO
    public final long OooO0OO() {
        return this.f20144OooO0o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO0OO
    public final int OooO0Oo() {
        return this.f20143OooO0Oo;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO0OO
    public final boolean OooO0o() {
        return this.f20142OooO0OO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO0OO
    public final long OooO0o0() {
        return this.f20145OooO0o0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.OooO.OooO0o.OooO0OO)) {
            return false;
        }
        CrashlyticsReport.OooO.OooO0o.OooO0OO oooO0OO = (CrashlyticsReport.OooO.OooO0o.OooO0OO) obj;
        Double d = this.f20140OooO00o;
        if (d != null ? d.equals(oooO0OO.OooO00o()) : oooO0OO.OooO00o() == null) {
            if (this.f20141OooO0O0 == oooO0OO.OooO0O0() && this.f20142OooO0OO == oooO0OO.OooO0o() && this.f20143OooO0Oo == oooO0OO.OooO0Oo() && this.f20145OooO0o0 == oooO0OO.OooO0o0() && this.f20144OooO0o == oooO0OO.OooO0OO()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Double d = this.f20140OooO00o;
        int iHashCode = ((((((((d == null ? 0 : d.hashCode()) ^ 1000003) * 1000003) ^ this.f20141OooO0O0) * 1000003) ^ (this.f20142OooO0OO ? 1231 : 1237)) * 1000003) ^ this.f20143OooO0Oo) * 1000003;
        long j = this.f20145OooO0o0;
        long j2 = this.f20144OooO0o;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{batteryLevel=");
        sb.append(this.f20140OooO00o);
        sb.append(", batteryVelocity=");
        sb.append(this.f20141OooO0O0);
        sb.append(", proximityOn=");
        sb.append(this.f20142OooO0OO);
        sb.append(", orientation=");
        sb.append(this.f20143OooO0Oo);
        sb.append(", ramUsed=");
        sb.append(this.f20145OooO0o0);
        sb.append(", diskUsed=");
        return android.support.v4.media.session.OooO0o.OooO0O0(sb, this.f20144OooO0o, "}");
    }
}
