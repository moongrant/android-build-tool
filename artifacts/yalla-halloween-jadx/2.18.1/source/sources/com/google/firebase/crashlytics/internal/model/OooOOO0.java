package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 extends CrashlyticsReport.OooO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f18975OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f18976OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f18977OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final CrashlyticsReport.OooO.OooO00o.AbstractC0136OooO00o f18978OooO0Oo = null;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f18979OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f18980OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String f18981OooO0oO;

    public OooOOO0(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f18975OooO00o = str;
        this.f18976OooO0O0 = str2;
        this.f18977OooO0OO = str3;
        this.f18980OooO0o0 = str4;
        this.f18979OooO0o = str5;
        this.f18981OooO0oO = str6;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO00o
    @Nullable
    public final String OooO00o() {
        return this.f18979OooO0o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO00o
    @Nullable
    public final String OooO0O0() {
        return this.f18981OooO0oO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO00o
    @Nullable
    public final String OooO0OO() {
        return this.f18977OooO0OO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO00o
    @NonNull
    public final String OooO0Oo() {
        return this.f18975OooO00o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO00o
    @Nullable
    public final CrashlyticsReport.OooO.OooO00o.AbstractC0136OooO00o OooO0o() {
        return this.f18978OooO0Oo;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO00o
    @Nullable
    public final String OooO0o0() {
        return this.f18980OooO0o0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO00o
    @NonNull
    public final String OooO0oO() {
        return this.f18976OooO0O0;
    }

    public final boolean equals(Object obj) {
        String str;
        CrashlyticsReport.OooO.OooO00o.AbstractC0136OooO00o abstractC0136OooO00o;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.OooO.OooO00o)) {
            return false;
        }
        CrashlyticsReport.OooO.OooO00o oooO00o = (CrashlyticsReport.OooO.OooO00o) obj;
        if (this.f18975OooO00o.equals(oooO00o.OooO0Oo()) && this.f18976OooO0O0.equals(oooO00o.OooO0oO()) && ((str = this.f18977OooO0OO) != null ? str.equals(oooO00o.OooO0OO()) : oooO00o.OooO0OO() == null) && ((abstractC0136OooO00o = this.f18978OooO0Oo) != null ? abstractC0136OooO00o.equals(oooO00o.OooO0o()) : oooO00o.OooO0o() == null) && ((str2 = this.f18980OooO0o0) != null ? str2.equals(oooO00o.OooO0o0()) : oooO00o.OooO0o0() == null) && ((str3 = this.f18979OooO0o) != null ? str3.equals(oooO00o.OooO00o()) : oooO00o.OooO00o() == null)) {
            String str4 = this.f18981OooO0oO;
            if (str4 == null) {
                if (oooO00o.OooO0O0() == null) {
                    return true;
                }
            } else if (str4.equals(oooO00o.OooO0O0())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f18975OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f18976OooO0O0.hashCode()) * 1000003;
        String str = this.f18977OooO0OO;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        CrashlyticsReport.OooO.OooO00o.AbstractC0136OooO00o abstractC0136OooO00o = this.f18978OooO0Oo;
        int iHashCode3 = (iHashCode2 ^ (abstractC0136OooO00o == null ? 0 : abstractC0136OooO00o.hashCode())) * 1000003;
        String str2 = this.f18980OooO0o0;
        int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f18979OooO0o;
        int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f18981OooO0oO;
        return iHashCode5 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Application{identifier=");
        sbOooO0o0.append(this.f18975OooO00o);
        sbOooO0o0.append(", version=");
        sbOooO0o0.append(this.f18976OooO0O0);
        sbOooO0o0.append(", displayVersion=");
        sbOooO0o0.append(this.f18977OooO0OO);
        sbOooO0o0.append(", organization=");
        sbOooO0o0.append(this.f18978OooO0Oo);
        sbOooO0o0.append(", installationUuid=");
        sbOooO0o0.append(this.f18980OooO0o0);
        sbOooO0o0.append(", developmentPlatform=");
        sbOooO0o0.append(this.f18979OooO0o);
        sbOooO0o0.append(", developmentPlatformVersion=");
        return p058o0000OoO.OooO.OooO00o(sbOooO0o0, this.f18981OooO0oO, "}");
    }
}
