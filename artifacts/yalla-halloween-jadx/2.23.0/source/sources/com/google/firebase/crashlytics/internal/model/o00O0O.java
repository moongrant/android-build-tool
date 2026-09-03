package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O extends CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f20109OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f20110OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f20111OooO0OO;

    public o00O0O(String str, String str2, long j) {
        this.f20109OooO00o = str;
        this.f20110OooO0O0 = str2;
        this.f20111OooO0OO = j;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.OooO0OO
    @NonNull
    public final long OooO00o() {
        return this.f20111OooO0OO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.OooO0OO
    @NonNull
    public final String OooO0O0() {
        return this.f20110OooO0O0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.OooO0OO
    @NonNull
    public final String OooO0OO() {
        return this.f20109OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.OooO0OO)) {
            return false;
        }
        CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.OooO0OO oooO0OO = (CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.OooO0OO) obj;
        return this.f20109OooO00o.equals(oooO0OO.OooO0OO()) && this.f20110OooO0O0.equals(oooO0OO.OooO0O0()) && this.f20111OooO0OO == oooO0OO.OooO00o();
    }

    public final int hashCode() {
        int iHashCode = (((this.f20109OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f20110OooO0O0.hashCode()) * 1000003;
        long j = this.f20111OooO0OO;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Signal{name=");
        sb.append(this.f20109OooO00o);
        sb.append(", code=");
        sb.append(this.f20110OooO0O0);
        sb.append(", address=");
        return android.support.v4.media.session.OooO0o.OooO0O0(sb, this.f20111OooO0OO, "}");
    }
}
