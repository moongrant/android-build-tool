package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.metadata.Metadata;
import p069o0000ooO.o0OO00O;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f12560OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f12561OooO0o0;

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
        this.f12560OooO0Oo = str;
        this.f12561OooO0o0 = str2;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ OooOo OooOo0() {
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void OooooOo(MediaMetadata.OooO00o oooO00o) {
        byte b;
        String str = this.f12560OooO0Oo;
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
        String str2 = this.f12561OooO0o0;
        if (b == 0) {
            oooO00o.f11000OooO0OO = str2;
            return;
        }
        if (b == 1) {
            oooO00o.f10998OooO00o = str2;
            return;
        }
        if (b == 2) {
            oooO00o.f11004OooO0oO = str2;
        } else if (b == 3) {
            oooO00o.f11001OooO0Oo = str2;
        } else {
            if (b != 4) {
                return;
            }
            oooO00o.f10999OooO0O0 = str2;
        }
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
        return this.f12560OooO0Oo.equals(vorbisComment.f12560OooO0Oo) && this.f12561OooO0o0.equals(vorbisComment.f12561OooO0o0);
    }

    public final int hashCode() {
        return this.f12561OooO0o0.hashCode() + o0OO00O.OooO00o(this.f12560OooO0Oo, 527, 31);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ byte[] o0000OO() {
        return null;
    }

    public final String toString() {
        return "VC: " + this.f12560OooO0Oo + "=" + this.f12561OooO0o0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12560OooO0Oo);
        parcel.writeString(this.f12561OooO0o0);
    }

    public VorbisComment(Parcel parcel) {
        String string = parcel.readString();
        int i = o0O00.f40595OooO00o;
        this.f12560OooO0Oo = string;
        this.f12561OooO0o0 = parcel.readString();
    }
}
