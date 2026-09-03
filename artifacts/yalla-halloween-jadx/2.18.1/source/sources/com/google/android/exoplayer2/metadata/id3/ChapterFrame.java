package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final int f14488Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final String f14489Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final int f14490Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final long f14491OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final long f14492OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final Id3Frame[] f14493OoooO0O;

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
        this.f14489Oooo0oO = str;
        this.f14490Oooo0oo = i;
        this.f14488Oooo = i2;
        this.f14492OoooO00 = j;
        this.f14491OoooO0 = j2;
        this.f14493OoooO0O = id3FrameArr;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
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
        return this.f14490Oooo0oo == chapterFrame.f14490Oooo0oo && this.f14488Oooo == chapterFrame.f14488Oooo && this.f14492OoooO00 == chapterFrame.f14492OoooO00 && this.f14491OoooO0 == chapterFrame.f14491OoooO0 && o000OOo0.OooO00o(this.f14489Oooo0oO, chapterFrame.f14489Oooo0oO) && Arrays.equals(this.f14493OoooO0O, chapterFrame.f14493OoooO0O);
    }

    public final int hashCode() {
        int i = (((((((527 + this.f14490Oooo0oo) * 31) + this.f14488Oooo) * 31) + ((int) this.f14492OoooO00)) * 31) + ((int) this.f14491OoooO0)) * 31;
        String str = this.f14489Oooo0oO;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14489Oooo0oO);
        parcel.writeInt(this.f14490Oooo0oo);
        parcel.writeInt(this.f14488Oooo);
        parcel.writeLong(this.f14492OoooO00);
        parcel.writeLong(this.f14491OoooO0);
        parcel.writeInt(this.f14493OoooO0O.length);
        for (Id3Frame id3Frame : this.f14493OoooO0O) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterFrame(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i = o000OOo0.f36740OooO00o;
        this.f14489Oooo0oO = string;
        this.f14490Oooo0oo = parcel.readInt();
        this.f14488Oooo = parcel.readInt();
        this.f14492OoooO00 = parcel.readLong();
        this.f14491OoooO0 = parcel.readLong();
        int i2 = parcel.readInt();
        this.f14493OoooO0O = new Id3Frame[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.f14493OoooO0O[i3] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
