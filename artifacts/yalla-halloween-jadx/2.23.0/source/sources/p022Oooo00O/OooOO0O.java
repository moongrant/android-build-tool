package p022Oooo00O;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O extends o0O0O0O.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f444OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f445OooO0O0;

    public OooOO0O(int i, int i2) {
        this.f444OooO00o = i;
        this.f445OooO0O0 = i2;
    }

    @Override // Oooo00O.o0O0O0O.OooO0O0
    public final int OooO00o() {
        return this.f444OooO00o;
    }

    @Override // Oooo00O.o0O0O0O.OooO0O0
    public final int OooO0O0() {
        return this.f445OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0O0O0O.OooO0O0)) {
            return false;
        }
        o0O0O0O.OooO0O0 oooO0O0 = (o0O0O0O.OooO0O0) obj;
        return this.f444OooO00o == oooO0O0.OooO00o() && this.f445OooO0O0 == oooO0O0.OooO0O0();
    }

    public final int hashCode() {
        return ((this.f444OooO00o ^ 1000003) * 1000003) ^ this.f445OooO0O0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeatureSettings{cameraMode=");
        sb.append(this.f444OooO00o);
        sb.append(", requiredMaxBitDepth=");
        return OooOO0.OooO0O0(sb, this.f445OooO0O0, "}");
    }
}
