package androidx.media3.container;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;
import com.google.common.primitives.OooO0OO;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class Mp4LocationData implements Metadata.Entry {
    public static final Parcelable.Creator<Mp4LocationData> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f6272OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f6273OooO0o0;

    public class OooO00o implements Parcelable.Creator<Mp4LocationData> {
        @Override // android.os.Parcelable.Creator
        public final Mp4LocationData createFromParcel(Parcel parcel) {
            return new Mp4LocationData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Mp4LocationData[] newArray(int i) {
            return new Mp4LocationData[i];
        }
    }

    public Mp4LocationData(Parcel parcel) {
        this.f6272OooO0Oo = parcel.readFloat();
        this.f6273OooO0o0 = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Mp4LocationData.class != obj.getClass()) {
            return false;
        }
        Mp4LocationData mp4LocationData = (Mp4LocationData) obj;
        return this.f6272OooO0Oo == mp4LocationData.f6272OooO0Oo && this.f6273OooO0o0 == mp4LocationData.f6273OooO0o0;
    }

    public final int hashCode() {
        return OooO0OO.OooO00o(this.f6273OooO0o0) + ((OooO0OO.OooO00o(this.f6272OooO0Oo) + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f6272OooO0Oo + ", longitude=" + this.f6273OooO0o0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f6272OooO0Oo);
        parcel.writeFloat(this.f6273OooO0o0);
    }
}
