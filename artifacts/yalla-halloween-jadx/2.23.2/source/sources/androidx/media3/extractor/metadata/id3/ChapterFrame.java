package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final long f8455OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f8456OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f8457OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f8458OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final long f8459OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Id3Frame[] f8460OooOO0;

    public class OooO00o implements Parcelable.Creator<ChapterFrame> {
        @Override // android.os.Parcelable.Creator
        public final ChapterFrame createFromParcel(Parcel parcel) {
            return new ChapterFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ChapterFrame[] newArray(int i) {
            return new ChapterFrame[i];
        }
    }

    public ChapterFrame(String str, int i, int i2, long j, long j2, Id3Frame[] id3FrameArr) {
        super("CHAP");
        this.f8457OooO0o0 = str;
        this.f8456OooO0o = i;
        this.f8458OooO0oO = i2;
        this.f8459OooO0oo = j;
        this.f8455OooO = j2;
        this.f8460OooOO0 = id3FrameArr;
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterFrame.class != obj.getClass()) {
            return false;
        }
        ChapterFrame chapterFrame = (ChapterFrame) obj;
        return this.f8456OooO0o == chapterFrame.f8456OooO0o && this.f8458OooO0oO == chapterFrame.f8458OooO0oO && this.f8459OooO0oo == chapterFrame.f8459OooO0oo && this.f8455OooO == chapterFrame.f8455OooO && o00.OooO00o(this.f8457OooO0o0, chapterFrame.f8457OooO0o0) && Arrays.equals(this.f8460OooOO0, chapterFrame.f8460OooOO0);
    }

    public final int hashCode() {
        int i = (((((((527 + this.f8456OooO0o) * 31) + this.f8458OooO0oO) * 31) + ((int) this.f8459OooO0oo)) * 31) + ((int) this.f8455OooO)) * 31;
        String str = this.f8457OooO0o0;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8457OooO0o0);
        parcel.writeInt(this.f8456OooO0o);
        parcel.writeInt(this.f8458OooO0oO);
        parcel.writeLong(this.f8459OooO0oo);
        parcel.writeLong(this.f8455OooO);
        Id3Frame[] id3FrameArr = this.f8460OooOO0;
        parcel.writeInt(id3FrameArr.length);
        for (Id3Frame id3Frame : id3FrameArr) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterFrame(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i = o00.f34910OooO00o;
        this.f8457OooO0o0 = string;
        this.f8456OooO0o = parcel.readInt();
        this.f8458OooO0oO = parcel.readInt();
        this.f8459OooO0oo = parcel.readLong();
        this.f8455OooO = parcel.readLong();
        int i2 = parcel.readInt();
        this.f8460OooOO0 = new Id3Frame[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.f8460OooOO0[i3] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
