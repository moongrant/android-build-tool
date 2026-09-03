package p039OoooOoo;

import androidx.annotation.NonNull;
import androidx.camera.video.AudioStats;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO00 extends o00OOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f1661OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f1662OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AudioStats f1663OooO0OO;

    public o000OO00(long j, long j2, o000O00O o000o00o2) {
        this.f1661OooO00o = j;
        this.f1662OooO0O0 = j2;
        this.f1663OooO0OO = o000o00o2;
    }

    @Override // p039OoooOoo.o00OOO0
    @NonNull
    public final AudioStats OooO00o() {
        return this.f1663OooO0OO;
    }

    @Override // p039OoooOoo.o00OOO0
    public final long OooO0O0() {
        return this.f1662OooO0O0;
    }

    @Override // p039OoooOoo.o00OOO0
    public final long OooO0OO() {
        return this.f1661OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o00OOO0)) {
            return false;
        }
        o00OOO0 o00ooo1 = (o00OOO0) obj;
        return this.f1661OooO00o == o00ooo1.OooO0OO() && this.f1662OooO0O0 == o00ooo1.OooO0O0() && this.f1663OooO0OO.equals(o00ooo1.OooO00o());
    }

    public final int hashCode() {
        long j = this.f1661OooO00o;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.f1662OooO0O0;
        return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f1663OooO0OO.hashCode();
    }

    public final String toString() {
        return "RecordingStats{recordedDurationNanos=" + this.f1661OooO00o + ", numBytesRecorded=" + this.f1662OooO0O0 + ", audioStats=" + this.f1663OooO0OO + "}";
    }
}
