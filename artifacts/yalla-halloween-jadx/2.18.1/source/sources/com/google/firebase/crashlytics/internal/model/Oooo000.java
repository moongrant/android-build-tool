package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo000 extends CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final p362o0OOOoo.o00oO0o<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0143OooO0o> f19028OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0140OooO0O0 f19029OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final CrashlyticsReport.OooO00o f19030OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.OooO0OO f19031OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final p362o0OOOoo.o00oO0o<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0138OooO00o> f19032OooO0o0;

    public Oooo000(p362o0OOOoo.o00oO0o o00oo0o2, CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0140OooO0O0 abstractC0140OooO0O0, CrashlyticsReport.OooO00o oooO00o, CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.OooO0OO oooO0OO, p362o0OOOoo.o00oO0o o00oo0o3, OooO00o oooO00o2) {
        this.f19028OooO00o = o00oo0o2;
        this.f19029OooO0O0 = abstractC0140OooO0O0;
        this.f19030OooO0OO = oooO00o;
        this.f19031OooO0Oo = oooO0OO;
        this.f19032OooO0o0 = o00oo0o3;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0
    @Nullable
    public final CrashlyticsReport.OooO00o OooO00o() {
        return this.f19030OooO0OO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0
    @NonNull
    public final p362o0OOOoo.o00oO0o<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0138OooO00o> OooO0O0() {
        return this.f19032OooO0o0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0
    @Nullable
    public final CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0140OooO0O0 OooO0OO() {
        return this.f19029OooO0O0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0
    @NonNull
    public final CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.OooO0OO OooO0Oo() {
        return this.f19031OooO0Oo;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0
    @Nullable
    public final p362o0OOOoo.o00oO0o<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0143OooO0o> OooO0o0() {
        return this.f19028OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0)) {
            return false;
        }
        CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0 oooO0O0 = (CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0) obj;
        p362o0OOOoo.o00oO0o<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0143OooO0o> o00oo0o2 = this.f19028OooO00o;
        if (o00oo0o2 != null ? o00oo0o2.equals(oooO0O0.OooO0o0()) : oooO0O0.OooO0o0() == null) {
            CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0140OooO0O0 abstractC0140OooO0O0 = this.f19029OooO0O0;
            if (abstractC0140OooO0O0 != null ? abstractC0140OooO0O0.equals(oooO0O0.OooO0OO()) : oooO0O0.OooO0OO() == null) {
                CrashlyticsReport.OooO00o oooO00o = this.f19030OooO0OO;
                if (oooO00o != null ? oooO00o.equals(oooO0O0.OooO00o()) : oooO0O0.OooO00o() == null) {
                    if (this.f19031OooO0Oo.equals(oooO0O0.OooO0Oo()) && this.f19032OooO0o0.equals(oooO0O0.OooO0O0())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        p362o0OOOoo.o00oO0o<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0143OooO0o> o00oo0o2 = this.f19028OooO00o;
        int iHashCode = ((o00oo0o2 == null ? 0 : o00oo0o2.hashCode()) ^ 1000003) * 1000003;
        CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0140OooO0O0 abstractC0140OooO0O0 = this.f19029OooO0O0;
        int iHashCode2 = (iHashCode ^ (abstractC0140OooO0O0 == null ? 0 : abstractC0140OooO0O0.hashCode())) * 1000003;
        CrashlyticsReport.OooO00o oooO00o = this.f19030OooO0OO;
        return ((((iHashCode2 ^ (oooO00o != null ? oooO00o.hashCode() : 0)) * 1000003) ^ this.f19031OooO0Oo.hashCode()) * 1000003) ^ this.f19032OooO0o0.hashCode();
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Execution{threads=");
        sbOooO0o0.append(this.f19028OooO00o);
        sbOooO0o0.append(", exception=");
        sbOooO0o0.append(this.f19029OooO0O0);
        sbOooO0o0.append(", appExitInfo=");
        sbOooO0o0.append(this.f19030OooO0OO);
        sbOooO0o0.append(", signal=");
        sbOooO0o0.append(this.f19031OooO0Oo);
        sbOooO0o0.append(", binaries=");
        sbOooO0o0.append(this.f19032OooO0o0);
        sbOooO0o0.append("}");
        return sbOooO0o0.toString();
    }
}
