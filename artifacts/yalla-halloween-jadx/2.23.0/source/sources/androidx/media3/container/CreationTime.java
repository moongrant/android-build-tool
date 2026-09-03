package androidx.media3.container;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;
import com.google.common.primitives.OooOO0;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class CreationTime implements Metadata.Entry {
    public static final Parcelable.Creator<CreationTime> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f6267OooO0Oo;

    public class OooO00o implements Parcelable.Creator<CreationTime> {
        @Override // android.os.Parcelable.Creator
        public final CreationTime createFromParcel(Parcel parcel) {
            return new CreationTime(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CreationTime[] newArray(int i) {
            return new CreationTime[i];
        }
    }

    public CreationTime(Parcel parcel) {
        this.f6267OooO0Oo = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CreationTime) {
            return this.f6267OooO0Oo == ((CreationTime) obj).f6267OooO0Oo;
        }
        return false;
    }

    public final int hashCode() {
        return OooOO0.OooO00o(this.f6267OooO0Oo);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Creation time: ");
        long j = this.f6267OooO0Oo;
        sb.append(j == -2082844800000L ? "unset" : Long.valueOf(j));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f6267OooO0Oo);
    }
}
