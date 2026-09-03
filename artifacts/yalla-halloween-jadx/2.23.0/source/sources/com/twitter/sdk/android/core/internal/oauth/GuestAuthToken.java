package com.twitter.sdk.android.core.internal.oauth;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class GuestAuthToken extends OAuth2Token {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @SerializedName("guest_token")
    private final String f21999OooO0oO;

    public GuestAuthToken(String str, String str2, String str3) {
        super(str, str2);
        this.f21999OooO0oO = str3;
    }

    public final String OooO0OO() {
        return this.f21999OooO0oO;
    }

    public final boolean OooO0Oo() {
        return System.currentTimeMillis() >= this.f21964OooO0Oo + 10800000;
    }

    @Override // com.twitter.sdk.android.core.internal.oauth.OAuth2Token
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        String str = this.f21999OooO0oO;
        String str2 = ((GuestAuthToken) obj).f21999OooO0oO;
        return str == null ? str2 == null : str.equals(str2);
    }

    @Override // com.twitter.sdk.android.core.internal.oauth.OAuth2Token
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f21999OooO0oO;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
