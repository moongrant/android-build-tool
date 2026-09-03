package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import o000O000.OooO0o;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Id3Frame[] f6375OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f6376OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f6377OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f6378OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String[] f6379OooO0oo;

    public class OooO00o implements Parcelable.Creator<ChapterTocFrame> {
        @Override // android.os.Parcelable.Creator
        public final ChapterTocFrame createFromParcel(Parcel parcel) {
            return new ChapterTocFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ChapterTocFrame[] newArray(int i) {
            return new ChapterTocFrame[i];
        }
    }

    public ChapterTocFrame(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i = OooO0o.f34423OooO00o;
        this.f6377OooO0o0 = string;
        this.f6376OooO0o = parcel.readByte() != 0;
        this.f6378OooO0oO = parcel.readByte() != 0;
        this.f6379OooO0oo = parcel.createStringArray();
        int i2 = parcel.readInt();
        this.f6375OooO = new Id3Frame[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.f6375OooO[i3] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterTocFrame.class != obj.getClass()) {
            return false;
        }
        ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
        return this.f6376OooO0o == chapterTocFrame.f6376OooO0o && this.f6378OooO0oO == chapterTocFrame.f6378OooO0oO && OooO0o.OooO00o(this.f6377OooO0o0, chapterTocFrame.f6377OooO0o0) && Arrays.equals(this.f6379OooO0oo, chapterTocFrame.f6379OooO0oo) && Arrays.equals(this.f6375OooO, chapterTocFrame.f6375OooO);
    }

    public final int hashCode() {
        int i = (((527 + (this.f6376OooO0o ? 1 : 0)) * 31) + (this.f6378OooO0oO ? 1 : 0)) * 31;
        String str = this.f6377OooO0o0;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6377OooO0o0);
        parcel.writeByte(this.f6376OooO0o ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f6378OooO0oO ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f6379OooO0oo);
        Id3Frame[] id3FrameArr = this.f6375OooO;
        parcel.writeInt(id3FrameArr.length);
        for (Id3Frame id3Frame : id3FrameArr) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }
}
