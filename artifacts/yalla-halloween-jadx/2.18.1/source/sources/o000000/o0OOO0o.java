package o000000;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o0O0O00.o000O000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0o extends oo000o {

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    @NotNull
    public static final p145o00Oo0.Oooo0 f26664o00oO0o;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    @NotNull
    public oo000o f26665o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    @NotNull
    public o0O0O00.oo000o f26666o00o0O;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public boolean f26667o00ooo;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    @Nullable
    public o0O00OO<o0O0O00.oo000o> f26668oo000o;

    static {
        p145o00Oo0.Oooo0 oooo0 = new p145o00Oo0.Oooo0();
        o00Oo0.o00000O0.OooO00o oooO00o = p145o00Oo0.o00000O0.f32063OooO0O0;
        oooo0.OooOO0(p145o00Oo0.o00000O0.f32068OooO0oO);
        oooo0.OooOo0O(1.0f);
        oooo0.OooOo0o(1);
        f26664o00oO0o = oooo0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0o(@NotNull oo000o wrapped, @NotNull o0O0O00.oo000o modifier) {
        super(wrapped.f26702OoooO00);
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        this.f26665o00Ooo = wrapped;
        this.f26666o00o0O = modifier;
    }

    @Override // o0O0O00.OooOOOO
    public final int OooOOO(int i) {
        return o0000OoO().Oooo000(o00000O0(), this.f26665o00Ooo, i);
    }

    @Override // o0O0O00.OooOOOO
    public final int OooOoo(int i) {
        return o0000OoO().OoooOOO(o00000O0(), this.f26665o00Ooo, i);
    }

    @Override // o0O0O00.OooOOOO
    public final int OooOooO(int i) {
        return o0000OoO().Oooooo(o00000O0(), this.f26665o00Ooo, i);
    }

    @Override // o0O0O00.o0O0O00
    @NotNull
    public final o000O000 Oooo000(long j) {
        if (!o0000O0O.OooO0O0.OooO0O0(this.f35264Oooo, j)) {
            this.f35264Oooo = j;
            Oooooo();
        }
        o0000OO0(this.f26666o00o0O.OoooO0(o00000O0(), this.f26665o00Ooo, j));
        o000000 o000000Var = this.f26715Oooooo;
        if (o000000Var != null) {
            o000000Var.OooO0o(this.f35267Oooo0oo);
        }
        o0000oO();
        return this;
    }

    @Override // o0O0O00.OooOOOO
    public final int OoooO(int i) {
        return o0000OoO().OoooO(o00000O0(), this.f26665o00Ooo, i);
    }

    @Override // o000000.oo000o, o0O0O00.o000O000
    public final void OooooOo(long j, float f, @Nullable Function1<? super p145o00Oo0.o0000, Unit> function1) {
        super.OooooOo(j, f, function1);
        oo000o oo000oVar = this.f26701OoooO0;
        if (oo000oVar != null && oo000oVar.f26711Ooooo0o) {
            return;
        }
        o0000O0O();
        o000O000.OooO00o.C0363OooO00o c0363OooO00o = o000O000.OooO00o.f35268OooO00o;
        int i = (int) (this.f35267Oooo0oo >> 32);
        LayoutDirection layoutDirection = o00000O0().getLayoutDirection();
        int i2 = o000O000.OooO00o.f35270OooO0OO;
        LayoutDirection layoutDirection2 = o000O000.OooO00o.f35269OooO0O0;
        o000O000.OooO00o.f35270OooO0OO = i;
        o000O000.OooO00o.f35269OooO0O0 = layoutDirection;
        o00000().OooO0OO();
        o000O000.OooO00o.f35270OooO0OO = i2;
        o000O000.OooO00o.f35269OooO0O0 = layoutDirection2;
    }

    @Override // o000000.oo000o
    @NotNull
    public final o0O0O00.o00000O0 o00000O0() {
        return this.f26665o00Ooo.o00000O0();
    }

    @Override // o000000.oo000o
    @NotNull
    public final oo000o o00000Oo() {
        return this.f26665o00Ooo;
    }

    @Override // o000000.oo000o
    public final void o0000O0() {
        o000000 o000000Var = this.f26715Oooooo;
        if (o000000Var != null) {
            o000000Var.invalidate();
        }
        o0O00OO<o0O0O00.oo000o> o0o00oo2 = this.f26668oo000o;
        if (o0o00oo2 == null) {
            return;
        }
        o0o00oo2.setValue(this.f26666o00o0O);
    }

    public final o0O0O00.oo000o o0000OoO() {
        o0O00OO<o0O0O00.oo000o> o0o00ooOooO0Oo = this.f26668oo000o;
        if (o0o00ooOooO0Oo == null) {
            o0o00ooOooO0Oo = o0OOO00.OooO0Oo(this.f26666o00o0O);
        }
        this.f26668oo000o = o0o00ooOooO0Oo;
        return o0o00ooOooO0Oo.getValue();
    }

    @Override // o000000.oo000o
    public final void o000OO(@NotNull p145o00Oo0.o0O0O00 canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.f26665o00Ooo.o000OOo(canvas);
        if (o00Ooo.OooO00o(this.f26702OoooO00).getShowLayoutBounds()) {
            o000000(canvas, f26664o00oO0o);
        }
    }

    @Override // o000000.oo000o
    public final int o0Oo0oo(@NotNull o0O0O00.OooO00o alignmentLine) {
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        if (o00000().OooO0o0().containsKey(alignmentLine)) {
            Integer num = o00000().OooO0o0().get(alignmentLine);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int iOooOo0o = this.f26665o00Ooo.OooOo0o(alignmentLine);
        if (iOooOo0o == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        this.f26711Ooooo0o = true;
        OooooOo(this.f26709OoooOoo, this.f26710Ooooo00, this.f26700OoooO);
        this.f26711Ooooo0o = false;
        return (alignmentLine instanceof o0O0O00.OooOOO ? o0000O0O.OooOo.OooO0OO(this.f26665o00Ooo.f26709OoooOoo) : (int) (this.f26665o00Ooo.f26709OoooOoo >> 32)) + iOooOo0o;
    }
}
