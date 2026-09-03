package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.annotations.Encodable;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO0 extends CrashlyticsReport.OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final CrashlyticsReport.OooO.OooO0OO f20036OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f20037OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f20038OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f20039OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Long f20040OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final CrashlyticsReport.OooO.OooO00o f20041OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f20042OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final CrashlyticsReport.OooO.OooOO0 f20043OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final CrashlyticsReport.OooO.AbstractC0243OooO f20044OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final p287o0O0Oo0.OooOO0<CrashlyticsReport.OooO.OooO0o> f20045OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final int f20046OooOO0O;

    public static final class OooO00o extends CrashlyticsReport.OooO.OooO0O0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public CrashlyticsReport.OooO.OooO0OO f20047OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f20048OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f20049OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Long f20050OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Long f20051OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public CrashlyticsReport.OooO.OooO00o f20052OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Boolean f20053OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public CrashlyticsReport.OooO.OooOO0 f20054OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public CrashlyticsReport.OooO.AbstractC0243OooO f20055OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public p287o0O0Oo0.OooOO0<CrashlyticsReport.OooO.OooO0o> f20056OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public Integer f20057OooOO0O;

        public OooO00o(CrashlyticsReport.OooO oooO) {
            this.f20048OooO00o = oooO.OooO0o0();
            this.f20049OooO0O0 = oooO.OooO0oO();
            this.f20050OooO0OO = Long.valueOf(oooO.OooO());
            this.f20051OooO0Oo = oooO.OooO0OO();
            this.f20053OooO0o0 = Boolean.valueOf(oooO.OooOO0O());
            this.f20052OooO0o = oooO.OooO00o();
            this.f20054OooO0oO = oooO.OooOO0();
            this.f20055OooO0oo = oooO.OooO0oo();
            this.f20047OooO = oooO.OooO0O0();
            this.f20056OooOO0 = oooO.OooO0Oo();
            this.f20057OooOO0O = Integer.valueOf(oooO.OooO0o());
        }

        public final OooOOO0 OooO00o() {
            String strOooO00o = this.f20048OooO00o == null ? " generator" : "";
            if (this.f20049OooO0O0 == null) {
                strOooO00o = strOooO00o.concat(" identifier");
            }
            if (this.f20050OooO0OO == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " startedAt");
            }
            if (this.f20053OooO0o0 == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " crashed");
            }
            if (this.f20052OooO0o == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " app");
            }
            if (this.f20057OooOO0O == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " generatorType");
            }
            if (strOooO00o.isEmpty()) {
                return new OooOOO0(this.f20048OooO00o, this.f20049OooO0O0, this.f20050OooO0OO.longValue(), this.f20051OooO0Oo, this.f20053OooO0o0.booleanValue(), this.f20052OooO0o, this.f20054OooO0oO, this.f20055OooO0oo, this.f20047OooO, this.f20056OooOO0, this.f20057OooOO0O.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strOooO00o));
        }
    }

    public OooOOO0() {
        throw null;
    }

    public OooOOO0(String str, String str2, long j, Long l, boolean z, CrashlyticsReport.OooO.OooO00o oooO00o, CrashlyticsReport.OooO.OooOO0 oooOO1, CrashlyticsReport.OooO.AbstractC0243OooO abstractC0243OooO, CrashlyticsReport.OooO.OooO0OO oooO0OO, p287o0O0Oo0.OooOO0 oooOO2, int i) {
        this.f20037OooO00o = str;
        this.f20038OooO0O0 = str2;
        this.f20039OooO0OO = j;
        this.f20040OooO0Oo = l;
        this.f20042OooO0o0 = z;
        this.f20041OooO0o = oooO00o;
        this.f20043OooO0oO = oooOO1;
        this.f20044OooO0oo = abstractC0243OooO;
        this.f20036OooO = oooO0OO;
        this.f20045OooOO0 = oooOO2;
        this.f20046OooOO0O = i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO
    public final long OooO() {
        return this.f20039OooO0OO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO
    @NonNull
    public final CrashlyticsReport.OooO.OooO00o OooO00o() {
        return this.f20041OooO0o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO
    @Nullable
    public final CrashlyticsReport.OooO.OooO0OO OooO0O0() {
        return this.f20036OooO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO
    @Nullable
    public final Long OooO0OO() {
        return this.f20040OooO0Oo;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO
    @Nullable
    public final p287o0O0Oo0.OooOO0<CrashlyticsReport.OooO.OooO0o> OooO0Oo() {
        return this.f20045OooOO0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO
    public final int OooO0o() {
        return this.f20046OooOO0O;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO
    @NonNull
    public final String OooO0o0() {
        return this.f20037OooO00o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO
    @NonNull
    @Encodable.Ignore
    public final String OooO0oO() {
        return this.f20038OooO0O0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO
    @Nullable
    public final CrashlyticsReport.OooO.AbstractC0243OooO OooO0oo() {
        return this.f20044OooO0oo;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO
    @Nullable
    public final CrashlyticsReport.OooO.OooOO0 OooOO0() {
        return this.f20043OooO0oO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO
    public final boolean OooOO0O() {
        return this.f20042OooO0o0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO
    public final OooO00o OooOO0o() {
        return new OooO00o(this);
    }

    public final boolean equals(Object obj) {
        Long l;
        CrashlyticsReport.OooO.OooOO0 oooOO1;
        CrashlyticsReport.OooO.AbstractC0243OooO abstractC0243OooO;
        CrashlyticsReport.OooO.OooO0OO oooO0OO;
        p287o0O0Oo0.OooOO0<CrashlyticsReport.OooO.OooO0o> oooOO2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.OooO)) {
            return false;
        }
        CrashlyticsReport.OooO oooO = (CrashlyticsReport.OooO) obj;
        return this.f20037OooO00o.equals(oooO.OooO0o0()) && this.f20038OooO0O0.equals(oooO.OooO0oO()) && this.f20039OooO0OO == oooO.OooO() && ((l = this.f20040OooO0Oo) != null ? l.equals(oooO.OooO0OO()) : oooO.OooO0OO() == null) && this.f20042OooO0o0 == oooO.OooOO0O() && this.f20041OooO0o.equals(oooO.OooO00o()) && ((oooOO1 = this.f20043OooO0oO) != null ? oooOO1.equals(oooO.OooOO0()) : oooO.OooOO0() == null) && ((abstractC0243OooO = this.f20044OooO0oo) != null ? abstractC0243OooO.equals(oooO.OooO0oo()) : oooO.OooO0oo() == null) && ((oooO0OO = this.f20036OooO) != null ? oooO0OO.equals(oooO.OooO0O0()) : oooO.OooO0O0() == null) && ((oooOO2 = this.f20045OooOO0) != null ? oooOO2.equals(oooO.OooO0Oo()) : oooO.OooO0Oo() == null) && this.f20046OooOO0O == oooO.OooO0o();
    }

    public final int hashCode() {
        int iHashCode = (((this.f20037OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f20038OooO0O0.hashCode()) * 1000003;
        long j = this.f20039OooO0OO;
        int i = (iHashCode ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        Long l = this.f20040OooO0Oo;
        int iHashCode2 = (((((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f20042OooO0o0 ? 1231 : 1237)) * 1000003) ^ this.f20041OooO0o.hashCode()) * 1000003;
        CrashlyticsReport.OooO.OooOO0 oooOO1 = this.f20043OooO0oO;
        int iHashCode3 = (iHashCode2 ^ (oooOO1 == null ? 0 : oooOO1.hashCode())) * 1000003;
        CrashlyticsReport.OooO.AbstractC0243OooO abstractC0243OooO = this.f20044OooO0oo;
        int iHashCode4 = (iHashCode3 ^ (abstractC0243OooO == null ? 0 : abstractC0243OooO.hashCode())) * 1000003;
        CrashlyticsReport.OooO.OooO0OO oooO0OO = this.f20036OooO;
        int iHashCode5 = (iHashCode4 ^ (oooO0OO == null ? 0 : oooO0OO.hashCode())) * 1000003;
        p287o0O0Oo0.OooOO0<CrashlyticsReport.OooO.OooO0o> oooOO2 = this.f20045OooOO0;
        return ((iHashCode5 ^ (oooOO2 != null ? oooOO2.hashCode() : 0)) * 1000003) ^ this.f20046OooOO0O;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.f20037OooO00o);
        sb.append(", identifier=");
        sb.append(this.f20038OooO0O0);
        sb.append(", startedAt=");
        sb.append(this.f20039OooO0OO);
        sb.append(", endedAt=");
        sb.append(this.f20040OooO0Oo);
        sb.append(", crashed=");
        sb.append(this.f20042OooO0o0);
        sb.append(", app=");
        sb.append(this.f20041OooO0o);
        sb.append(", user=");
        sb.append(this.f20043OooO0oO);
        sb.append(", os=");
        sb.append(this.f20044OooO0oo);
        sb.append(", device=");
        sb.append(this.f20036OooO);
        sb.append(", events=");
        sb.append(this.f20045OooOO0);
        sb.append(", generatorType=");
        return p022Oooo00O.OooOO0.OooO0O0(sb, this.f20046OooOO0O, "}");
    }
}
