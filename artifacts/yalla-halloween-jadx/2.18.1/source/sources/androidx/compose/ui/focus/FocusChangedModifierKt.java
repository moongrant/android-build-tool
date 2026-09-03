package androidx.compose.ui.focus;

import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00oOoo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p048OoooooO.o00OOO0O;
import p048OoooooO.o00OOOO0;
import p076o000OOo.OooOo00;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oOO00O;
import p710ooOO.o0000oo;
import p710ooOO.o00Oo0;
import p710ooOO.o00oO0o;
import p710ooOO.oo000o;

/* JADX INFO: loaded from: classes.dex */
public final class FocusChangedModifierKt {

    public static final class OooO00o extends Lambda implements Function3<o00OOOO0, oOO00O, Integer, o00OOOO0> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function1<o0000oo, Unit> f5996Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Function1<? super o0000oo, Unit> function1) {
            super(3);
            this.f5996Oooo0o = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public final o00OOOO0 invoke(o00OOOO0 o00oooo1, oOO00O ooo00o, Integer num) {
            o00OOOO0 composed = o00oooo1;
            oOO00O ooo00o2 = ooo00o;
            num.intValue();
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            ooo00o2.OooO0o0(-1741761824);
            ooo00o2.OooO0o0(-492369756);
            Object objOooO0o = ooo00o2.OooO0o();
            if (objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0o = o0OOO00.OooO0Oo(null);
                ooo00o2.Oooo00o(objOooO0o);
            }
            ooo00o2.Oooo0o0();
            o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
            androidx.compose.ui.focus.OooO00o onFocusEvent = new androidx.compose.ui.focus.OooO00o((o0O00OO) objOooO0o, this.f5996Oooo0o);
            OooOo00<o00oO0o> oooOo00 = o00Oo0.f53465OooO00o;
            Intrinsics.checkNotNullParameter(oooO00o, "<this>");
            Intrinsics.checkNotNullParameter(onFocusEvent, "onFocusEvent");
            Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
            o00OOOO0 o00oooo0OooO00o = o00OOO0O.OooO00o(oooO00o, o00oOoo.f6560OooO00o, new oo000o(onFocusEvent));
            ooo00o2.Oooo0o0();
            return o00oooo0OooO00o;
        }
    }

    @NotNull
    public static final o00OOOO0 OooO00o(@NotNull o00OOOO0 o00oooo1, @NotNull Function1<? super o0000oo, Unit> onFocusChanged) {
        Intrinsics.checkNotNullParameter(o00oooo1, "<this>");
        Intrinsics.checkNotNullParameter(onFocusChanged, "onFocusChanged");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        return o00OOO0O.OooO00o(o00oooo1, o00oOoo.f6560OooO00o, new OooO00o(onFocusChanged));
    }
}
