package p028Oooo0oO;

import android.graphics.Matrix;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.o00OO;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0 extends o00O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00OO f1109OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f1110OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f1111OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Matrix f1112OooO0Oo;

    public o000O0(o00OO o00oo2, long j, int i, Matrix matrix) {
        if (o00oo2 == null) {
            throw new NullPointerException("Null tagBundle");
        }
        this.f1109OooO00o = o00oo2;
        this.f1110OooO0O0 = j;
        this.f1111OooO0OO = i;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        this.f1112OooO0Oo = matrix;
    }

    @Override // p028Oooo0oO.oo00o
    @NonNull
    public final o00OO OooO0O0() {
        return this.f1109OooO00o;
    }

    @Override // p028Oooo0oO.oo00o
    public final long OooO0OO() {
        return this.f1110OooO0O0;
    }

    @Override // p028Oooo0oO.o00O0O00
    public final int OooO0Oo() {
        return this.f1111OooO0OO;
    }

    @Override // p028Oooo0oO.o00O0O00
    @NonNull
    public final Matrix OooO0o0() {
        return this.f1112OooO0Oo;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o00O0O00)) {
            return false;
        }
        o00O0O00 o00o0o01 = (o00O0O00) obj;
        return this.f1109OooO00o.equals(((o000O0) o00o0o01).f1109OooO00o) && this.f1110OooO0O0 == ((o000O0) o00o0o01).f1110OooO0O0 && this.f1111OooO0OO == o00o0o01.OooO0Oo() && this.f1112OooO0Oo.equals(o00o0o01.OooO0o0());
    }

    public final int hashCode() {
        int iHashCode = (this.f1109OooO00o.hashCode() ^ 1000003) * 1000003;
        long j = this.f1110OooO0O0;
        return ((((iHashCode ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.f1111OooO0OO) * 1000003) ^ this.f1112OooO0Oo.hashCode();
    }

    public final String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.f1109OooO00o + ", timestamp=" + this.f1110OooO0O0 + ", rotationDegrees=" + this.f1111OooO0OO + ", sensorToBufferTransformMatrix=" + this.f1112OooO0Oo + "}";
    }
}
