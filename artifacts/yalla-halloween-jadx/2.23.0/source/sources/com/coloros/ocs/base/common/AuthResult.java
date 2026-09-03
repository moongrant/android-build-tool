package com.coloros.ocs.base.common;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class AuthResult implements Parcelable {
    public static final Parcelable.Creator<AuthResult> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f10491OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f10492OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f10493OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f10494OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final byte[] f10495OooO0oo;

    public static class OooO00o implements Parcelable.Creator<AuthResult> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AuthResult createFromParcel(Parcel parcel) {
            return new AuthResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ AuthResult[] newArray(int i) {
            return new AuthResult[i];
        }
    }

    public AuthResult(Parcel parcel) {
        this.f10491OooO0Oo = parcel.readString();
        this.f10493OooO0o0 = parcel.readInt();
        this.f10492OooO0o = parcel.readInt();
        this.f10494OooO0oO = parcel.readInt();
        this.f10495OooO0oo = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10491OooO0Oo);
        parcel.writeInt(this.f10493OooO0o0);
        parcel.writeInt(this.f10492OooO0o);
        parcel.writeInt(this.f10494OooO0oO);
        parcel.writeByteArray(this.f10495OooO0oo);
    }
}
