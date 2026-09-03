package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o00oO0o extends CrashlyticsReport.OooO.AbstractC0135OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f19071OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f19072OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f19073OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f19074OooO0Oo;

    public static final class OooO00o extends CrashlyticsReport.OooO.AbstractC0135OooO.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Integer f19075OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f19076OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public String f19077OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Boolean f19078OooO0Oo;

        public final CrashlyticsReport.OooO.AbstractC0135OooO OooO00o() {
            String strOooO0Oo = this.f19075OooO00o == null ? " platform" : "";
            if (this.f19076OooO0O0 == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " version");
            }
            if (this.f19077OooO0OO == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " buildVersion");
            }
            if (this.f19078OooO0Oo == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " jailbroken");
            }
            if (strOooO0Oo.isEmpty()) {
                return new o00oO0o(this.f19075OooO00o.intValue(), this.f19076OooO0O0, this.f19077OooO0OO, this.f19078OooO0Oo.booleanValue());
            }
            throw new IllegalStateException(p016OooOoO0.OooOo00.OooO0Oo("Missing required properties:", strOooO0Oo));
        }
    }

    public o00oO0o(int i, String str, String str2, boolean z) {
        this.f19071OooO00o = i;
        this.f19072OooO0O0 = str;
        this.f19073OooO0OO = str2;
        this.f19074OooO0Oo = z;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.AbstractC0135OooO
    @NonNull
    public final String OooO00o() {
        return this.f19073OooO0OO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.AbstractC0135OooO
    public final int OooO0O0() {
        return this.f19071OooO00o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.AbstractC0135OooO
    @NonNull
    public final String OooO0OO() {
        return this.f19072OooO0O0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.AbstractC0135OooO
    public final boolean OooO0Oo() {
        return this.f19074OooO0Oo;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.OooO.AbstractC0135OooO)) {
            return false;
        }
        CrashlyticsReport.OooO.AbstractC0135OooO abstractC0135OooO = (CrashlyticsReport.OooO.AbstractC0135OooO) obj;
        return this.f19071OooO00o == abstractC0135OooO.OooO0O0() && this.f19072OooO0O0.equals(abstractC0135OooO.OooO0OO()) && this.f19073OooO0OO.equals(abstractC0135OooO.OooO00o()) && this.f19074OooO0Oo == abstractC0135OooO.OooO0Oo();
    }

    public final int hashCode() {
        return ((((((this.f19071OooO00o ^ 1000003) * 1000003) ^ this.f19072OooO0O0.hashCode()) * 1000003) ^ this.f19073OooO0OO.hashCode()) * 1000003) ^ (this.f19074OooO0Oo ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("OperatingSystem{platform=");
        sbOooO0o0.append(this.f19071OooO00o);
        sbOooO0o0.append(", version=");
        sbOooO0o0.append(this.f19072OooO0O0);
        sbOooO0o0.append(", buildVersion=");
        sbOooO0o0.append(this.f19073OooO0OO);
        sbOooO0o0.append(", jailbroken=");
        sbOooO0o0.append(this.f19074OooO0Oo);
        sbOooO0o0.append("}");
        return sbOooO0o0.toString();
    }
}
