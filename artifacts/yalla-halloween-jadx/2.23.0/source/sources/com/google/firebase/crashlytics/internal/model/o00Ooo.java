package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Ooo extends CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0249OooO0o.AbstractC0250OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f20115OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f20116OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f20117OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f20118OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f20119OooO0o0;

    public static final class OooO00o extends CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0249OooO0o.AbstractC0250OooO00o.AbstractC0251OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Long f20120OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f20121OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public String f20122OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Long f20123OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Integer f20124OooO0o0;

        public final o00Ooo OooO00o() {
            String strOooO00o = this.f20120OooO00o == null ? " pc" : "";
            if (this.f20121OooO0O0 == null) {
                strOooO00o = strOooO00o.concat(" symbol");
            }
            if (this.f20123OooO0Oo == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " offset");
            }
            if (this.f20124OooO0o0 == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " importance");
            }
            if (strOooO00o.isEmpty()) {
                return new o00Ooo(this.f20120OooO00o.longValue(), this.f20121OooO0O0, this.f20122OooO0OO, this.f20123OooO0Oo.longValue(), this.f20124OooO0o0.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strOooO00o));
        }
    }

    public o00Ooo(long j, String str, String str2, long j2, int i) {
        this.f20115OooO00o = j;
        this.f20116OooO0O0 = str;
        this.f20117OooO0OO = str2;
        this.f20118OooO0Oo = j2;
        this.f20119OooO0o0 = i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0249OooO0o.AbstractC0250OooO00o
    @Nullable
    public final String OooO00o() {
        return this.f20117OooO0OO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0249OooO0o.AbstractC0250OooO00o
    public final int OooO0O0() {
        return this.f20119OooO0o0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0249OooO0o.AbstractC0250OooO00o
    public final long OooO0OO() {
        return this.f20118OooO0Oo;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0249OooO0o.AbstractC0250OooO00o
    public final long OooO0Oo() {
        return this.f20115OooO00o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0249OooO0o.AbstractC0250OooO00o
    @NonNull
    public final String OooO0o0() {
        return this.f20116OooO0O0;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0249OooO0o.AbstractC0250OooO00o)) {
            return false;
        }
        CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0249OooO0o.AbstractC0250OooO00o abstractC0250OooO00o = (CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0249OooO0o.AbstractC0250OooO00o) obj;
        return this.f20115OooO00o == abstractC0250OooO00o.OooO0Oo() && this.f20116OooO0O0.equals(abstractC0250OooO00o.OooO0o0()) && ((str = this.f20117OooO0OO) != null ? str.equals(abstractC0250OooO00o.OooO00o()) : abstractC0250OooO00o.OooO00o() == null) && this.f20118OooO0Oo == abstractC0250OooO00o.OooO0OO() && this.f20119OooO0o0 == abstractC0250OooO00o.OooO0O0();
    }

    public final int hashCode() {
        long j = this.f20115OooO00o;
        int iHashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f20116OooO0O0.hashCode()) * 1000003;
        String str = this.f20117OooO0OO;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j2 = this.f20118OooO0Oo;
        return ((iHashCode2 ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f20119OooO0o0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame{pc=");
        sb.append(this.f20115OooO00o);
        sb.append(", symbol=");
        sb.append(this.f20116OooO0O0);
        sb.append(", file=");
        sb.append(this.f20117OooO0OO);
        sb.append(", offset=");
        sb.append(this.f20118OooO0Oo);
        sb.append(", importance=");
        return p022Oooo00O.OooOO0.OooO0O0(sb, this.f20119OooO0o0, "}");
    }
}
