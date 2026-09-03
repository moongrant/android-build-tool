package com.google.firebase.installations.local;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;
import p016OooOoO0.OooOo00;
import p058o0000OoO.OooO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends OooO0O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f19136OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final PersistedInstallation.RegistrationStatus f19137OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f19138OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f19139OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f19140OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f19141OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f19142OooO0oo;

    /* JADX INFO: renamed from: com.google.firebase.installations.local.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0152OooO00o extends OooO0O0.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f19143OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public PersistedInstallation.RegistrationStatus f19144OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public String f19145OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public String f19146OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Long f19147OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Long f19148OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public String f19149OooO0oO;

        public C0152OooO00o() {
        }

        public final OooO0O0 OooO00o() {
            String strOooO0Oo = this.f19144OooO0O0 == null ? " registrationStatus" : "";
            if (this.f19148OooO0o0 == null) {
                strOooO0Oo = OooOo00.OooO0Oo(strOooO0Oo, " expiresInSecs");
            }
            if (this.f19147OooO0o == null) {
                strOooO0Oo = OooOo00.OooO0Oo(strOooO0Oo, " tokenCreationEpochInSecs");
            }
            if (strOooO0Oo.isEmpty()) {
                return new OooO00o(this.f19143OooO00o, this.f19144OooO0O0, this.f19145OooO0OO, this.f19146OooO0Oo, this.f19148OooO0o0.longValue(), this.f19147OooO0o.longValue(), this.f19149OooO0oO);
            }
            throw new IllegalStateException(OooOo00.OooO0Oo("Missing required properties:", strOooO0Oo));
        }

        public final OooO0O0.OooO00o OooO0O0(long j) {
            this.f19148OooO0o0 = Long.valueOf(j);
            return this;
        }

        public final OooO0O0.OooO00o OooO0OO(PersistedInstallation.RegistrationStatus registrationStatus) {
            Objects.requireNonNull(registrationStatus, "Null registrationStatus");
            this.f19144OooO0O0 = registrationStatus;
            return this;
        }

        public final OooO0O0.OooO00o OooO0Oo(long j) {
            this.f19147OooO0o = Long.valueOf(j);
            return this;
        }

        public C0152OooO00o(OooO0O0 oooO0O0) {
            this.f19143OooO00o = oooO0O0.OooO0OO();
            this.f19144OooO0O0 = oooO0O0.OooO0o();
            this.f19145OooO0OO = oooO0O0.OooO00o();
            this.f19146OooO0Oo = oooO0O0.OooO0o0();
            this.f19148OooO0o0 = Long.valueOf(oooO0O0.OooO0O0());
            this.f19147OooO0o = Long.valueOf(oooO0O0.OooO0oO());
            this.f19149OooO0oO = oooO0O0.OooO0Oo();
        }
    }

    public OooO00o(String str, PersistedInstallation.RegistrationStatus registrationStatus, String str2, String str3, long j, long j2, String str4) {
        this.f19136OooO0O0 = str;
        this.f19137OooO0OO = registrationStatus;
        this.f19138OooO0Oo = str2;
        this.f19140OooO0o0 = str3;
        this.f19139OooO0o = j;
        this.f19141OooO0oO = j2;
        this.f19142OooO0oo = str4;
    }

    @Override // com.google.firebase.installations.local.OooO0O0
    @Nullable
    public final String OooO00o() {
        return this.f19138OooO0Oo;
    }

    @Override // com.google.firebase.installations.local.OooO0O0
    public final long OooO0O0() {
        return this.f19139OooO0o;
    }

    @Override // com.google.firebase.installations.local.OooO0O0
    @Nullable
    public final String OooO0OO() {
        return this.f19136OooO0O0;
    }

    @Override // com.google.firebase.installations.local.OooO0O0
    @Nullable
    public final String OooO0Oo() {
        return this.f19142OooO0oo;
    }

    @Override // com.google.firebase.installations.local.OooO0O0
    @NonNull
    public final PersistedInstallation.RegistrationStatus OooO0o() {
        return this.f19137OooO0OO;
    }

    @Override // com.google.firebase.installations.local.OooO0O0
    @Nullable
    public final String OooO0o0() {
        return this.f19140OooO0o0;
    }

    @Override // com.google.firebase.installations.local.OooO0O0
    public final long OooO0oO() {
        return this.f19141OooO0oO;
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
        String str3 = this.f19136OooO0O0;
        if (str3 != null ? str3.equals(oooO0O0.OooO0OO()) : oooO0O0.OooO0OO() == null) {
            if (this.f19137OooO0OO.equals(oooO0O0.OooO0o()) && ((str = this.f19138OooO0Oo) != null ? str.equals(oooO0O0.OooO00o()) : oooO0O0.OooO00o() == null) && ((str2 = this.f19140OooO0o0) != null ? str2.equals(oooO0O0.OooO0o0()) : oooO0O0.OooO0o0() == null) && this.f19139OooO0o == oooO0O0.OooO0O0() && this.f19141OooO0oO == oooO0O0.OooO0oO()) {
                String str4 = this.f19142OooO0oo;
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
        String str = this.f19136OooO0O0;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f19137OooO0OO.hashCode()) * 1000003;
        String str2 = this.f19138OooO0Oo;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f19140OooO0o0;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.f19139OooO0o;
        int i = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f19141OooO0oO;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f19142OooO0oo;
        return i2 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("PersistedInstallationEntry{firebaseInstallationId=");
        sbOooO0o0.append(this.f19136OooO0O0);
        sbOooO0o0.append(", registrationStatus=");
        sbOooO0o0.append(this.f19137OooO0OO);
        sbOooO0o0.append(", authToken=");
        sbOooO0o0.append(this.f19138OooO0Oo);
        sbOooO0o0.append(", refreshToken=");
        sbOooO0o0.append(this.f19140OooO0o0);
        sbOooO0o0.append(", expiresInSecs=");
        sbOooO0o0.append(this.f19139OooO0o);
        sbOooO0o0.append(", tokenCreationEpochInSecs=");
        sbOooO0o0.append(this.f19141OooO0oO);
        sbOooO0o0.append(", fisError=");
        return OooO.OooO00o(sbOooO0o0, this.f19142OooO0oo, "}");
    }
}
