package com.twitter.sdk.android.core.internal.oauth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class OAuth2Token extends com.twitter.sdk.android.core.OooO00o implements Parcelable {
    public static final Parcelable.Creator<OAuth2Token> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @SerializedName("access_token")
    private final String f22002OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @SerializedName("token_type")
    private final String f22003OooO0o0;

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
        this.f22003OooO0o0 = str;
        this.f22002OooO0o = str2;
    }

    public final String OooO00o() {
        return this.f22002OooO0o;
    }

    public final String OooO0O0() {
        return this.f22003OooO0o0;
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
        String str = this.f22002OooO0o;
        if (str == null ? oAuth2Token.f22002OooO0o != null : !str.equals(oAuth2Token.f22002OooO0o)) {
            return false;
        }
        String str2 = this.f22003OooO0o0;
        String str3 = oAuth2Token.f22003OooO0o0;
        return str2 == null ? str3 == null : str2.equals(str3);
    }

    public int hashCode() {
        String str = this.f22003OooO0o0;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f22002OooO0o;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f22003OooO0o0);
        parcel.writeString(this.f22002OooO0o);
    }

    public OAuth2Token(Parcel parcel) {
        this.f22003OooO0o0 = parcel.readString();
        this.f22002OooO0o = parcel.readString();
    }
}
