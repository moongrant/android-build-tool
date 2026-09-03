package androidx.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;
import com.google.common.primitives.OooOO0;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class MotionPhotoMetadata implements Metadata.Entry {
    public static final Parcelable.Creator<MotionPhotoMetadata> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f6402OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f6403OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f6404OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f6405OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final long f6406OooO0oo;

    public class OooO00o implements Parcelable.Creator<MotionPhotoMetadata> {
        @Override // android.os.Parcelable.Creator
        public final MotionPhotoMetadata createFromParcel(Parcel parcel) {
            return new MotionPhotoMetadata(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MotionPhotoMetadata[] newArray(int i) {
            return new MotionPhotoMetadata[i];
        }
    }

    public MotionPhotoMetadata(Parcel parcel) {
        this.f6402OooO0Oo = parcel.readLong();
        this.f6404OooO0o0 = parcel.readLong();
        this.f6403OooO0o = parcel.readLong();
        this.f6405OooO0oO = parcel.readLong();
        this.f6406OooO0oo = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MotionPhotoMetadata.class != obj.getClass()) {
            return false;
        }
        MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
        return this.f6402OooO0Oo == motionPhotoMetadata.f6402OooO0Oo && this.f6404OooO0o0 == motionPhotoMetadata.f6404OooO0o0 && this.f6403OooO0o == motionPhotoMetadata.f6403OooO0o && this.f6405OooO0oO == motionPhotoMetadata.f6405OooO0oO && this.f6406OooO0oo == motionPhotoMetadata.f6406OooO0oo;
    }

    public final int hashCode() {
        return OooOO0.OooO00o(this.f6406OooO0oo) + ((OooOO0.OooO00o(this.f6405OooO0oO) + ((OooOO0.OooO00o(this.f6403OooO0o) + ((OooOO0.OooO00o(this.f6404OooO0o0) + ((OooOO0.OooO00o(this.f6402OooO0Oo) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f6402OooO0Oo + ", photoSize=" + this.f6404OooO0o0 + ", photoPresentationTimestampUs=" + this.f6403OooO0o + ", videoStartPosition=" + this.f6405OooO0oO + ", videoSize=" + this.f6406OooO0oo;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f6402OooO0Oo);
        parcel.writeLong(this.f6404OooO0o0);
        parcel.writeLong(this.f6403OooO0o);
        parcel.writeLong(this.f6405OooO0oO);
        parcel.writeLong(this.f6406OooO0oo);
    }
}
