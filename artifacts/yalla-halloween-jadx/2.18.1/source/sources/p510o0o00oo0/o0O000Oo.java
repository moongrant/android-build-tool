package p510o0o00oo0;

import code.easy.refresh.RefreshState;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0000O0O.OooOOO0;
import org.jetbrains.annotations.NotNull;
import p028Oooo0o0.o00O00o0;
import p043OooooO0.o00;
import p043OooooO0.o00O0000;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O000Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0O000Oo f41898OooO00o = new o0O000Oo();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static Function5<o00O00o0, RefreshState.State, OooOOO0, oOO00O, Integer, Unit> f41899OooO0O0 = (o00) o00O0000.OooO0O0(780011195, false, OooO00o.f41900Oooo0o);

    public static final class OooO00o extends Lambda implements Function5<o00O00o0, RefreshState.State, OooOOO0, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f41900Oooo0o = new OooO00o();

        public OooO00o() {
            super(5);
        }

        @Override // kotlin.jvm.functions.Function5
        public final Unit invoke(o00O00o0 o00o00o1, RefreshState.State state, OooOOO0 oooOOO0, oOO00O ooo00o, Integer num) {
            int i;
            o00O00o0 EasyRefresh = o00o00o1;
            RefreshState.State _state = state;
            float f = oooOOO0.f27306Oooo0o;
            oOO00O ooo00o2 = ooo00o;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(EasyRefresh, "$this$EasyRefresh");
            Intrinsics.checkNotNullParameter(_state, "_state");
            if ((iIntValue & 14) == 0) {
                i = (ooo00o2.Oooo0oo(EasyRefresh) ? 4 : 2) | iIntValue;
            } else {
                i = iIntValue;
            }
            if ((iIntValue & 112) == 0) {
                i |= ooo00o2.Oooo0oo(_state) ? 32 : 16;
            }
            if ((iIntValue & 896) == 0) {
                i |= ooo00o2.OooO0oO(f) ? 256 : 128;
            }
            if ((i & 5851) == 1170 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                o0OoO00O.OooO0O0(EasyRefresh, _state, f, ooo00o2, (i & 14) | (i & 112) | (i & 896));
            }
            return Unit.INSTANCE;
        }
    }
}
