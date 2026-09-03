package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.annotations.Encodable;
import p028Oooo0oO.o0oOO;

/* JADX INFO: loaded from: classes3.dex */
public final class o000oOoO extends CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0245OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f19629OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f19630OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f19631OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f19632OooO0Oo;

    public static final class OooO00o extends CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0245OooO00o.AbstractC0246OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Long f19633OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Long f19634OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public String f19635OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public String f19636OooO0Oo;

        public final o000oOoO OooO00o() {
            String strOooO00o = this.f19633OooO00o == null ? " baseAddress" : "";
            if (this.f19634OooO0O0 == null) {
                strOooO00o = strOooO00o.concat(" size");
            }
            if (this.f19635OooO0OO == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " name");
            }
            if (strOooO00o.isEmpty()) {
                return new o000oOoO(this.f19633OooO00o.longValue(), this.f19634OooO0O0.longValue(), this.f19635OooO0OO, this.f19636OooO0Oo);
            }
            throw new IllegalStateException("Missing required properties:".concat(strOooO00o));
        }
    }

    public o000oOoO(long j, long j2, String str, String str2) {
        this.f19629OooO00o = j;
        this.f19630OooO0O0 = j2;
        this.f19631OooO0OO = str;
        this.f19632OooO0Oo = str2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0245OooO00o
    @NonNull
    public final long OooO00o() {
        return this.f19629OooO00o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0245OooO00o
    @NonNull
    public final String OooO0O0() {
        return this.f19631OooO0OO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0245OooO00o
    public final long OooO0OO() {
        return this.f19630OooO0O0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0245OooO00o
    @Nullable
    @Encodable.Ignore
    public final String OooO0Oo() {
        return this.f19632OooO0Oo;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0245OooO00o)) {
            return false;
        }
        CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0245OooO00o abstractC0245OooO00o = (CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0245OooO00o) obj;
        if (this.f19629OooO00o == abstractC0245OooO00o.OooO00o() && this.f19630OooO0O0 == abstractC0245OooO00o.OooO0OO() && this.f19631OooO0OO.equals(abstractC0245OooO00o.OooO0O0())) {
            String str = this.f19632OooO0Oo;
            if (str == null) {
                if (abstractC0245OooO00o.OooO0Oo() == null) {
                    return true;
                }
            } else if (str.equals(abstractC0245OooO00o.OooO0Oo())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f19629OooO00o;
        long j2 = this.f19630OooO0O0;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f19631OooO0OO.hashCode()) * 1000003;
        String str = this.f19632OooO0Oo;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BinaryImage{baseAddress=");
        sb.append(this.f19629OooO00o);
        sb.append(", size=");
        sb.append(this.f19630OooO0O0);
        sb.append(", name=");
        sb.append(this.f19631OooO0OO);
        sb.append(", uuid=");
        return o0oOO.OooO0O0(sb, this.f19632OooO0Oo, "}");
    }
}
