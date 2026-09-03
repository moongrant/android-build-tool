package com.coloros.ocs.base.common;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class AuthResult implements Parcelable {
    public static final Parcelable.Creator<AuthResult> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f12624Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public String f12625Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f12626Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f12627Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public byte[] f12628OoooO00;

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
        this.f12625Oooo0o = parcel.readString();
        this.f12626Oooo0oO = parcel.readInt();
        this.f12627Oooo0oo = parcel.readInt();
        this.f12624Oooo = parcel.readInt();
        this.f12628OoooO00 = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12625Oooo0o);
        parcel.writeInt(this.f12626Oooo0oO);
        parcel.writeInt(this.f12627Oooo0oo);
        parcel.writeInt(this.f12624Oooo);
        parcel.writeByteArray(this.f12628OoooO00);
    }
}
