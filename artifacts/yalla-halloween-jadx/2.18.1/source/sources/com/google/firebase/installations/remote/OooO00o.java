package com.google.firebase.installations.remote;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends InstallationResponse {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f19153OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f19154OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f19155OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final TokenResult f19156OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final InstallationResponse.ResponseCode f19157OooO0o0;

    public OooO00o(String str, String str2, String str3, TokenResult tokenResult, InstallationResponse.ResponseCode responseCode) {
        this.f19153OooO00o = str;
        this.f19154OooO0O0 = str2;
        this.f19155OooO0OO = str3;
        this.f19156OooO0Oo = tokenResult;
        this.f19157OooO0o0 = responseCode;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    @Nullable
    public final TokenResult OooO00o() {
        return this.f19156OooO0Oo;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    @Nullable
    public final String OooO0O0() {
        return this.f19154OooO0O0;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    @Nullable
    public final String OooO0OO() {
        return this.f19155OooO0OO;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    @Nullable
    public final InstallationResponse.ResponseCode OooO0Oo() {
        return this.f19157OooO0o0;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    @Nullable
    public final String OooO0o0() {
        return this.f19153OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallationResponse)) {
            return false;
        }
        InstallationResponse installationResponse = (InstallationResponse) obj;
        String str = this.f19153OooO00o;
        if (str != null ? str.equals(installationResponse.OooO0o0()) : installationResponse.OooO0o0() == null) {
            String str2 = this.f19154OooO0O0;
            if (str2 != null ? str2.equals(installationResponse.OooO0O0()) : installationResponse.OooO0O0() == null) {
                String str3 = this.f19155OooO0OO;
                if (str3 != null ? str3.equals(installationResponse.OooO0OO()) : installationResponse.OooO0OO() == null) {
                    TokenResult tokenResult = this.f19156OooO0Oo;
                    if (tokenResult != null ? tokenResult.equals(installationResponse.OooO00o()) : installationResponse.OooO00o() == null) {
                        InstallationResponse.ResponseCode responseCode = this.f19157OooO0o0;
                        if (responseCode == null) {
                            if (installationResponse.OooO0Oo() == null) {
                                return true;
                            }
                        } else if (responseCode.equals(installationResponse.OooO0Oo())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f19153OooO00o;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f19154OooO0O0;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f19155OooO0OO;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        TokenResult tokenResult = this.f19156OooO0Oo;
        int iHashCode4 = (iHashCode3 ^ (tokenResult == null ? 0 : tokenResult.hashCode())) * 1000003;
        InstallationResponse.ResponseCode responseCode = this.f19157OooO0o0;
        return iHashCode4 ^ (responseCode != null ? responseCode.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("InstallationResponse{uri=");
        sbOooO0o0.append(this.f19153OooO00o);
        sbOooO0o0.append(", fid=");
        sbOooO0o0.append(this.f19154OooO0O0);
        sbOooO0o0.append(", refreshToken=");
        sbOooO0o0.append(this.f19155OooO0OO);
        sbOooO0o0.append(", authToken=");
        sbOooO0o0.append(this.f19156OooO0Oo);
        sbOooO0o0.append(", responseCode=");
        sbOooO0o0.append(this.f19157OooO0o0);
        sbOooO0o0.append("}");
        return sbOooO0o0.toString();
    }
}
