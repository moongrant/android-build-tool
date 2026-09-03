package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o extends CrashlyticsReport.OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f18947OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f18948OooO0O0;

    public OooO0o(String str, String str2) {
        this.f18947OooO00o = str;
        this.f18948OooO0O0 = str2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO0OO
    @NonNull
    public final String OooO00o() {
        return this.f18947OooO00o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO0OO
    @NonNull
    public final String OooO0O0() {
        return this.f18948OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.OooO0OO)) {
            return false;
        }
        CrashlyticsReport.OooO0OO oooO0OO = (CrashlyticsReport.OooO0OO) obj;
        return this.f18947OooO00o.equals(oooO0OO.OooO00o()) && this.f18948OooO0O0.equals(oooO0OO.OooO0O0());
    }

    public final int hashCode() {
        return ((this.f18947OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f18948OooO0O0.hashCode();
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("CustomAttribute{key=");
        sbOooO0o0.append(this.f18947OooO00o);
        sbOooO0o0.append(", value=");
        return p058o0000OoO.OooO.OooO00o(sbOooO0o0, this.f18948OooO0O0, "}");
    }
}
