package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o000oOoO extends CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0140OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f19033OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f19034OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final p362o0OOOoo.o00oO0o<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0143OooO0o.AbstractC0145OooO0O0> f19035OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0140OooO0O0 f19036OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f19037OooO0o0;

    public static final class OooO0O0 extends CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0140OooO0O0.AbstractC0141OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f19038OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f19039OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public p362o0OOOoo.o00oO0o<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0143OooO0o.AbstractC0145OooO0O0> f19040OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0140OooO0O0 f19041OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Integer f19042OooO0o0;

        public final CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0140OooO0O0 OooO00o() {
            String strOooO0Oo = this.f19038OooO00o == null ? " type" : "";
            if (this.f19040OooO0OO == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " frames");
            }
            if (this.f19042OooO0o0 == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " overflowCount");
            }
            if (strOooO0Oo.isEmpty()) {
                return new o000oOoO(this.f19038OooO00o, this.f19039OooO0O0, this.f19040OooO0OO, this.f19041OooO0Oo, this.f19042OooO0o0.intValue(), null);
            }
            throw new IllegalStateException(p016OooOoO0.OooOo00.OooO0Oo("Missing required properties:", strOooO0Oo));
        }
    }

    public o000oOoO(String str, String str2, p362o0OOOoo.o00oO0o o00oo0o2, CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0140OooO0O0 abstractC0140OooO0O0, int i, OooO00o oooO00o) {
        this.f19033OooO00o = str;
        this.f19034OooO0O0 = str2;
        this.f19035OooO0OO = o00oo0o2;
        this.f19036OooO0Oo = abstractC0140OooO0O0;
        this.f19037OooO0o0 = i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0140OooO0O0
    @Nullable
    public final CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0140OooO0O0 OooO00o() {
        return this.f19036OooO0Oo;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0140OooO0O0
    @NonNull
    public final p362o0OOOoo.o00oO0o<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0143OooO0o.AbstractC0145OooO0O0> OooO0O0() {
        return this.f19035OooO0OO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0140OooO0O0
    public final int OooO0OO() {
        return this.f19037OooO0o0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0140OooO0O0
    @Nullable
    public final String OooO0Oo() {
        return this.f19034OooO0O0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0140OooO0O0
    @NonNull
    public final String OooO0o0() {
        return this.f19033OooO00o;
    }

    public final boolean equals(Object obj) {
        String str;
        CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0140OooO0O0 abstractC0140OooO0O0;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0140OooO0O0)) {
            return false;
        }
        CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0140OooO0O0 abstractC0140OooO0O1 = (CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0140OooO0O0) obj;
        return this.f19033OooO00o.equals(abstractC0140OooO0O1.OooO0o0()) && ((str = this.f19034OooO0O0) != null ? str.equals(abstractC0140OooO0O1.OooO0Oo()) : abstractC0140OooO0O1.OooO0Oo() == null) && this.f19035OooO0OO.equals(abstractC0140OooO0O1.OooO0O0()) && ((abstractC0140OooO0O0 = this.f19036OooO0Oo) != null ? abstractC0140OooO0O0.equals(abstractC0140OooO0O1.OooO00o()) : abstractC0140OooO0O1.OooO00o() == null) && this.f19037OooO0o0 == abstractC0140OooO0O1.OooO0OO();
    }

    public final int hashCode() {
        int iHashCode = (this.f19033OooO00o.hashCode() ^ 1000003) * 1000003;
        String str = this.f19034OooO0O0;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f19035OooO0OO.hashCode()) * 1000003;
        CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0140OooO0O0 abstractC0140OooO0O0 = this.f19036OooO0Oo;
        return ((iHashCode2 ^ (abstractC0140OooO0O0 != null ? abstractC0140OooO0O0.hashCode() : 0)) * 1000003) ^ this.f19037OooO0o0;
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Exception{type=");
        sbOooO0o0.append(this.f19033OooO00o);
        sbOooO0o0.append(", reason=");
        sbOooO0o0.append(this.f19034OooO0O0);
        sbOooO0o0.append(", frames=");
        sbOooO0o0.append(this.f19035OooO0OO);
        sbOooO0o0.append(", causedBy=");
        sbOooO0o0.append(this.f19036OooO0Oo);
        sbOooO0o0.append(", overflowCount=");
        return o0O0O00.o0ooOOo.OooO00o(sbOooO0o0, this.f19037OooO0o0, "}");
    }
}
