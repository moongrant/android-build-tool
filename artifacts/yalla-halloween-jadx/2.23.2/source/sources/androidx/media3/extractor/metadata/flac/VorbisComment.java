package androidx.media3.extractor.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.compose.animation.OooO0O0;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.OooOO0;
import androidx.media3.common.util.UnstableApi;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
@Deprecated
public class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f8439OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f8440OooO0o0;

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

    public VorbisComment(String str, String str2) {
        this.f8439OooO0Oo = str;
        this.f8440OooO0o0 = str2;
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
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VorbisComment vorbisComment = (VorbisComment) obj;
        return this.f8439OooO0Oo.equals(vorbisComment.f8439OooO0Oo) && this.f8440OooO0o0.equals(vorbisComment.f8440OooO0o0);
    }

    public final int hashCode() {
        return this.f8440OooO0o0.hashCode() + OooO0O0.OooO00o(this.f8439OooO0Oo, 527, 31);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ byte[] o0000OO() {
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    @Override // androidx.media3.common.Metadata.Entry
    public final void o0ooOoO(MediaMetadata.OooO00o oooO00o) {
        byte b;
        String str = this.f8439OooO0Oo;
        str.getClass();
        switch (str) {
            case "ALBUM":
                b = 0;
                break;
            case "TITLE":
                b = 1;
                break;
            case "DESCRIPTION":
                b = 2;
                break;
            case "ALBUMARTIST":
                b = 3;
                break;
            case "ARTIST":
                b = 4;
                break;
            default:
                b = -1;
                break;
        }
        String str2 = this.f8440OooO0o0;
        if (b == 0) {
            oooO00o.f6306OooO0OO = str2;
            return;
        }
        if (b == 1) {
            oooO00o.f6304OooO00o = str2;
            return;
        }
        if (b == 2) {
            oooO00o.f6310OooO0oO = str2;
        } else if (b == 3) {
            oooO00o.f6307OooO0Oo = str2;
        } else {
            if (b != 4) {
                return;
            }
            oooO00o.f6305OooO0O0 = str2;
        }
    }

    public final String toString() {
        return "VC: " + this.f8439OooO0Oo + "=" + this.f8440OooO0o0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8439OooO0Oo);
        parcel.writeString(this.f8440OooO0o0);
    }

    public VorbisComment(Parcel parcel) {
        String string = parcel.readString();
        int i = o00.f34910OooO00o;
        this.f8439OooO0Oo = string;
        this.f8440OooO0o0 = parcel.readString();
    }
}
