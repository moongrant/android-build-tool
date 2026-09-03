package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO extends CrashlyticsReport.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final p362o0OOOoo.o00oO0o<CrashlyticsReport.OooO0o.OooO00o> f18794OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f18795OooO0O0;

    public OooO(p362o0OOOoo.o00oO0o o00oo0o2, String str, OooO00o oooO00o) {
        this.f18794OooO00o = o00oo0o2;
        this.f18795OooO0O0 = str;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO0o
    @NonNull
    public final p362o0OOOoo.o00oO0o<CrashlyticsReport.OooO0o.OooO00o> OooO00o() {
        return this.f18794OooO00o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO0o
    @Nullable
    public final String OooO0O0() {
        return this.f18795OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.OooO0o)) {
            return false;
        }
        CrashlyticsReport.OooO0o oooO0o = (CrashlyticsReport.OooO0o) obj;
        if (this.f18794OooO00o.equals(oooO0o.OooO00o())) {
            String str = this.f18795OooO0O0;
            if (str == null) {
                if (oooO0o.OooO0O0() == null) {
                    return true;
                }
            } else if (str.equals(oooO0o.OooO0O0())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f18794OooO00o.hashCode() ^ 1000003) * 1000003;
        String str = this.f18795OooO0O0;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("FilesPayload{files=");
        sbOooO0o0.append(this.f18794OooO00o);
        sbOooO0o0.append(", orgId=");
        return p058o0000OoO.OooO.OooO00o(sbOooO0o0, this.f18795OooO0O0, "}");
    }
}
