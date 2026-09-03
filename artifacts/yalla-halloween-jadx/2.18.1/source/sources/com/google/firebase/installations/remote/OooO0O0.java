package com.google.firebase.installations.remote;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p016OooOoO0.OooOo00;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 extends TokenResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f19158OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f19159OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final TokenResult.ResponseCode f19160OooO0OO;

    public static final class OooO00o extends TokenResult.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f19161OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Long f19162OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public TokenResult.ResponseCode f19163OooO0OO;

        @Override // com.google.firebase.installations.remote.TokenResult.OooO00o
        public final TokenResult OooO00o() {
            String str = this.f19162OooO0O0 == null ? " tokenExpirationTimestamp" : "";
            if (str.isEmpty()) {
                return new OooO0O0(this.f19161OooO00o, this.f19162OooO0O0.longValue(), this.f19163OooO0OO);
            }
            throw new IllegalStateException(OooOo00.OooO0Oo("Missing required properties:", str));
        }

        @Override // com.google.firebase.installations.remote.TokenResult.OooO00o
        public final TokenResult.OooO00o OooO0O0(long j) {
            this.f19162OooO0O0 = Long.valueOf(j);
            return this;
        }
    }

    public OooO0O0(String str, long j, TokenResult.ResponseCode responseCode) {
        this.f19158OooO00o = str;
        this.f19159OooO0O0 = j;
        this.f19160OooO0OO = responseCode;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    @Nullable
    public final TokenResult.ResponseCode OooO0O0() {
        return this.f19160OooO0OO;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    @Nullable
    public final String OooO0OO() {
        return this.f19158OooO00o;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    @NonNull
    public final long OooO0Oo() {
        return this.f19159OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TokenResult)) {
            return false;
        }
        TokenResult tokenResult = (TokenResult) obj;
        String str = this.f19158OooO00o;
        if (str != null ? str.equals(tokenResult.OooO0OO()) : tokenResult.OooO0OO() == null) {
            if (this.f19159OooO0O0 == tokenResult.OooO0Oo()) {
                TokenResult.ResponseCode responseCode = this.f19160OooO0OO;
                if (responseCode == null) {
                    if (tokenResult.OooO0O0() == null) {
                        return true;
                    }
                } else if (responseCode.equals(tokenResult.OooO0O0())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f19158OooO00o;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.f19159OooO0O0;
        int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        TokenResult.ResponseCode responseCode = this.f19160OooO0OO;
        return i ^ (responseCode != null ? responseCode.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("TokenResult{token=");
        sbOooO0o0.append(this.f19158OooO00o);
        sbOooO0o0.append(", tokenExpirationTimestamp=");
        sbOooO0o0.append(this.f19159OooO0O0);
        sbOooO0o0.append(", responseCode=");
        sbOooO0o0.append(this.f19160OooO0OO);
        sbOooO0o0.append("}");
        return sbOooO0o0.toString();
    }
}
