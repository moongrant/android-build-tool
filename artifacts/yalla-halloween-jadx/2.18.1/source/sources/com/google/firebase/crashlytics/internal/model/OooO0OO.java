package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO extends CrashlyticsReport.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f18931OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f18932OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f18933OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f18934OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f18935OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f18936OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f18937OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f18938OooO0oo;

    public static final class OooO00o extends CrashlyticsReport.OooO00o.AbstractC0148OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Integer f18939OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f18940OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Integer f18941OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Integer f18942OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Long f18943OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Long f18944OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Long f18945OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public String f18946OooO0oo;

        public final CrashlyticsReport.OooO00o OooO00o() {
            String strOooO0Oo = this.f18939OooO00o == null ? " pid" : "";
            if (this.f18940OooO0O0 == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " processName");
            }
            if (this.f18941OooO0OO == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " reasonCode");
            }
            if (this.f18942OooO0Oo == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " importance");
            }
            if (this.f18944OooO0o0 == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " pss");
            }
            if (this.f18943OooO0o == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " rss");
            }
            if (this.f18945OooO0oO == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " timestamp");
            }
            if (strOooO0Oo.isEmpty()) {
                return new OooO0OO(this.f18939OooO00o.intValue(), this.f18940OooO0O0, this.f18941OooO0OO.intValue(), this.f18942OooO0Oo.intValue(), this.f18944OooO0o0.longValue(), this.f18943OooO0o.longValue(), this.f18945OooO0oO.longValue(), this.f18946OooO0oo);
            }
            throw new IllegalStateException(p016OooOoO0.OooOo00.OooO0Oo("Missing required properties:", strOooO0Oo));
        }
    }

    public OooO0OO(int i, String str, int i2, int i3, long j, long j2, long j3, String str2) {
        this.f18931OooO00o = i;
        this.f18932OooO0O0 = str;
        this.f18933OooO0OO = i2;
        this.f18934OooO0Oo = i3;
        this.f18936OooO0o0 = j;
        this.f18935OooO0o = j2;
        this.f18937OooO0oO = j3;
        this.f18938OooO0oo = str2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO00o
    @NonNull
    public final int OooO00o() {
        return this.f18934OooO0Oo;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO00o
    @NonNull
    public final int OooO0O0() {
        return this.f18931OooO00o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO00o
    @NonNull
    public final String OooO0OO() {
        return this.f18932OooO0O0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO00o
    @NonNull
    public final long OooO0Oo() {
        return this.f18936OooO0o0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO00o
    @NonNull
    public final long OooO0o() {
        return this.f18935OooO0o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO00o
    @NonNull
    public final int OooO0o0() {
        return this.f18933OooO0OO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO00o
    @NonNull
    public final long OooO0oO() {
        return this.f18937OooO0oO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO00o
    @Nullable
    public final String OooO0oo() {
        return this.f18938OooO0oo;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.OooO00o)) {
            return false;
        }
        CrashlyticsReport.OooO00o oooO00o = (CrashlyticsReport.OooO00o) obj;
        if (this.f18931OooO00o == oooO00o.OooO0O0() && this.f18932OooO0O0.equals(oooO00o.OooO0OO()) && this.f18933OooO0OO == oooO00o.OooO0o0() && this.f18934OooO0Oo == oooO00o.OooO00o() && this.f18936OooO0o0 == oooO00o.OooO0Oo() && this.f18935OooO0o == oooO00o.OooO0o() && this.f18937OooO0oO == oooO00o.OooO0oO()) {
            String str = this.f18938OooO0oo;
            if (str == null) {
                if (oooO00o.OooO0oo() == null) {
                    return true;
                }
            } else if (str.equals(oooO00o.OooO0oo())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f18931OooO00o ^ 1000003) * 1000003) ^ this.f18932OooO0O0.hashCode()) * 1000003) ^ this.f18933OooO0OO) * 1000003) ^ this.f18934OooO0Oo) * 1000003;
        long j = this.f18936OooO0o0;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f18935OooO0o;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f18937OooO0oO;
        int i3 = (i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str = this.f18938OooO0oo;
        return i3 ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ApplicationExitInfo{pid=");
        sbOooO0o0.append(this.f18931OooO00o);
        sbOooO0o0.append(", processName=");
        sbOooO0o0.append(this.f18932OooO0O0);
        sbOooO0o0.append(", reasonCode=");
        sbOooO0o0.append(this.f18933OooO0OO);
        sbOooO0o0.append(", importance=");
        sbOooO0o0.append(this.f18934OooO0Oo);
        sbOooO0o0.append(", pss=");
        sbOooO0o0.append(this.f18936OooO0o0);
        sbOooO0o0.append(", rss=");
        sbOooO0o0.append(this.f18935OooO0o);
        sbOooO0o0.append(", timestamp=");
        sbOooO0o0.append(this.f18937OooO0oO);
        sbOooO0o0.append(", traceFile=");
        return p058o0000OoO.OooO.OooO00o(sbOooO0o0, this.f18938OooO0oo, "}");
    }
}
