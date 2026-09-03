package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class TrackGroupArray implements Parcelable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int f14605Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final TrackGroup[] f14606Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f14607Oooo0oo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final TrackGroupArray f14604Oooo = new TrackGroupArray(new TrackGroup[0]);
    public static final Parcelable.Creator<TrackGroupArray> CREATOR = new OooO00o();

    public class OooO00o implements Parcelable.Creator<TrackGroupArray> {
        @Override // android.os.Parcelable.Creator
        public final TrackGroupArray createFromParcel(Parcel parcel) {
            return new TrackGroupArray(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final TrackGroupArray[] newArray(int i) {
            return new TrackGroupArray[i];
        }
    }

    public TrackGroupArray(TrackGroup... trackGroupArr) {
        this.f14606Oooo0oO = trackGroupArr;
        this.f14605Oooo0o = trackGroupArr.length;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackGroupArray.class != obj.getClass()) {
            return false;
        }
        TrackGroupArray trackGroupArray = (TrackGroupArray) obj;
        return this.f14605Oooo0o == trackGroupArray.f14605Oooo0o && Arrays.equals(this.f14606Oooo0oO, trackGroupArray.f14606Oooo0oO);
    }

    public final int hashCode() {
        if (this.f14607Oooo0oo == 0) {
            this.f14607Oooo0oo = Arrays.hashCode(this.f14606Oooo0oO);
        }
        return this.f14607Oooo0oo;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f14605Oooo0o);
        for (int i2 = 0; i2 < this.f14605Oooo0o; i2++) {
            parcel.writeParcelable(this.f14606Oooo0oO[i2], 0);
        }
    }

    public TrackGroupArray(Parcel parcel) {
        int i = parcel.readInt();
        this.f14605Oooo0o = i;
        this.f14606Oooo0oO = new TrackGroup[i];
        for (int i2 = 0; i2 < this.f14605Oooo0o; i2++) {
            this.f14606Oooo0oO[i2] = (TrackGroup) parcel.readParcelable(TrackGroup.class.getClassLoader());
        }
    }
}
