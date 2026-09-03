package com.google.firebase.installations.local;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.OooOOOO;
import p028Oooo0oO.o0O00o0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o extends OooO0O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f20193OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final PersistedInstallation.RegistrationStatus f20194OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f20195OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f20196OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f20197OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f20198OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f20199OooO0oo;

    /* JADX INFO: renamed from: com.google.firebase.installations.local.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0256OooO00o extends OooO0O0.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f20200OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public PersistedInstallation.RegistrationStatus f20201OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public String f20202OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public String f20203OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Long f20204OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Long f20205OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public String f20206OooO0oO;

        public C0256OooO00o(OooO0O0 oooO0O0) {
            this.f20200OooO00o = oooO0O0.OooO0OO();
            this.f20201OooO0O0 = oooO0O0.OooO0o();
            this.f20202OooO0OO = oooO0O0.OooO00o();
            this.f20203OooO0Oo = oooO0O0.OooO0o0();
            this.f20205OooO0o0 = Long.valueOf(oooO0O0.OooO0O0());
            this.f20204OooO0o = Long.valueOf(oooO0O0.OooO0oO());
            this.f20206OooO0oO = oooO0O0.OooO0Oo();
        }

        public final OooO00o OooO00o() {
            String strOooO00o = this.f20201OooO0O0 == null ? " registrationStatus" : "";
            if (this.f20205OooO0o0 == null) {
                strOooO00o = strOooO00o.concat(" expiresInSecs");
            }
            if (this.f20204OooO0o == null) {
                strOooO00o = OooOOOO.OooO00o(strOooO00o, " tokenCreationEpochInSecs");
            }
            if (strOooO00o.isEmpty()) {
                return new OooO00o(this.f20200OooO00o, this.f20201OooO0O0, this.f20202OooO0OO, this.f20203OooO0Oo, this.f20205OooO0o0.longValue(), this.f20204OooO0o.longValue(), this.f20206OooO0oO);
            }
            throw new IllegalStateException("Missing required properties:".concat(strOooO00o));
        }

        public final C0256OooO00o OooO0O0(PersistedInstallation.RegistrationStatus registrationStatus) {
            if (registrationStatus == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f20201OooO0O0 = registrationStatus;
            return this;
        }
    }

    public OooO00o(String str, PersistedInstallation.RegistrationStatus registrationStatus, String str2, String str3, long j, long j2, String str4) {
        this.f20193OooO0O0 = str;
        this.f20194OooO0OO = registrationStatus;
        this.f20195OooO0Oo = str2;
        this.f20197OooO0o0 = str3;
        this.f20196OooO0o = j;
        this.f20198OooO0oO = j2;
        this.f20199OooO0oo = str4;
    }

    @Override // com.google.firebase.installations.local.OooO0O0
    @Nullable
    public final String OooO00o() {
        return this.f20195OooO0Oo;
    }

    @Override // com.google.firebase.installations.local.OooO0O0
    public final long OooO0O0() {
        return this.f20196OooO0o;
    }

    @Override // com.google.firebase.installations.local.OooO0O0
    @Nullable
    public final String OooO0OO() {
        return this.f20193OooO0O0;
    }

    @Override // com.google.firebase.installations.local.OooO0O0
    @Nullable
    public final String OooO0Oo() {
        return this.f20199OooO0oo;
    }

    @Override // com.google.firebase.installations.local.OooO0O0
    @NonNull
    public final PersistedInstallation.RegistrationStatus OooO0o() {
        return this.f20194OooO0OO;
    }

    @Override // com.google.firebase.installations.local.OooO0O0
    @Nullable
    public final String OooO0o0() {
        return this.f20197OooO0o0;
    }

    @Override // com.google.firebase.installations.local.OooO0O0
    public final long OooO0oO() {
        return this.f20198OooO0oO;
    }

    public final C0256OooO00o OooO0oo() {
        return new C0256OooO00o(this);
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
        String str3 = this.f20193OooO0O0;
        if (str3 != null ? str3.equals(oooO0O0.OooO0OO()) : oooO0O0.OooO0OO() == null) {
            if (this.f20194OooO0OO.equals(oooO0O0.OooO0o()) && ((str = this.f20195OooO0Oo) != null ? str.equals(oooO0O0.OooO00o()) : oooO0O0.OooO00o() == null) && ((str2 = this.f20197OooO0o0) != null ? str2.equals(oooO0O0.OooO0o0()) : oooO0O0.OooO0o0() == null) && this.f20196OooO0o == oooO0O0.OooO0O0() && this.f20198OooO0oO == oooO0O0.OooO0oO()) {
                String str4 = this.f20199OooO0oo;
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
        String str = this.f20193OooO0O0;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f20194OooO0OO.hashCode()) * 1000003;
        String str2 = this.f20195OooO0Oo;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f20197OooO0o0;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.f20196OooO0o;
        int i = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f20198OooO0oO;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f20199OooO0oo;
        return (str4 != null ? str4.hashCode() : 0) ^ i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.f20193OooO0O0);
        sb.append(", registrationStatus=");
        sb.append(this.f20194OooO0OO);
        sb.append(", authToken=");
        sb.append(this.f20195OooO0Oo);
        sb.append(", refreshToken=");
        sb.append(this.f20197OooO0o0);
        sb.append(", expiresInSecs=");
        sb.append(this.f20196OooO0o);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f20198OooO0oO);
        sb.append(", fisError=");
        return o0O00o0.OooO0O0(sb, this.f20199OooO0oo, "}");
    }
}
