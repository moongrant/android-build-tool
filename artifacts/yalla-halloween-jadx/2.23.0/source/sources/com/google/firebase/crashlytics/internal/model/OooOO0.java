package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p028Oooo0oO.o0O00o0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0 extends CrashlyticsReport.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final p287o0O0Oo0.OooOO0<CrashlyticsReport.OooO0o.OooO00o> f20025OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f20026OooO0O0;

    public OooOO0() {
        throw null;
    }

    public OooOO0(p287o0O0Oo0.OooOO0 oooOO1, String str) {
        this.f20025OooO00o = oooOO1;
        this.f20026OooO0O0 = str;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO0o
    @NonNull
    public final p287o0O0Oo0.OooOO0<CrashlyticsReport.OooO0o.OooO00o> OooO00o() {
        return this.f20025OooO00o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO0o
    @Nullable
    public final String OooO0O0() {
        return this.f20026OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.OooO0o)) {
            return false;
        }
        CrashlyticsReport.OooO0o oooO0o = (CrashlyticsReport.OooO0o) obj;
        if (this.f20025OooO00o.equals(oooO0o.OooO00o())) {
            String str = this.f20026OooO0O0;
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
        int iHashCode = (this.f20025OooO00o.hashCode() ^ 1000003) * 1000003;
        String str = this.f20026OooO0O0;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.f20025OooO00o);
        sb.append(", orgId=");
        return o0O00o0.OooO0O0(sb, this.f20026OooO0O0, "}");
    }
}
