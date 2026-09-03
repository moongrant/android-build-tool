package com.twitter.sdk.android.core;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class TwitterAuthConfig implements Parcelable {
    public static final Parcelable.Creator<TwitterAuthConfig> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f21505OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f21506OooO0o0;

    public static class OooO00o implements Parcelable.Creator<TwitterAuthConfig> {
        @Override // android.os.Parcelable.Creator
        public final TwitterAuthConfig createFromParcel(Parcel parcel) {
            return new TwitterAuthConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final TwitterAuthConfig[] newArray(int i) {
            return new TwitterAuthConfig[i];
        }
    }

    public TwitterAuthConfig(String str, String str2) {
        if (str == null || str2 == null) {
            throw new IllegalArgumentException("TwitterAuthConfig must not be created with null consumer key or secret.");
        }
        this.f21505OooO0Oo = str.trim();
        this.f21506OooO0o0 = str2.trim();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f21505OooO0Oo);
        parcel.writeString(this.f21506OooO0o0);
    }

    public TwitterAuthConfig(Parcel parcel) {
        this.f21505OooO0Oo = parcel.readString();
        this.f21506OooO0o0 = parcel.readString();
    }
}
