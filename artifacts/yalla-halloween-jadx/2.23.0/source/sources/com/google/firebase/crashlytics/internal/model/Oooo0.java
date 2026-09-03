package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class Oooo0 extends CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final p287o0O0Oo0.OooOO0<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0249OooO0o> f20086OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0248OooO0O0 f20087OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final CrashlyticsReport.OooO00o f20088OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.OooO0OO f20089OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final p287o0O0Oo0.OooOO0<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0246OooO00o> f20090OooO0o0;

    public Oooo0() {
        throw null;
    }

    public Oooo0(p287o0O0Oo0.OooOO0 oooOO1, CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0248OooO0O0 abstractC0248OooO0O0, CrashlyticsReport.OooO00o oooO00o, CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.OooO0OO oooO0OO, p287o0O0Oo0.OooOO0 oooOO2) {
        this.f20086OooO00o = oooOO1;
        this.f20087OooO0O0 = abstractC0248OooO0O0;
        this.f20088OooO0OO = oooO00o;
        this.f20089OooO0Oo = oooO0OO;
        this.f20090OooO0o0 = oooOO2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0
    @Nullable
    public final CrashlyticsReport.OooO00o OooO00o() {
        return this.f20088OooO0OO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0
    @NonNull
    public final p287o0O0Oo0.OooOO0<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0246OooO00o> OooO0O0() {
        return this.f20090OooO0o0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0
    @Nullable
    public final CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0248OooO0O0 OooO0OO() {
        return this.f20087OooO0O0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0
    @NonNull
    public final CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.OooO0OO OooO0Oo() {
        return this.f20089OooO0Oo;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0
    @Nullable
    public final p287o0O0Oo0.OooOO0<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0249OooO0o> OooO0o0() {
        return this.f20086OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0)) {
            return false;
        }
        CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0 oooO0O0 = (CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0) obj;
        p287o0O0Oo0.OooOO0<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0249OooO0o> oooOO1 = this.f20086OooO00o;
        if (oooOO1 != null ? oooOO1.equals(oooO0O0.OooO0o0()) : oooO0O0.OooO0o0() == null) {
            CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0248OooO0O0 abstractC0248OooO0O0 = this.f20087OooO0O0;
            if (abstractC0248OooO0O0 != null ? abstractC0248OooO0O0.equals(oooO0O0.OooO0OO()) : oooO0O0.OooO0OO() == null) {
                CrashlyticsReport.OooO00o oooO00o = this.f20088OooO0OO;
                if (oooO00o != null ? oooO00o.equals(oooO0O0.OooO00o()) : oooO0O0.OooO00o() == null) {
                    if (this.f20089OooO0Oo.equals(oooO0O0.OooO0Oo()) && this.f20090OooO0o0.equals(oooO0O0.OooO0O0())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        p287o0O0Oo0.OooOO0<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0249OooO0o> oooOO1 = this.f20086OooO00o;
        int iHashCode = ((oooOO1 == null ? 0 : oooOO1.hashCode()) ^ 1000003) * 1000003;
        CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0248OooO0O0 abstractC0248OooO0O0 = this.f20087OooO0O0;
        int iHashCode2 = (iHashCode ^ (abstractC0248OooO0O0 == null ? 0 : abstractC0248OooO0O0.hashCode())) * 1000003;
        CrashlyticsReport.OooO00o oooO00o = this.f20088OooO0OO;
        return (((((oooO00o != null ? oooO00o.hashCode() : 0) ^ iHashCode2) * 1000003) ^ this.f20089OooO0Oo.hashCode()) * 1000003) ^ this.f20090OooO0o0.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.f20086OooO00o + ", exception=" + this.f20087OooO0O0 + ", appExitInfo=" + this.f20088OooO0OO + ", signal=" + this.f20089OooO0Oo + ", binaries=" + this.f20090OooO0o0 + "}";
    }
}
