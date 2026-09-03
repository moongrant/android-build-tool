package o000000;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 extends o00Oo0<OooOO0, p442o0OoOo0.o00O0O> implements o00000O0 {

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public static final Function1<OooOO0, Unit> f26592OoooOO0 = OooO00o.f26597Oooo0o;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f26593OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f26594OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public p442o0OoOo0.o000oOoO f26595OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f26596OoooO0O;

    public static final class OooO00o extends Lambda implements Function1<OooOO0, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f26597Oooo0o = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(OooOO0 oooOO1) {
            OooOO0 drawEntity = oooOO1;
            Intrinsics.checkNotNullParameter(drawEntity, "drawEntity");
            if (drawEntity.f26652Oooo0o.OooOoO()) {
                drawEntity.f26596OoooO0O = true;
                drawEntity.f26652Oooo0o.o0000();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 implements p442o0OoOo0.OooOo00 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final o0000O0O.OooO f26598OooO00o;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ oo000o f26600OooO0OO;

        public OooO0O0(oo000o oo000oVar) {
            this.f26600OooO0OO = oo000oVar;
            this.f26598OooO00o = OooOO0.this.f26652Oooo0o.f26702OoooO00.f6150Ooooo00;
        }

        @Override // p442o0OoOo0.OooOo00
        public final long OooO0OO() {
            return o0000O0O.o0OoOo0.OooO0O0(this.f26600OooO0OO.f35267Oooo0oo);
        }

        @Override // p442o0OoOo0.OooOo00
        @NotNull
        public final o0000O0O.OooO getDensity() {
            return this.f26598OooO00o;
        }

        @Override // p442o0OoOo0.OooOo00
        @NotNull
        public final LayoutDirection getLayoutDirection() {
            return OooOO0.this.f26652Oooo0o.f26702OoooO00.f6152OooooO0;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            OooOO0 oooOO1 = OooOO0.this;
            p442o0OoOo0.o000oOoO o000oooo2 = oooOO1.f26595OoooO00;
            if (o000oooo2 != null) {
                o000oooo2.OooOo0o(oooOO1.f26594OoooO0);
            }
            OooOO0.this.f26596OoooO0O = false;
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(@NotNull oo000o layoutNodeWrapper, @NotNull p442o0OoOo0.o00O0O modifier) {
        super(layoutNodeWrapper, modifier);
        Intrinsics.checkNotNullParameter(layoutNodeWrapper, "layoutNodeWrapper");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        p442o0OoOo0.o00O0O o00o0o2 = (p442o0OoOo0.o00O0O) this.f26653Oooo0oO;
        this.f26595OoooO00 = o00o0o2 instanceof p442o0OoOo0.o000oOoO ? (p442o0OoOo0.o000oOoO) o00o0o2 : null;
        this.f26594OoooO0 = new OooO0O0(layoutNodeWrapper);
        this.f26596OoooO0O = true;
        this.f26593OoooO = new OooO0OO();
    }

    @Override // o000000.o00Oo0
    public final void OooO00o() {
        p442o0OoOo0.o00O0O o00o0o2 = (p442o0OoOo0.o00O0O) this.f26653Oooo0oO;
        this.f26595OoooO00 = o00o0o2 instanceof p442o0OoOo0.o000oOoO ? (p442o0OoOo0.o000oOoO) o00o0o2 : null;
        this.f26596OoooO0O = true;
        this.f26651Oooo = true;
    }

    public final void OooO0OO(@NotNull p145o00Oo0.o0O0O00 canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        long jOooO0O0 = o0000O0O.o0OoOo0.OooO0O0(this.f26652Oooo0o.f35267Oooo0oo);
        if (this.f26595OoooO00 != null && this.f26596OoooO0O) {
            o00Ooo.OooO00o(this.f26652Oooo0o.f26702OoooO00).getF6257o0OoOo0().OooO00o(this, f26592OoooOO0, this.f26593OoooO);
        }
        o00O0O sharedDrawScope = o00Ooo.OooO00o(this.f26652Oooo0o.f26702OoooO00).getF6202Oooo0oo();
        oo000o oo000oVar = this.f26652Oooo0o;
        OooOO0 oooOO1 = sharedDrawScope.f26650Oooo0oO;
        sharedDrawScope.f26650Oooo0oO = this;
        p191o00o0O.o00Oo0 o00oo1 = sharedDrawScope.f26649Oooo0o;
        o0O0O00.o00000O0 o00000O1 = oo000oVar.o00000O0();
        LayoutDirection layoutDirection = oo000oVar.o00000O0().getLayoutDirection();
        o00o0O.o00Oo0.OooO00o oooO00o = o00oo1.f33067Oooo0o;
        o0000O0O.OooO oooO = oooO00o.f33070OooO00o;
        LayoutDirection layoutDirection2 = oooO00o.f33071OooO0O0;
        p145o00Oo0.o0O0O00 o0o0o00 = oooO00o.f33072OooO0OO;
        long j = oooO00o.f33073OooO0Oo;
        oooO00o.OooO0O0(o00000O1);
        oooO00o.OooO0OO(layoutDirection);
        Intrinsics.checkNotNullParameter(canvas, "<set-?>");
        oooO00o.f33072OooO0OO = canvas;
        oooO00o.f33073OooO0Oo = jOooO0O0;
        canvas.OooO0oo();
        ((p442o0OoOo0.o00O0O) this.f26653Oooo0oO).Oooo0o(sharedDrawScope);
        canvas.OooOOo0();
        o00o0O.o00Oo0.OooO00o oooO00o2 = o00oo1.f33067Oooo0o;
        oooO00o2.OooO0O0(oooO);
        oooO00o2.OooO0OO(layoutDirection2);
        oooO00o2.OooO00o(o0o0o00);
        oooO00o2.f33073OooO0Oo = j;
        sharedDrawScope.f26650Oooo0oO = oooOO1;
    }

    @Override // o000000.o00000O0
    public final boolean isValid() {
        return this.f26652Oooo0o.OooOoO();
    }
}
