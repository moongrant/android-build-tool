package p710ooOO;

import androidx.compose.ui.focus.FocusStateImpl;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class o000OOo extends Lambda implements Function3<o00OOOO0, oOO00O, Integer, o00OOOO0> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final o000OOo f53464Oooo0o = new o000OOo();

    public o000OOo() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public final o00OOOO0 invoke(o00OOOO0 o00oooo1, oOO00O ooo00o, Integer num) {
        o00OOOO0 composed = o00oooo1;
        oOO00O ooo00o2 = ooo00o;
        num.intValue();
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        ooo00o2.OooO0o0(-326009031);
        ooo00o2.OooO0o0(-492369756);
        Object objOooO0o = ooo00o2.OooO0o();
        if (objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
            objOooO0o = new o0OO00O(FocusStateImpl.Inactive);
            ooo00o2.Oooo00o(objOooO0o);
        }
        ooo00o2.Oooo0o0();
        o0OO00O o0oo00o2 = (o0OO00O) objOooO0o;
        o00Oo00.OooO0oO(new o0O0O00(o0oo00o2), ooo00o2);
        o00OOOO0 o00oooo0OooO00o = oo0o0Oo.OooO00o(composed, o0oo00o2);
        ooo00o2.Oooo0o0();
        return o00oooo0OooO00o;
    }
}
