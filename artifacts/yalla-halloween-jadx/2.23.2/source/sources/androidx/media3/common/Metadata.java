package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import java.util.List;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Entry[] f6336OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f6337OooO0o0;

    public interface Entry extends Parcelable {
        @Nullable
        OooOO0 OooOo0();

        @Nullable
        byte[] o0000OO();

        void o0ooOoO(MediaMetadata.OooO00o oooO00o);
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
        int i = o00.f34910OooO00o;
        Entry[] entryArr2 = this.f6336OooO0Oo;
        Object[] objArrCopyOf = Arrays.copyOf(entryArr2, entryArr2.length + entryArr.length);
        System.arraycopy(entryArr, 0, objArrCopyOf, entryArr2.length, entryArr.length);
        return new Metadata(this.f6337OooO0o0, (Entry[]) objArrCopyOf);
    }

    public final Entry OooO0O0(int i) {
        return this.f6336OooO0Oo[i];
    }

    public final int OooO0OO() {
        return this.f6336OooO0Oo.length;
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
        return Arrays.equals(this.f6336OooO0Oo, metadata.f6336OooO0Oo) && this.f6337OooO0o0 == metadata.f6337OooO0o0;
    }

    public final int hashCode() {
        return com.google.common.primitives.OooO.OooO00o(this.f6337OooO0o0) + (Arrays.hashCode(this.f6336OooO0Oo) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.f6336OooO0Oo));
        long j = this.f6337OooO0o0;
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
        Entry[] entryArr = this.f6336OooO0Oo;
        parcel.writeInt(entryArr.length);
        for (Entry entry : entryArr) {
            parcel.writeParcelable(entry, 0);
        }
        parcel.writeLong(this.f6337OooO0o0);
    }

    public Metadata(long j, Entry... entryArr) {
        this.f6337OooO0o0 = j;
        this.f6336OooO0Oo = entryArr;
    }

    public Metadata(List<? extends Entry> list) {
        this((Entry[]) list.toArray(new Entry[0]));
    }

    public Metadata(Parcel parcel) {
        this.f6336OooO0Oo = new Entry[parcel.readInt()];
        int i = 0;
        while (true) {
            Entry[] entryArr = this.f6336OooO0Oo;
            if (i < entryArr.length) {
                entryArr[i] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
                i++;
            } else {
                this.f6337OooO0o0 = parcel.readLong();
                return;
            }
        }
    }
}
