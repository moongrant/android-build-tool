package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.annotations.Encodable;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO0 extends CrashlyticsReport.OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final CrashlyticsReport.OooO.OooO0OO f19564OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f19565OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f19566OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f19567OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Long f19568OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final CrashlyticsReport.OooO.OooO00o f19569OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f19570OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final CrashlyticsReport.OooO.OooOO0 f19571OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final CrashlyticsReport.OooO.AbstractC0242OooO f19572OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final p291o0O0Oo0o.o00O0O<CrashlyticsReport.OooO.OooO0o> f19573OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final int f19574OooOO0O;

    public static final class OooO00o extends CrashlyticsReport.OooO.OooO0O0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public CrashlyticsReport.OooO.OooO0OO f19575OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f19576OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f19577OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Long f19578OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Long f19579OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public CrashlyticsReport.OooO.OooO00o f19580OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Boolean f19581OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public CrashlyticsReport.OooO.OooOO0 f19582OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public CrashlyticsReport.OooO.AbstractC0242OooO f19583OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public p291o0O0Oo0o.o00O0O<CrashlyticsReport.OooO.OooO0o> f19584OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public Integer f19585OooOO0O;

        public OooO00o(CrashlyticsReport.OooO oooO) {
            this.f19576OooO00o = oooO.OooO0o0();
            this.f19577OooO0O0 = oooO.OooO0oO();
            this.f19578OooO0OO = Long.valueOf(oooO.OooO());
            this.f19579OooO0Oo = oooO.OooO0OO();
            this.f19581OooO0o0 = Boolean.valueOf(oooO.OooOO0O());
            this.f19580OooO0o = oooO.OooO00o();
            this.f19582OooO0oO = oooO.OooOO0();
            this.f19583OooO0oo = oooO.OooO0oo();
            this.f19575OooO = oooO.OooO0O0();
            this.f19584OooOO0 = oooO.OooO0Oo();
            this.f19585OooOO0O = Integer.valueOf(oooO.OooO0o());
        }

        public final OooOOO0 OooO00o() {
            String strOooO00o = this.f19576OooO00o == null ? " generator" : "";
            if (this.f19577OooO0O0 == null) {
                strOooO00o = strOooO00o.concat(" identifier");
            }
            if (this.f19578OooO0OO == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " startedAt");
            }
            if (this.f19581OooO0o0 == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " crashed");
            }
            if (this.f19580OooO0o == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " app");
            }
            if (this.f19585OooOO0O == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " generatorType");
            }
            if (strOooO00o.isEmpty()) {
                return new OooOOO0(this.f19576OooO00o, this.f19577OooO0O0, this.f19578OooO0OO.longValue(), this.f19579OooO0Oo, this.f19581OooO0o0.booleanValue(), this.f19580OooO0o, this.f19582OooO0oO, this.f19583OooO0oo, this.f19575OooO, this.f19584OooOO0, this.f19585OooOO0O.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strOooO00o));
        }
    }

    public OooOOO0() {
        throw null;
    }

    public OooOOO0(String str, String str2, long j, Long l, boolean z, CrashlyticsReport.OooO.OooO00o oooO00o, CrashlyticsReport.OooO.OooOO0 oooOO1, CrashlyticsReport.OooO.AbstractC0242OooO abstractC0242OooO, CrashlyticsReport.OooO.OooO0OO oooO0OO, p291o0O0Oo0o.o00O0O o00o0o2, int i) {
        this.f19565OooO00o = str;
        this.f19566OooO0O0 = str2;
        this.f19567OooO0OO = j;
        this.f19568OooO0Oo = l;
        this.f19570OooO0o0 = z;
        this.f19569OooO0o = oooO00o;
        this.f19571OooO0oO = oooOO1;
        this.f19572OooO0oo = abstractC0242OooO;
        this.f19564OooO = oooO0OO;
        this.f19573OooOO0 = o00o0o2;
        this.f19574OooOO0O = i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO
    public final long OooO() {
        return this.f19567OooO0OO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO
    @NonNull
    public final CrashlyticsReport.OooO.OooO00o OooO00o() {
        return this.f19569OooO0o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO
    @Nullable
    public final CrashlyticsReport.OooO.OooO0OO OooO0O0() {
        return this.f19564OooO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO
    @Nullable
    public final Long OooO0OO() {
        return this.f19568OooO0Oo;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO
    @Nullable
    public final p291o0O0Oo0o.o00O0O<CrashlyticsReport.OooO.OooO0o> OooO0Oo() {
        return this.f19573OooOO0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO
    public final int OooO0o() {
        return this.f19574OooOO0O;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO
    @NonNull
    public final String OooO0o0() {
        return this.f19565OooO00o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO
    @NonNull
    @Encodable.Ignore
    public final String OooO0oO() {
        return this.f19566OooO0O0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO
    @Nullable
    public final CrashlyticsReport.OooO.AbstractC0242OooO OooO0oo() {
        return this.f19572OooO0oo;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO
    @Nullable
    public final CrashlyticsReport.OooO.OooOO0 OooOO0() {
        return this.f19571OooO0oO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO
    public final boolean OooOO0O() {
        return this.f19570OooO0o0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO
    public final OooO00o OooOO0o() {
        return new OooO00o(this);
    }

    public final boolean equals(Object obj) {
        Long l;
        CrashlyticsReport.OooO.OooOO0 oooOO1;
        CrashlyticsReport.OooO.AbstractC0242OooO abstractC0242OooO;
        CrashlyticsReport.OooO.OooO0OO oooO0OO;
        p291o0O0Oo0o.o00O0O<CrashlyticsReport.OooO.OooO0o> o00o0o2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.OooO)) {
            return false;
        }
        CrashlyticsReport.OooO oooO = (CrashlyticsReport.OooO) obj;
        return this.f19565OooO00o.equals(oooO.OooO0o0()) && this.f19566OooO0O0.equals(oooO.OooO0oO()) && this.f19567OooO0OO == oooO.OooO() && ((l = this.f19568OooO0Oo) != null ? l.equals(oooO.OooO0OO()) : oooO.OooO0OO() == null) && this.f19570OooO0o0 == oooO.OooOO0O() && this.f19569OooO0o.equals(oooO.OooO00o()) && ((oooOO1 = this.f19571OooO0oO) != null ? oooOO1.equals(oooO.OooOO0()) : oooO.OooOO0() == null) && ((abstractC0242OooO = this.f19572OooO0oo) != null ? abstractC0242OooO.equals(oooO.OooO0oo()) : oooO.OooO0oo() == null) && ((oooO0OO = this.f19564OooO) != null ? oooO0OO.equals(oooO.OooO0O0()) : oooO.OooO0O0() == null) && ((o00o0o2 = this.f19573OooOO0) != null ? o00o0o2.equals(oooO.OooO0Oo()) : oooO.OooO0Oo() == null) && this.f19574OooOO0O == oooO.OooO0o();
    }

    public final int hashCode() {
        int iHashCode = (((this.f19565OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f19566OooO0O0.hashCode()) * 1000003;
        long j = this.f19567OooO0OO;
        int i = (iHashCode ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        Long l = this.f19568OooO0Oo;
        int iHashCode2 = (((((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f19570OooO0o0 ? 1231 : 1237)) * 1000003) ^ this.f19569OooO0o.hashCode()) * 1000003;
        CrashlyticsReport.OooO.OooOO0 oooOO1 = this.f19571OooO0oO;
        int iHashCode3 = (iHashCode2 ^ (oooOO1 == null ? 0 : oooOO1.hashCode())) * 1000003;
        CrashlyticsReport.OooO.AbstractC0242OooO abstractC0242OooO = this.f19572OooO0oo;
        int iHashCode4 = (iHashCode3 ^ (abstractC0242OooO == null ? 0 : abstractC0242OooO.hashCode())) * 1000003;
        CrashlyticsReport.OooO.OooO0OO oooO0OO = this.f19564OooO;
        int iHashCode5 = (iHashCode4 ^ (oooO0OO == null ? 0 : oooO0OO.hashCode())) * 1000003;
        p291o0O0Oo0o.o00O0O<CrashlyticsReport.OooO.OooO0o> o00o0o2 = this.f19573OooOO0;
        return ((iHashCode5 ^ (o00o0o2 != null ? o00o0o2.hashCode() : 0)) * 1000003) ^ this.f19574OooOO0O;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.f19565OooO00o);
        sb.append(", identifier=");
        sb.append(this.f19566OooO0O0);
        sb.append(", startedAt=");
        sb.append(this.f19567OooO0OO);
        sb.append(", endedAt=");
        sb.append(this.f19568OooO0Oo);
        sb.append(", crashed=");
        sb.append(this.f19570OooO0o0);
        sb.append(", app=");
        sb.append(this.f19569OooO0o);
        sb.append(", user=");
        sb.append(this.f19571OooO0oO);
        sb.append(", os=");
        sb.append(this.f19572OooO0oo);
        sb.append(", device=");
        sb.append(this.f19564OooO);
        sb.append(", events=");
        sb.append(this.f19573OooOO0);
        sb.append(", generatorType=");
        return p022Oooo00O.OooOO0.OooO00o(sb, this.f19574OooOO0O, "}");
    }
}
