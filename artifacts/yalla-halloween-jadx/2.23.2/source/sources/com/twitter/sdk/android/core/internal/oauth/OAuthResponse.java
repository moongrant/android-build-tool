package com.twitter.sdk.android.core.internal.oauth;

import android.os.Parcel;
import android.os.Parcelable;
import com.twitter.sdk.android.core.TwitterAuthToken;

/* JADX INFO: loaded from: classes2.dex */
public class OAuthResponse implements Parcelable {
    public static final Parcelable.Creator<OAuthResponse> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final TwitterAuthToken f21533OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f21534OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f21535OooO0o0;

    public static class OooO00o implements Parcelable.Creator<OAuthResponse> {
        @Override // android.os.Parcelable.Creator
        public final OAuthResponse createFromParcel(Parcel parcel) {
            return new OAuthResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final OAuthResponse[] newArray(int i) {
            return new OAuthResponse[i];
        }
    }

    public OAuthResponse(long j, TwitterAuthToken twitterAuthToken, String str) {
        this.f21533OooO0Oo = twitterAuthToken;
        this.f21535OooO0o0 = str;
        this.f21534OooO0o = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "authToken=" + this.f21533OooO0Oo + ",userName=" + this.f21535OooO0o0 + ",userId=" + this.f21534OooO0o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f21533OooO0Oo, i);
        parcel.writeString(this.f21535OooO0o0);
        parcel.writeLong(this.f21534OooO0o);
    }

    public OAuthResponse(Parcel parcel) {
        this.f21533OooO0Oo = (TwitterAuthToken) parcel.readParcelable(TwitterAuthToken.class.getClassLoader());
        this.f21535OooO0o0 = parcel.readString();
        this.f21534OooO0o = parcel.readLong();
    }
}
