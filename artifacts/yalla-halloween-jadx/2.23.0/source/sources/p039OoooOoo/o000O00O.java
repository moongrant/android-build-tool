package p039OoooOoo;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.video.AudioStats;

/* JADX INFO: loaded from: classes.dex */
public final class o000O00O extends AudioStats {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f1649OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final double f1650OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Throwable f1651OooO0Oo;

    public o000O00O(double d, int i, @Nullable Throwable th) {
        this.f1649OooO0O0 = i;
        this.f1650OooO0OO = d;
        this.f1651OooO0Oo = th;
    }

    @Override // androidx.camera.video.AudioStats
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final double OooO00o() {
        return this.f1650OooO0OO;
    }

    @Override // androidx.camera.video.AudioStats
    public final int OooO0O0() {
        return this.f1649OooO0O0;
    }

    @Override // androidx.camera.video.AudioStats
    @Nullable
    public final Throwable OooO0OO() {
        return this.f1651OooO0Oo;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AudioStats)) {
            return false;
        }
        AudioStats audioStats = (AudioStats) obj;
        if (this.f1649OooO0O0 == audioStats.OooO0O0() && Double.doubleToLongBits(this.f1650OooO0OO) == Double.doubleToLongBits(audioStats.OooO00o())) {
            Throwable th = this.f1651OooO0Oo;
            if (th == null) {
                if (audioStats.OooO0OO() == null) {
                    return true;
                }
            } else if (th.equals(audioStats.OooO0OO())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f1649OooO0O0 ^ 1000003) * 1000003;
        double d = this.f1650OooO0OO;
        int iDoubleToLongBits = (i ^ ((int) (Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32)))) * 1000003;
        Throwable th = this.f1651OooO0Oo;
        return iDoubleToLongBits ^ (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        return "AudioStats{audioState=" + this.f1649OooO0O0 + ", audioAmplitudeInternal=" + this.f1650OooO0OO + ", errorCause=" + this.f1651OooO0Oo + "}";
    }
}
