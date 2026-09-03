package androidx.media3.common;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class StreamKey implements Comparable<StreamKey>, Parcelable, OooO0OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f6727OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f6728OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f6729OooO0o0;
    public static final Parcelable.Creator<StreamKey> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final String f6725OooO0oO = o00.Oooo00o(0);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final String f6726OooO0oo = o00.Oooo00o(1);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final String f6724OooO = o00.Oooo00o(2);

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
        this.f6727OooO0Oo = i;
        this.f6729OooO0o0 = i2;
        this.f6728OooO0o = i3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(StreamKey streamKey) {
        StreamKey streamKey2 = streamKey;
        int i = this.f6727OooO0Oo - streamKey2.f6727OooO0Oo;
        if (i != 0) {
            return i;
        }
        int i2 = this.f6729OooO0o0 - streamKey2.f6729OooO0o0;
        return i2 == 0 ? this.f6728OooO0o - streamKey2.f6728OooO0o : i2;
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
        return this.f6727OooO0Oo == streamKey.f6727OooO0Oo && this.f6729OooO0o0 == streamKey.f6729OooO0o0 && this.f6728OooO0o == streamKey.f6728OooO0o;
    }

    public final int hashCode() {
        return (((this.f6727OooO0Oo * 31) + this.f6729OooO0o0) * 31) + this.f6728OooO0o;
    }

    @Override // androidx.media3.common.OooO0OO
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        int i = this.f6727OooO0Oo;
        if (i != 0) {
            bundle.putInt(f6725OooO0oO, i);
        }
        int i2 = this.f6729OooO0o0;
        if (i2 != 0) {
            bundle.putInt(f6726OooO0oo, i2);
        }
        int i3 = this.f6728OooO0o;
        if (i3 != 0) {
            bundle.putInt(f6724OooO, i3);
        }
        return bundle;
    }

    public final String toString() {
        return this.f6727OooO0Oo + "." + this.f6729OooO0o0 + "." + this.f6728OooO0o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f6727OooO0Oo);
        parcel.writeInt(this.f6729OooO0o0);
        parcel.writeInt(this.f6728OooO0o);
    }

    public StreamKey(Parcel parcel) {
        this.f6727OooO0Oo = parcel.readInt();
        this.f6729OooO0o0 = parcel.readInt();
        this.f6728OooO0o = parcel.readInt();
    }
}
