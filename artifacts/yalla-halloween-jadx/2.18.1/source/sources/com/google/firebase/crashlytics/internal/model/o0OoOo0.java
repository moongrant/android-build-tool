package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoOo0 extends CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f19079OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f19080OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f19081OooO0OO;

    public static final class OooO00o extends CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.OooO0OO.AbstractC0142OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f19082OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f19083OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Long f19084OooO0OO;

        public final CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.OooO0OO OooO00o() {
            String strOooO0Oo = this.f19082OooO00o == null ? " name" : "";
            if (this.f19083OooO0O0 == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " code");
            }
            if (this.f19084OooO0OO == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " address");
            }
            if (strOooO0Oo.isEmpty()) {
                return new o0OoOo0(this.f19082OooO00o, this.f19083OooO0O0, this.f19084OooO0OO.longValue());
            }
            throw new IllegalStateException(p016OooOoO0.OooOo00.OooO0Oo("Missing required properties:", strOooO0Oo));
        }
    }

    public o0OoOo0(String str, String str2, long j) {
        this.f19079OooO00o = str;
        this.f19080OooO0O0 = str2;
        this.f19081OooO0OO = j;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.OooO0OO
    @NonNull
    public final long OooO00o() {
        return this.f19081OooO0OO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.OooO0OO
    @NonNull
    public final String OooO0O0() {
        return this.f19080OooO0O0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.OooO0OO
    @NonNull
    public final String OooO0OO() {
        return this.f19079OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.OooO0OO)) {
            return false;
        }
        CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.OooO0OO oooO0OO = (CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.OooO0OO) obj;
        return this.f19079OooO00o.equals(oooO0OO.OooO0OO()) && this.f19080OooO0O0.equals(oooO0OO.OooO0O0()) && this.f19081OooO0OO == oooO0OO.OooO00o();
    }

    public final int hashCode() {
        int iHashCode = (((this.f19079OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f19080OooO0O0.hashCode()) * 1000003;
        long j = this.f19081OooO0OO;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Signal{name=");
        sbOooO0o0.append(this.f19079OooO00o);
        sbOooO0o0.append(", code=");
        sbOooO0o0.append(this.f19080OooO0O0);
        sbOooO0o0.append(", address=");
        return android.support.v4.media.session.OooOOO0.OooO00o(sbOooO0o0, this.f19081OooO0OO, "}");
    }
}
