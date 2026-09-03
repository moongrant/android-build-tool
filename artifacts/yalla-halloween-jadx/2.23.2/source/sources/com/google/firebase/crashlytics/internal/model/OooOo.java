package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo extends CrashlyticsReport.OooO.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f19586OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f19587OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final CrashlyticsReport.OooO.OooO0o.OooO00o f19588OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final CrashlyticsReport.OooO.OooO0o.OooO0OO f19589OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final CrashlyticsReport.OooO.OooO0o.AbstractC0251OooO0o f19590OooO0o0;

    public static final class OooO00o extends CrashlyticsReport.OooO.OooO0o.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Long f19591OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f19592OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public CrashlyticsReport.OooO.OooO0o.OooO00o f19593OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public CrashlyticsReport.OooO.OooO0o.OooO0OO f19594OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public CrashlyticsReport.OooO.OooO0o.AbstractC0251OooO0o f19595OooO0o0;

        public OooO00o(CrashlyticsReport.OooO.OooO0o oooO0o) {
            this.f19591OooO00o = Long.valueOf(oooO0o.OooO0Oo());
            this.f19592OooO0O0 = oooO0o.OooO0o0();
            this.f19593OooO0OO = oooO0o.OooO00o();
            this.f19594OooO0Oo = oooO0o.OooO0O0();
            this.f19595OooO0o0 = oooO0o.OooO0OO();
        }

        public final OooOo OooO00o() {
            String strOooO00o = this.f19591OooO00o == null ? " timestamp" : "";
            if (this.f19592OooO0O0 == null) {
                strOooO00o = strOooO00o.concat(" type");
            }
            if (this.f19593OooO0OO == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " app");
            }
            if (this.f19594OooO0Oo == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " device");
            }
            if (strOooO00o.isEmpty()) {
                return new OooOo(this.f19591OooO00o.longValue(), this.f19592OooO0O0, this.f19593OooO0OO, this.f19594OooO0Oo, this.f19595OooO0o0);
            }
            throw new IllegalStateException("Missing required properties:".concat(strOooO00o));
        }
    }

    public OooOo(long j, String str, CrashlyticsReport.OooO.OooO0o.OooO00o oooO00o, CrashlyticsReport.OooO.OooO0o.OooO0OO oooO0OO, CrashlyticsReport.OooO.OooO0o.AbstractC0251OooO0o abstractC0251OooO0o) {
        this.f19586OooO00o = j;
        this.f19587OooO0O0 = str;
        this.f19588OooO0OO = oooO00o;
        this.f19589OooO0Oo = oooO0OO;
        this.f19590OooO0o0 = abstractC0251OooO0o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o
    @NonNull
    public final CrashlyticsReport.OooO.OooO0o.OooO00o OooO00o() {
        return this.f19588OooO0OO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o
    @NonNull
    public final CrashlyticsReport.OooO.OooO0o.OooO0OO OooO0O0() {
        return this.f19589OooO0Oo;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o
    @Nullable
    public final CrashlyticsReport.OooO.OooO0o.AbstractC0251OooO0o OooO0OO() {
        return this.f19590OooO0o0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o
    public final long OooO0Oo() {
        return this.f19586OooO00o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o
    @NonNull
    public final String OooO0o0() {
        return this.f19587OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.OooO.OooO0o)) {
            return false;
        }
        CrashlyticsReport.OooO.OooO0o oooO0o = (CrashlyticsReport.OooO.OooO0o) obj;
        if (this.f19586OooO00o == oooO0o.OooO0Oo() && this.f19587OooO0O0.equals(oooO0o.OooO0o0()) && this.f19588OooO0OO.equals(oooO0o.OooO00o()) && this.f19589OooO0Oo.equals(oooO0o.OooO0O0())) {
            CrashlyticsReport.OooO.OooO0o.AbstractC0251OooO0o abstractC0251OooO0o = this.f19590OooO0o0;
            if (abstractC0251OooO0o == null) {
                if (oooO0o.OooO0OO() == null) {
                    return true;
                }
            } else if (abstractC0251OooO0o.equals(oooO0o.OooO0OO())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f19586OooO00o;
        int iHashCode = (((((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.f19587OooO0O0.hashCode()) * 1000003) ^ this.f19588OooO0OO.hashCode()) * 1000003) ^ this.f19589OooO0Oo.hashCode()) * 1000003;
        CrashlyticsReport.OooO.OooO0o.AbstractC0251OooO0o abstractC0251OooO0o = this.f19590OooO0o0;
        return iHashCode ^ (abstractC0251OooO0o == null ? 0 : abstractC0251OooO0o.hashCode());
    }

    public final String toString() {
        return "Event{timestamp=" + this.f19586OooO00o + ", type=" + this.f19587OooO0O0 + ", app=" + this.f19588OooO0OO + ", device=" + this.f19589OooO0Oo + ", log=" + this.f19590OooO0o0 + "}";
    }
}
