package androidx.compose.foundation;

import Oooo0.o00000O;
import Oooo0.o00O0000;
import Oooo0.o00oOoo;
import Oooo0.o0O0ooO;
import Oooo0.oo0o0O0;
import Oooo000.o0000O00;
import androidx.compose.ui.platform.o00O000o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p026Oooo0OO.o0000OO0;
import p048OoooooO.o00OOO0O;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00OO0O0;
import p100o000oOoO.o0O0O0o0;
import p100o000oOoO.o0oo0000;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class IndicationKt {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0O0O0o0<o00O0000> f5595OooO00o = (o0oo0000) o00OO0O0.OooO0Oo(OooO00o.f5596Oooo0o);

    public static final class OooO00o extends Lambda implements Function0<o00O0000> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f5596Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ o00O0000 invoke() {
            return o00000O.f543OooO00o;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function3<o00OOOO0, oOO00O, Integer, o00OOOO0> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00O0000 f5597Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0000OO0 f5598Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o00O0000 o00o0001, o0000OO0 o0000oo1) {
            super(3);
            this.f5597Oooo0o = o00o0001;
            this.f5598Oooo0oO = o0000oo1;
        }

        @Override // kotlin.jvm.functions.Function3
        public final o00OOOO0 invoke(o00OOOO0 o00oooo1, oOO00O ooo00o, Integer num) {
            oOO00O ooo00o2 = ooo00o;
            o0000O00.OooO00o(num, o00oooo1, "$this$composed", ooo00o2, -353972293);
            o00O0000 o00o0001 = this.f5597Oooo0o;
            if (o00o0001 == null) {
                o00o0001 = oo0o0O0.f776OooO00o;
            }
            o0O0ooO o0o0oooOooO00o = o00o0001.OooO00o(this.f5598Oooo0oO, ooo00o2);
            ooo00o2.OooO0o0(1157296644);
            boolean zOooo0oo = ooo00o2.Oooo0oo(o0o0oooOooO00o);
            Object objOooO0o = ooo00o2.OooO0o();
            if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0o = new o00oOoo(o0o0oooOooO00o);
                ooo00o2.Oooo00o(objOooO0o);
            }
            ooo00o2.Oooo0o0();
            o00oOoo o00oooo2 = (o00oOoo) objOooO0o;
            ooo00o2.Oooo0o0();
            return o00oooo2;
        }
    }

    @NotNull
    public static final o00OOOO0 OooO00o(@NotNull o00OOOO0 o00oooo1, @NotNull o0000OO0 interactionSource, @Nullable o00O0000 o00o0001) {
        Intrinsics.checkNotNullParameter(o00oooo1, "<this>");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Function1<o00O000o, Unit> function1 = androidx.compose.ui.platform.o00oOoo.f6560OooO00o;
        return o00OOO0O.OooO00o(o00oooo1, androidx.compose.ui.platform.o00oOoo.f6560OooO00o, new OooO0O0(o00o0001, interactionSource));
    }
}
