package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 extends CrashlyticsReport {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final CrashlyticsReport.OooO0o f19986OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f19987OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f19988OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f19989OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f19990OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f19991OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String f19992OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final CrashlyticsReport.OooO f19993OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final CrashlyticsReport.OooO00o f19994OooOO0;

    public static final class OooO00o extends CrashlyticsReport.OooO0O0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public CrashlyticsReport.OooO00o f19995OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f19996OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f19997OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Integer f19998OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public String f19999OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public String f20000OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public String f20001OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public CrashlyticsReport.OooO f20002OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public CrashlyticsReport.OooO0o f20003OooO0oo;

        public OooO00o(CrashlyticsReport crashlyticsReport) {
            this.f19996OooO00o = crashlyticsReport.OooO0oo();
            this.f19997OooO0O0 = crashlyticsReport.OooO0Oo();
            this.f19998OooO0OO = Integer.valueOf(crashlyticsReport.OooO0oO());
            this.f19999OooO0Oo = crashlyticsReport.OooO0o0();
            this.f20001OooO0o0 = crashlyticsReport.OooO0O0();
            this.f20000OooO0o = crashlyticsReport.OooO0OO();
            this.f20002OooO0oO = crashlyticsReport.OooO();
            this.f20003OooO0oo = crashlyticsReport.OooO0o();
            this.f19995OooO = crashlyticsReport.OooO00o();
        }

        public final OooO0O0 OooO00o() {
            String strOooO00o = this.f19996OooO00o == null ? " sdkVersion" : "";
            if (this.f19997OooO0O0 == null) {
                strOooO00o = strOooO00o.concat(" gmpAppId");
            }
            if (this.f19998OooO0OO == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " platform");
            }
            if (this.f19999OooO0Oo == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " installationUuid");
            }
            if (this.f20001OooO0o0 == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " buildVersion");
            }
            if (this.f20000OooO0o == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " displayVersion");
            }
            if (strOooO00o.isEmpty()) {
                return new OooO0O0(this.f19996OooO00o, this.f19997OooO0O0, this.f19998OooO0OO.intValue(), this.f19999OooO0Oo, this.f20001OooO0o0, this.f20000OooO0o, this.f20002OooO0oO, this.f20003OooO0oo, this.f19995OooO);
            }
            throw new IllegalStateException("Missing required properties:".concat(strOooO00o));
        }
    }

    public OooO0O0(String str, String str2, int i, String str3, String str4, String str5, CrashlyticsReport.OooO oooO, CrashlyticsReport.OooO0o oooO0o, CrashlyticsReport.OooO00o oooO00o) {
        this.f19987OooO0O0 = str;
        this.f19988OooO0OO = str2;
        this.f19989OooO0Oo = i;
        this.f19991OooO0o0 = str3;
        this.f19990OooO0o = str4;
        this.f19992OooO0oO = str5;
        this.f19993OooO0oo = oooO;
        this.f19986OooO = oooO0o;
        this.f19994OooOO0 = oooO00o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @Nullable
    public final CrashlyticsReport.OooO OooO() {
        return this.f19993OooO0oo;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @Nullable
    public final CrashlyticsReport.OooO00o OooO00o() {
        return this.f19994OooOO0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @NonNull
    public final String OooO0O0() {
        return this.f19990OooO0o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @NonNull
    public final String OooO0OO() {
        return this.f19992OooO0oO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @NonNull
    public final String OooO0Oo() {
        return this.f19988OooO0OO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @Nullable
    public final CrashlyticsReport.OooO0o OooO0o() {
        return this.f19986OooO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @NonNull
    public final String OooO0o0() {
        return this.f19991OooO0o0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final int OooO0oO() {
        return this.f19989OooO0Oo;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @NonNull
    public final String OooO0oo() {
        return this.f19987OooO0O0;
    }

    public final boolean equals(Object obj) {
        CrashlyticsReport.OooO oooO;
        CrashlyticsReport.OooO0o oooO0o;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport)) {
            return false;
        }
        CrashlyticsReport crashlyticsReport = (CrashlyticsReport) obj;
        if (this.f19987OooO0O0.equals(crashlyticsReport.OooO0oo()) && this.f19988OooO0OO.equals(crashlyticsReport.OooO0Oo()) && this.f19989OooO0Oo == crashlyticsReport.OooO0oO() && this.f19991OooO0o0.equals(crashlyticsReport.OooO0o0()) && this.f19990OooO0o.equals(crashlyticsReport.OooO0O0()) && this.f19992OooO0oO.equals(crashlyticsReport.OooO0OO()) && ((oooO = this.f19993OooO0oo) != null ? oooO.equals(crashlyticsReport.OooO()) : crashlyticsReport.OooO() == null) && ((oooO0o = this.f19986OooO) != null ? oooO0o.equals(crashlyticsReport.OooO0o()) : crashlyticsReport.OooO0o() == null)) {
            CrashlyticsReport.OooO00o oooO00o = this.f19994OooOO0;
            if (oooO00o == null) {
                if (crashlyticsReport.OooO00o() == null) {
                    return true;
                }
            } else if (oooO00o.equals(crashlyticsReport.OooO00o())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((((this.f19987OooO0O0.hashCode() ^ 1000003) * 1000003) ^ this.f19988OooO0OO.hashCode()) * 1000003) ^ this.f19989OooO0Oo) * 1000003) ^ this.f19991OooO0o0.hashCode()) * 1000003) ^ this.f19990OooO0o.hashCode()) * 1000003) ^ this.f19992OooO0oO.hashCode()) * 1000003;
        CrashlyticsReport.OooO oooO = this.f19993OooO0oo;
        int iHashCode2 = (iHashCode ^ (oooO == null ? 0 : oooO.hashCode())) * 1000003;
        CrashlyticsReport.OooO0o oooO0o = this.f19986OooO;
        int iHashCode3 = (iHashCode2 ^ (oooO0o == null ? 0 : oooO0o.hashCode())) * 1000003;
        CrashlyticsReport.OooO00o oooO00o = this.f19994OooOO0;
        return iHashCode3 ^ (oooO00o != null ? oooO00o.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f19987OooO0O0 + ", gmpAppId=" + this.f19988OooO0OO + ", platform=" + this.f19989OooO0Oo + ", installationUuid=" + this.f19991OooO0o0 + ", buildVersion=" + this.f19990OooO0o + ", displayVersion=" + this.f19992OooO0oO + ", session=" + this.f19993OooO0oo + ", ndkPayload=" + this.f19986OooO + ", appExitInfo=" + this.f19994OooOO0 + "}";
    }
}
