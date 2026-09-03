package p034OoooO0O;

import Oooo000.o0000O00;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0000O0O.OooO;
import o0000O0O.o000oOoO;
import p023Oooo00O.o0OO00O;
import p048OoooooO.o00OOO0O;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class o000 extends Lambda implements Function3<o00OOOO0, oOO00O, Integer, o00OOOO0> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0000oo f3466Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000(o0000oo o0000ooVar) {
        super(3);
        this.f3466Oooo0o = o0000ooVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final o00OOOO0 invoke(o00OOOO0 o00oooo1, oOO00O ooo00o, Integer num) {
        o00OOOO0 o00oooo2 = o00oooo1;
        oOO00O ooo00o2 = ooo00o;
        o0000O00.OooO00o(num, o00oooo2, "$this$composed", ooo00o2, 1980580247);
        OooO oooO = (OooO) ooo00o2.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0);
        ooo00o2.OooO0o0(-492369756);
        Object objOooO0o = ooo00o2.OooO0o();
        if (objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
            objOooO0o = o0OOO00.OooO0Oo(new o000oOoO(0L));
            ooo00o2.Oooo00o(objOooO0o);
        }
        ooo00o2.Oooo0o0();
        o0O00OO o0o00oo2 = (o0O00OO) objOooO0o;
        o0000O0O magnifierCenter = new o0000O0O(this.f3466Oooo0o, o0o00oo2);
        o0000OO0 platformMagnifier = new o0000OO0(oooO, o0o00oo2);
        o0OO00O o0oo00o2 = o0O0O00.f3552OooO00o;
        Intrinsics.checkNotNullParameter(o00oooo2, "<this>");
        Intrinsics.checkNotNullParameter(magnifierCenter, "magnifierCenter");
        Intrinsics.checkNotNullParameter(platformMagnifier, "platformMagnifier");
        o00OOOO0 o00oooo0OooO0O0 = o00OOO0O.OooO0O0(o00oooo2, new o000000(magnifierCenter, platformMagnifier));
        ooo00o2.Oooo0o0();
        return o00oooo0OooO0O0;
    }
}
