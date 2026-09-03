package com.google.firebase.installations.local;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.OooOOOO;
import p028Oooo0oO.o0oOO;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o extends OooO0O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f19721OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final PersistedInstallation.RegistrationStatus f19722OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f19723OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f19724OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f19725OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f19726OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f19727OooO0oo;

    /* JADX INFO: renamed from: com.google.firebase.installations.local.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0255OooO00o extends OooO0O0.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f19728OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public PersistedInstallation.RegistrationStatus f19729OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public String f19730OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public String f19731OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Long f19732OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Long f19733OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public String f19734OooO0oO;

        public C0255OooO00o(OooO0O0 oooO0O0) {
            this.f19728OooO00o = oooO0O0.OooO0OO();
            this.f19729OooO0O0 = oooO0O0.OooO0o();
            this.f19730OooO0OO = oooO0O0.OooO00o();
            this.f19731OooO0Oo = oooO0O0.OooO0o0();
            this.f19733OooO0o0 = Long.valueOf(oooO0O0.OooO0O0());
            this.f19732OooO0o = Long.valueOf(oooO0O0.OooO0oO());
            this.f19734OooO0oO = oooO0O0.OooO0Oo();
        }

        public final OooO00o OooO00o() {
            String strOooO00o = this.f19729OooO0O0 == null ? " registrationStatus" : "";
            if (this.f19733OooO0o0 == null) {
                strOooO00o = strOooO00o.concat(" expiresInSecs");
            }
            if (this.f19732OooO0o == null) {
                strOooO00o = OooOOOO.OooO00o(strOooO00o, " tokenCreationEpochInSecs");
            }
            if (strOooO00o.isEmpty()) {
                return new OooO00o(this.f19728OooO00o, this.f19729OooO0O0, this.f19730OooO0OO, this.f19731OooO0Oo, this.f19733OooO0o0.longValue(), this.f19732OooO0o.longValue(), this.f19734OooO0oO);
            }
            throw new IllegalStateException("Missing required properties:".concat(strOooO00o));
        }

        public final C0255OooO00o OooO0O0(PersistedInstallation.RegistrationStatus registrationStatus) {
            if (registrationStatus == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f19729OooO0O0 = registrationStatus;
            return this;
        }
    }

    public OooO00o(String str, PersistedInstallation.RegistrationStatus registrationStatus, String str2, String str3, long j, long j2, String str4) {
        this.f19721OooO0O0 = str;
        this.f19722OooO0OO = registrationStatus;
        this.f19723OooO0Oo = str2;
        this.f19725OooO0o0 = str3;
        this.f19724OooO0o = j;
        this.f19726OooO0oO = j2;
        this.f19727OooO0oo = str4;
    }

    @Override // com.google.firebase.installations.local.OooO0O0
    @Nullable
    public final String OooO00o() {
        return this.f19723OooO0Oo;
    }

    @Override // com.google.firebase.installations.local.OooO0O0
    public final long OooO0O0() {
        return this.f19724OooO0o;
    }

    @Override // com.google.firebase.installations.local.OooO0O0
    @Nullable
    public final String OooO0OO() {
        return this.f19721OooO0O0;
    }

    @Override // com.google.firebase.installations.local.OooO0O0
    @Nullable
    public final String OooO0Oo() {
        return this.f19727OooO0oo;
    }

    @Override // com.google.firebase.installations.local.OooO0O0
    @NonNull
    public final PersistedInstallation.RegistrationStatus OooO0o() {
        return this.f19722OooO0OO;
    }

    @Override // com.google.firebase.installations.local.OooO0O0
    @Nullable
    public final String OooO0o0() {
        return this.f19725OooO0o0;
    }

    @Override // com.google.firebase.installations.local.OooO0O0
    public final long OooO0oO() {
        return this.f19726OooO0oO;
    }

    public final C0255OooO00o OooO0oo() {
        return new C0255OooO00o(this);
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooO0O0)) {
            return false;
        }
        OooO0O0 oooO0O0 = (OooO0O0) obj;
        String str3 = this.f19721OooO0O0;
        if (str3 != null ? str3.equals(oooO0O0.OooO0OO()) : oooO0O0.OooO0OO() == null) {
            if (this.f19722OooO0OO.equals(oooO0O0.OooO0o()) && ((str = this.f19723OooO0Oo) != null ? str.equals(oooO0O0.OooO00o()) : oooO0O0.OooO00o() == null) && ((str2 = this.f19725OooO0o0) != null ? str2.equals(oooO0O0.OooO0o0()) : oooO0O0.OooO0o0() == null) && this.f19724OooO0o == oooO0O0.OooO0O0() && this.f19726OooO0oO == oooO0O0.OooO0oO()) {
                String str4 = this.f19727OooO0oo;
                if (str4 == null) {
                    if (oooO0O0.OooO0Oo() == null) {
                        return true;
                    }
                } else if (str4.equals(oooO0O0.OooO0Oo())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f19721OooO0O0;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f19722OooO0OO.hashCode()) * 1000003;
        String str2 = this.f19723OooO0Oo;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f19725OooO0o0;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.f19724OooO0o;
        int i = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f19726OooO0oO;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f19727OooO0oo;
        return (str4 != null ? str4.hashCode() : 0) ^ i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.f19721OooO0O0);
        sb.append(", registrationStatus=");
        sb.append(this.f19722OooO0OO);
        sb.append(", authToken=");
        sb.append(this.f19723OooO0Oo);
        sb.append(", refreshToken=");
        sb.append(this.f19725OooO0o0);
        sb.append(", expiresInSecs=");
        sb.append(this.f19724OooO0o);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f19726OooO0oO);
        sb.append(", fisError=");
        return o0oOO.OooO0O0(sb, this.f19727OooO0oo, "}");
    }
}
