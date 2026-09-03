package androidx.compose.ui.focus;

import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00oOoo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p048OoooooO.o00OOO0O;
import p048OoooooO.o00OOOO0;
import p076o000OOo.OooOOO0;
import p076o000OOo.OooOo00;
import p100o000oOoO.oOO00O;
import p710ooOO.o0000O00;
import p710ooOO.o0000Ooo;

/* JADX INFO: loaded from: classes.dex */
public final class FocusRequesterModifierKt {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooOo00<o0000O00> f6003OooO00o = OooOOO0.OooO00o(OooO00o.f6004Oooo0o);

    public static final class OooO00o extends Lambda implements Function0<o0000O00> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f6004Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ o0000O00 invoke() {
            return null;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function3<o00OOOO0, oOO00O, Integer, o00OOOO0> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0000Ooo f6005Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o0000Ooo o0000ooo) {
            super(3);
            this.f6005Oooo0o = o0000ooo;
        }

        @Override // kotlin.jvm.functions.Function3
        public final o00OOOO0 invoke(o00OOOO0 o00oooo1, oOO00O ooo00o, Integer num) {
            oOO00O ooo00o2 = ooo00o;
            Oooo000.o0000O00.OooO00o(num, o00oooo1, "$this$composed", ooo00o2, -307396750);
            o0000Ooo o0000ooo = this.f6005Oooo0o;
            ooo00o2.OooO0o0(1157296644);
            boolean zOooo0oo = ooo00o2.Oooo0oo(o0000ooo);
            Object objOooO0o = ooo00o2.OooO0o();
            if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0o = new o0000O00(o0000ooo);
                ooo00o2.Oooo00o(objOooO0o);
            }
            ooo00o2.Oooo0o0();
            o0000O00 o0000o00 = (o0000O00) objOooO0o;
            ooo00o2.Oooo0o0();
            return o0000o00;
        }
    }

    @NotNull
    public static final o00OOOO0 OooO00o(@NotNull o00OOOO0 o00oooo1, @NotNull o0000Ooo focusRequester) {
        Intrinsics.checkNotNullParameter(o00oooo1, "<this>");
        Intrinsics.checkNotNullParameter(focusRequester, "focusRequester");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        return o00OOO0O.OooO00o(o00oooo1, o00oOoo.f6560OooO00o, new OooO0O0(focusRequester));
    }
}
