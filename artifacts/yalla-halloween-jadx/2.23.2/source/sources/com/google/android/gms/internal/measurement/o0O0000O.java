package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0000O implements oO0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final zzki f15052OooO00o;

    public o0O0000O(zzki zzkiVar) {
        Charset charset = zzlj.f15277OooO00o;
        this.f15052OooO00o = zzkiVar;
        zzkiVar.f15270OooO00o = this;
    }

    public final void OooO(int i, int i2) throws IOException {
        this.f15052OooO00o.zzf(i, i2);
    }

    public final void OooO00o(int i, int i2) throws IOException {
        this.f15052OooO00o.zzp(i, (i2 >> 31) ^ (i2 + i2));
    }

    public final void OooO0O0(int i, long j) throws IOException {
        this.f15052OooO00o.zzr(i, (j >> 63) ^ (j + j));
    }

    public final void OooO0OO(int i, int i2) throws IOException {
        this.f15052OooO00o.zzp(i, i2);
    }

    public final void OooO0Oo(int i, long j) throws IOException {
        this.f15052OooO00o.zzr(i, j);
    }

    public final void OooO0o(int i, zzka zzkaVar) throws IOException {
        this.f15052OooO00o.zze(i, zzkaVar);
    }

    public final void OooO0o0(int i, boolean z) throws IOException {
        this.f15052OooO00o.zzd(i, z);
    }

    public final void OooO0oO(double d, int i) throws IOException {
        this.f15052OooO00o.zzh(i, Double.doubleToRawLongBits(d));
    }

    public final void OooO0oo(int i, int i2) throws IOException {
        this.f15052OooO00o.zzj(i, i2);
    }

    public final void OooOO0(int i, long j) throws IOException {
        this.f15052OooO00o.zzh(i, j);
    }

    public final void OooOO0O(float f, int i) throws IOException {
        this.f15052OooO00o.zzf(i, Float.floatToRawIntBits(f));
    }

    public final void OooOO0o(int i, oo0oO0 oo0oo0, Object obj) throws IOException {
        zzki zzkiVar = this.f15052OooO00o;
        zzkiVar.zzo(i, 3);
        oo0oo0.OooO0O0((zzmi) obj, zzkiVar.f15270OooO00o);
        zzkiVar.zzo(i, 4);
    }

    public final void OooOOO(int i, long j) throws IOException {
        this.f15052OooO00o.zzr(i, j);
    }

    public final void OooOOO0(int i, int i2) throws IOException {
        this.f15052OooO00o.zzj(i, i2);
    }

    public final void OooOOOO(int i, oo0oO0 oo0oo0, Object obj) throws IOException {
        zzmi zzmiVar = (zzmi) obj;
        o0O00000 o0o00000 = (o0O00000) this.f15052OooO00o;
        o0o00000.zzq((i << 3) | 2);
        o0o00000.zzq(((zzjk) zzmiVar).OooO00o(oo0oo0));
        oo0oo0.OooO0O0(zzmiVar, o0o00000.f15270OooO00o);
    }

    public final void OooOOOo(int i, int i2) throws IOException {
        this.f15052OooO00o.zzf(i, i2);
    }

    public final void OooOOo0(int i, long j) throws IOException {
        this.f15052OooO00o.zzh(i, j);
    }
}
