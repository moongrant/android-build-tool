package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p028Oooo0oO.o0O00o0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO extends CrashlyticsReport.OooO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f20029OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f20030OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f20031OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final CrashlyticsReport.OooO.OooO00o.AbstractC0244OooO00o f20032OooO0Oo = null;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f20033OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f20034OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String f20035OooO0oO;

    public OooOOO(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f20029OooO00o = str;
        this.f20030OooO0O0 = str2;
        this.f20031OooO0OO = str3;
        this.f20034OooO0o0 = str4;
        this.f20033OooO0o = str5;
        this.f20035OooO0oO = str6;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO00o
    @Nullable
    public final String OooO00o() {
        return this.f20033OooO0o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO00o
    @Nullable
    public final String OooO0O0() {
        return this.f20035OooO0oO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO00o
    @Nullable
    public final String OooO0OO() {
        return this.f20031OooO0OO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO00o
    @NonNull
    public final String OooO0Oo() {
        return this.f20029OooO00o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO00o
    @Nullable
    public final CrashlyticsReport.OooO.OooO00o.AbstractC0244OooO00o OooO0o() {
        return this.f20032OooO0Oo;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO00o
    @Nullable
    public final String OooO0o0() {
        return this.f20034OooO0o0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO00o
    @NonNull
    public final String OooO0oO() {
        return this.f20030OooO0O0;
    }

    public final boolean equals(Object obj) {
        String str;
        CrashlyticsReport.OooO.OooO00o.AbstractC0244OooO00o abstractC0244OooO00o;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.OooO.OooO00o)) {
            return false;
        }
        CrashlyticsReport.OooO.OooO00o oooO00o = (CrashlyticsReport.OooO.OooO00o) obj;
        if (this.f20029OooO00o.equals(oooO00o.OooO0Oo()) && this.f20030OooO0O0.equals(oooO00o.OooO0oO()) && ((str = this.f20031OooO0OO) != null ? str.equals(oooO00o.OooO0OO()) : oooO00o.OooO0OO() == null) && ((abstractC0244OooO00o = this.f20032OooO0Oo) != null ? abstractC0244OooO00o.equals(oooO00o.OooO0o()) : oooO00o.OooO0o() == null) && ((str2 = this.f20034OooO0o0) != null ? str2.equals(oooO00o.OooO0o0()) : oooO00o.OooO0o0() == null) && ((str3 = this.f20033OooO0o) != null ? str3.equals(oooO00o.OooO00o()) : oooO00o.OooO00o() == null)) {
            String str4 = this.f20035OooO0oO;
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
        int iHashCode = (((this.f20029OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f20030OooO0O0.hashCode()) * 1000003;
        String str = this.f20031OooO0OO;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        CrashlyticsReport.OooO.OooO00o.AbstractC0244OooO00o abstractC0244OooO00o = this.f20032OooO0Oo;
        int iHashCode3 = (iHashCode2 ^ (abstractC0244OooO00o == null ? 0 : abstractC0244OooO00o.hashCode())) * 1000003;
        String str2 = this.f20034OooO0o0;
        int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f20033OooO0o;
        int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f20035OooO0oO;
        return iHashCode5 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{identifier=");
        sb.append(this.f20029OooO00o);
        sb.append(", version=");
        sb.append(this.f20030OooO0O0);
        sb.append(", displayVersion=");
        sb.append(this.f20031OooO0OO);
        sb.append(", organization=");
        sb.append(this.f20032OooO0Oo);
        sb.append(", installationUuid=");
        sb.append(this.f20034OooO0o0);
        sb.append(", developmentPlatform=");
        sb.append(this.f20033OooO0o);
        sb.append(", developmentPlatformVersion=");
        return o0O00o0.OooO0O0(sb, this.f20035OooO0oO, "}");
    }
}
