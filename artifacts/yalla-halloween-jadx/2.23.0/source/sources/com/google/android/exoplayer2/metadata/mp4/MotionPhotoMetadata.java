package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.common.primitives.OooOO0;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class MotionPhotoMetadata implements Metadata.Entry {
    public static final Parcelable.Creator<MotionPhotoMetadata> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f12613OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f12614OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f12615OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f12616OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final long f12617OooO0oo;

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
        this.f12613OooO0Oo = j;
        this.f12615OooO0o0 = j2;
        this.f12614OooO0o = j3;
        this.f12616OooO0oO = j4;
        this.f12617OooO0oo = j5;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ OooOo OooOo0() {
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ void OooooOo(MediaMetadata.OooO00o oooO00o) {
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
        return this.f12613OooO0Oo == motionPhotoMetadata.f12613OooO0Oo && this.f12615OooO0o0 == motionPhotoMetadata.f12615OooO0o0 && this.f12614OooO0o == motionPhotoMetadata.f12614OooO0o && this.f12616OooO0oO == motionPhotoMetadata.f12616OooO0oO && this.f12617OooO0oo == motionPhotoMetadata.f12617OooO0oo;
    }

    public final int hashCode() {
        return OooOO0.OooO00o(this.f12617OooO0oo) + ((OooOO0.OooO00o(this.f12616OooO0oO) + ((OooOO0.OooO00o(this.f12614OooO0o) + ((OooOO0.OooO00o(this.f12615OooO0o0) + ((OooOO0.OooO00o(this.f12613OooO0Oo) + 527) * 31)) * 31)) * 31)) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ byte[] o0000OO() {
        return null;
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f12613OooO0Oo + ", photoSize=" + this.f12615OooO0o0 + ", photoPresentationTimestampUs=" + this.f12614OooO0o + ", videoStartPosition=" + this.f12616OooO0oO + ", videoSize=" + this.f12617OooO0oo;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f12613OooO0Oo);
        parcel.writeLong(this.f12615OooO0o0);
        parcel.writeLong(this.f12614OooO0o);
        parcel.writeLong(this.f12616OooO0oO);
        parcel.writeLong(this.f12617OooO0oo);
    }

    public MotionPhotoMetadata(Parcel parcel) {
        this.f12613OooO0Oo = parcel.readLong();
        this.f12615OooO0o0 = parcel.readLong();
        this.f12614OooO0o = parcel.readLong();
        this.f12616OooO0oO = parcel.readLong();
        this.f12617OooO0oo = parcel.readLong();
    }
}
