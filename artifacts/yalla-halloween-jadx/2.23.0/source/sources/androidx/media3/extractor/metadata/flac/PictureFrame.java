package androidx.media3.extractor.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import o000O000.OooO0o;
import p069o0000ooO.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f6345OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f6346OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f6347OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f6348OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f6349OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f6350OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f6351OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final byte[] f6352OooOO0O;

    public class OooO00o implements Parcelable.Creator<PictureFrame> {
        @Override // android.os.Parcelable.Creator
        public final PictureFrame createFromParcel(Parcel parcel) {
            return new PictureFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PictureFrame[] newArray(int i) {
            return new PictureFrame[i];
        }
    }

    public PictureFrame(Parcel parcel) {
        this.f6346OooO0Oo = parcel.readInt();
        String string = parcel.readString();
        int i = OooO0o.f34423OooO00o;
        this.f6348OooO0o0 = string;
        this.f6347OooO0o = parcel.readString();
        this.f6349OooO0oO = parcel.readInt();
        this.f6350OooO0oo = parcel.readInt();
        this.f6345OooO = parcel.readInt();
        this.f6351OooOO0 = parcel.readInt();
        this.f6352OooOO0O = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PictureFrame.class != obj.getClass()) {
            return false;
        }
        PictureFrame pictureFrame = (PictureFrame) obj;
        return this.f6346OooO0Oo == pictureFrame.f6346OooO0Oo && this.f6348OooO0o0.equals(pictureFrame.f6348OooO0o0) && this.f6347OooO0o.equals(pictureFrame.f6347OooO0o) && this.f6349OooO0oO == pictureFrame.f6349OooO0oO && this.f6350OooO0oo == pictureFrame.f6350OooO0oo && this.f6345OooO == pictureFrame.f6345OooO && this.f6351OooOO0 == pictureFrame.f6351OooOO0 && Arrays.equals(this.f6352OooOO0O, pictureFrame.f6352OooOO0O);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f6352OooOO0O) + ((((((((o0OO00O.OooO00o(this.f6347OooO0o, o0OO00O.OooO00o(this.f6348OooO0o0, (this.f6346OooO0Oo + 527) * 31, 31), 31) + this.f6349OooO0oO) * 31) + this.f6350OooO0oo) * 31) + this.f6345OooO) * 31) + this.f6351OooOO0) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f6348OooO0o0 + ", description=" + this.f6347OooO0o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f6346OooO0Oo);
        parcel.writeString(this.f6348OooO0o0);
        parcel.writeString(this.f6347OooO0o);
        parcel.writeInt(this.f6349OooO0oO);
        parcel.writeInt(this.f6350OooO0oo);
        parcel.writeInt(this.f6345OooO);
        parcel.writeInt(this.f6351OooOO0);
        parcel.writeByteArray(this.f6352OooOO0O);
    }
}
