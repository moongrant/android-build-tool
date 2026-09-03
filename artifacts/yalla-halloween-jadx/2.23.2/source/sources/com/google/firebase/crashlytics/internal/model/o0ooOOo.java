package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o0ooOOo extends CrashlyticsReport.OooO.AbstractC0242OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f19660OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f19661OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f19662OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f19663OooO0Oo;

    public static final class OooO00o extends CrashlyticsReport.OooO.AbstractC0242OooO.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Integer f19664OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f19665OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public String f19666OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Boolean f19667OooO0Oo;

        public final o0ooOOo OooO00o() {
            String strOooO00o = this.f19664OooO00o == null ? " platform" : "";
            if (this.f19665OooO0O0 == null) {
                strOooO00o = strOooO00o.concat(" version");
            }
            if (this.f19666OooO0OO == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " buildVersion");
            }
            if (this.f19667OooO0Oo == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " jailbroken");
            }
            if (strOooO00o.isEmpty()) {
                return new o0ooOOo(this.f19664OooO00o.intValue(), this.f19665OooO0O0, this.f19666OooO0OO, this.f19667OooO0Oo.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strOooO00o));
        }
    }

    public o0ooOOo(int i, String str, String str2, boolean z) {
        this.f19660OooO00o = i;
        this.f19661OooO0O0 = str;
        this.f19662OooO0OO = str2;
        this.f19663OooO0Oo = z;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.AbstractC0242OooO
    @NonNull
    public final String OooO00o() {
        return this.f19662OooO0OO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.AbstractC0242OooO
    public final int OooO0O0() {
        return this.f19660OooO00o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.AbstractC0242OooO
    @NonNull
    public final String OooO0OO() {
        return this.f19661OooO0O0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.AbstractC0242OooO
    public final boolean OooO0Oo() {
        return this.f19663OooO0Oo;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.OooO.AbstractC0242OooO)) {
            return false;
        }
        CrashlyticsReport.OooO.AbstractC0242OooO abstractC0242OooO = (CrashlyticsReport.OooO.AbstractC0242OooO) obj;
        return this.f19660OooO00o == abstractC0242OooO.OooO0O0() && this.f19661OooO0O0.equals(abstractC0242OooO.OooO0OO()) && this.f19662OooO0OO.equals(abstractC0242OooO.OooO00o()) && this.f19663OooO0Oo == abstractC0242OooO.OooO0Oo();
    }

    public final int hashCode() {
        return ((((((this.f19660OooO00o ^ 1000003) * 1000003) ^ this.f19661OooO0O0.hashCode()) * 1000003) ^ this.f19662OooO0OO.hashCode()) * 1000003) ^ (this.f19663OooO0Oo ? 1231 : 1237);
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f19660OooO00o + ", version=" + this.f19661OooO0O0 + ", buildVersion=" + this.f19662OooO0OO + ", jailbroken=" + this.f19663OooO0Oo + "}";
    }
}
