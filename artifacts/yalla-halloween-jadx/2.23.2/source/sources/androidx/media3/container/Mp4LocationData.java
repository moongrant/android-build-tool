package androidx.media3.container;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.OooOO0;
import androidx.media3.common.util.UnstableApi;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class Mp4LocationData implements Metadata.Entry {
    public static final Parcelable.Creator<Mp4LocationData> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f6952OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f6953OooO0o0;

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

    public Mp4LocationData(@FloatRange(from = -90.0d, to = 90.0d) float f, @FloatRange(from = -180.0d, to = 180.0d) float f2) {
        o00Oo0.OooO0O0(f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f, "Invalid latitude or longitude");
        this.f6952OooO0Oo = f;
        this.f6953OooO0o0 = f2;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ OooOO0 OooOo0() {
        return null;
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
        return this.f6952OooO0Oo == mp4LocationData.f6952OooO0Oo && this.f6953OooO0o0 == mp4LocationData.f6953OooO0o0;
    }

    public final int hashCode() {
        return Float.valueOf(this.f6953OooO0o0).hashCode() + ((Float.valueOf(this.f6952OooO0Oo).hashCode() + 527) * 31);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ byte[] o0000OO() {
        return null;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ void o0ooOoO(MediaMetadata.OooO00o oooO00o) {
    }

    public final String toString() {
        return "xyz: latitude=" + this.f6952OooO0Oo + ", longitude=" + this.f6953OooO0o0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f6952OooO0Oo);
        parcel.writeFloat(this.f6953OooO0o0);
    }

    public Mp4LocationData(Parcel parcel) {
        this.f6952OooO0Oo = parcel.readFloat();
        this.f6953OooO0o0 = parcel.readFloat();
    }
}
