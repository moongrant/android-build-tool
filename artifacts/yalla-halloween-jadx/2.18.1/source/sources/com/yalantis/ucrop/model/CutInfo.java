package com.yalantis.ucrop.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class CutInfo implements Parcelable {
    public static final Parcelable.Creator<CutInfo> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public String f20339Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public long f20340Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public String f20341Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public String f20342Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f20343OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f20344OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f20345OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f20346OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f20347OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public float f20348OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public long f20349OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public Uri f20350OoooOo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public String f20351o000oOoO;

    public class OooO00o implements Parcelable.Creator<CutInfo> {
        @Override // android.os.Parcelable.Creator
        public final CutInfo createFromParcel(Parcel parcel) {
            return new CutInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CutInfo[] newArray(int i) {
            return new CutInfo[i];
        }
    }

    public CutInfo() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f20340Oooo0o);
        parcel.writeString(this.f20341Oooo0oO);
        parcel.writeString(this.f20342Oooo0oo);
        parcel.writeString(this.f20339Oooo);
        parcel.writeInt(this.f20345OoooO00);
        parcel.writeInt(this.f20344OoooO0);
        parcel.writeInt(this.f20346OoooO0O);
        parcel.writeInt(this.f20343OoooO);
        parcel.writeByte(this.f20347OoooOO0 ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f20351o000oOoO);
        parcel.writeFloat(this.f20348OoooOOO);
        parcel.writeLong(this.f20349OoooOOo);
        parcel.writeParcelable(this.f20350OoooOo0, i);
    }

    public CutInfo(Parcel parcel) {
        this.f20340Oooo0o = parcel.readLong();
        this.f20341Oooo0oO = parcel.readString();
        this.f20342Oooo0oo = parcel.readString();
        this.f20339Oooo = parcel.readString();
        this.f20345OoooO00 = parcel.readInt();
        this.f20344OoooO0 = parcel.readInt();
        this.f20346OoooO0O = parcel.readInt();
        this.f20343OoooO = parcel.readInt();
        this.f20347OoooOO0 = parcel.readByte() != 0;
        this.f20351o000oOoO = parcel.readString();
        this.f20348OoooOOO = parcel.readFloat();
        this.f20349OoooOOo = parcel.readLong();
        this.f20350OoooOo0 = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }
}
