package com.twitter.sdk.android.core.internal.oauth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p433o0OoOO0o.o0oOOo;

/* JADX INFO: loaded from: classes2.dex */
public class OAuth2Token extends o0oOOo implements Parcelable {
    public static final Parcelable.Creator<OAuth2Token> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @SerializedName("token_type")
    private final String f19968Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @SerializedName("access_token")
    private final String f19969Oooo0oo;

    public static class OooO00o implements Parcelable.Creator<OAuth2Token> {
        @Override // android.os.Parcelable.Creator
        public final OAuth2Token createFromParcel(Parcel parcel) {
            return new OAuth2Token(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final OAuth2Token[] newArray(int i) {
            return new OAuth2Token[i];
        }
    }

    public OAuth2Token(String str, String str2) {
        this.f19968Oooo0oO = str;
        this.f19969Oooo0oo = str2;
    }

    public final String OooO00o() {
        return this.f19969Oooo0oo;
    }

    public final String OooO0O0() {
        return this.f19968Oooo0oO;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OAuth2Token oAuth2Token = (OAuth2Token) obj;
        String str = this.f19969Oooo0oo;
        if (str == null ? oAuth2Token.f19969Oooo0oo != null : !str.equals(oAuth2Token.f19969Oooo0oo)) {
            return false;
        }
        String str2 = this.f19968Oooo0oO;
        String str3 = oAuth2Token.f19968Oooo0oO;
        return str2 == null ? str3 == null : str2.equals(str3);
    }

    public int hashCode() {
        String str = this.f19968Oooo0oO;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f19969Oooo0oo;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19968Oooo0oO);
        parcel.writeString(this.f19969Oooo0oo);
    }

    public OAuth2Token(Parcel parcel) {
        this.f19968Oooo0oO = parcel.readString();
        this.f19969Oooo0oo = parcel.readString();
    }
}
