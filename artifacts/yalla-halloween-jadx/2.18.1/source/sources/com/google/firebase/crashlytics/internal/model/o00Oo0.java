package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Oo0 extends CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0143OooO0o.AbstractC0145OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f19049OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f19050OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f19051OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f19052OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f19053OooO0o0;

    public static final class OooO00o extends CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0143OooO0o.AbstractC0145OooO0O0.AbstractC0146OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Long f19054OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f19055OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public String f19056OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Long f19057OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Integer f19058OooO0o0;

        public final CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0143OooO0o.AbstractC0145OooO0O0 OooO00o() {
            String strOooO0Oo = this.f19054OooO00o == null ? " pc" : "";
            if (this.f19055OooO0O0 == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " symbol");
            }
            if (this.f19057OooO0Oo == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " offset");
            }
            if (this.f19058OooO0o0 == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " importance");
            }
            if (strOooO0Oo.isEmpty()) {
                return new o00Oo0(this.f19054OooO00o.longValue(), this.f19055OooO0O0, this.f19056OooO0OO, this.f19057OooO0Oo.longValue(), this.f19058OooO0o0.intValue());
            }
            throw new IllegalStateException(p016OooOoO0.OooOo00.OooO0Oo("Missing required properties:", strOooO0Oo));
        }
    }

    public o00Oo0(long j, String str, String str2, long j2, int i) {
        this.f19049OooO00o = j;
        this.f19050OooO0O0 = str;
        this.f19051OooO0OO = str2;
        this.f19052OooO0Oo = j2;
        this.f19053OooO0o0 = i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0143OooO0o.AbstractC0145OooO0O0
    @Nullable
    public final String OooO00o() {
        return this.f19051OooO0OO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0143OooO0o.AbstractC0145OooO0O0
    public final int OooO0O0() {
        return this.f19053OooO0o0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0143OooO0o.AbstractC0145OooO0O0
    public final long OooO0OO() {
        return this.f19052OooO0Oo;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0143OooO0o.AbstractC0145OooO0O0
    public final long OooO0Oo() {
        return this.f19049OooO00o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0143OooO0o.AbstractC0145OooO0O0
    @NonNull
    public final String OooO0o0() {
        return this.f19050OooO0O0;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0143OooO0o.AbstractC0145OooO0O0)) {
            return false;
        }
        CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0143OooO0o.AbstractC0145OooO0O0 abstractC0145OooO0O0 = (CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0143OooO0o.AbstractC0145OooO0O0) obj;
        return this.f19049OooO00o == abstractC0145OooO0O0.OooO0Oo() && this.f19050OooO0O0.equals(abstractC0145OooO0O0.OooO0o0()) && ((str = this.f19051OooO0OO) != null ? str.equals(abstractC0145OooO0O0.OooO00o()) : abstractC0145OooO0O0.OooO00o() == null) && this.f19052OooO0Oo == abstractC0145OooO0O0.OooO0OO() && this.f19053OooO0o0 == abstractC0145OooO0O0.OooO0O0();
    }

    public final int hashCode() {
        long j = this.f19049OooO00o;
        int iHashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f19050OooO0O0.hashCode()) * 1000003;
        String str = this.f19051OooO0OO;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j2 = this.f19052OooO0Oo;
        return this.f19053OooO0o0 ^ ((iHashCode2 ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Frame{pc=");
        sbOooO0o0.append(this.f19049OooO00o);
        sbOooO0o0.append(", symbol=");
        sbOooO0o0.append(this.f19050OooO0O0);
        sbOooO0o0.append(", file=");
        sbOooO0o0.append(this.f19051OooO0OO);
        sbOooO0o0.append(", offset=");
        sbOooO0o0.append(this.f19052OooO0Oo);
        sbOooO0o0.append(", importance=");
        return o0O0O00.o0ooOOo.OooO00o(sbOooO0o0, this.f19053OooO0o0, "}");
    }
}
