package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OoOo0 extends CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0247OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f19655OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f19656OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final p291o0O0Oo0o.o00O0O<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0248OooO0o.AbstractC0249OooO00o> f19657OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0247OooO0O0 f19658OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f19659OooO0o0;

    public o0OoOo0() {
        throw null;
    }

    public o0OoOo0(String str, String str2, p291o0O0Oo0o.o00O0O o00o0o2, CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0247OooO0O0 abstractC0247OooO0O0, int i) {
        this.f19655OooO00o = str;
        this.f19656OooO0O0 = str2;
        this.f19657OooO0OO = o00o0o2;
        this.f19658OooO0Oo = abstractC0247OooO0O0;
        this.f19659OooO0o0 = i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0247OooO0O0
    @Nullable
    public final CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0247OooO0O0 OooO00o() {
        return this.f19658OooO0Oo;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0247OooO0O0
    @NonNull
    public final p291o0O0Oo0o.o00O0O<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0248OooO0o.AbstractC0249OooO00o> OooO0O0() {
        return this.f19657OooO0OO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0247OooO0O0
    public final int OooO0OO() {
        return this.f19659OooO0o0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0247OooO0O0
    @Nullable
    public final String OooO0Oo() {
        return this.f19656OooO0O0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0247OooO0O0
    @NonNull
    public final String OooO0o0() {
        return this.f19655OooO00o;
    }

    public final boolean equals(Object obj) {
        String str;
        CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0247OooO0O0 abstractC0247OooO0O0;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0247OooO0O0)) {
            return false;
        }
        CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0247OooO0O0 abstractC0247OooO0O1 = (CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0247OooO0O0) obj;
        return this.f19655OooO00o.equals(abstractC0247OooO0O1.OooO0o0()) && ((str = this.f19656OooO0O0) != null ? str.equals(abstractC0247OooO0O1.OooO0Oo()) : abstractC0247OooO0O1.OooO0Oo() == null) && this.f19657OooO0OO.equals(abstractC0247OooO0O1.OooO0O0()) && ((abstractC0247OooO0O0 = this.f19658OooO0Oo) != null ? abstractC0247OooO0O0.equals(abstractC0247OooO0O1.OooO00o()) : abstractC0247OooO0O1.OooO00o() == null) && this.f19659OooO0o0 == abstractC0247OooO0O1.OooO0OO();
    }

    public final int hashCode() {
        int iHashCode = (this.f19655OooO00o.hashCode() ^ 1000003) * 1000003;
        String str = this.f19656OooO0O0;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f19657OooO0OO.hashCode()) * 1000003;
        CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0247OooO0O0 abstractC0247OooO0O0 = this.f19658OooO0Oo;
        return ((iHashCode2 ^ (abstractC0247OooO0O0 != null ? abstractC0247OooO0O0.hashCode() : 0)) * 1000003) ^ this.f19659OooO0o0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.f19655OooO00o);
        sb.append(", reason=");
        sb.append(this.f19656OooO0O0);
        sb.append(", frames=");
        sb.append(this.f19657OooO0OO);
        sb.append(", causedBy=");
        sb.append(this.f19658OooO0Oo);
        sb.append(", overflowCount=");
        return p022Oooo00O.OooOO0.OooO00o(sb, this.f19659OooO0o0, "}");
    }
}
