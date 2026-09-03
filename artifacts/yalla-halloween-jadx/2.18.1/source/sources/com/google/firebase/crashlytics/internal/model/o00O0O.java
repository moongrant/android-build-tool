package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O extends CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0143OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f19043OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f19044OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final p362o0OOOoo.o00oO0o<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0143OooO0o.AbstractC0145OooO0O0> f19045OooO0OO;

    public static final class OooO0O0 extends CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0143OooO0o.AbstractC0144OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f19046OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Integer f19047OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public p362o0OOOoo.o00oO0o<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0143OooO0o.AbstractC0145OooO0O0> f19048OooO0OO;

        public final CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0143OooO0o OooO00o() {
            String strOooO0Oo = this.f19046OooO00o == null ? " name" : "";
            if (this.f19047OooO0O0 == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " importance");
            }
            if (this.f19048OooO0OO == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " frames");
            }
            if (strOooO0Oo.isEmpty()) {
                return new o00O0O(this.f19046OooO00o, this.f19047OooO0O0.intValue(), this.f19048OooO0OO, null);
            }
            throw new IllegalStateException(p016OooOoO0.OooOo00.OooO0Oo("Missing required properties:", strOooO0Oo));
        }
    }

    public o00O0O(String str, int i, p362o0OOOoo.o00oO0o o00oo0o2, OooO00o oooO00o) {
        this.f19043OooO00o = str;
        this.f19044OooO0O0 = i;
        this.f19045OooO0OO = o00oo0o2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0143OooO0o
    @NonNull
    public final p362o0OOOoo.o00oO0o<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0143OooO0o.AbstractC0145OooO0O0> OooO00o() {
        return this.f19045OooO0OO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0143OooO0o
    public final int OooO0O0() {
        return this.f19044OooO0O0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0143OooO0o
    @NonNull
    public final String OooO0OO() {
        return this.f19043OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0143OooO0o)) {
            return false;
        }
        CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0143OooO0o abstractC0143OooO0o = (CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0143OooO0o) obj;
        return this.f19043OooO00o.equals(abstractC0143OooO0o.OooO0OO()) && this.f19044OooO0O0 == abstractC0143OooO0o.OooO0O0() && this.f19045OooO0OO.equals(abstractC0143OooO0o.OooO00o());
    }

    public final int hashCode() {
        return ((((this.f19043OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f19044OooO0O0) * 1000003) ^ this.f19045OooO0OO.hashCode();
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Thread{name=");
        sbOooO0o0.append(this.f19043OooO00o);
        sbOooO0o0.append(", importance=");
        sbOooO0o0.append(this.f19044OooO0O0);
        sbOooO0o0.append(", frames=");
        sbOooO0o0.append(this.f19045OooO0OO);
        sbOooO0o0.append("}");
        return sbOooO0o0.toString();
    }
}
