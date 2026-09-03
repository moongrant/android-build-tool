package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Oo0 extends CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0248OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f19640OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f19641OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final p291o0O0Oo0o.o00O0O<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0248OooO0o.AbstractC0249OooO00o> f19642OooO0OO;

    public o00Oo0() {
        throw null;
    }

    public o00Oo0(String str, int i, p291o0O0Oo0o.o00O0O o00o0o2) {
        this.f19640OooO00o = str;
        this.f19641OooO0O0 = i;
        this.f19642OooO0OO = o00o0o2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0248OooO0o
    @NonNull
    public final p291o0O0Oo0o.o00O0O<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0248OooO0o.AbstractC0249OooO00o> OooO00o() {
        return this.f19642OooO0OO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0248OooO0o
    public final int OooO0O0() {
        return this.f19641OooO0O0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0248OooO0o
    @NonNull
    public final String OooO0OO() {
        return this.f19640OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0248OooO0o)) {
            return false;
        }
        CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0248OooO0o abstractC0248OooO0o = (CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0248OooO0o) obj;
        return this.f19640OooO00o.equals(abstractC0248OooO0o.OooO0OO()) && this.f19641OooO0O0 == abstractC0248OooO0o.OooO0O0() && this.f19642OooO0OO.equals(abstractC0248OooO0o.OooO00o());
    }

    public final int hashCode() {
        return ((((this.f19640OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f19641OooO0O0) * 1000003) ^ this.f19642OooO0OO.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f19640OooO00o + ", importance=" + this.f19641OooO0O0 + ", frames=" + this.f19642OooO0OO + "}";
    }
}
