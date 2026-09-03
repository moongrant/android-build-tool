package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO extends CrashlyticsReport.OooO.OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final String f18982OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f18983OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f18984OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f18985OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f18986OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f18987OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f18988OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f18989OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f18990OooO0oo;

    public static final class OooO00o extends CrashlyticsReport.OooO.OooO0OO.OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public String f18991OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Integer f18992OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f18993OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Integer f18994OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Long f18995OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Boolean f18996OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Long f18997OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Integer f18998OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public String f18999OooO0oo;

        public final CrashlyticsReport.OooO.OooO0OO OooO00o() {
            String strOooO0Oo = this.f18992OooO00o == null ? " arch" : "";
            if (this.f18993OooO0O0 == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " model");
            }
            if (this.f18994OooO0OO == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " cores");
            }
            if (this.f18995OooO0Oo == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " ram");
            }
            if (this.f18997OooO0o0 == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " diskSpace");
            }
            if (this.f18996OooO0o == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " simulator");
            }
            if (this.f18998OooO0oO == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " state");
            }
            if (this.f18999OooO0oo == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " manufacturer");
            }
            if (this.f18991OooO == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " modelClass");
            }
            if (strOooO0Oo.isEmpty()) {
                return new OooOOOO(this.f18992OooO00o.intValue(), this.f18993OooO0O0, this.f18994OooO0OO.intValue(), this.f18995OooO0Oo.longValue(), this.f18997OooO0o0.longValue(), this.f18996OooO0o.booleanValue(), this.f18998OooO0oO.intValue(), this.f18999OooO0oo, this.f18991OooO);
            }
            throw new IllegalStateException(p016OooOoO0.OooOo00.OooO0Oo("Missing required properties:", strOooO0Oo));
        }
    }

    public OooOOOO(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f18983OooO00o = i;
        this.f18984OooO0O0 = str;
        this.f18985OooO0OO = i2;
        this.f18986OooO0Oo = j;
        this.f18988OooO0o0 = j2;
        this.f18987OooO0o = z;
        this.f18989OooO0oO = i3;
        this.f18990OooO0oo = str2;
        this.f18982OooO = str3;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0OO
    public final boolean OooO() {
        return this.f18987OooO0o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0OO
    @NonNull
    public final int OooO00o() {
        return this.f18983OooO00o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0OO
    public final int OooO0O0() {
        return this.f18985OooO0OO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0OO
    public final long OooO0OO() {
        return this.f18988OooO0o0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0OO
    @NonNull
    public final String OooO0Oo() {
        return this.f18990OooO0oo;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0OO
    @NonNull
    public final String OooO0o() {
        return this.f18982OooO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0OO
    @NonNull
    public final String OooO0o0() {
        return this.f18984OooO0O0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0OO
    public final long OooO0oO() {
        return this.f18986OooO0Oo;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0OO
    public final int OooO0oo() {
        return this.f18989OooO0oO;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.OooO.OooO0OO)) {
            return false;
        }
        CrashlyticsReport.OooO.OooO0OO oooO0OO = (CrashlyticsReport.OooO.OooO0OO) obj;
        return this.f18983OooO00o == oooO0OO.OooO00o() && this.f18984OooO0O0.equals(oooO0OO.OooO0o0()) && this.f18985OooO0OO == oooO0OO.OooO0O0() && this.f18986OooO0Oo == oooO0OO.OooO0oO() && this.f18988OooO0o0 == oooO0OO.OooO0OO() && this.f18987OooO0o == oooO0OO.OooO() && this.f18989OooO0oO == oooO0OO.OooO0oo() && this.f18990OooO0oo.equals(oooO0OO.OooO0Oo()) && this.f18982OooO.equals(oooO0OO.OooO0o());
    }

    public final int hashCode() {
        int iHashCode = (((((this.f18983OooO00o ^ 1000003) * 1000003) ^ this.f18984OooO0O0.hashCode()) * 1000003) ^ this.f18985OooO0OO) * 1000003;
        long j = this.f18986OooO0Oo;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f18988OooO0o0;
        return ((((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f18987OooO0o ? 1231 : 1237)) * 1000003) ^ this.f18989OooO0oO) * 1000003) ^ this.f18990OooO0oo.hashCode()) * 1000003) ^ this.f18982OooO.hashCode();
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Device{arch=");
        sbOooO0o0.append(this.f18983OooO00o);
        sbOooO0o0.append(", model=");
        sbOooO0o0.append(this.f18984OooO0O0);
        sbOooO0o0.append(", cores=");
        sbOooO0o0.append(this.f18985OooO0OO);
        sbOooO0o0.append(", ram=");
        sbOooO0o0.append(this.f18986OooO0Oo);
        sbOooO0o0.append(", diskSpace=");
        sbOooO0o0.append(this.f18988OooO0o0);
        sbOooO0o0.append(", simulator=");
        sbOooO0o0.append(this.f18987OooO0o);
        sbOooO0o0.append(", state=");
        sbOooO0o0.append(this.f18989OooO0oO);
        sbOooO0o0.append(", manufacturer=");
        sbOooO0o0.append(this.f18990OooO0oo);
        sbOooO0o0.append(", modelClass=");
        return p058o0000OoO.OooO.OooO00o(sbOooO0o0, this.f18982OooO, "}");
    }
}
