package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import java.util.Arrays;
import p318o0O0oOo.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class TrackGroup implements Parcelable {
    public static final Parcelable.Creator<TrackGroup> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int f14601Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final Format[] f14602Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f14603Oooo0oo;

    public class OooO00o implements Parcelable.Creator<TrackGroup> {
        @Override // android.os.Parcelable.Creator
        public final TrackGroup createFromParcel(Parcel parcel) {
            return new TrackGroup(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final TrackGroup[] newArray(int i) {
            return new TrackGroup[i];
        }
    }

    public TrackGroup(Format... formatArr) {
        o00000O0.OooO0Oo(formatArr.length > 0);
        this.f14602Oooo0oO = formatArr;
        this.f14601Oooo0o = formatArr.length;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackGroup.class != obj.getClass()) {
            return false;
        }
        TrackGroup trackGroup = (TrackGroup) obj;
        return this.f14601Oooo0o == trackGroup.f14601Oooo0o && Arrays.equals(this.f14602Oooo0oO, trackGroup.f14602Oooo0oO);
    }

    public final int hashCode() {
        if (this.f14603Oooo0oo == 0) {
            this.f14603Oooo0oo = 527 + Arrays.hashCode(this.f14602Oooo0oO);
        }
        return this.f14603Oooo0oo;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f14601Oooo0o);
        for (int i2 = 0; i2 < this.f14601Oooo0o; i2++) {
            parcel.writeParcelable(this.f14602Oooo0oO[i2], 0);
        }
    }

    public TrackGroup(Parcel parcel) {
        int i = parcel.readInt();
        this.f14601Oooo0o = i;
        this.f14602Oooo0oO = new Format[i];
        for (int i2 = 0; i2 < this.f14601Oooo0o; i2++) {
            this.f14602Oooo0oO[i2] = (Format) parcel.readParcelable(Format.class.getClassLoader());
        }
    }
}
