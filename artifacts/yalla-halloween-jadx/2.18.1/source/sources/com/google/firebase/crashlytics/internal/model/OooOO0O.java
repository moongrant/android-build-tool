package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.annotations.Encodable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O extends CrashlyticsReport.OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final CrashlyticsReport.OooO.OooO0OO f18953OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f18954OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f18955OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f18956OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Long f18957OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final CrashlyticsReport.OooO.OooO00o f18958OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f18959OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final CrashlyticsReport.OooO.OooOO0 f18960OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final CrashlyticsReport.OooO.AbstractC0135OooO f18961OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final p362o0OOOoo.o00oO0o<CrashlyticsReport.OooO.OooO0o> f18962OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final int f18963OooOO0O;

    public static final class OooO0O0 extends CrashlyticsReport.OooO.OooO0O0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public CrashlyticsReport.OooO.OooO0OO f18964OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f18965OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f18966OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Long f18967OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Long f18968OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public CrashlyticsReport.OooO.OooO00o f18969OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Boolean f18970OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public CrashlyticsReport.OooO.OooOO0 f18971OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public CrashlyticsReport.OooO.AbstractC0135OooO f18972OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public p362o0OOOoo.o00oO0o<CrashlyticsReport.OooO.OooO0o> f18973OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public Integer f18974OooOO0O;

        public OooO0O0() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0O0
        public final CrashlyticsReport.OooO OooO00o() {
            String strOooO0Oo = this.f18965OooO00o == null ? " generator" : "";
            if (this.f18966OooO0O0 == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " identifier");
            }
            if (this.f18967OooO0OO == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " startedAt");
            }
            if (this.f18970OooO0o0 == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " crashed");
            }
            if (this.f18969OooO0o == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " app");
            }
            if (this.f18974OooOO0O == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " generatorType");
            }
            if (strOooO0Oo.isEmpty()) {
                return new OooOO0O(this.f18965OooO00o, this.f18966OooO0O0, this.f18967OooO0OO.longValue(), this.f18968OooO0Oo, this.f18970OooO0o0.booleanValue(), this.f18969OooO0o, this.f18971OooO0oO, this.f18972OooO0oo, this.f18964OooO, this.f18973OooOO0, this.f18974OooOO0O.intValue(), null);
            }
            throw new IllegalStateException(p016OooOoO0.OooOo00.OooO0Oo("Missing required properties:", strOooO0Oo));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0O0
        public final CrashlyticsReport.OooO.OooO0O0 OooO0O0(boolean z) {
            this.f18970OooO0o0 = Boolean.valueOf(z);
            return this;
        }

        public OooO0O0(CrashlyticsReport.OooO oooO) {
            this.f18965OooO00o = oooO.OooO0o0();
            this.f18966OooO0O0 = oooO.OooO0oO();
            this.f18967OooO0OO = Long.valueOf(oooO.OooO());
            this.f18968OooO0Oo = oooO.OooO0OO();
            this.f18970OooO0o0 = Boolean.valueOf(oooO.OooOO0O());
            this.f18969OooO0o = oooO.OooO00o();
            this.f18971OooO0oO = oooO.OooOO0();
            this.f18972OooO0oo = oooO.OooO0oo();
            this.f18964OooO = oooO.OooO0O0();
            this.f18973OooOO0 = oooO.OooO0Oo();
            this.f18974OooOO0O = Integer.valueOf(oooO.OooO0o());
        }
    }

    public OooOO0O(String str, String str2, long j, Long l, boolean z, CrashlyticsReport.OooO.OooO00o oooO00o, CrashlyticsReport.OooO.OooOO0 oooOO1, CrashlyticsReport.OooO.AbstractC0135OooO abstractC0135OooO, CrashlyticsReport.OooO.OooO0OO oooO0OO, p362o0OOOoo.o00oO0o o00oo0o2, int i, OooO00o oooO00o2) {
        this.f18954OooO00o = str;
        this.f18955OooO0O0 = str2;
        this.f18956OooO0OO = j;
        this.f18957OooO0Oo = l;
        this.f18959OooO0o0 = z;
        this.f18958OooO0o = oooO00o;
        this.f18960OooO0oO = oooOO1;
        this.f18961OooO0oo = abstractC0135OooO;
        this.f18953OooO = oooO0OO;
        this.f18962OooOO0 = o00oo0o2;
        this.f18963OooOO0O = i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO
    public final long OooO() {
        return this.f18956OooO0OO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO
    @NonNull
    public final CrashlyticsReport.OooO.OooO00o OooO00o() {
        return this.f18958OooO0o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO
    @Nullable
    public final CrashlyticsReport.OooO.OooO0OO OooO0O0() {
        return this.f18953OooO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO
    @Nullable
    public final Long OooO0OO() {
        return this.f18957OooO0Oo;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO
    @Nullable
    public final p362o0OOOoo.o00oO0o<CrashlyticsReport.OooO.OooO0o> OooO0Oo() {
        return this.f18962OooOO0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO
    public final int OooO0o() {
        return this.f18963OooOO0O;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO
    @NonNull
    public final String OooO0o0() {
        return this.f18954OooO00o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO
    @NonNull
    @Encodable.Ignore
    public final String OooO0oO() {
        return this.f18955OooO0O0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO
    @Nullable
    public final CrashlyticsReport.OooO.AbstractC0135OooO OooO0oo() {
        return this.f18961OooO0oo;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO
    @Nullable
    public final CrashlyticsReport.OooO.OooOO0 OooOO0() {
        return this.f18960OooO0oO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO
    public final boolean OooOO0O() {
        return this.f18959OooO0o0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO
    public final CrashlyticsReport.OooO.OooO0O0 OooOO0o() {
        return new OooO0O0(this);
    }

    public final boolean equals(Object obj) {
        Long l;
        CrashlyticsReport.OooO.OooOO0 oooOO1;
        CrashlyticsReport.OooO.AbstractC0135OooO abstractC0135OooO;
        CrashlyticsReport.OooO.OooO0OO oooO0OO;
        p362o0OOOoo.o00oO0o<CrashlyticsReport.OooO.OooO0o> o00oo0o2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.OooO)) {
            return false;
        }
        CrashlyticsReport.OooO oooO = (CrashlyticsReport.OooO) obj;
        return this.f18954OooO00o.equals(oooO.OooO0o0()) && this.f18955OooO0O0.equals(oooO.OooO0oO()) && this.f18956OooO0OO == oooO.OooO() && ((l = this.f18957OooO0Oo) != null ? l.equals(oooO.OooO0OO()) : oooO.OooO0OO() == null) && this.f18959OooO0o0 == oooO.OooOO0O() && this.f18958OooO0o.equals(oooO.OooO00o()) && ((oooOO1 = this.f18960OooO0oO) != null ? oooOO1.equals(oooO.OooOO0()) : oooO.OooOO0() == null) && ((abstractC0135OooO = this.f18961OooO0oo) != null ? abstractC0135OooO.equals(oooO.OooO0oo()) : oooO.OooO0oo() == null) && ((oooO0OO = this.f18953OooO) != null ? oooO0OO.equals(oooO.OooO0O0()) : oooO.OooO0O0() == null) && ((o00oo0o2 = this.f18962OooOO0) != null ? o00oo0o2.equals(oooO.OooO0Oo()) : oooO.OooO0Oo() == null) && this.f18963OooOO0O == oooO.OooO0o();
    }

    public final int hashCode() {
        int iHashCode = (((this.f18954OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f18955OooO0O0.hashCode()) * 1000003;
        long j = this.f18956OooO0OO;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.f18957OooO0Oo;
        int iHashCode2 = (((((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f18959OooO0o0 ? 1231 : 1237)) * 1000003) ^ this.f18958OooO0o.hashCode()) * 1000003;
        CrashlyticsReport.OooO.OooOO0 oooOO1 = this.f18960OooO0oO;
        int iHashCode3 = (iHashCode2 ^ (oooOO1 == null ? 0 : oooOO1.hashCode())) * 1000003;
        CrashlyticsReport.OooO.AbstractC0135OooO abstractC0135OooO = this.f18961OooO0oo;
        int iHashCode4 = (iHashCode3 ^ (abstractC0135OooO == null ? 0 : abstractC0135OooO.hashCode())) * 1000003;
        CrashlyticsReport.OooO.OooO0OO oooO0OO = this.f18953OooO;
        int iHashCode5 = (iHashCode4 ^ (oooO0OO == null ? 0 : oooO0OO.hashCode())) * 1000003;
        p362o0OOOoo.o00oO0o<CrashlyticsReport.OooO.OooO0o> o00oo0o2 = this.f18962OooOO0;
        return ((iHashCode5 ^ (o00oo0o2 != null ? o00oo0o2.hashCode() : 0)) * 1000003) ^ this.f18963OooOO0O;
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Session{generator=");
        sbOooO0o0.append(this.f18954OooO00o);
        sbOooO0o0.append(", identifier=");
        sbOooO0o0.append(this.f18955OooO0O0);
        sbOooO0o0.append(", startedAt=");
        sbOooO0o0.append(this.f18956OooO0OO);
        sbOooO0o0.append(", endedAt=");
        sbOooO0o0.append(this.f18957OooO0Oo);
        sbOooO0o0.append(", crashed=");
        sbOooO0o0.append(this.f18959OooO0o0);
        sbOooO0o0.append(", app=");
        sbOooO0o0.append(this.f18958OooO0o);
        sbOooO0o0.append(", user=");
        sbOooO0o0.append(this.f18960OooO0oO);
        sbOooO0o0.append(", os=");
        sbOooO0o0.append(this.f18961OooO0oo);
        sbOooO0o0.append(", device=");
        sbOooO0o0.append(this.f18953OooO);
        sbOooO0o0.append(", events=");
        sbOooO0o0.append(this.f18962OooOO0);
        sbOooO0o0.append(", generatorType=");
        return o0O0O00.o0ooOOo.OooO00o(sbOooO0o0, this.f18963OooOO0O, "}");
    }
}
