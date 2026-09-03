package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 extends CrashlyticsReport.OooO.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f19010OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f19011OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final CrashlyticsReport.OooO.OooO0o.OooO00o f19012OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final CrashlyticsReport.OooO.OooO0o.OooO0OO f19013OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final CrashlyticsReport.OooO.OooO0o.AbstractC0147OooO0o f19014OooO0o0;

    public static final class OooO00o extends CrashlyticsReport.OooO.OooO0o.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Long f19015OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f19016OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public CrashlyticsReport.OooO.OooO0o.OooO00o f19017OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public CrashlyticsReport.OooO.OooO0o.OooO0OO f19018OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public CrashlyticsReport.OooO.OooO0o.AbstractC0147OooO0o f19019OooO0o0;

        public OooO00o() {
        }

        public final CrashlyticsReport.OooO.OooO0o OooO00o() {
            String strOooO0Oo = this.f19015OooO00o == null ? " timestamp" : "";
            if (this.f19016OooO0O0 == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " type");
            }
            if (this.f19017OooO0OO == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " app");
            }
            if (this.f19018OooO0Oo == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " device");
            }
            if (strOooO0Oo.isEmpty()) {
                return new OooOo00(this.f19015OooO00o.longValue(), this.f19016OooO0O0, this.f19017OooO0OO, this.f19018OooO0Oo, this.f19019OooO0o0);
            }
            throw new IllegalStateException(p016OooOoO0.OooOo00.OooO0Oo("Missing required properties:", strOooO0Oo));
        }

        public final CrashlyticsReport.OooO.OooO0o.OooO0O0 OooO0O0(long j) {
            this.f19015OooO00o = Long.valueOf(j);
            return this;
        }

        public final CrashlyticsReport.OooO.OooO0o.OooO0O0 OooO0OO(String str) {
            Objects.requireNonNull(str, "Null type");
            this.f19016OooO0O0 = str;
            return this;
        }

        public OooO00o(CrashlyticsReport.OooO.OooO0o oooO0o) {
            this.f19015OooO00o = Long.valueOf(oooO0o.OooO0Oo());
            this.f19016OooO0O0 = oooO0o.OooO0o0();
            this.f19017OooO0OO = oooO0o.OooO00o();
            this.f19018OooO0Oo = oooO0o.OooO0O0();
            this.f19019OooO0o0 = oooO0o.OooO0OO();
        }
    }

    public OooOo00(long j, String str, CrashlyticsReport.OooO.OooO0o.OooO00o oooO00o, CrashlyticsReport.OooO.OooO0o.OooO0OO oooO0OO, CrashlyticsReport.OooO.OooO0o.AbstractC0147OooO0o abstractC0147OooO0o) {
        this.f19010OooO00o = j;
        this.f19011OooO0O0 = str;
        this.f19012OooO0OO = oooO00o;
        this.f19013OooO0Oo = oooO0OO;
        this.f19014OooO0o0 = abstractC0147OooO0o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o
    @NonNull
    public final CrashlyticsReport.OooO.OooO0o.OooO00o OooO00o() {
        return this.f19012OooO0OO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o
    @NonNull
    public final CrashlyticsReport.OooO.OooO0o.OooO0OO OooO0O0() {
        return this.f19013OooO0Oo;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o
    @Nullable
    public final CrashlyticsReport.OooO.OooO0o.AbstractC0147OooO0o OooO0OO() {
        return this.f19014OooO0o0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o
    public final long OooO0Oo() {
        return this.f19010OooO00o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o
    @NonNull
    public final String OooO0o0() {
        return this.f19011OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.OooO.OooO0o)) {
            return false;
        }
        CrashlyticsReport.OooO.OooO0o oooO0o = (CrashlyticsReport.OooO.OooO0o) obj;
        if (this.f19010OooO00o == oooO0o.OooO0Oo() && this.f19011OooO0O0.equals(oooO0o.OooO0o0()) && this.f19012OooO0OO.equals(oooO0o.OooO00o()) && this.f19013OooO0Oo.equals(oooO0o.OooO0O0())) {
            CrashlyticsReport.OooO.OooO0o.AbstractC0147OooO0o abstractC0147OooO0o = this.f19014OooO0o0;
            if (abstractC0147OooO0o == null) {
                if (oooO0o.OooO0OO() == null) {
                    return true;
                }
            } else if (abstractC0147OooO0o.equals(oooO0o.OooO0OO())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f19010OooO00o;
        int iHashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f19011OooO0O0.hashCode()) * 1000003) ^ this.f19012OooO0OO.hashCode()) * 1000003) ^ this.f19013OooO0Oo.hashCode()) * 1000003;
        CrashlyticsReport.OooO.OooO0o.AbstractC0147OooO0o abstractC0147OooO0o = this.f19014OooO0o0;
        return (abstractC0147OooO0o == null ? 0 : abstractC0147OooO0o.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Event{timestamp=");
        sbOooO0o0.append(this.f19010OooO00o);
        sbOooO0o0.append(", type=");
        sbOooO0o0.append(this.f19011OooO0O0);
        sbOooO0o0.append(", app=");
        sbOooO0o0.append(this.f19012OooO0OO);
        sbOooO0o0.append(", device=");
        sbOooO0o0.append(this.f19013OooO0Oo);
        sbOooO0o0.append(", log=");
        sbOooO0o0.append(this.f19014OooO0o0);
        sbOooO0o0.append("}");
        return sbOooO0o0.toString();
    }
}
