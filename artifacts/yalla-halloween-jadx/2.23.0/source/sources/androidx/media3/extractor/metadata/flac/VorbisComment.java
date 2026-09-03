package androidx.media3.extractor.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;
import o000O000.OooO0o;
import p069o0000ooO.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
@Deprecated
public class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f6353OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f6354OooO0o0;

    public class OooO00o implements Parcelable.Creator<VorbisComment> {
        @Override // android.os.Parcelable.Creator
        public final VorbisComment createFromParcel(Parcel parcel) {
            return new VorbisComment(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final VorbisComment[] newArray(int i) {
            return new VorbisComment[i];
        }
    }

    public VorbisComment(Parcel parcel) {
        String string = parcel.readString();
        int i = OooO0o.f34423OooO00o;
        this.f6353OooO0Oo = string;
        this.f6354OooO0o0 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VorbisComment vorbisComment = (VorbisComment) obj;
        return this.f6353OooO0Oo.equals(vorbisComment.f6353OooO0Oo) && this.f6354OooO0o0.equals(vorbisComment.f6354OooO0o0);
    }

    public final int hashCode() {
        return this.f6354OooO0o0.hashCode() + o0OO00O.OooO00o(this.f6353OooO0Oo, 527, 31);
    }

    public final String toString() {
        return "VC: " + this.f6353OooO0Oo + "=" + this.f6354OooO0o0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6353OooO0Oo);
        parcel.writeString(this.f6354OooO0o0);
    }
}
