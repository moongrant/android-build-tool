package com.twitter.sdk.android.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.gson.annotations.SerializedName;
import p433o0OoOO0o.o0oOOo;

/* JADX INFO: loaded from: classes2.dex */
public class TwitterAuthToken extends o0oOOo implements Parcelable {
    public static final Parcelable.Creator<TwitterAuthToken> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @SerializedName(FirebaseMessagingService.EXTRA_TOKEN)
    public final String f19940Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @SerializedName("secret")
    public final String f19941Oooo0oo;

    public static class OooO00o implements Parcelable.Creator<TwitterAuthToken> {
        @Override // android.os.Parcelable.Creator
        public final TwitterAuthToken createFromParcel(Parcel parcel) {
            return new TwitterAuthToken(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final TwitterAuthToken[] newArray(int i) {
            return new TwitterAuthToken[i];
        }
    }

    public TwitterAuthToken(String str, String str2) {
        this.f19940Oooo0oO = str;
        this.f19941Oooo0oo = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TwitterAuthToken)) {
            return false;
        }
        TwitterAuthToken twitterAuthToken = (TwitterAuthToken) obj;
        String str = this.f19941Oooo0oo;
        if (str == null ? twitterAuthToken.f19941Oooo0oo != null : !str.equals(twitterAuthToken.f19941Oooo0oo)) {
            return false;
        }
        String str2 = this.f19940Oooo0oO;
        String str3 = twitterAuthToken.f19940Oooo0oO;
        return str2 == null ? str3 == null : str2.equals(str3);
    }

    public final int hashCode() {
        String str = this.f19940Oooo0oO;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f19941Oooo0oo;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("token=");
        sbOooO0o0.append(this.f19940Oooo0oO);
        sbOooO0o0.append(",secret=");
        sbOooO0o0.append(this.f19941Oooo0oo);
        return sbOooO0o0.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19940Oooo0oO);
        parcel.writeString(this.f19941Oooo0oo);
    }

    public TwitterAuthToken(Parcel parcel) {
        this.f19940Oooo0oO = parcel.readString();
        this.f19941Oooo0oo = parcel.readString();
    }
}
