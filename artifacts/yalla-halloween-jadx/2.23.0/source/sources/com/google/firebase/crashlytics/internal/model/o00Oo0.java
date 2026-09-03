package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Oo0 extends CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0249OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f20112OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f20113OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final p287o0O0Oo0.OooOO0<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0249OooO0o.AbstractC0250OooO00o> f20114OooO0OO;

    public o00Oo0() {
        throw null;
    }

    public o00Oo0(String str, int i, p287o0O0Oo0.OooOO0 oooOO1) {
        this.f20112OooO00o = str;
        this.f20113OooO0O0 = i;
        this.f20114OooO0OO = oooOO1;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0249OooO0o
    @NonNull
    public final p287o0O0Oo0.OooOO0<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0249OooO0o.AbstractC0250OooO00o> OooO00o() {
        return this.f20114OooO0OO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0249OooO0o
    public final int OooO0O0() {
        return this.f20113OooO0O0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0249OooO0o
    @NonNull
    public final String OooO0OO() {
        return this.f20112OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0249OooO0o)) {
            return false;
        }
        CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0249OooO0o abstractC0249OooO0o = (CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0249OooO0o) obj;
        return this.f20112OooO00o.equals(abstractC0249OooO0o.OooO0OO()) && this.f20113OooO0O0 == abstractC0249OooO0o.OooO0O0() && this.f20114OooO0OO.equals(abstractC0249OooO0o.OooO00o());
    }

    public final int hashCode() {
        return ((((this.f20112OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f20113OooO0O0) * 1000003) ^ this.f20114OooO0OO.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f20112OooO00o + ", importance=" + this.f20113OooO0O0 + ", frames=" + this.f20114OooO0OO + "}";
    }
}
