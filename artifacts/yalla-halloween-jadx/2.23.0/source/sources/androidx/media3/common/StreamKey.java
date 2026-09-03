package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import o000O000.OooO0o;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f6224OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f6225OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f6226OooO0o0;

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

    static {
        OooO0o.OooO0oO(0);
        OooO0o.OooO0oO(1);
        OooO0o.OooO0oO(2);
    }

    public StreamKey(Parcel parcel) {
        this.f6224OooO0Oo = parcel.readInt();
        this.f6226OooO0o0 = parcel.readInt();
        this.f6225OooO0o = parcel.readInt();
    }

    @Override // java.lang.Comparable
    public final int compareTo(StreamKey streamKey) {
        StreamKey streamKey2 = streamKey;
        int i = this.f6224OooO0Oo - streamKey2.f6224OooO0Oo;
        if (i != 0) {
            return i;
        }
        int i2 = this.f6226OooO0o0 - streamKey2.f6226OooO0o0;
        return i2 == 0 ? this.f6225OooO0o - streamKey2.f6225OooO0o : i2;
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
        return this.f6224OooO0Oo == streamKey.f6224OooO0Oo && this.f6226OooO0o0 == streamKey.f6226OooO0o0 && this.f6225OooO0o == streamKey.f6225OooO0o;
    }

    public final int hashCode() {
        return (((this.f6224OooO0Oo * 31) + this.f6226OooO0o0) * 31) + this.f6225OooO0o;
    }

    public final String toString() {
        return this.f6224OooO0Oo + "." + this.f6226OooO0o0 + "." + this.f6225OooO0o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f6224OooO0Oo);
        parcel.writeInt(this.f6226OooO0o0);
        parcel.writeInt(this.f6225OooO0o);
    }
}
