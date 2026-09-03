package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p028Oooo0oO.o0oOO;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO extends CrashlyticsReport.OooO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f19557OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f19558OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f19559OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final CrashlyticsReport.OooO.OooO00o.AbstractC0243OooO00o f19560OooO0Oo = null;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f19561OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f19562OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String f19563OooO0oO;

    public OooOOO(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f19557OooO00o = str;
        this.f19558OooO0O0 = str2;
        this.f19559OooO0OO = str3;
        this.f19562OooO0o0 = str4;
        this.f19561OooO0o = str5;
        this.f19563OooO0oO = str6;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO00o
    @Nullable
    public final String OooO00o() {
        return this.f19561OooO0o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO00o
    @Nullable
    public final String OooO0O0() {
        return this.f19563OooO0oO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO00o
    @Nullable
    public final String OooO0OO() {
        return this.f19559OooO0OO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO00o
    @NonNull
    public final String OooO0Oo() {
        return this.f19557OooO00o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO00o
    @Nullable
    public final CrashlyticsReport.OooO.OooO00o.AbstractC0243OooO00o OooO0o() {
        return this.f19560OooO0Oo;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO00o
    @Nullable
    public final String OooO0o0() {
        return this.f19562OooO0o0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO00o
    @NonNull
    public final String OooO0oO() {
        return this.f19558OooO0O0;
    }

    public final boolean equals(Object obj) {
        String str;
        CrashlyticsReport.OooO.OooO00o.AbstractC0243OooO00o abstractC0243OooO00o;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.OooO.OooO00o)) {
            return false;
        }
        CrashlyticsReport.OooO.OooO00o oooO00o = (CrashlyticsReport.OooO.OooO00o) obj;
        if (this.f19557OooO00o.equals(oooO00o.OooO0Oo()) && this.f19558OooO0O0.equals(oooO00o.OooO0oO()) && ((str = this.f19559OooO0OO) != null ? str.equals(oooO00o.OooO0OO()) : oooO00o.OooO0OO() == null) && ((abstractC0243OooO00o = this.f19560OooO0Oo) != null ? abstractC0243OooO00o.equals(oooO00o.OooO0o()) : oooO00o.OooO0o() == null) && ((str2 = this.f19562OooO0o0) != null ? str2.equals(oooO00o.OooO0o0()) : oooO00o.OooO0o0() == null) && ((str3 = this.f19561OooO0o) != null ? str3.equals(oooO00o.OooO00o()) : oooO00o.OooO00o() == null)) {
            String str4 = this.f19563OooO0oO;
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
        int iHashCode = (((this.f19557OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f19558OooO0O0.hashCode()) * 1000003;
        String str = this.f19559OooO0OO;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        CrashlyticsReport.OooO.OooO00o.AbstractC0243OooO00o abstractC0243OooO00o = this.f19560OooO0Oo;
        int iHashCode3 = (iHashCode2 ^ (abstractC0243OooO00o == null ? 0 : abstractC0243OooO00o.hashCode())) * 1000003;
        String str2 = this.f19562OooO0o0;
        int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f19561OooO0o;
        int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f19563OooO0oO;
        return iHashCode5 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{identifier=");
        sb.append(this.f19557OooO00o);
        sb.append(", version=");
        sb.append(this.f19558OooO0O0);
        sb.append(", displayVersion=");
        sb.append(this.f19559OooO0OO);
        sb.append(", organization=");
        sb.append(this.f19560OooO0Oo);
        sb.append(", installationUuid=");
        sb.append(this.f19562OooO0o0);
        sb.append(", developmentPlatform=");
        sb.append(this.f19561OooO0o);
        sb.append(", developmentPlatformVersion=");
        return o0oOO.OooO0O0(sb, this.f19563OooO0oO, "}");
    }
}
