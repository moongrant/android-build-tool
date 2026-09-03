package p057o0000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class o000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public float f27545OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public float f27546OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public float f27547OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f27548OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f27549OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f27550OooO0o0;

    public final void OooO00o(float f, float f2, int i, int i2, float[] fArr) {
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = (f - 0.5f) * 2.0f;
        float f6 = (f2 - 0.5f) * 2.0f;
        float f7 = f3 + this.f27547OooO0OO;
        float f8 = f4 + this.f27548OooO0Oo;
        float f9 = (this.f27545OooO00o * f5) + f7;
        float f10 = (this.f27546OooO0O0 * f6) + f8;
        float radians = (float) Math.toRadians(this.f27549OooO0o);
        float radians2 = (float) Math.toRadians(this.f27550OooO0o0);
        double d = radians;
        double d2 = i2 * f6;
        float fSin = (((float) ((Math.sin(d) * ((double) ((-i) * f5))) - (Math.cos(d) * d2))) * radians2) + f9;
        float fCos = (radians2 * ((float) ((Math.cos(d) * ((double) (i * f5))) - (Math.sin(d) * d2)))) + f10;
        fArr[0] = fSin;
        fArr[1] = fCos;
    }
}
