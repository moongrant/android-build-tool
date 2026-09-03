package com.yalantis.ucrop.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class AspectRatio implements Parcelable {
    public static final Parcelable.Creator<AspectRatio> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @Nullable
    public final String f20336Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final float f20337Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final float f20338Oooo0oo;

    public class OooO00o implements Parcelable.Creator<AspectRatio> {
        @Override // android.os.Parcelable.Creator
        public final AspectRatio createFromParcel(Parcel parcel) {
            return new AspectRatio(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AspectRatio[] newArray(int i) {
            return new AspectRatio[i];
        }
    }

    public AspectRatio(@Nullable String str, float f, float f2) {
        this.f20336Oooo0o = str;
        this.f20337Oooo0oO = f;
        this.f20338Oooo0oo = f2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f20336Oooo0o);
        parcel.writeFloat(this.f20337Oooo0oO);
        parcel.writeFloat(this.f20338Oooo0oo);
    }

    public AspectRatio(Parcel parcel) {
        this.f20336Oooo0o = parcel.readString();
        this.f20337Oooo0oO = parcel.readFloat();
        this.f20338Oooo0oo = parcel.readFloat();
    }
}
