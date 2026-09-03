package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final long f12576OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f12577OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f12578OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f12579OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final long f12580OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Id3Frame[] f12581OooOO0;

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
        this.f12578OooO0o0 = str;
        this.f12577OooO0o = i;
        this.f12579OooO0oO = i2;
        this.f12580OooO0oo = j;
        this.f12576OooO = j2;
        this.f12581OooOO0 = id3FrameArr;
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
        return this.f12577OooO0o == chapterFrame.f12577OooO0o && this.f12579OooO0oO == chapterFrame.f12579OooO0oO && this.f12580OooO0oo == chapterFrame.f12580OooO0oo && this.f12576OooO == chapterFrame.f12576OooO && o0O00.OooO00o(this.f12578OooO0o0, chapterFrame.f12578OooO0o0) && Arrays.equals(this.f12581OooOO0, chapterFrame.f12581OooOO0);
    }

    public final int hashCode() {
        int i = (((((((527 + this.f12577OooO0o) * 31) + this.f12579OooO0oO) * 31) + ((int) this.f12580OooO0oo)) * 31) + ((int) this.f12576OooO)) * 31;
        String str = this.f12578OooO0o0;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12578OooO0o0);
        parcel.writeInt(this.f12577OooO0o);
        parcel.writeInt(this.f12579OooO0oO);
        parcel.writeLong(this.f12580OooO0oo);
        parcel.writeLong(this.f12576OooO);
        Id3Frame[] id3FrameArr = this.f12581OooOO0;
        parcel.writeInt(id3FrameArr.length);
        for (Id3Frame id3Frame : id3FrameArr) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterFrame(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i = o0O00.f40595OooO00o;
        this.f12578OooO0o0 = string;
        this.f12577OooO0o = parcel.readInt();
        this.f12579OooO0oO = parcel.readInt();
        this.f12580OooO0oo = parcel.readLong();
        this.f12576OooO = parcel.readLong();
        int i2 = parcel.readInt();
        this.f12581OooOO0 = new Id3Frame[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.f12581OooOO0[i3] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
