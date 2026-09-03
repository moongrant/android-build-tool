package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo extends CrashlyticsReport.OooO.OooO0o.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0 f19000OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final p362o0OOOoo.o00oO0o<CrashlyticsReport.OooO0OO> f19001OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final p362o0OOOoo.o00oO0o<CrashlyticsReport.OooO0OO> f19002OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Boolean f19003OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f19004OooO0o0;

    public static final class OooO0O0 extends CrashlyticsReport.OooO.OooO0o.OooO00o.AbstractC0137OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0 f19005OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public p362o0OOOoo.o00oO0o<CrashlyticsReport.OooO0OO> f19006OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public p362o0OOOoo.o00oO0o<CrashlyticsReport.OooO0OO> f19007OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Boolean f19008OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Integer f19009OooO0o0;

        public OooO0O0() {
        }

        public final CrashlyticsReport.OooO.OooO0o.OooO00o OooO00o() {
            String strOooO0Oo = this.f19005OooO00o == null ? " execution" : "";
            if (this.f19009OooO0o0 == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " uiOrientation");
            }
            if (strOooO0Oo.isEmpty()) {
                return new OooOo(this.f19005OooO00o, this.f19006OooO0O0, this.f19007OooO0OO, this.f19008OooO0Oo, this.f19009OooO0o0.intValue(), null);
            }
            throw new IllegalStateException(p016OooOoO0.OooOo00.OooO0Oo("Missing required properties:", strOooO0Oo));
        }

        public final CrashlyticsReport.OooO.OooO0o.OooO00o.AbstractC0137OooO00o OooO0O0(int i) {
            this.f19009OooO0o0 = Integer.valueOf(i);
            return this;
        }

        public OooO0O0(CrashlyticsReport.OooO.OooO0o.OooO00o oooO00o) {
            this.f19005OooO00o = oooO00o.OooO0OO();
            this.f19006OooO0O0 = oooO00o.OooO0O0();
            this.f19007OooO0OO = oooO00o.OooO0Oo();
            this.f19008OooO0Oo = oooO00o.OooO00o();
            this.f19009OooO0o0 = Integer.valueOf(oooO00o.OooO0o0());
        }
    }

    public OooOo(CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0 oooO0O0, p362o0OOOoo.o00oO0o o00oo0o2, p362o0OOOoo.o00oO0o o00oo0o3, Boolean bool, int i, OooO00o oooO00o) {
        this.f19000OooO00o = oooO0O0;
        this.f19001OooO0O0 = o00oo0o2;
        this.f19002OooO0OO = o00oo0o3;
        this.f19003OooO0Oo = bool;
        this.f19004OooO0o0 = i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o
    @Nullable
    public final Boolean OooO00o() {
        return this.f19003OooO0Oo;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o
    @Nullable
    public final p362o0OOOoo.o00oO0o<CrashlyticsReport.OooO0OO> OooO0O0() {
        return this.f19001OooO0O0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o
    @NonNull
    public final CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0 OooO0OO() {
        return this.f19000OooO00o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o
    @Nullable
    public final p362o0OOOoo.o00oO0o<CrashlyticsReport.OooO0OO> OooO0Oo() {
        return this.f19002OooO0OO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o
    public final CrashlyticsReport.OooO.OooO0o.OooO00o.AbstractC0137OooO00o OooO0o() {
        return new OooO0O0(this);
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o
    public final int OooO0o0() {
        return this.f19004OooO0o0;
    }

    public final boolean equals(Object obj) {
        p362o0OOOoo.o00oO0o<CrashlyticsReport.OooO0OO> o00oo0o2;
        p362o0OOOoo.o00oO0o<CrashlyticsReport.OooO0OO> o00oo0o3;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.OooO.OooO0o.OooO00o)) {
            return false;
        }
        CrashlyticsReport.OooO.OooO0o.OooO00o oooO00o = (CrashlyticsReport.OooO.OooO0o.OooO00o) obj;
        return this.f19000OooO00o.equals(oooO00o.OooO0OO()) && ((o00oo0o2 = this.f19001OooO0O0) != null ? o00oo0o2.equals(oooO00o.OooO0O0()) : oooO00o.OooO0O0() == null) && ((o00oo0o3 = this.f19002OooO0OO) != null ? o00oo0o3.equals(oooO00o.OooO0Oo()) : oooO00o.OooO0Oo() == null) && ((bool = this.f19003OooO0Oo) != null ? bool.equals(oooO00o.OooO00o()) : oooO00o.OooO00o() == null) && this.f19004OooO0o0 == oooO00o.OooO0o0();
    }

    public final int hashCode() {
        int iHashCode = (this.f19000OooO00o.hashCode() ^ 1000003) * 1000003;
        p362o0OOOoo.o00oO0o<CrashlyticsReport.OooO0OO> o00oo0o2 = this.f19001OooO0O0;
        int iHashCode2 = (iHashCode ^ (o00oo0o2 == null ? 0 : o00oo0o2.hashCode())) * 1000003;
        p362o0OOOoo.o00oO0o<CrashlyticsReport.OooO0OO> o00oo0o3 = this.f19002OooO0OO;
        int iHashCode3 = (iHashCode2 ^ (o00oo0o3 == null ? 0 : o00oo0o3.hashCode())) * 1000003;
        Boolean bool = this.f19003OooO0Oo;
        return ((iHashCode3 ^ (bool != null ? bool.hashCode() : 0)) * 1000003) ^ this.f19004OooO0o0;
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Application{execution=");
        sbOooO0o0.append(this.f19000OooO00o);
        sbOooO0o0.append(", customAttributes=");
        sbOooO0o0.append(this.f19001OooO0O0);
        sbOooO0o0.append(", internalKeys=");
        sbOooO0o0.append(this.f19002OooO0OO);
        sbOooO0o0.append(", background=");
        sbOooO0o0.append(this.f19003OooO0Oo);
        sbOooO0o0.append(", uiOrientation=");
        return o0O0O00.o0ooOOo.OooO00o(sbOooO0o0, this.f19004OooO0o0, "}");
    }
}
