package androidx.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.OooOO0;
import androidx.media3.common.util.UnstableApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p080o000OoO.o00;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class SlowMotionData implements Metadata.Entry {
    public static final Parcelable.Creator<SlowMotionData> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<Segment> f8493OooO0Oo;

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
        public final long f8494OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f8495OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final long f8496OooO0o0;

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
            o00Oo0.OooO00o(j < j2);
            this.f8494OooO0Oo = j;
            this.f8496OooO0o0 = j2;
            this.f8495OooO0o = i;
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
            return this.f8494OooO0Oo == segment.f8494OooO0Oo && this.f8496OooO0o0 == segment.f8496OooO0o0 && this.f8495OooO0o == segment.f8495OooO0o;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f8494OooO0Oo), Long.valueOf(this.f8496OooO0o0), Integer.valueOf(this.f8495OooO0o)});
        }

        public final String toString() {
            return o00.OooOOO("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f8494OooO0Oo), Long.valueOf(this.f8496OooO0o0), Integer.valueOf(this.f8495OooO0o));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f8494OooO0Oo);
            parcel.writeLong(this.f8496OooO0o0);
            parcel.writeInt(this.f8495OooO0o);
        }
    }

    public SlowMotionData(ArrayList arrayList) {
        this.f8493OooO0Oo = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((Segment) arrayList.get(0)).f8496OooO0o0;
            for (int i = 1; i < arrayList.size(); i++) {
                if (((Segment) arrayList.get(i)).f8494OooO0Oo < j) {
                    z = true;
                    break;
                }
                j = ((Segment) arrayList.get(i)).f8496OooO0o0;
            }
        }
        o00Oo0.OooO00o(!z);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ OooOO0 OooOo0() {
        return null;
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
        return this.f8493OooO0Oo.equals(((SlowMotionData) obj).f8493OooO0Oo);
    }

    public final int hashCode() {
        return this.f8493OooO0Oo.hashCode();
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ byte[] o0000OO() {
        return null;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ void o0ooOoO(MediaMetadata.OooO00o oooO00o) {
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f8493OooO0Oo;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f8493OooO0Oo);
    }
}
