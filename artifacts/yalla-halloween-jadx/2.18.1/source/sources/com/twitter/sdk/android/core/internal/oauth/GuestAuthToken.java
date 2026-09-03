package com.twitter.sdk.android.core.internal.oauth;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes2.dex */
public class GuestAuthToken extends OAuth2Token {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @SerializedName("guest_token")
    private final String f19961Oooo;

    public GuestAuthToken(String str, String str2, String str3) {
        super(str, str2);
        this.f19961Oooo = str3;
    }

    public final String OooO0OO() {
        return this.f19961Oooo;
    }

    @Override // com.twitter.sdk.android.core.internal.oauth.OAuth2Token
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        String str = this.f19961Oooo;
        String str2 = ((GuestAuthToken) obj).f19961Oooo;
        return str == null ? str2 == null : str.equals(str2);
    }

    @Override // com.twitter.sdk.android.core.internal.oauth.OAuth2Token
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f19961Oooo;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
