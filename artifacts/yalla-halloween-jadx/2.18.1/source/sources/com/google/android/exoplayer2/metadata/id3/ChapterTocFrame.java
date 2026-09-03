package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final boolean f14494Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final String f14495Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final boolean f14496Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final Id3Frame[] f14497OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final String[] f14498OoooO00;

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
        this.f14495Oooo0oO = str;
        this.f14496Oooo0oo = z;
        this.f14494Oooo = z2;
        this.f14498OoooO00 = strArr;
        this.f14497OoooO0 = id3FrameArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterTocFrame.class != obj.getClass()) {
            return false;
        }
        ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
        return this.f14496Oooo0oo == chapterTocFrame.f14496Oooo0oo && this.f14494Oooo == chapterTocFrame.f14494Oooo && o000OOo0.OooO00o(this.f14495Oooo0oO, chapterTocFrame.f14495Oooo0oO) && Arrays.equals(this.f14498OoooO00, chapterTocFrame.f14498OoooO00) && Arrays.equals(this.f14497OoooO0, chapterTocFrame.f14497OoooO0);
    }

    public final int hashCode() {
        int i = (((527 + (this.f14496Oooo0oo ? 1 : 0)) * 31) + (this.f14494Oooo ? 1 : 0)) * 31;
        String str = this.f14495Oooo0oO;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14495Oooo0oO);
        parcel.writeByte(this.f14496Oooo0oo ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f14494Oooo ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f14498OoooO00);
        parcel.writeInt(this.f14497OoooO0.length);
        for (Id3Frame id3Frame : this.f14497OoooO0) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterTocFrame(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i = o000OOo0.f36740OooO00o;
        this.f14495Oooo0oO = string;
        this.f14496Oooo0oo = parcel.readByte() != 0;
        this.f14494Oooo = parcel.readByte() != 0;
        this.f14498OoooO00 = parcel.createStringArray();
        int i2 = parcel.readInt();
        this.f14497OoooO0 = new Id3Frame[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.f14497OoooO0[i3] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
