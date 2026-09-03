package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 extends CrashlyticsReport {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final CrashlyticsReport.OooO0o f18915OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f18916OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f18917OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f18918OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f18919OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f18920OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String f18921OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final CrashlyticsReport.OooO f18922OooO0oo;

    public static final class OooO00o extends CrashlyticsReport.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f18923OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f18924OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Integer f18925OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public String f18926OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public String f18927OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public String f18928OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public CrashlyticsReport.OooO f18929OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public CrashlyticsReport.OooO0o f18930OooO0oo;

        public OooO00o() {
        }

        public final CrashlyticsReport OooO00o() {
            String strOooO0Oo = this.f18923OooO00o == null ? " sdkVersion" : "";
            if (this.f18924OooO0O0 == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " gmpAppId");
            }
            if (this.f18925OooO0OO == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " platform");
            }
            if (this.f18926OooO0Oo == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " installationUuid");
            }
            if (this.f18928OooO0o0 == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " buildVersion");
            }
            if (this.f18927OooO0o == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " displayVersion");
            }
            if (strOooO0Oo.isEmpty()) {
                return new OooO0O0(this.f18923OooO00o, this.f18924OooO0O0, this.f18925OooO0OO.intValue(), this.f18926OooO0Oo, this.f18928OooO0o0, this.f18927OooO0o, this.f18929OooO0oO, this.f18930OooO0oo);
            }
            throw new IllegalStateException(p016OooOoO0.OooOo00.OooO0Oo("Missing required properties:", strOooO0Oo));
        }

        public OooO00o(CrashlyticsReport crashlyticsReport) {
            this.f18923OooO00o = crashlyticsReport.OooO0oO();
            this.f18924OooO0O0 = crashlyticsReport.OooO0OO();
            this.f18925OooO0OO = Integer.valueOf(crashlyticsReport.OooO0o());
            this.f18926OooO0Oo = crashlyticsReport.OooO0Oo();
            this.f18928OooO0o0 = crashlyticsReport.OooO00o();
            this.f18927OooO0o = crashlyticsReport.OooO0O0();
            this.f18929OooO0oO = crashlyticsReport.OooO0oo();
            this.f18930OooO0oo = crashlyticsReport.OooO0o0();
        }
    }

    public OooO0O0(String str, String str2, int i, String str3, String str4, String str5, CrashlyticsReport.OooO oooO, CrashlyticsReport.OooO0o oooO0o) {
        this.f18916OooO0O0 = str;
        this.f18917OooO0OO = str2;
        this.f18918OooO0Oo = i;
        this.f18920OooO0o0 = str3;
        this.f18919OooO0o = str4;
        this.f18921OooO0oO = str5;
        this.f18922OooO0oo = oooO;
        this.f18915OooO = oooO0o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @NonNull
    public final String OooO00o() {
        return this.f18919OooO0o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @NonNull
    public final String OooO0O0() {
        return this.f18921OooO0oO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @NonNull
    public final String OooO0OO() {
        return this.f18917OooO0OO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @NonNull
    public final String OooO0Oo() {
        return this.f18920OooO0o0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final int OooO0o() {
        return this.f18918OooO0Oo;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @Nullable
    public final CrashlyticsReport.OooO0o OooO0o0() {
        return this.f18915OooO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @NonNull
    public final String OooO0oO() {
        return this.f18916OooO0O0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @Nullable
    public final CrashlyticsReport.OooO OooO0oo() {
        return this.f18922OooO0oo;
    }

    public final boolean equals(Object obj) {
        CrashlyticsReport.OooO oooO;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport)) {
            return false;
        }
        CrashlyticsReport crashlyticsReport = (CrashlyticsReport) obj;
        if (this.f18916OooO0O0.equals(crashlyticsReport.OooO0oO()) && this.f18917OooO0OO.equals(crashlyticsReport.OooO0OO()) && this.f18918OooO0Oo == crashlyticsReport.OooO0o() && this.f18920OooO0o0.equals(crashlyticsReport.OooO0Oo()) && this.f18919OooO0o.equals(crashlyticsReport.OooO00o()) && this.f18921OooO0oO.equals(crashlyticsReport.OooO0O0()) && ((oooO = this.f18922OooO0oo) != null ? oooO.equals(crashlyticsReport.OooO0oo()) : crashlyticsReport.OooO0oo() == null)) {
            CrashlyticsReport.OooO0o oooO0o = this.f18915OooO;
            if (oooO0o == null) {
                if (crashlyticsReport.OooO0o0() == null) {
                    return true;
                }
            } else if (oooO0o.equals(crashlyticsReport.OooO0o0())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((((this.f18916OooO0O0.hashCode() ^ 1000003) * 1000003) ^ this.f18917OooO0OO.hashCode()) * 1000003) ^ this.f18918OooO0Oo) * 1000003) ^ this.f18920OooO0o0.hashCode()) * 1000003) ^ this.f18919OooO0o.hashCode()) * 1000003) ^ this.f18921OooO0oO.hashCode()) * 1000003;
        CrashlyticsReport.OooO oooO = this.f18922OooO0oo;
        int iHashCode2 = (iHashCode ^ (oooO == null ? 0 : oooO.hashCode())) * 1000003;
        CrashlyticsReport.OooO0o oooO0o = this.f18915OooO;
        return iHashCode2 ^ (oooO0o != null ? oooO0o.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("CrashlyticsReport{sdkVersion=");
        sbOooO0o0.append(this.f18916OooO0O0);
        sbOooO0o0.append(", gmpAppId=");
        sbOooO0o0.append(this.f18917OooO0OO);
        sbOooO0o0.append(", platform=");
        sbOooO0o0.append(this.f18918OooO0Oo);
        sbOooO0o0.append(", installationUuid=");
        sbOooO0o0.append(this.f18920OooO0o0);
        sbOooO0o0.append(", buildVersion=");
        sbOooO0o0.append(this.f18919OooO0o);
        sbOooO0o0.append(", displayVersion=");
        sbOooO0o0.append(this.f18921OooO0oO);
        sbOooO0o0.append(", session=");
        sbOooO0o0.append(this.f18922OooO0oo);
        sbOooO0o0.append(", ndkPayload=");
        sbOooO0o0.append(this.f18915OooO);
        sbOooO0o0.append("}");
        return sbOooO0o0.toString();
    }
}
