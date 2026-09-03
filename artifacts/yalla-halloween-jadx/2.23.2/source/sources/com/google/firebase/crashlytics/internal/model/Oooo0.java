package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class Oooo0 extends CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final p291o0O0Oo0o.o00O0O<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0248OooO0o> f19614OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0247OooO0O0 f19615OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final CrashlyticsReport.OooO00o f19616OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.OooO0OO f19617OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final p291o0O0Oo0o.o00O0O<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0245OooO00o> f19618OooO0o0;

    public Oooo0() {
        throw null;
    }

    public Oooo0(p291o0O0Oo0o.o00O0O o00o0o2, CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0247OooO0O0 abstractC0247OooO0O0, CrashlyticsReport.OooO00o oooO00o, CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.OooO0OO oooO0OO, p291o0O0Oo0o.o00O0O o00o0o3) {
        this.f19614OooO00o = o00o0o2;
        this.f19615OooO0O0 = abstractC0247OooO0O0;
        this.f19616OooO0OO = oooO00o;
        this.f19617OooO0Oo = oooO0OO;
        this.f19618OooO0o0 = o00o0o3;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0
    @Nullable
    public final CrashlyticsReport.OooO00o OooO00o() {
        return this.f19616OooO0OO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0
    @NonNull
    public final p291o0O0Oo0o.o00O0O<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0245OooO00o> OooO0O0() {
        return this.f19618OooO0o0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0
    @Nullable
    public final CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0247OooO0O0 OooO0OO() {
        return this.f19615OooO0O0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0
    @NonNull
    public final CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.OooO0OO OooO0Oo() {
        return this.f19617OooO0Oo;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0
    @Nullable
    public final p291o0O0Oo0o.o00O0O<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0248OooO0o> OooO0o0() {
        return this.f19614OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0)) {
            return false;
        }
        CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0 oooO0O0 = (CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0) obj;
        p291o0O0Oo0o.o00O0O<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0248OooO0o> o00o0o2 = this.f19614OooO00o;
        if (o00o0o2 != null ? o00o0o2.equals(oooO0O0.OooO0o0()) : oooO0O0.OooO0o0() == null) {
            CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0247OooO0O0 abstractC0247OooO0O0 = this.f19615OooO0O0;
            if (abstractC0247OooO0O0 != null ? abstractC0247OooO0O0.equals(oooO0O0.OooO0OO()) : oooO0O0.OooO0OO() == null) {
                CrashlyticsReport.OooO00o oooO00o = this.f19616OooO0OO;
                if (oooO00o != null ? oooO00o.equals(oooO0O0.OooO00o()) : oooO0O0.OooO00o() == null) {
                    if (this.f19617OooO0Oo.equals(oooO0O0.OooO0Oo()) && this.f19618OooO0o0.equals(oooO0O0.OooO0O0())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        p291o0O0Oo0o.o00O0O<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0248OooO0o> o00o0o2 = this.f19614OooO00o;
        int iHashCode = ((o00o0o2 == null ? 0 : o00o0o2.hashCode()) ^ 1000003) * 1000003;
        CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0247OooO0O0 abstractC0247OooO0O0 = this.f19615OooO0O0;
        int iHashCode2 = (iHashCode ^ (abstractC0247OooO0O0 == null ? 0 : abstractC0247OooO0O0.hashCode())) * 1000003;
        CrashlyticsReport.OooO00o oooO00o = this.f19616OooO0OO;
        return (((((oooO00o != null ? oooO00o.hashCode() : 0) ^ iHashCode2) * 1000003) ^ this.f19617OooO0Oo.hashCode()) * 1000003) ^ this.f19618OooO0o0.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.f19614OooO00o + ", exception=" + this.f19615OooO0O0 + ", appExitInfo=" + this.f19616OooO0OO + ", signal=" + this.f19617OooO0Oo + ", binaries=" + this.f19618OooO0o0 + "}";
    }
}
