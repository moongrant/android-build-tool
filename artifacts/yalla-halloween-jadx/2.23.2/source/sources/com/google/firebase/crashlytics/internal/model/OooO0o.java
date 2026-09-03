package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import p028Oooo0oO.o0oOO;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0o extends CrashlyticsReport.OooO00o.AbstractC0252OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f19550OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f19551OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f19552OooO0OO;

    public OooO0o(String str, String str2, String str3) {
        this.f19550OooO00o = str;
        this.f19551OooO0O0 = str2;
        this.f19552OooO0OO = str3;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO00o.AbstractC0252OooO00o
    @NonNull
    public final String OooO00o() {
        return this.f19550OooO00o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO00o.AbstractC0252OooO00o
    @NonNull
    public final String OooO0O0() {
        return this.f19552OooO0OO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO00o.AbstractC0252OooO00o
    @NonNull
    public final String OooO0OO() {
        return this.f19551OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.OooO00o.AbstractC0252OooO00o)) {
            return false;
        }
        CrashlyticsReport.OooO00o.AbstractC0252OooO00o abstractC0252OooO00o = (CrashlyticsReport.OooO00o.AbstractC0252OooO00o) obj;
        return this.f19550OooO00o.equals(abstractC0252OooO00o.OooO00o()) && this.f19551OooO0O0.equals(abstractC0252OooO00o.OooO0OO()) && this.f19552OooO0OO.equals(abstractC0252OooO00o.OooO0O0());
    }

    public final int hashCode() {
        return ((((this.f19550OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f19551OooO0O0.hashCode()) * 1000003) ^ this.f19552OooO0OO.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuildIdMappingForArch{arch=");
        sb.append(this.f19550OooO00o);
        sb.append(", libraryName=");
        sb.append(this.f19551OooO0O0);
        sb.append(", buildId=");
        return o0oOO.OooO0O0(sb, this.f19552OooO0OO, "}");
    }
}
