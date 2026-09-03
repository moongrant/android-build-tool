package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import p028Oooo0oO.o0oOO;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo00 extends CrashlyticsReport.OooO.OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final String f19596OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f19597OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f19598OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f19599OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f19600OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f19601OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f19602OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f19603OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f19604OooO0oo;

    public static final class OooO00o extends CrashlyticsReport.OooO.OooO0OO.OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public String f19605OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Integer f19606OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f19607OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Integer f19608OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Long f19609OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Boolean f19610OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Long f19611OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Integer f19612OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public String f19613OooO0oo;

        public final OooOo00 OooO00o() {
            String strOooO00o = this.f19606OooO00o == null ? " arch" : "";
            if (this.f19607OooO0O0 == null) {
                strOooO00o = strOooO00o.concat(" model");
            }
            if (this.f19608OooO0OO == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " cores");
            }
            if (this.f19609OooO0Oo == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " ram");
            }
            if (this.f19611OooO0o0 == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " diskSpace");
            }
            if (this.f19610OooO0o == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " simulator");
            }
            if (this.f19612OooO0oO == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " state");
            }
            if (this.f19613OooO0oo == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " manufacturer");
            }
            if (this.f19605OooO == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " modelClass");
            }
            if (strOooO00o.isEmpty()) {
                return new OooOo00(this.f19606OooO00o.intValue(), this.f19607OooO0O0, this.f19608OooO0OO.intValue(), this.f19609OooO0Oo.longValue(), this.f19611OooO0o0.longValue(), this.f19610OooO0o.booleanValue(), this.f19612OooO0oO.intValue(), this.f19613OooO0oo, this.f19605OooO);
            }
            throw new IllegalStateException("Missing required properties:".concat(strOooO00o));
        }
    }

    public OooOo00(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f19597OooO00o = i;
        this.f19598OooO0O0 = str;
        this.f19599OooO0OO = i2;
        this.f19600OooO0Oo = j;
        this.f19602OooO0o0 = j2;
        this.f19601OooO0o = z;
        this.f19603OooO0oO = i3;
        this.f19604OooO0oo = str2;
        this.f19596OooO = str3;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0OO
    public final boolean OooO() {
        return this.f19601OooO0o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0OO
    @NonNull
    public final int OooO00o() {
        return this.f19597OooO00o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0OO
    public final int OooO0O0() {
        return this.f19599OooO0OO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0OO
    public final long OooO0OO() {
        return this.f19602OooO0o0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0OO
    @NonNull
    public final String OooO0Oo() {
        return this.f19604OooO0oo;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0OO
    @NonNull
    public final String OooO0o() {
        return this.f19596OooO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0OO
    @NonNull
    public final String OooO0o0() {
        return this.f19598OooO0O0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0OO
    public final long OooO0oO() {
        return this.f19600OooO0Oo;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0OO
    public final int OooO0oo() {
        return this.f19603OooO0oO;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.OooO.OooO0OO)) {
            return false;
        }
        CrashlyticsReport.OooO.OooO0OO oooO0OO = (CrashlyticsReport.OooO.OooO0OO) obj;
        return this.f19597OooO00o == oooO0OO.OooO00o() && this.f19598OooO0O0.equals(oooO0OO.OooO0o0()) && this.f19599OooO0OO == oooO0OO.OooO0O0() && this.f19600OooO0Oo == oooO0OO.OooO0oO() && this.f19602OooO0o0 == oooO0OO.OooO0OO() && this.f19601OooO0o == oooO0OO.OooO() && this.f19603OooO0oO == oooO0OO.OooO0oo() && this.f19604OooO0oo.equals(oooO0OO.OooO0Oo()) && this.f19596OooO.equals(oooO0OO.OooO0o());
    }

    public final int hashCode() {
        int iHashCode = (((((this.f19597OooO00o ^ 1000003) * 1000003) ^ this.f19598OooO0O0.hashCode()) * 1000003) ^ this.f19599OooO0OO) * 1000003;
        long j = this.f19600OooO0Oo;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f19602OooO0o0;
        return ((((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f19601OooO0o ? 1231 : 1237)) * 1000003) ^ this.f19603OooO0oO) * 1000003) ^ this.f19604OooO0oo.hashCode()) * 1000003) ^ this.f19596OooO.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{arch=");
        sb.append(this.f19597OooO00o);
        sb.append(", model=");
        sb.append(this.f19598OooO0O0);
        sb.append(", cores=");
        sb.append(this.f19599OooO0OO);
        sb.append(", ram=");
        sb.append(this.f19600OooO0Oo);
        sb.append(", diskSpace=");
        sb.append(this.f19602OooO0o0);
        sb.append(", simulator=");
        sb.append(this.f19601OooO0o);
        sb.append(", state=");
        sb.append(this.f19603OooO0oO);
        sb.append(", manufacturer=");
        sb.append(this.f19604OooO0oo);
        sb.append(", modelClass=");
        return o0oOO.OooO0O0(sb, this.f19596OooO, "}");
    }
}
