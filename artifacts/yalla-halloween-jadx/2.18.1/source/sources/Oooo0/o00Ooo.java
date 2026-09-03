package Oooo0;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.IndicationKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o00Ooo extends Lambda implements Function3<p048OoooooO.o00OOOO0, p100o000oOoO.oOO00O, Integer, p048OoooooO.o00OOOO0> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f695Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f696Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f697Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o00000O0.OooOO0O f698Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Ooo(boolean z, String str, o00000O0.OooOO0O oooOO0O, Function0<Unit> function0) {
        super(3);
        this.f696Oooo0o = z;
        this.f697Oooo0oO = str;
        this.f698Oooo0oo = oooOO0O;
        this.f695Oooo = function0;
    }

    @Override // kotlin.jvm.functions.Function3
    public final p048OoooooO.o00OOOO0 invoke(p048OoooooO.o00OOOO0 o00oooo1, p100o000oOoO.oOO00O ooo00o, Integer num) {
        p100o000oOoO.oOO00O ooo00o2 = ooo00o;
        Oooo000.o0000O00.OooO00o(num, o00oooo1, "$this$composed", ooo00o2, -756081143);
        OoooooO.o00OOOO0.OooO00o oooO00o = OoooooO.o00OOOO0.OooO00o.f4198Oooo0o;
        o00O0000 o00o0001 = (o00O0000) ooo00o2.OooOO0o(IndicationKt.f5595OooO00o);
        ooo00o2.OooO0o0(-492369756);
        Object objOooO0o = ooo00o2.OooO0o();
        if (objOooO0o == o000oOoO.oOO00O.OooO00o.f29689OooO0O0) {
            objOooO0o = o00Oo0.OooO00o(ooo00o2);
        }
        ooo00o2.Oooo0o0();
        p048OoooooO.o00OOOO0 o00oooo0OooO0O0 = ClickableKt.OooO0O0(oooO00o, (p026Oooo0OO.o000) objOooO0o, o00o0001, this.f696Oooo0o, this.f697Oooo0oO, this.f698Oooo0oo, this.f695Oooo);
        ooo00o2.Oooo0o0();
        return o00oooo0OooO0O0;
    }
}
