package o000000;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0Oo0oo implements Function0<Unit>, o00000O0, p076o000OOo.OooOOOO {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f26671Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public o0OO00O f26672Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final p076o000OOo.OooOO0O f26673Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final p036OoooOOO.o000OOo<p076o000OOo.OooOO0<?>> f26674Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public static final Function1<o0Oo0oo, Unit> f26670OoooO00 = OooO0O0.f26675Oooo0o;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f26669OoooO0 = new OooO00o();

    public static final class OooO00o implements p076o000OOo.OooOOOO {
        @Override // p076o000OOo.OooOOOO
        public final <T> T OooO00o(@NotNull p076o000OOo.OooOO0<T> oooOO1) {
            Intrinsics.checkNotNullParameter(oooOO1, "<this>");
            return oooOO1.f28283OooO00o.invoke();
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<o0Oo0oo, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f26675Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0Oo0oo o0oo0oo2) {
            o0Oo0oo node = o0oo0oo2;
            Intrinsics.checkNotNullParameter(node, "node");
            node.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0Oo0oo o0oo0oo2 = o0Oo0oo.this;
            o0oo0oo2.f26673Oooo0oO.OooOooO(o0oo0oo2);
            return Unit.INSTANCE;
        }
    }

    public o0Oo0oo(@NotNull o0OO00O provider, @NotNull p076o000OOo.OooOO0O modifier) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        this.f26672Oooo0o = provider;
        this.f26673Oooo0oO = modifier;
        this.f26674Oooo0oo = new p036OoooOOO.o000OOo<>(new p076o000OOo.OooOO0[16]);
    }

    @Override // p076o000OOo.OooOOOO
    public final <T> T OooO00o(@NotNull p076o000OOo.OooOO0<T> oooOO1) {
        Intrinsics.checkNotNullParameter(oooOO1, "<this>");
        this.f26674Oooo0oo.OooO0O0(oooOO1);
        p076o000OOo.OooOOO<?> oooOOOOooO0O0 = this.f26672Oooo0o.OooO0O0(oooOO1);
        return oooOOOOooO0O0 == null ? oooOO1.f28283OooO00o.invoke() : (T) oooOOOOooO0O0.getValue();
    }

    public final void OooO0O0() {
        if (this.f26671Oooo) {
            this.f26674Oooo0oo.OooO0o0();
            o00Ooo.OooO00o(this.f26672Oooo0o.f26659Oooo0o).getF6257o0OoOo0().OooO00o(this, f26670OoooO00, new OooO0OO());
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooO0O0();
        return Unit.INSTANCE;
    }

    @Override // o000000.o00000O0
    public final boolean isValid() {
        return this.f26671Oooo;
    }
}
