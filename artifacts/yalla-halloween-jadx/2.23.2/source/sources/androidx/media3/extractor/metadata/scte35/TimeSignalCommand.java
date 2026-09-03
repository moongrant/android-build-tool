package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.OooO0OO;
import androidx.media3.common.util.UnstableApi;
import p080o000OoO.o000O000;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f8532OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f8533OooO0o0;

    public class OooO00o implements Parcelable.Creator<TimeSignalCommand> {
        @Override // android.os.Parcelable.Creator
        public final TimeSignalCommand createFromParcel(Parcel parcel) {
            return new TimeSignalCommand(parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final TimeSignalCommand[] newArray(int i) {
            return new TimeSignalCommand[i];
        }
    }

    public TimeSignalCommand(long j, long j2) {
        this.f8532OooO0Oo = j;
        this.f8533OooO0o0 = j2;
    }

    public static long OooO00o(long j, o000O000 o000o001) {
        long jOooOo0O = o000o001.OooOo0O();
        if ((128 & jOooOo0O) != 0) {
            return 8589934591L & ((((jOooOo0O & 1) << 32) | o000o001.OooOo0o()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
        sb.append(this.f8532OooO0Oo);
        sb.append(", playbackPositionUs= ");
        return OooO0OO.OooO0O0(sb, this.f8533OooO0o0, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f8532OooO0Oo);
        parcel.writeLong(this.f8533OooO0o0);
    }
}
