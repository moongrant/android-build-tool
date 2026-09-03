package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import o000O000.OooO0o;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final long f6369OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f6370OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f6371OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f6372OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final long f6373OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Id3Frame[] f6374OooOO0;

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

    public ChapterFrame(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i = OooO0o.f34423OooO00o;
        this.f6371OooO0o0 = string;
        this.f6370OooO0o = parcel.readInt();
        this.f6372OooO0oO = parcel.readInt();
        this.f6373OooO0oo = parcel.readLong();
        this.f6369OooO = parcel.readLong();
        int i2 = parcel.readInt();
        this.f6374OooOO0 = new Id3Frame[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.f6374OooOO0[i3] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
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
        return this.f6370OooO0o == chapterFrame.f6370OooO0o && this.f6372OooO0oO == chapterFrame.f6372OooO0oO && this.f6373OooO0oo == chapterFrame.f6373OooO0oo && this.f6369OooO == chapterFrame.f6369OooO && OooO0o.OooO00o(this.f6371OooO0o0, chapterFrame.f6371OooO0o0) && Arrays.equals(this.f6374OooOO0, chapterFrame.f6374OooOO0);
    }

    public final int hashCode() {
        int i = (((((((527 + this.f6370OooO0o) * 31) + this.f6372OooO0oO) * 31) + ((int) this.f6373OooO0oo)) * 31) + ((int) this.f6369OooO)) * 31;
        String str = this.f6371OooO0o0;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6371OooO0o0);
        parcel.writeInt(this.f6370OooO0o);
        parcel.writeInt(this.f6372OooO0oO);
        parcel.writeLong(this.f6373OooO0oo);
        parcel.writeLong(this.f6369OooO);
        Id3Frame[] id3FrameArr = this.f6374OooOO0;
        parcel.writeInt(id3FrameArr.length);
        for (Id3Frame id3Frame : id3FrameArr) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }
}
