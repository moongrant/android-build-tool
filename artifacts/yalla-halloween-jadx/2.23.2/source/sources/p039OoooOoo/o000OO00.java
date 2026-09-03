package p039OoooOoo;

import androidx.annotation.NonNull;
import androidx.camera.video.AudioStats;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO00 extends o00OOOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f1628OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f1629OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AudioStats f1630OooO0OO;

    public o000OO00(long j, long j2, o000O00O o000o00o2) {
        this.f1628OooO00o = j;
        this.f1629OooO0O0 = j2;
        this.f1630OooO0OO = o000o00o2;
    }

    @Override // p039OoooOoo.o00OOOOo
    @NonNull
    public final AudioStats OooO00o() {
        return this.f1630OooO0OO;
    }

    @Override // p039OoooOoo.o00OOOOo
    public final long OooO0O0() {
        return this.f1629OooO0O0;
    }

    @Override // p039OoooOoo.o00OOOOo
    public final long OooO0OO() {
        return this.f1628OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o00OOOOo)) {
            return false;
        }
        o00OOOOo o00ooooo2 = (o00OOOOo) obj;
        return this.f1628OooO00o == o00ooooo2.OooO0OO() && this.f1629OooO0O0 == o00ooooo2.OooO0O0() && this.f1630OooO0OO.equals(o00ooooo2.OooO00o());
    }

    public final int hashCode() {
        long j = this.f1628OooO00o;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.f1629OooO0O0;
        return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f1630OooO0OO.hashCode();
    }

    public final String toString() {
        return "RecordingStats{recordedDurationNanos=" + this.f1628OooO00o + ", numBytesRecorded=" + this.f1629OooO0O0 + ", audioStats=" + this.f1630OooO0OO + "}";
    }
}
