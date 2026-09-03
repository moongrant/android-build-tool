package androidx.compose.ui.semantics;

import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00oOoo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00000O0.Oooo0;
import o00000O0.o0OO00O;
import org.jetbrains.annotations.NotNull;
import p048OoooooO.o00OOO0O;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class SemanticsModifierKt {

    public static final class OooO00o extends Lambda implements Function3<o00OOOO0, oOO00O, Integer, o00OOOO0> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ boolean f6655Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<o0OO00O, Unit> f6656Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(boolean z, Function1<? super o0OO00O, Unit> function1) {
            super(3);
            this.f6655Oooo0o = z;
            this.f6656Oooo0oO = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public final o00OOOO0 invoke(o00OOOO0 o00oooo1, oOO00O ooo00o, Integer num) {
            o00OOOO0 composed = o00oooo1;
            oOO00O ooo00o2 = ooo00o;
            num.intValue();
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            ooo00o2.OooO0o0(-140499264);
            ooo00o2.OooO0o0(-492369756);
            Object objOooO0o = ooo00o2.OooO0o();
            if (objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                Oooo0.OooO00o oooO00o = Oooo0.f26939Oooo0oo;
                objOooO0o = Integer.valueOf(Oooo0.f26938Oooo.addAndGet(1));
                ooo00o2.Oooo00o(objOooO0o);
            }
            ooo00o2.Oooo0o0();
            Oooo0 oooo0 = new Oooo0(((Number) objOooO0o).intValue(), this.f6655Oooo0o, this.f6656Oooo0oO);
            ooo00o2.Oooo0o0();
            return oooo0;
        }
    }

    @NotNull
    public static final o00OOOO0 OooO00o(@NotNull o00OOOO0 o00oooo1, boolean z, @NotNull Function1<? super o0OO00O, Unit> properties) {
        Intrinsics.checkNotNullParameter(o00oooo1, "<this>");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        return o00OOO0O.OooO00o(o00oooo1, o00oOoo.f6560OooO00o, new OooO00o(z, properties));
    }
}
