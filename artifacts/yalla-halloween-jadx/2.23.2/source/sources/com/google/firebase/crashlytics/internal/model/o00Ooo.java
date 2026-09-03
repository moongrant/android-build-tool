package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Ooo extends CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0248OooO0o.AbstractC0249OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f19643OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f19644OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f19645OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f19646OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f19647OooO0o0;

    public static final class OooO00o extends CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0248OooO0o.AbstractC0249OooO00o.AbstractC0250OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Long f19648OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f19649OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public String f19650OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Long f19651OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Integer f19652OooO0o0;

        public final o00Ooo OooO00o() {
            String strOooO00o = this.f19648OooO00o == null ? " pc" : "";
            if (this.f19649OooO0O0 == null) {
                strOooO00o = strOooO00o.concat(" symbol");
            }
            if (this.f19651OooO0Oo == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " offset");
            }
            if (this.f19652OooO0o0 == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " importance");
            }
            if (strOooO00o.isEmpty()) {
                return new o00Ooo(this.f19648OooO00o.longValue(), this.f19649OooO0O0, this.f19650OooO0OO, this.f19651OooO0Oo.longValue(), this.f19652OooO0o0.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strOooO00o));
        }
    }

    public o00Ooo(long j, String str, String str2, long j2, int i) {
        this.f19643OooO00o = j;
        this.f19644OooO0O0 = str;
        this.f19645OooO0OO = str2;
        this.f19646OooO0Oo = j2;
        this.f19647OooO0o0 = i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0248OooO0o.AbstractC0249OooO00o
    @Nullable
    public final String OooO00o() {
        return this.f19645OooO0OO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0248OooO0o.AbstractC0249OooO00o
    public final int OooO0O0() {
        return this.f19647OooO0o0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0248OooO0o.AbstractC0249OooO00o
    public final long OooO0OO() {
        return this.f19646OooO0Oo;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0248OooO0o.AbstractC0249OooO00o
    public final long OooO0Oo() {
        return this.f19643OooO00o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0248OooO0o.AbstractC0249OooO00o
    @NonNull
    public final String OooO0o0() {
        return this.f19644OooO0O0;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0248OooO0o.AbstractC0249OooO00o)) {
            return false;
        }
        CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0248OooO0o.AbstractC0249OooO00o abstractC0249OooO00o = (CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0248OooO0o.AbstractC0249OooO00o) obj;
        return this.f19643OooO00o == abstractC0249OooO00o.OooO0Oo() && this.f19644OooO0O0.equals(abstractC0249OooO00o.OooO0o0()) && ((str = this.f19645OooO0OO) != null ? str.equals(abstractC0249OooO00o.OooO00o()) : abstractC0249OooO00o.OooO00o() == null) && this.f19646OooO0Oo == abstractC0249OooO00o.OooO0OO() && this.f19647OooO0o0 == abstractC0249OooO00o.OooO0O0();
    }

    public final int hashCode() {
        long j = this.f19643OooO00o;
        int iHashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f19644OooO0O0.hashCode()) * 1000003;
        String str = this.f19645OooO0OO;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j2 = this.f19646OooO0Oo;
        return ((iHashCode2 ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f19647OooO0o0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame{pc=");
        sb.append(this.f19643OooO00o);
        sb.append(", symbol=");
        sb.append(this.f19644OooO0O0);
        sb.append(", file=");
        sb.append(this.f19645OooO0OO);
        sb.append(", offset=");
        sb.append(this.f19646OooO0Oo);
        sb.append(", importance=");
        return p022Oooo00O.OooOO0.OooO00o(sb, this.f19647OooO0o0, "}");
    }
}
