package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO extends CrashlyticsReport.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final p291o0O0Oo0o.o00O0O<CrashlyticsReport.OooO00o.AbstractC0252OooO00o> f19532OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f19533OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f19534OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f19535OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f19536OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f19537OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f19538OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f19539OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f19540OooO0oo;

    public static final class OooO00o extends CrashlyticsReport.OooO00o.OooO0O0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public p291o0O0Oo0o.o00O0O<CrashlyticsReport.OooO00o.AbstractC0252OooO00o> f19541OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Integer f19542OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f19543OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Integer f19544OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Integer f19545OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Long f19546OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Long f19547OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Long f19548OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public String f19549OooO0oo;

        public final OooO0OO OooO00o() {
            String strOooO00o = this.f19542OooO00o == null ? " pid" : "";
            if (this.f19543OooO0O0 == null) {
                strOooO00o = strOooO00o.concat(" processName");
            }
            if (this.f19544OooO0OO == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " reasonCode");
            }
            if (this.f19545OooO0Oo == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " importance");
            }
            if (this.f19547OooO0o0 == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " pss");
            }
            if (this.f19546OooO0o == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " rss");
            }
            if (this.f19548OooO0oO == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " timestamp");
            }
            if (strOooO00o.isEmpty()) {
                return new OooO0OO(this.f19542OooO00o.intValue(), this.f19543OooO0O0, this.f19544OooO0OO.intValue(), this.f19545OooO0Oo.intValue(), this.f19547OooO0o0.longValue(), this.f19546OooO0o.longValue(), this.f19548OooO0oO.longValue(), this.f19549OooO0oo, this.f19541OooO);
            }
            throw new IllegalStateException("Missing required properties:".concat(strOooO00o));
        }
    }

    public OooO0OO() {
        throw null;
    }

    public OooO0OO(int i, String str, int i2, int i3, long j, long j2, long j3, String str2, p291o0O0Oo0o.o00O0O o00o0o2) {
        this.f19533OooO00o = i;
        this.f19534OooO0O0 = str;
        this.f19535OooO0OO = i2;
        this.f19536OooO0Oo = i3;
        this.f19538OooO0o0 = j;
        this.f19537OooO0o = j2;
        this.f19539OooO0oO = j3;
        this.f19540OooO0oo = str2;
        this.f19532OooO = o00o0o2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO00o
    @Nullable
    public final String OooO() {
        return this.f19540OooO0oo;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO00o
    @Nullable
    public final p291o0O0Oo0o.o00O0O<CrashlyticsReport.OooO00o.AbstractC0252OooO00o> OooO00o() {
        return this.f19532OooO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO00o
    @NonNull
    public final int OooO0O0() {
        return this.f19536OooO0Oo;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO00o
    @NonNull
    public final int OooO0OO() {
        return this.f19533OooO00o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO00o
    @NonNull
    public final String OooO0Oo() {
        return this.f19534OooO0O0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO00o
    @NonNull
    public final int OooO0o() {
        return this.f19535OooO0OO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO00o
    @NonNull
    public final long OooO0o0() {
        return this.f19538OooO0o0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO00o
    @NonNull
    public final long OooO0oO() {
        return this.f19537OooO0o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO00o
    @NonNull
    public final long OooO0oo() {
        return this.f19539OooO0oO;
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
        if (this.f19533OooO00o == oooO00o.OooO0OO() && this.f19534OooO0O0.equals(oooO00o.OooO0Oo()) && this.f19535OooO0OO == oooO00o.OooO0o() && this.f19536OooO0Oo == oooO00o.OooO0O0() && this.f19538OooO0o0 == oooO00o.OooO0o0() && this.f19537OooO0o == oooO00o.OooO0oO() && this.f19539OooO0oO == oooO00o.OooO0oo() && ((str = this.f19540OooO0oo) != null ? str.equals(oooO00o.OooO()) : oooO00o.OooO() == null)) {
            p291o0O0Oo0o.o00O0O<CrashlyticsReport.OooO00o.AbstractC0252OooO00o> o00o0o2 = this.f19532OooO;
            if (o00o0o2 == null) {
                if (oooO00o.OooO00o() == null) {
                    return true;
                }
            } else if (o00o0o2.equals(oooO00o.OooO00o())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f19533OooO00o ^ 1000003) * 1000003) ^ this.f19534OooO0O0.hashCode()) * 1000003) ^ this.f19535OooO0OO) * 1000003) ^ this.f19536OooO0Oo) * 1000003;
        long j = this.f19538OooO0o0;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f19537OooO0o;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f19539OooO0oO;
        int i3 = (i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str = this.f19540OooO0oo;
        int iHashCode2 = (i3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        p291o0O0Oo0o.o00O0O<CrashlyticsReport.OooO00o.AbstractC0252OooO00o> o00o0o2 = this.f19532OooO;
        return iHashCode2 ^ (o00o0o2 != null ? o00o0o2.hashCode() : 0);
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f19533OooO00o + ", processName=" + this.f19534OooO0O0 + ", reasonCode=" + this.f19535OooO0OO + ", importance=" + this.f19536OooO0Oo + ", pss=" + this.f19538OooO0o0 + ", rss=" + this.f19537OooO0o + ", timestamp=" + this.f19539OooO0oO + ", traceFile=" + this.f19540OooO0oo + ", buildIdMappingForArch=" + this.f19532OooO + "}";
    }
}
