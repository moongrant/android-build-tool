package androidx.compose.foundation.relocation;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00oOoo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p030Oooo0oo.o0O00oO0;
import p030Oooo0oo.o0O0O0O;
import p030Oooo0oo.o0O0O0Oo;
import p030Oooo0oo.o0oO0O0o;
import p030Oooo0oo.oo0OOoo;
import p048OoooooO.o00OOO0O;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class BringIntoViewRequesterKt {

    public static final class OooO00o extends Lambda implements Function3<o00OOOO0, oOO00O, Integer, o00OOOO0> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O0O0O f5850Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0O0O0O o0o0o0o) {
            super(3);
            this.f5850Oooo0o = o0o0o0o;
        }

        @Override // kotlin.jvm.functions.Function3
        public final o00OOOO0 invoke(o00OOOO0 o00oooo1, oOO00O ooo00o, Integer num) {
            o00OOOO0 composed = o00oooo1;
            oOO00O ooo00o2 = ooo00o;
            num.intValue();
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            ooo00o2.OooO0o0(-992853993);
            o0O00oO0 o0o00oo0OooO00o = oo0OOoo.OooO00o(ooo00o2);
            ooo00o2.OooO0o0(1157296644);
            boolean zOooo0oo = ooo00o2.Oooo0oo(o0o00oo0OooO00o);
            Object objOooO0o = ooo00o2.OooO0o();
            if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0o = new o0O0O0Oo(o0o00oo0OooO00o);
                ooo00o2.Oooo00o(objOooO0o);
            }
            ooo00o2.Oooo0o0();
            o0O0O0Oo o0o0o0oo = (o0O0O0Oo) objOooO0o;
            o0O0O0O o0o0o0o = this.f5850Oooo0o;
            if (o0o0o0o instanceof o0oO0O0o) {
                o00Oo00.OooO0O0(o0o0o0o, new androidx.compose.foundation.relocation.OooO00o(o0o0o0o, o0o0o0oo), ooo00o2);
            }
            ooo00o2.Oooo0o0();
            return o0o0o0oo;
        }
    }

    @ExperimentalFoundationApi
    @NotNull
    public static final o00OOOO0 OooO00o(@NotNull o00OOOO0 o00oooo1, @NotNull o0O0O0O bringIntoViewRequester) {
        Intrinsics.checkNotNullParameter(o00oooo1, "<this>");
        Intrinsics.checkNotNullParameter(bringIntoViewRequester, "bringIntoViewRequester");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        return o00OOO0O.OooO00o(o00oooo1, o00oOoo.f6560OooO00o, new OooO00o(bringIntoViewRequester));
    }
}
