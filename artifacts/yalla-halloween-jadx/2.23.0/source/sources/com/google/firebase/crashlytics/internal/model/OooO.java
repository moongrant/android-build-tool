package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import p028Oooo0oO.o0O00o0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO extends CrashlyticsReport.OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f19859OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f19860OooO0O0;

    public OooO(String str, String str2) {
        this.f19859OooO00o = str;
        this.f19860OooO0O0 = str2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO0OO
    @NonNull
    public final String OooO00o() {
        return this.f19859OooO00o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO0OO
    @NonNull
    public final String OooO0O0() {
        return this.f19860OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.OooO0OO)) {
            return false;
        }
        CrashlyticsReport.OooO0OO oooO0OO = (CrashlyticsReport.OooO0OO) obj;
        return this.f19859OooO00o.equals(oooO0OO.OooO00o()) && this.f19860OooO0O0.equals(oooO0OO.OooO0O0());
    }

    public final int hashCode() {
        return ((this.f19859OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f19860OooO0O0.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.f19859OooO00o);
        sb.append(", value=");
        return o0O00o0.OooO0O0(sb, this.f19860OooO0O0, "}");
    }
}
