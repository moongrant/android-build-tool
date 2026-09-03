package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator<CommentFrame> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f8466OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f8467OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String f8468OooO0oO;

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

    public CommentFrame(String str, String str2, String str3) {
        super("COMM");
        this.f8467OooO0o0 = str;
        this.f8466OooO0o = str2;
        this.f8468OooO0oO = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CommentFrame.class != obj.getClass()) {
            return false;
        }
        CommentFrame commentFrame = (CommentFrame) obj;
        return o00.OooO00o(this.f8466OooO0o, commentFrame.f8466OooO0o) && o00.OooO00o(this.f8467OooO0o0, commentFrame.f8467OooO0o0) && o00.OooO00o(this.f8468OooO0oO, commentFrame.f8468OooO0oO);
    }

    public final int hashCode() {
        String str = this.f8467OooO0o0;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f8466OooO0o;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f8468OooO0oO;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return this.f8473OooO0Oo + ": language=" + this.f8467OooO0o0 + ", description=" + this.f8466OooO0o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8473OooO0Oo);
        parcel.writeString(this.f8467OooO0o0);
        parcel.writeString(this.f8468OooO0oO);
    }

    public CommentFrame(Parcel parcel) {
        super("COMM");
        String string = parcel.readString();
        int i = o00.f34910OooO00o;
        this.f8467OooO0o0 = string;
        this.f8466OooO0o = parcel.readString();
        this.f8468OooO0oO = parcel.readString();
    }
}
