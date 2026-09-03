package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o0ooOOo extends CrashlyticsReport.OooO.AbstractC0243OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f20132OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f20133OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f20134OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f20135OooO0Oo;

    public static final class OooO00o extends CrashlyticsReport.OooO.AbstractC0243OooO.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Integer f20136OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f20137OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public String f20138OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Boolean f20139OooO0Oo;

        public final o0ooOOo OooO00o() {
            String strOooO00o = this.f20136OooO00o == null ? " platform" : "";
            if (this.f20137OooO0O0 == null) {
                strOooO00o = strOooO00o.concat(" version");
            }
            if (this.f20138OooO0OO == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " buildVersion");
            }
            if (this.f20139OooO0Oo == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " jailbroken");
            }
            if (strOooO00o.isEmpty()) {
                return new o0ooOOo(this.f20136OooO00o.intValue(), this.f20137OooO0O0, this.f20138OooO0OO, this.f20139OooO0Oo.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strOooO00o));
        }
    }

    public o0ooOOo(int i, String str, String str2, boolean z) {
        this.f20132OooO00o = i;
        this.f20133OooO0O0 = str;
        this.f20134OooO0OO = str2;
        this.f20135OooO0Oo = z;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.AbstractC0243OooO
    @NonNull
    public final String OooO00o() {
        return this.f20134OooO0OO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.AbstractC0243OooO
    public final int OooO0O0() {
        return this.f20132OooO00o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.AbstractC0243OooO
    @NonNull
    public final String OooO0OO() {
        return this.f20133OooO0O0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.AbstractC0243OooO
    public final boolean OooO0Oo() {
        return this.f20135OooO0Oo;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.OooO.AbstractC0243OooO)) {
            return false;
        }
        CrashlyticsReport.OooO.AbstractC0243OooO abstractC0243OooO = (CrashlyticsReport.OooO.AbstractC0243OooO) obj;
        return this.f20132OooO00o == abstractC0243OooO.OooO0O0() && this.f20133OooO0O0.equals(abstractC0243OooO.OooO0OO()) && this.f20134OooO0OO.equals(abstractC0243OooO.OooO00o()) && this.f20135OooO0Oo == abstractC0243OooO.OooO0Oo();
    }

    public final int hashCode() {
        return ((((((this.f20132OooO00o ^ 1000003) * 1000003) ^ this.f20133OooO0O0.hashCode()) * 1000003) ^ this.f20134OooO0OO.hashCode()) * 1000003) ^ (this.f20135OooO0Oo ? 1231 : 1237);
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f20132OooO00o + ", version=" + this.f20133OooO0O0 + ", buildVersion=" + this.f20134OooO0OO + ", jailbroken=" + this.f20135OooO0Oo + "}";
    }
}
