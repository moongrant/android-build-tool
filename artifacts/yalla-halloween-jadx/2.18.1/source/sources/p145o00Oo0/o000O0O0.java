package p145o00Oo0;

import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import o0000O0O.OooO;
import o0000O0O.OooO0o;
import o0000O0O.OooOO0O;
import o0000O0O.o00Oo0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0O0 implements o0000 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public float f32083Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public float f32084Oooo0o = 1.0f;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public float f32085Oooo0oO = 1.0f;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public float f32086Oooo0oo = 1.0f;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public long f32087OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public float f32088OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public float f32089OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public long f32090OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public float f32091OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public float f32092OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public float f32093OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public long f32094OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @NotNull
    public o000OOo0 f32095OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public boolean f32096OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public OooO f32097Ooooo00;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public float f32098o000oOoO;

    public o000O0O0() {
        long j = o0000O00.f32072OooO00o;
        this.f32090OoooO0O = j;
        this.f32087OoooO = j;
        this.f32093OoooOOo = 8.0f;
        o00O00.OooO00o oooO00o = o00O00.f32112OooO0O0;
        this.f32094OoooOo0 = o00O00.f32113OooO0OO;
        this.f32095OoooOoO = o000O0Oo.f32099OooO00o;
        this.f32097Ooooo00 = OooOO0O.OooO00o();
    }

    @Override // p145o00Oo0.o0000
    public final void OooO(float f) {
        this.f32089OoooO00 = f;
    }

    @Override // p145o00Oo0.o0000
    public final void OooO0O0(float f) {
        this.f32086Oooo0oo = f;
    }

    @Override // p145o00Oo0.o0000
    public final void OooO0Oo(float f) {
        this.f32098o000oOoO = f;
    }

    @Override // p145o00Oo0.o0000
    public final void OooO0o() {
    }

    @Override // o0000O0O.OooO
    public final float OooO0o0(int i) {
        return i / getDensity();
    }

    @Override // p145o00Oo0.o0000
    public final void OooO0oo(float f) {
        this.f32092OoooOOO = f;
    }

    @Override // p145o00Oo0.o0000
    public final void OooOO0(float f) {
        this.f32085Oooo0oO = f;
    }

    @Override // p145o00Oo0.o0000
    public final void OooOO0o(float f) {
        this.f32084Oooo0o = f;
    }

    @Override // p145o00Oo0.o0000
    public final void OooOOO0(float f) {
        this.f32083Oooo = f;
    }

    @Override // p145o00Oo0.o0000
    public final void OooOOOo(float f) {
        this.f32093OoooOOo = f;
    }

    @Override // p145o00Oo0.o0000
    public final void OooOOo0(float f) {
        this.f32091OoooOO0 = f;
    }

    @Override // p145o00Oo0.o0000
    public final void OooOo00(float f) {
        this.f32088OoooO0 = f;
    }

    @Override // o0000O0O.OooO
    public final long OooOoOO(float f) {
        return o00Oo0.OooO0O0(f / OoooOOo());
    }

    @Override // o0000O0O.OooO
    public final /* synthetic */ long OooOoo0(long j) {
        return OooO0o.OooO0O0(this, j);
    }

    @Override // p145o00Oo0.o0000
    public final void Oooo00o(@NotNull o000OOo0 o000ooo1) {
        Intrinsics.checkNotNullParameter(o000ooo1, "<set-?>");
        this.f32095OoooOoO = o000ooo1;
    }

    @Override // o0000O0O.OooO
    public final float OoooOO0(float f) {
        return f / getDensity();
    }

    @Override // o0000O0O.OooO
    public final float OoooOOo() {
        return this.f32097Ooooo00.OoooOOo();
    }

    @Override // o0000O0O.OooO
    public final float OoooOoo(float f) {
        return getDensity() * f;
    }

    @Override // p145o00Oo0.o0000
    public final void Ooooo00(long j) {
        this.f32090OoooO0O = j;
    }

    @Override // o0000O0O.OooO
    public final int OooooOO(long j) {
        return MathKt.roundToInt(oo000o(j));
    }

    @Override // p145o00Oo0.o0000
    public final void Oooooo0(boolean z) {
        this.f32096OoooOoo = z;
    }

    @Override // o0000O0O.OooO
    public final /* synthetic */ int OoooooO(float f) {
        return OooO0o.OooO00o(this, f);
    }

    @Override // p145o00Oo0.o0000
    public final void Ooooooo(long j) {
        this.f32094OoooOo0 = j;
    }

    @Override // o0000O0O.OooO
    public final float getDensity() {
        return this.f32097Ooooo00.getDensity();
    }

    @Override // o0000O0O.OooO
    public final /* synthetic */ long o00ooo(long j) {
        return OooO0o.OooO0Oo(this, j);
    }

    @Override // o0000O0O.OooO
    public final /* synthetic */ float oo000o(long j) {
        return OooO0o.OooO0OO(this, j);
    }

    @Override // p145o00Oo0.o0000
    public final void ooOO(long j) {
        this.f32087OoooO = j;
    }
}
