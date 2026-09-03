package com.twitter.sdk.android.core.internal.oauth;

import android.os.Parcel;
import android.os.Parcelable;
import com.twitter.sdk.android.core.TwitterAuthToken;

/* JADX INFO: loaded from: classes2.dex */
public class OAuthResponse implements Parcelable {
    public static final Parcelable.Creator<OAuthResponse> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final TwitterAuthToken f19970Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final String f19971Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final long f19972Oooo0oo;

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

    public OAuthResponse(TwitterAuthToken twitterAuthToken, String str, long j) {
        this.f19970Oooo0o = twitterAuthToken;
        this.f19971Oooo0oO = str;
        this.f19972Oooo0oo = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("authToken=");
        sbOooO0o0.append(this.f19970Oooo0o);
        sbOooO0o0.append(",userName=");
        sbOooO0o0.append(this.f19971Oooo0oO);
        sbOooO0o0.append(",userId=");
        sbOooO0o0.append(this.f19972Oooo0oo);
        return sbOooO0o0.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f19970Oooo0o, i);
        parcel.writeString(this.f19971Oooo0oO);
        parcel.writeLong(this.f19972Oooo0oo);
    }

    public OAuthResponse(Parcel parcel) {
        this.f19970Oooo0o = (TwitterAuthToken) parcel.readParcelable(TwitterAuthToken.class.getClassLoader());
        this.f19971Oooo0oO = parcel.readString();
        this.f19972Oooo0oo = parcel.readLong();
    }
}
