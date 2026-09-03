package androidx.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o000O000.OooO0o;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class SlowMotionData implements Metadata.Entry {
    public static final Parcelable.Creator<SlowMotionData> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<Segment> f6407OooO0Oo;

    public class OooO00o implements Parcelable.Creator<SlowMotionData> {
        @Override // android.os.Parcelable.Creator
        public final SlowMotionData createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, Segment.class.getClassLoader());
            return new SlowMotionData(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SlowMotionData[] newArray(int i) {
            return new SlowMotionData[i];
        }
    }

    public static final class Segment implements Parcelable {
        public static final Parcelable.Creator<Segment> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final long f6408OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f6409OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final long f6410OooO0o0;

        public class OooO00o implements Parcelable.Creator<Segment> {
            @Override // android.os.Parcelable.Creator
            public final Segment createFromParcel(Parcel parcel) {
                return new Segment(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Segment[] newArray(int i) {
                return new Segment[i];
            }
        }

        public Segment(long j, long j2, int i) {
            o000O000.OooO00o.OooO00o(j < j2);
            this.f6408OooO0Oo = j;
            this.f6410OooO0o0 = j2;
            this.f6409OooO0o = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Segment.class != obj.getClass()) {
                return false;
            }
            Segment segment = (Segment) obj;
            return this.f6408OooO0Oo == segment.f6408OooO0Oo && this.f6410OooO0o0 == segment.f6410OooO0o0 && this.f6409OooO0o == segment.f6409OooO0o;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f6408OooO0Oo), Long.valueOf(this.f6410OooO0o0), Integer.valueOf(this.f6409OooO0o)});
        }

        public final String toString() {
            return OooO0o.OooO0O0("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f6408OooO0Oo), Long.valueOf(this.f6410OooO0o0), Integer.valueOf(this.f6409OooO0o));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f6408OooO0Oo);
            parcel.writeLong(this.f6410OooO0o0);
            parcel.writeInt(this.f6409OooO0o);
        }
    }

    public SlowMotionData(ArrayList arrayList) {
        this.f6407OooO0Oo = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((Segment) arrayList.get(0)).f6410OooO0o0;
            for (int i = 1; i < arrayList.size(); i++) {
                if (((Segment) arrayList.get(i)).f6408OooO0Oo < j) {
                    z = true;
                    break;
                }
                j = ((Segment) arrayList.get(i)).f6410OooO0o0;
            }
        }
        o000O000.OooO00o.OooO00o(!z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SlowMotionData.class != obj.getClass()) {
            return false;
        }
        return this.f6407OooO0Oo.equals(((SlowMotionData) obj).f6407OooO0Oo);
    }

    public final int hashCode() {
        return this.f6407OooO0Oo.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f6407OooO0Oo;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f6407OooO0Oo);
    }
}
