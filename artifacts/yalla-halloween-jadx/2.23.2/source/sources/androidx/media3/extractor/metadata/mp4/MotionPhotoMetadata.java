package androidx.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.OooOO0;
import androidx.media3.common.util.UnstableApi;
import com.google.common.primitives.OooO;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class MotionPhotoMetadata implements Metadata.Entry {
    public static final Parcelable.Creator<MotionPhotoMetadata> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f8488OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f8489OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f8490OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f8491OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final long f8492OooO0oo;

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

    public MotionPhotoMetadata(long j, long j2, long j3, long j4, long j5) {
        this.f8488OooO0Oo = j;
        this.f8490OooO0o0 = j2;
        this.f8489OooO0o = j3;
        this.f8491OooO0oO = j4;
        this.f8492OooO0oo = j5;
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
        if (obj == null || MotionPhotoMetadata.class != obj.getClass()) {
            return false;
        }
        MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
        return this.f8488OooO0Oo == motionPhotoMetadata.f8488OooO0Oo && this.f8490OooO0o0 == motionPhotoMetadata.f8490OooO0o0 && this.f8489OooO0o == motionPhotoMetadata.f8489OooO0o && this.f8491OooO0oO == motionPhotoMetadata.f8491OooO0oO && this.f8492OooO0oo == motionPhotoMetadata.f8492OooO0oo;
    }

    public final int hashCode() {
        return OooO.OooO00o(this.f8492OooO0oo) + ((OooO.OooO00o(this.f8491OooO0oO) + ((OooO.OooO00o(this.f8489OooO0o) + ((OooO.OooO00o(this.f8490OooO0o0) + ((OooO.OooO00o(this.f8488OooO0Oo) + 527) * 31)) * 31)) * 31)) * 31);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ byte[] o0000OO() {
        return null;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ void o0ooOoO(MediaMetadata.OooO00o oooO00o) {
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f8488OooO0Oo + ", photoSize=" + this.f8490OooO0o0 + ", photoPresentationTimestampUs=" + this.f8489OooO0o + ", videoStartPosition=" + this.f8491OooO0oO + ", videoSize=" + this.f8492OooO0oo;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f8488OooO0Oo);
        parcel.writeLong(this.f8490OooO0o0);
        parcel.writeLong(this.f8489OooO0o);
        parcel.writeLong(this.f8491OooO0oO);
        parcel.writeLong(this.f8492OooO0oo);
    }

    public MotionPhotoMetadata(Parcel parcel) {
        this.f8488OooO0Oo = parcel.readLong();
        this.f8490OooO0o0 = parcel.readLong();
        this.f8489OooO0o = parcel.readLong();
        this.f8491OooO0oO = parcel.readLong();
        this.f8492OooO0oo = parcel.readLong();
    }
}
