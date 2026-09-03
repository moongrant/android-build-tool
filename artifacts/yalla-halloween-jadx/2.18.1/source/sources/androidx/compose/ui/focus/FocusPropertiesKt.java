package androidx.compose.ui.focus;

import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00oOoo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o000000.o00000;
import o000000.oo000o;
import org.jetbrains.annotations.NotNull;
import p048OoooooO.o00OOOO0;
import p076o000OOo.OooOOO0;
import p076o000OOo.OooOo00;
import p710ooOO.o00000O;
import p710ooOO.o00000O0;
import p710ooOO.o00000OO;
import p710ooOO.o0000O0;
import p710ooOO.o0000Ooo;
import p710ooOO.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
public final class FocusPropertiesKt {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooOo00<o00000OO> f5999OooO00o = OooOOO0.OooO00o(OooO00o.f6000Oooo0o);

    public static final class OooO00o extends Lambda implements Function0<o00000OO> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f6000Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ o00000OO invoke() {
            return null;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0OO00O f6001Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o0OO00O o0oo00o2) {
            super(0);
            this.f6001Oooo0o = o0oo00o2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0OO00O o0oo00o2 = this.f6001Oooo0o;
            o00000OO o00000oo2 = o0oo00o2.f53489o000oOoO;
            if (o00000oo2 != null) {
                o00000oo2.OooO0O0(o0oo00o2.f53483OoooOOO);
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final o00OOOO0 OooO00o(@NotNull o00OOOO0 o00oooo1, @NotNull Function1<? super o00000O0, Unit> scope) {
        Intrinsics.checkNotNullParameter(o00oooo1, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        return o00oooo1.OooOOoo(new o00000OO(scope));
    }

    public static final void OooO0O0(@NotNull o0OO00O o0oo00o2) {
        o000000.o00000OO snapshotObserver;
        Intrinsics.checkNotNullParameter(o0oo00o2, "<this>");
        oo000o oo000oVar = o0oo00o2.f53485OoooOo0;
        if (oo000oVar == null) {
            return;
        }
        o00000O o00000o = o0oo00o2.f53483OoooOOO;
        Intrinsics.checkNotNullParameter(o00000o, "<this>");
        o00000o.f53440OooO00o = true;
        o0000Ooo.OooO00o oooO00o = o0000Ooo.f53457OooO0O0;
        o0000Ooo o0000ooo = o0000Ooo.f53458OooO0OO;
        o00000o.OooO0o0(o0000ooo);
        o00000o.OooO0o(o0000ooo);
        o00000o.OooO(o0000ooo);
        o00000o.OooO0O0(o0000ooo);
        o00000o.OooO0Oo(o0000ooo);
        o00000o.OooO0oO(o0000ooo);
        o00000o.OooO0oo(o0000ooo);
        o00000o.OooO0OO(o0000ooo);
        o00000 o00000Var = oo000oVar.f26702OoooO00.f6143OoooO0O;
        if (o00000Var != null && (snapshotObserver = o00000Var.getSnapshotObserver()) != null) {
            o0OO00O.OooO0O0 oooO0O0 = o0OO00O.f53473Ooooo0o;
            o0OO00O.OooO0O0 oooO0O1 = o0OO00O.f53473Ooooo0o;
            snapshotObserver.OooO00o(o0oo00o2, o0OO00O.f53474OooooO0, new OooO0O0(o0oo00o2));
        }
        o00000O properties = o0oo00o2.f53483OoooOOO;
        Intrinsics.checkNotNullParameter(o0oo00o2, "<this>");
        Intrinsics.checkNotNullParameter(properties, "properties");
        if (properties.f53440OooO00o) {
            o0000O0.OooO00o(o0oo00o2);
        } else {
            o0000O0.OooO0Oo(o0oo00o2);
        }
    }
}
