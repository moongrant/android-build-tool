package com.google.firebase.installations.remote;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 extends TokenResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f20215OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f20216OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final TokenResult.ResponseCode f20217OooO0OO;

    public OooO0O0(String str, long j, TokenResult.ResponseCode responseCode) {
        this.f20215OooO00o = str;
        this.f20216OooO0O0 = j;
        this.f20217OooO0OO = responseCode;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    @Nullable
    public final TokenResult.ResponseCode OooO00o() {
        return this.f20217OooO0OO;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    @Nullable
    public final String OooO0O0() {
        return this.f20215OooO00o;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    @NonNull
    public final long OooO0OO() {
        return this.f20216OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TokenResult)) {
            return false;
        }
        TokenResult tokenResult = (TokenResult) obj;
        String str = this.f20215OooO00o;
        if (str != null ? str.equals(tokenResult.OooO0O0()) : tokenResult.OooO0O0() == null) {
            if (this.f20216OooO0O0 == tokenResult.OooO0OO()) {
                TokenResult.ResponseCode responseCode = this.f20217OooO0OO;
                if (responseCode == null) {
                    if (tokenResult.OooO00o() == null) {
                        return true;
                    }
                } else if (responseCode.equals(tokenResult.OooO00o())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f20215OooO00o;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.f20216OooO0O0;
        int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        TokenResult.ResponseCode responseCode = this.f20217OooO0OO;
        return (responseCode != null ? responseCode.hashCode() : 0) ^ i;
    }

    public final String toString() {
        return "TokenResult{token=" + this.f20215OooO00o + ", tokenExpirationTimestamp=" + this.f20216OooO0O0 + ", responseCode=" + this.f20217OooO0OO + "}";
    }
}
