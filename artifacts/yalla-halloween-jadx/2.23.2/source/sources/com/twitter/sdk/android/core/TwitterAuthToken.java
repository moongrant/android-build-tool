package com.twitter.sdk.android.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes2.dex */
public class TwitterAuthToken extends com.twitter.sdk.android.core.OooO00o implements Parcelable {
    public static final Parcelable.Creator<TwitterAuthToken> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @SerializedName("secret")
    public final String f21507OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @SerializedName("token")
    public final String f21508OooO0o0;

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
        this.f21508OooO0o0 = str;
        this.f21507OooO0o = str2;
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
        String str = this.f21507OooO0o;
        if (str == null ? twitterAuthToken.f21507OooO0o != null : !str.equals(twitterAuthToken.f21507OooO0o)) {
            return false;
        }
        String str2 = this.f21508OooO0o0;
        String str3 = twitterAuthToken.f21508OooO0o0;
        return str2 == null ? str3 == null : str2.equals(str3);
    }

    public final int hashCode() {
        String str = this.f21508OooO0o0;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f21507OooO0o;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "token=" + this.f21508OooO0o0 + ",secret=" + this.f21507OooO0o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f21508OooO0o0);
        parcel.writeString(this.f21507OooO0o);
    }

    public TwitterAuthToken(Parcel parcel) {
        this.f21508OooO0o0 = parcel.readString();
        this.f21507OooO0o = parcel.readString();
    }
}
