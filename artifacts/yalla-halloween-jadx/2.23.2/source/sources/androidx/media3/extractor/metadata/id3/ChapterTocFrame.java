package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Id3Frame[] f8461OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f8462OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f8463OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f8464OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String[] f8465OooO0oo;

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

    public ChapterTocFrame(String str, boolean z, boolean z2, String[] strArr, Id3Frame[] id3FrameArr) {
        super("CTOC");
        this.f8463OooO0o0 = str;
        this.f8462OooO0o = z;
        this.f8464OooO0oO = z2;
        this.f8465OooO0oo = strArr;
        this.f8461OooO = id3FrameArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterTocFrame.class != obj.getClass()) {
            return false;
        }
        ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
        return this.f8462OooO0o == chapterTocFrame.f8462OooO0o && this.f8464OooO0oO == chapterTocFrame.f8464OooO0oO && o00.OooO00o(this.f8463OooO0o0, chapterTocFrame.f8463OooO0o0) && Arrays.equals(this.f8465OooO0oo, chapterTocFrame.f8465OooO0oo) && Arrays.equals(this.f8461OooO, chapterTocFrame.f8461OooO);
    }

    public final int hashCode() {
        int i = (((527 + (this.f8462OooO0o ? 1 : 0)) * 31) + (this.f8464OooO0oO ? 1 : 0)) * 31;
        String str = this.f8463OooO0o0;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8463OooO0o0);
        parcel.writeByte(this.f8462OooO0o ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f8464OooO0oO ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f8465OooO0oo);
        Id3Frame[] id3FrameArr = this.f8461OooO;
        parcel.writeInt(id3FrameArr.length);
        for (Id3Frame id3Frame : id3FrameArr) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterTocFrame(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i = o00.f34910OooO00o;
        this.f8463OooO0o0 = string;
        this.f8462OooO0o = parcel.readByte() != 0;
        this.f8464OooO0oO = parcel.readByte() != 0;
        this.f8465OooO0oo = parcel.createStringArray();
        int i2 = parcel.readInt();
        this.f8461OooO = new Id3Frame[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.f8461OooO[i3] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
