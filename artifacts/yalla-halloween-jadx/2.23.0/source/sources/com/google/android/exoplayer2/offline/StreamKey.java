package com.google.android.exoplayer2.offline;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.OooO;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class StreamKey implements Comparable<StreamKey>, Parcelable, OooO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f12883OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f12884OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f12885OooO0o0;
    public static final Parcelable.Creator<StreamKey> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final String f12881OooO0oO = o0O00.Oooo00O(0);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final String f12882OooO0oo = o0O00.Oooo00O(1);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final String f12880OooO = o0O00.Oooo00O(2);

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

    public StreamKey(int i, int i2, int i3) {
        this.f12883OooO0Oo = i;
        this.f12885OooO0o0 = i2;
        this.f12884OooO0o = i3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(StreamKey streamKey) {
        StreamKey streamKey2 = streamKey;
        int i = this.f12883OooO0Oo - streamKey2.f12883OooO0Oo;
        if (i != 0) {
            return i;
        }
        int i2 = this.f12885OooO0o0 - streamKey2.f12885OooO0o0;
        return i2 == 0 ? this.f12884OooO0o - streamKey2.f12884OooO0o : i2;
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
        return this.f12883OooO0Oo == streamKey.f12883OooO0Oo && this.f12885OooO0o0 == streamKey.f12885OooO0o0 && this.f12884OooO0o == streamKey.f12884OooO0o;
    }

    public final int hashCode() {
        return (((this.f12883OooO0Oo * 31) + this.f12885OooO0o0) * 31) + this.f12884OooO0o;
    }

    @Override // com.google.android.exoplayer2.OooO
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        int i = this.f12883OooO0Oo;
        if (i != 0) {
            bundle.putInt(f12881OooO0oO, i);
        }
        int i2 = this.f12885OooO0o0;
        if (i2 != 0) {
            bundle.putInt(f12882OooO0oo, i2);
        }
        int i3 = this.f12884OooO0o;
        if (i3 != 0) {
            bundle.putInt(f12880OooO, i3);
        }
        return bundle;
    }

    public final String toString() {
        return this.f12883OooO0Oo + "." + this.f12885OooO0o0 + "." + this.f12884OooO0o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f12883OooO0Oo);
        parcel.writeInt(this.f12885OooO0o0);
        parcel.writeInt(this.f12884OooO0o);
    }

    public StreamKey(Parcel parcel) {
        this.f12883OooO0Oo = parcel.readInt();
        this.f12885OooO0o0 = parcel.readInt();
        this.f12884OooO0o = parcel.readInt();
    }
}
