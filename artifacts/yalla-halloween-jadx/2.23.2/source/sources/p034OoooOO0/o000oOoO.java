package p034OoooOO0;

/* JADX INFO: loaded from: classes.dex */
public final class o000oOoO extends o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f1419OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f1420OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f1421OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f1422OooO0Oo;

    public o000oOoO(float f, float f2, float f3, float f4) {
        this.f1419OooO00o = f;
        this.f1420OooO0O0 = f2;
        this.f1421OooO0OO = f3;
        this.f1422OooO0Oo = f4;
    }

    @Override // p028Oooo0oO.o0O0o
    public final float OooO00o() {
        return this.f1419OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o00Ooo)) {
            return false;
        }
        o00Ooo o00ooo2 = (o00Ooo) obj;
        if (Float.floatToIntBits(this.f1419OooO00o) == Float.floatToIntBits(((o000oOoO) o00ooo2).f1419OooO00o)) {
            o000oOoO o000oooo2 = (o000oOoO) o00ooo2;
            if (Float.floatToIntBits(this.f1420OooO0O0) == Float.floatToIntBits(o000oooo2.f1420OooO0O0) && Float.floatToIntBits(this.f1421OooO0OO) == Float.floatToIntBits(o000oooo2.f1421OooO0OO) && Float.floatToIntBits(this.f1422OooO0Oo) == Float.floatToIntBits(o000oooo2.f1422OooO0Oo)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.f1419OooO00o) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f1420OooO0O0)) * 1000003) ^ Float.floatToIntBits(this.f1421OooO0OO)) * 1000003) ^ Float.floatToIntBits(this.f1422OooO0Oo);
    }

    public final String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f1419OooO00o + ", maxZoomRatio=" + this.f1420OooO0O0 + ", minZoomRatio=" + this.f1421OooO0OO + ", linearZoom=" + this.f1422OooO0Oo + "}";
    }
}
