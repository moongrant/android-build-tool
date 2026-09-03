package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO extends CrashlyticsReport.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final p287o0O0Oo0.OooOO0<CrashlyticsReport.OooO00o.AbstractC0253OooO00o> f20004OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f20005OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f20006OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f20007OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f20008OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f20009OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f20010OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f20011OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f20012OooO0oo;

    public static final class OooO00o extends CrashlyticsReport.OooO00o.OooO0O0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public p287o0O0Oo0.OooOO0<CrashlyticsReport.OooO00o.AbstractC0253OooO00o> f20013OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Integer f20014OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f20015OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Integer f20016OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Integer f20017OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Long f20018OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Long f20019OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Long f20020OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public String f20021OooO0oo;

        public final OooO0OO OooO00o() {
            String strOooO00o = this.f20014OooO00o == null ? " pid" : "";
            if (this.f20015OooO0O0 == null) {
                strOooO00o = strOooO00o.concat(" processName");
            }
            if (this.f20016OooO0OO == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " reasonCode");
            }
            if (this.f20017OooO0Oo == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " importance");
            }
            if (this.f20019OooO0o0 == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " pss");
            }
            if (this.f20018OooO0o == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " rss");
            }
            if (this.f20020OooO0oO == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " timestamp");
            }
            if (strOooO00o.isEmpty()) {
                return new OooO0OO(this.f20014OooO00o.intValue(), this.f20015OooO0O0, this.f20016OooO0OO.intValue(), this.f20017OooO0Oo.intValue(), this.f20019OooO0o0.longValue(), this.f20018OooO0o.longValue(), this.f20020OooO0oO.longValue(), this.f20021OooO0oo, this.f20013OooO);
            }
            throw new IllegalStateException("Missing required properties:".concat(strOooO00o));
        }
    }

    public OooO0OO() {
        throw null;
    }

    public OooO0OO(int i, String str, int i2, int i3, long j, long j2, long j3, String str2, p287o0O0Oo0.OooOO0 oooOO1) {
        this.f20005OooO00o = i;
        this.f20006OooO0O0 = str;
        this.f20007OooO0OO = i2;
        this.f20008OooO0Oo = i3;
        this.f20010OooO0o0 = j;
        this.f20009OooO0o = j2;
        this.f20011OooO0oO = j3;
        this.f20012OooO0oo = str2;
        this.f20004OooO = oooOO1;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO00o
    @Nullable
    public final String OooO() {
        return this.f20012OooO0oo;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO00o
    @Nullable
    public final p287o0O0Oo0.OooOO0<CrashlyticsReport.OooO00o.AbstractC0253OooO00o> OooO00o() {
        return this.f20004OooO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO00o
    @NonNull
    public final int OooO0O0() {
        return this.f20008OooO0Oo;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO00o
    @NonNull
    public final int OooO0OO() {
        return this.f20005OooO00o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO00o
    @NonNull
    public final String OooO0Oo() {
        return this.f20006OooO0O0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO00o
    @NonNull
    public final int OooO0o() {
        return this.f20007OooO0OO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO00o
    @NonNull
    public final long OooO0o0() {
        return this.f20010OooO0o0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO00o
    @NonNull
    public final long OooO0oO() {
        return this.f20009OooO0o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO00o
    @NonNull
    public final long OooO0oo() {
        return this.f20011OooO0oO;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.OooO00o)) {
            return false;
        }
        CrashlyticsReport.OooO00o oooO00o = (CrashlyticsReport.OooO00o) obj;
        if (this.f20005OooO00o == oooO00o.OooO0OO() && this.f20006OooO0O0.equals(oooO00o.OooO0Oo()) && this.f20007OooO0OO == oooO00o.OooO0o() && this.f20008OooO0Oo == oooO00o.OooO0O0() && this.f20010OooO0o0 == oooO00o.OooO0o0() && this.f20009OooO0o == oooO00o.OooO0oO() && this.f20011OooO0oO == oooO00o.OooO0oo() && ((str = this.f20012OooO0oo) != null ? str.equals(oooO00o.OooO()) : oooO00o.OooO() == null)) {
            p287o0O0Oo0.OooOO0<CrashlyticsReport.OooO00o.AbstractC0253OooO00o> oooOO1 = this.f20004OooO;
            if (oooOO1 == null) {
                if (oooO00o.OooO00o() == null) {
                    return true;
                }
            } else if (oooOO1.equals(oooO00o.OooO00o())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f20005OooO00o ^ 1000003) * 1000003) ^ this.f20006OooO0O0.hashCode()) * 1000003) ^ this.f20007OooO0OO) * 1000003) ^ this.f20008OooO0Oo) * 1000003;
        long j = this.f20010OooO0o0;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f20009OooO0o;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f20011OooO0oO;
        int i3 = (i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str = this.f20012OooO0oo;
        int iHashCode2 = (i3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        p287o0O0Oo0.OooOO0<CrashlyticsReport.OooO00o.AbstractC0253OooO00o> oooOO1 = this.f20004OooO;
        return iHashCode2 ^ (oooOO1 != null ? oooOO1.hashCode() : 0);
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f20005OooO00o + ", processName=" + this.f20006OooO0O0 + ", reasonCode=" + this.f20007OooO0OO + ", importance=" + this.f20008OooO0Oo + ", pss=" + this.f20010OooO0o0 + ", rss=" + this.f20009OooO0o + ", timestamp=" + this.f20011OooO0oO + ", traceFile=" + this.f20012OooO0oo + ", buildIdMappingForArch=" + this.f20004OooO + "}";
    }
}
