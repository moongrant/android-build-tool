package com.google.android.exoplayer2.offline;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int f14597Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final int f14598Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final int f14599Oooo0oo;

    public class OooO00o implements Parcelable.Creator<StreamKey> {
        @Override // android.os.Parcelable.Creator
        public final StreamKey createFromParcel(Parcel parcel) {
            return new StreamKey(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final StreamKey[] newArray(int i) {
            return new StreamKey[i];
        }
    }

    public StreamKey(Parcel parcel) {
        this.f14597Oooo0o = parcel.readInt();
        this.f14598Oooo0oO = parcel.readInt();
        this.f14599Oooo0oo = parcel.readInt();
    }

    @Override // java.lang.Comparable
    public final int compareTo(StreamKey streamKey) {
        StreamKey streamKey2 = streamKey;
        int i = this.f14597Oooo0o - streamKey2.f14597Oooo0o;
        if (i != 0) {
            return i;
        }
        int i2 = this.f14598Oooo0oO - streamKey2.f14598Oooo0oO;
        return i2 == 0 ? this.f14599Oooo0oo - streamKey2.f14599Oooo0oo : i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StreamKey.class != obj.getClass()) {
            return false;
        }
        StreamKey streamKey = (StreamKey) obj;
        return this.f14597Oooo0o == streamKey.f14597Oooo0o && this.f14598Oooo0oO == streamKey.f14598Oooo0oO && this.f14599Oooo0oo == streamKey.f14599Oooo0oo;
    }

    public final int hashCode() {
        return (((this.f14597Oooo0o * 31) + this.f14598Oooo0oO) * 31) + this.f14599Oooo0oo;
    }

    public final String toString() {
        int i = this.f14597Oooo0o;
        int i2 = this.f14598Oooo0oO;
        int i3 = this.f14599Oooo0oo;
        StringBuilder sb = new StringBuilder(35);
        sb.append(i);
        sb.append(".");
        sb.append(i2);
        sb.append(".");
        sb.append(i3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f14597Oooo0o);
        parcel.writeInt(this.f14598Oooo0oO);
        parcel.writeInt(this.f14599Oooo0oo);
    }
}
