package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.os.Build;
import androidx.compose.ui.unit.LayoutDirection;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f6483OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public o0000O0O.OooO f6484OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f6485OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Outline f6486OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f6487OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public p145o00Oo0.o0OoOo0 f6488OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public p145o00Oo0.o000OOo0 f6489OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public p145o00Oo0.o000O0o f6490OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f6491OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public p145o00Oo0.o000O0o f6492OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public o00O0O.OooOOO f6493OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f6494OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public long f6495OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public long f6496OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f6497OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public LayoutDirection f6498OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public p145o00Oo0.o0000OO0 f6499OooOOo0;

    public o00O0O00(@NotNull o0000O0O.OooO density) {
        Intrinsics.checkNotNullParameter(density, "density");
        this.f6484OooO00o = density;
        this.f6485OooO0O0 = true;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f6486OooO0OO = outline;
        o00O0O.OooOo00.OooO00o oooO00o = o00O0O.OooOo00.f30416OooO0O0;
        long j = o00O0O.OooOo00.f30417OooO0OO;
        this.f6487OooO0Oo = j;
        this.f6489OooO0o0 = p145o00Oo0.o000O0Oo.f32099OooO00o;
        o00O0O.OooO.OooO00o oooO00o2 = o00O0O.OooO.f30391OooO0O0;
        this.f6496OooOOO0 = o00O0O.OooO.f30392OooO0OO;
        this.f6495OooOOO = j;
        this.f6498OooOOOo = LayoutDirection.Ltr;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0085  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00be  */
    public final void OooO00o(@NotNull p145o00Oo0.o0O0O00 canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        OooO0o0();
        p145o00Oo0.o000O0o o000o0o2 = this.f6490OooO0oO;
        if (o000o0o2 != null) {
            canvas.OooO0OO(o000o0o2, 1);
            return;
        }
        float f = this.f6494OooOO0o;
        if (f <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            canvas.OooO00o(o00O0O.OooO.OooO0OO(this.f6496OooOOO0), o00O0O.OooO.OooO0Oo(this.f6496OooOOO0), o00O0O.OooOo00.OooO0Oo(this.f6495OooOOO) + o00O0O.OooO.OooO0OO(this.f6496OooOOO0), o00O0O.OooOo00.OooO0O0(this.f6495OooOOO) + o00O0O.OooO.OooO0Oo(this.f6496OooOOO0), 1);
            return;
        }
        p145o00Oo0.o000O0o o000o0oOooO00o = this.f6492OooOO0;
        o00O0O.OooOOO oooOOO = this.f6493OooOO0O;
        if (o000o0oOooO00o != null) {
            long j = this.f6496OooOOO0;
            long j2 = this.f6495OooOOO;
            boolean z = false;
            if (oooOOO != null && o00O0O.OooOOOO.OooO0O0(oooOOO)) {
                if (oooOOO.f30408OooO00o == o00O0O.OooO.OooO0OO(j)) {
                    if (oooOOO.f30409OooO0O0 == o00O0O.OooO.OooO0Oo(j)) {
                        if (oooOOO.f30410OooO0OO == o00O0O.OooOo00.OooO0Oo(j2) + o00O0O.OooO.OooO0OO(j)) {
                            if (oooOOO.f30411OooO0Oo == o00O0O.OooOo00.OooO0O0(j2) + o00O0O.OooO.OooO0Oo(j)) {
                                if (o00O0O.OooO00o.OooO0O0(oooOOO.f30413OooO0o0) == f) {
                                    z = true;
                                }
                            }
                        }
                    }
                }
            }
            if (!z) {
                float fOooO0OO = o00O0O.OooO.OooO0OO(this.f6496OooOOO0);
                float fOooO0Oo = o00O0O.OooO.OooO0Oo(this.f6496OooOOO0);
                float fOooO0Oo2 = o00O0O.OooOo00.OooO0Oo(this.f6495OooOOO) + o00O0O.OooO.OooO0OO(this.f6496OooOOO0);
                float fOooO0O0 = o00O0O.OooOo00.OooO0O0(this.f6495OooOOO) + o00O0O.OooO.OooO0Oo(this.f6496OooOOO0);
                float f2 = this.f6494OooOO0o;
                o00O0O.OooOOO oooOOOOooO00o = o00O0O.OooOOOO.OooO00o(fOooO0OO, fOooO0Oo, fOooO0Oo2, fOooO0O0, o00O0O.OooO0O0.OooO00o(f2, f2));
                if (o000o0oOooO00o == null) {
                    o000o0oOooO00o = p145o00Oo0.o00Ooo.OooO00o();
                } else {
                    o000o0oOooO00o.OooO00o();
                }
                o000o0oOooO00o.OooO0oO(oooOOOOooO00o);
                this.f6493OooOO0O = oooOOOOooO00o;
                this.f6492OooOO0 = o000o0oOooO00o;
            }
        } else {
            float fOooO0OO2 = o00O0O.OooO.OooO0OO(this.f6496OooOOO0);
            float fOooO0Oo3 = o00O0O.OooO.OooO0Oo(this.f6496OooOOO0);
            float fOooO0Oo4 = o00O0O.OooOo00.OooO0Oo(this.f6495OooOOO) + o00O0O.OooO.OooO0OO(this.f6496OooOOO0);
            float fOooO0O1 = o00O0O.OooOo00.OooO0O0(this.f6495OooOOO) + o00O0O.OooO.OooO0Oo(this.f6496OooOOO0);
            float f3 = this.f6494OooOO0o;
            o00O0O.OooOOO oooOOOOooO00o2 = o00O0O.OooOOOO.OooO00o(fOooO0OO2, fOooO0Oo3, fOooO0Oo4, fOooO0O1, o00O0O.OooO0O0.OooO00o(f3, f3));
            if (o000o0oOooO00o == null) {
                o000o0oOooO00o = p145o00Oo0.o00Ooo.OooO00o();
            } else {
                o000o0oOooO00o.OooO00o();
            }
            o000o0oOooO00o.OooO0oO(oooOOOOooO00o2);
            this.f6493OooOO0O = oooOOOOooO00o2;
            this.f6492OooOO0 = o000o0oOooO00o;
        }
        canvas.OooO0OO(o000o0oOooO00o, 1);
    }

    @Nullable
    public final Outline OooO0O0() {
        OooO0o0();
        if (this.f6497OooOOOO && this.f6485OooO0O0) {
            return this.f6486OooO0OO;
        }
        return null;
    }

    public final boolean OooO0OO(long j) {
        p145o00Oo0.o0000OO0 outline;
        boolean zOooO;
        if (!this.f6497OooOOOO || (outline = this.f6499OooOOo0) == null) {
            return true;
        }
        float fOooO0OO = o00O0O.OooO.OooO0OO(j);
        float fOooO0Oo = o00O0O.OooO.OooO0Oo(j);
        Intrinsics.checkNotNullParameter(outline, "outline");
        boolean z = false;
        if (outline instanceof o00Oo0.o0000OO0.OooO0O0) {
            o00O0O.OooOO0O oooOO0O = ((o00Oo0.o0000OO0.OooO0O0) outline).f32074OooO00o;
            if (oooOO0O.f30404OooO00o <= fOooO0OO && fOooO0OO < oooOO0O.f30406OooO0OO && oooOO0O.f30405OooO0O0 <= fOooO0Oo && fOooO0Oo < oooOO0O.f30407OooO0Oo) {
                return true;
            }
        } else {
            if (!(outline instanceof o00Oo0.o0000OO0.OooO0OO)) {
                if (outline instanceof o00Oo0.o0000OO0.OooO00o) {
                    return o00OO00O.OooO0oo(((o00Oo0.o0000OO0.OooO00o) outline).f32073OooO00o, fOooO0OO, fOooO0Oo);
                }
                throw new NoWhenBranchMatchedException();
            }
            o00O0O.OooOOO oooOOO = ((o00Oo0.o0000OO0.OooO0OO) outline).f32075OooO00o;
            if (fOooO0OO >= oooOOO.f30408OooO00o && fOooO0OO < oooOOO.f30410OooO0OO && fOooO0Oo >= oooOOO.f30409OooO0O0 && fOooO0Oo < oooOOO.f30411OooO0Oo) {
                if (o00O0O.OooO00o.OooO0O0(oooOOO.f30412OooO0o) + o00O0O.OooO00o.OooO0O0(oooOOO.f30413OooO0o0) <= oooOOO.f30410OooO0OO - oooOOO.f30408OooO00o) {
                    if (o00O0O.OooO00o.OooO0O0(oooOOO.f30414OooO0oO) + o00O0O.OooO00o.OooO0O0(oooOOO.f30415OooO0oo) <= oooOOO.f30410OooO0OO - oooOOO.f30408OooO00o) {
                        if (o00O0O.OooO00o.OooO0OO(oooOOO.f30415OooO0oo) + o00O0O.OooO00o.OooO0OO(oooOOO.f30413OooO0o0) <= oooOOO.f30411OooO0Oo - oooOOO.f30409OooO0O0) {
                            if (o00O0O.OooO00o.OooO0OO(oooOOO.f30414OooO0oO) + o00O0O.OooO00o.OooO0OO(oooOOO.f30412OooO0o) <= oooOOO.f30411OooO0Oo - oooOOO.f30409OooO0O0) {
                                z = true;
                            }
                        }
                    }
                }
                if (!z) {
                    p145o00Oo0.o0OoOo0 o0oooo1 = (p145o00Oo0.o0OoOo0) p145o00Oo0.o00Ooo.OooO00o();
                    o0oooo1.OooO0oO(oooOOO);
                    return o00OO00O.OooO0oo(o0oooo1, fOooO0OO, fOooO0Oo);
                }
                float fOooO0O0 = o00O0O.OooO00o.OooO0O0(oooOOO.f30413OooO0o0) + oooOOO.f30408OooO00o;
                float fOooO0OO2 = o00O0O.OooO00o.OooO0OO(oooOOO.f30413OooO0o0) + oooOOO.f30409OooO0O0;
                float fOooO0O1 = oooOOO.f30410OooO0OO - o00O0O.OooO00o.OooO0O0(oooOOO.f30412OooO0o);
                float fOooO0OO3 = oooOOO.f30409OooO0O0 + o00O0O.OooO00o.OooO0OO(oooOOO.f30412OooO0o);
                float fOooO0O2 = oooOOO.f30410OooO0OO - o00O0O.OooO00o.OooO0O0(oooOOO.f30414OooO0oO);
                float fOooO0OO4 = oooOOO.f30411OooO0Oo - o00O0O.OooO00o.OooO0OO(oooOOO.f30414OooO0oO);
                float fOooO0OO5 = oooOOO.f30411OooO0Oo - o00O0O.OooO00o.OooO0OO(oooOOO.f30415OooO0oo);
                float fOooO0O3 = o00O0O.OooO00o.OooO0O0(oooOOO.f30415OooO0oo) + oooOOO.f30408OooO00o;
                if (fOooO0OO < fOooO0O0 && fOooO0Oo < fOooO0OO2) {
                    zOooO = o00OO00O.OooO(fOooO0OO, fOooO0Oo, oooOOO.f30413OooO0o0, fOooO0O0, fOooO0OO2);
                } else if (fOooO0OO < fOooO0O3 && fOooO0Oo > fOooO0OO5) {
                    zOooO = o00OO00O.OooO(fOooO0OO, fOooO0Oo, oooOOO.f30415OooO0oo, fOooO0O3, fOooO0OO5);
                } else if (fOooO0OO > fOooO0O1 && fOooO0Oo < fOooO0OO3) {
                    zOooO = o00OO00O.OooO(fOooO0OO, fOooO0Oo, oooOOO.f30412OooO0o, fOooO0O1, fOooO0OO3);
                } else {
                    if (fOooO0OO <= fOooO0O2 || fOooO0Oo <= fOooO0OO4) {
                        return true;
                    }
                    zOooO = o00OO00O.OooO(fOooO0OO, fOooO0Oo, oooOOO.f30414OooO0oO, fOooO0O2, fOooO0OO4);
                }
                return zOooO;
            }
        }
        return false;
    }

    public final boolean OooO0Oo(@NotNull p145o00Oo0.o000OOo0 shape, float f, boolean z, float f2, @NotNull LayoutDirection layoutDirection, @NotNull o0000O0O.OooO density) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        this.f6486OooO0OO.setAlpha(f);
        boolean z2 = !Intrinsics.areEqual(this.f6489OooO0o0, shape);
        if (z2) {
            this.f6489OooO0o0 = shape;
            this.f6491OooO0oo = true;
        }
        boolean z3 = z || f2 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        if (this.f6497OooOOOO != z3) {
            this.f6497OooOOOO = z3;
            this.f6491OooO0oo = true;
        }
        if (this.f6498OooOOOo != layoutDirection) {
            this.f6498OooOOOo = layoutDirection;
            this.f6491OooO0oo = true;
        }
        if (!Intrinsics.areEqual(this.f6484OooO00o, density)) {
            this.f6484OooO00o = density;
            this.f6491OooO0oo = true;
        }
        return z2;
    }

    public final void OooO0o(p145o00Oo0.o000O0o o000o0o2) {
        if (Build.VERSION.SDK_INT > 28 || o000o0o2.OooO0O0()) {
            Outline outline = this.f6486OooO0OO;
            if (!(o000o0o2 instanceof p145o00Oo0.o0OoOo0)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            outline.setConvexPath(((p145o00Oo0.o0OoOo0) o000o0o2).f32146OooO00o);
            this.f6483OooO = !this.f6486OooO0OO.canClip();
        } else {
            this.f6485OooO0O0 = false;
            this.f6486OooO0OO.setEmpty();
            this.f6483OooO = true;
        }
        this.f6490OooO0oO = o000o0o2;
    }

    public final void OooO0o0() {
        if (this.f6491OooO0oo) {
            o00O0O.OooO.OooO00o oooO00o = o00O0O.OooO.f30391OooO0O0;
            this.f6496OooOOO0 = o00O0O.OooO.f30392OooO0OO;
            long j = this.f6487OooO0Oo;
            this.f6495OooOOO = j;
            this.f6494OooOO0o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f6490OooO0oO = null;
            this.f6491OooO0oo = false;
            this.f6483OooO = false;
            if (!this.f6497OooOOOO || o00O0O.OooOo00.OooO0Oo(j) <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || o00O0O.OooOo00.OooO0O0(this.f6487OooO0Oo) <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                this.f6486OooO0OO.setEmpty();
                return;
            }
            this.f6485OooO0O0 = true;
            p145o00Oo0.o0000OO0 o0000oo0OooO00o = this.f6489OooO0o0.OooO00o(this.f6487OooO0Oo, this.f6498OooOOOo, this.f6484OooO00o);
            this.f6499OooOOo0 = o0000oo0OooO00o;
            if (o0000oo0OooO00o instanceof o00Oo0.o0000OO0.OooO0O0) {
                o00O0O.OooOO0O oooOO0O = ((o00Oo0.o0000OO0.OooO0O0) o0000oo0OooO00o).f32074OooO00o;
                this.f6496OooOOO0 = o00O0O.OooOO0.OooO00o(oooOO0O.f30404OooO00o, oooOO0O.f30405OooO0O0);
                this.f6495OooOOO = o00O0O.OooOo.OooO00o(oooOO0O.f30406OooO0OO - oooOO0O.f30404OooO00o, oooOO0O.f30407OooO0Oo - oooOO0O.f30405OooO0O0);
                this.f6486OooO0OO.setRect(MathKt.roundToInt(oooOO0O.f30404OooO00o), MathKt.roundToInt(oooOO0O.f30405OooO0O0), MathKt.roundToInt(oooOO0O.f30406OooO0OO), MathKt.roundToInt(oooOO0O.f30407OooO0Oo));
                return;
            }
            if (!(o0000oo0OooO00o instanceof o00Oo0.o0000OO0.OooO0OO)) {
                if (o0000oo0OooO00o instanceof o00Oo0.o0000OO0.OooO00o) {
                    OooO0o(((o00Oo0.o0000OO0.OooO00o) o0000oo0OooO00o).f32073OooO00o);
                    return;
                }
                return;
            }
            o00O0O.OooOOO oooOOO = ((o00Oo0.o0000OO0.OooO0OO) o0000oo0OooO00o).f32075OooO00o;
            float fOooO0O0 = o00O0O.OooO00o.OooO0O0(oooOOO.f30413OooO0o0);
            this.f6496OooOOO0 = o00O0O.OooOO0.OooO00o(oooOOO.f30408OooO00o, oooOOO.f30409OooO0O0);
            this.f6495OooOOO = o00O0O.OooOo.OooO00o(oooOOO.f30410OooO0OO - oooOOO.f30408OooO00o, oooOOO.f30411OooO0Oo - oooOOO.f30409OooO0O0);
            if (o00O0O.OooOOOO.OooO0O0(oooOOO)) {
                this.f6486OooO0OO.setRoundRect(MathKt.roundToInt(oooOOO.f30408OooO00o), MathKt.roundToInt(oooOOO.f30409OooO0O0), MathKt.roundToInt(oooOOO.f30410OooO0OO), MathKt.roundToInt(oooOOO.f30411OooO0Oo), fOooO0O0);
                this.f6494OooOO0o = fOooO0O0;
                return;
            }
            p145o00Oo0.o000O0o o000o0oOooO00o = this.f6488OooO0o;
            if (o000o0oOooO00o == null) {
                o000o0oOooO00o = p145o00Oo0.o00Ooo.OooO00o();
                this.f6488OooO0o = (p145o00Oo0.o0OoOo0) o000o0oOooO00o;
            }
            p145o00Oo0.o0OoOo0 o0oooo1 = (p145o00Oo0.o0OoOo0) o000o0oOooO00o;
            o0oooo1.OooO00o();
            o0oooo1.OooO0oO(oooOOO);
            OooO0o(o0oooo1);
        }
    }
}
