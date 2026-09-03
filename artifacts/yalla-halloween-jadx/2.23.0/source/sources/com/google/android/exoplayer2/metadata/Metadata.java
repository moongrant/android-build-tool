package com.google.android.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.OooOo;
import com.google.common.primitives.OooOO0;
import java.util.Arrays;
import java.util.List;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Entry[] f12530OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f12531OooO0o0;

    public interface Entry extends Parcelable {
        @Nullable
        OooOo OooOo0();

        void OooooOo(MediaMetadata.OooO00o oooO00o);

        @Nullable
        byte[] o0000OO();
    }

    public class OooO00o implements Parcelable.Creator<Metadata> {
        @Override // android.os.Parcelable.Creator
        public final Metadata createFromParcel(Parcel parcel) {
            return new Metadata(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Metadata[] newArray(int i) {
            return new Metadata[i];
        }
    }

    public Metadata() {
        throw null;
    }

    public Metadata(Entry... entryArr) {
        this(-9223372036854775807L, entryArr);
    }

    public final Metadata OooO00o(Entry... entryArr) {
        if (entryArr.length == 0) {
            return this;
        }
        int i = o0O00.f40595OooO00o;
        Entry[] entryArr2 = this.f12530OooO0Oo;
        Object[] objArrCopyOf = Arrays.copyOf(entryArr2, entryArr2.length + entryArr.length);
        System.arraycopy(entryArr, 0, objArrCopyOf, entryArr2.length, entryArr.length);
        return new Metadata(this.f12531OooO0o0, (Entry[]) objArrCopyOf);
    }

    public final Entry OooO0O0(int i) {
        return this.f12530OooO0Oo[i];
    }

    public final int OooO0OO() {
        return this.f12530OooO0Oo.length;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Metadata.class != obj.getClass()) {
            return false;
        }
        Metadata metadata = (Metadata) obj;
        return Arrays.equals(this.f12530OooO0Oo, metadata.f12530OooO0Oo) && this.f12531OooO0o0 == metadata.f12531OooO0o0;
    }

    public final int hashCode() {
        return OooOO0.OooO00o(this.f12531OooO0o0) + (Arrays.hashCode(this.f12530OooO0Oo) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.f12530OooO0Oo));
        long j = this.f12531OooO0o0;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Entry[] entryArr = this.f12530OooO0Oo;
        parcel.writeInt(entryArr.length);
        for (Entry entry : entryArr) {
            parcel.writeParcelable(entry, 0);
        }
        parcel.writeLong(this.f12531OooO0o0);
    }

    public Metadata(long j, Entry... entryArr) {
        this.f12531OooO0o0 = j;
        this.f12530OooO0Oo = entryArr;
    }

    public Metadata(List<? extends Entry> list) {
        this((Entry[]) list.toArray(new Entry[0]));
    }

    public Metadata(Parcel parcel) {
        this.f12530OooO0Oo = new Entry[parcel.readInt()];
        int i = 0;
        while (true) {
            Entry[] entryArr = this.f12530OooO0Oo;
            if (i < entryArr.length) {
                entryArr[i] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
                i++;
            } else {
                this.f12531OooO0o0 = parcel.readLong();
                return;
            }
        }
    }
}
