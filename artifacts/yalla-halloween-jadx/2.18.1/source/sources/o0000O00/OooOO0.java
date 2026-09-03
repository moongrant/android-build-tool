package o0000O00;

import android.text.TextPaint;
import kotlin.jvm.internal.Intrinsics;
import o00O0O.OooOo00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p145o00Oo0.o00000O0;
import p145o00Oo0.o00000OO;
import p145o00Oo0.o000O;
import p145o00Oo0.o000OO00;
import p145o00Oo0.o0O0ooO;
import p145o00Oo0.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 extends TextPaint {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public o0000O0.OooO f27292OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public o000OO00 f27293OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public o0Oo0oo f27294OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public OooOo00 f27295OooO0Oo;

    public OooOO0(float f) {
        super(1);
        ((TextPaint) this).density = f;
        this.f27292OooO00o = o0000O0.OooO.f27246OooO0OO;
        o000OO00.OooO00o oooO00o = o000OO00.f32105OooO0Oo;
        this.f27293OooO0O0 = o000OO00.f32106OooO0o0;
    }

    public final void OooO00o(@Nullable o0Oo0oo o0oo0oo2, long j) {
        if (o0oo0oo2 == null) {
            setShader(null);
            return;
        }
        if (Intrinsics.areEqual(this.f27294OooO0OO, o0oo0oo2)) {
            OooOo00 oooOo00 = this.f27295OooO0Oo;
            if (oooOo00 == null ? false : OooOo00.OooO00o(oooOo00.f30419OooO00o, j)) {
                return;
            }
        }
        this.f27294OooO0OO = o0oo0oo2;
        this.f27295OooO0Oo = new OooOo00(j);
        if (o0oo0oo2 instanceof o0O0ooO) {
            setShader(null);
            OooO0O0(((o0O0ooO) o0oo0oo2).f32140OooO0O0);
        } else if (o0oo0oo2 instanceof o000O) {
            OooOo00.OooO00o oooO00o = OooOo00.f30416OooO0O0;
            if (j != OooOo00.f30418OooO0Oo) {
                setShader(((o000O) o0oo0oo2).OooO0O0(j));
            }
        }
    }

    public final void OooO0O0(long j) {
        int iOooO0oO;
        o00000O0.OooO00o oooO00o = o00000O0.f32063OooO0O0;
        if (!(j != o00000O0.f32062OooO) || getColor() == (iOooO0oO = o00000OO.OooO0oO(j))) {
            return;
        }
        setColor(iOooO0oO);
    }

    public final void OooO0OO(@Nullable o000OO00 o000oo01) {
        if (o000oo01 == null) {
            o000OO00.OooO00o oooO00o = o000OO00.f32105OooO0Oo;
            o000oo01 = o000OO00.f32106OooO0o0;
        }
        if (Intrinsics.areEqual(this.f27293OooO0O0, o000oo01)) {
            return;
        }
        this.f27293OooO0O0 = o000oo01;
        o000OO00.OooO00o oooO00o2 = o000OO00.f32105OooO0Oo;
        if (Intrinsics.areEqual(o000oo01, o000OO00.f32106OooO0o0)) {
            clearShadowLayer();
        } else {
            o000OO00 o000oo02 = this.f27293OooO0O0;
            setShadowLayer(o000oo02.f32109OooO0OO, o00O0O.OooO.OooO0OO(o000oo02.f32108OooO0O0), o00O0O.OooO.OooO0Oo(this.f27293OooO0O0.f32108OooO0O0), o00000OO.OooO0oO(this.f27293OooO0O0.f32107OooO00o));
        }
    }

    public final void OooO0Oo(@Nullable o0000O0.OooO oooO) {
        if (oooO == null) {
            oooO = o0000O0.OooO.f27246OooO0OO;
        }
        if (Intrinsics.areEqual(this.f27292OooO00o, oooO)) {
            return;
        }
        this.f27292OooO00o = oooO;
        setUnderlineText(oooO.OooO00o(o0000O0.OooO.f27247OooO0Oo));
        setStrikeThruText(this.f27292OooO00o.OooO00o(o0000O0.OooO.f27248OooO0o0));
    }
}
