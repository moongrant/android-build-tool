package androidx.media3.extractor.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.OooOO0;
import androidx.media3.common.util.UnstableApi;
import p069o0000ooO.o0000;
import p080o000OoO.o000OO00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
@Deprecated
public class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f8444OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f8445OooO0o0;

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
        this.f8444OooO0Oo = str;
        this.f8445OooO0o0 = str2;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ OooOO0 OooOo0o() {
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
        return this.f8444OooO0Oo.equals(vorbisComment.f8444OooO0Oo) && this.f8445OooO0o0.equals(vorbisComment.f8445OooO0o0);
    }

    public final int hashCode() {
        return this.f8445OooO0o0.hashCode() + o0000.OooO00o(this.f8444OooO0Oo, 527, 31);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ byte[] o0000OO() {
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    @Override // androidx.media3.common.Metadata.Entry
    public final void o0ooOOo(MediaMetadata.OooO00o oooO00o) {
        byte b;
        String str = this.f8444OooO0Oo;
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
        String str2 = this.f8445OooO0o0;
        if (b == 0) {
            oooO00o.f6311OooO0OO = str2;
            return;
        }
        if (b == 1) {
            oooO00o.f6309OooO00o = str2;
            return;
        }
        if (b == 2) {
            oooO00o.f6315OooO0oO = str2;
        } else if (b == 3) {
            oooO00o.f6312OooO0Oo = str2;
        } else {
            if (b != 4) {
                return;
            }
            oooO00o.f6310OooO0O0 = str2;
        }
    }

    public final String toString() {
        return "VC: " + this.f8444OooO0Oo + "=" + this.f8445OooO0o0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8444OooO0Oo);
        parcel.writeString(this.f8445OooO0o0);
    }

    public VorbisComment(Parcel parcel) {
        String string = parcel.readString();
        int i = o000OO00.f34965OooO00o;
        this.f8444OooO0Oo = string;
        this.f8445OooO0o0 = parcel.readString();
    }
}
