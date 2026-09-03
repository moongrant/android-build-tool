package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import o000O000.OooO0o;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator<CommentFrame> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f6380OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f6381OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String f6382OooO0oO;

    public class OooO00o implements Parcelable.Creator<CommentFrame> {
        @Override // android.os.Parcelable.Creator
        public final CommentFrame createFromParcel(Parcel parcel) {
            return new CommentFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CommentFrame[] newArray(int i) {
            return new CommentFrame[i];
        }
    }

    public CommentFrame(Parcel parcel) {
        super("COMM");
        String string = parcel.readString();
        int i = OooO0o.f34423OooO00o;
        this.f6381OooO0o0 = string;
        this.f6380OooO0o = parcel.readString();
        this.f6382OooO0oO = parcel.readString();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CommentFrame.class != obj.getClass()) {
            return false;
        }
        CommentFrame commentFrame = (CommentFrame) obj;
        return OooO0o.OooO00o(this.f6380OooO0o, commentFrame.f6380OooO0o) && OooO0o.OooO00o(this.f6381OooO0o0, commentFrame.f6381OooO0o0) && OooO0o.OooO00o(this.f6382OooO0oO, commentFrame.f6382OooO0oO);
    }

    public final int hashCode() {
        String str = this.f6381OooO0o0;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6380OooO0o;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6382OooO0oO;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return this.f6387OooO0Oo + ": language=" + this.f6381OooO0o0 + ", description=" + this.f6380OooO0o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6387OooO0Oo);
        parcel.writeString(this.f6381OooO0o0);
        parcel.writeString(this.f6382OooO0oO);
    }
}
