package p032OoooO0;

import androidx.compose.ui.input.key.KeyInputModifierKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p034OoooO0O.o0000oo;
import p034OoooO0O.o000O000;
import p048OoooooO.o00OOOO0;
import p054o00000oo.o00O0O00;
import p054o00000oo.oo0oOO0;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class o00OOO0 extends Lambda implements Function3<o00OOOO0, oOO00O, Integer, o00OOOO0> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ boolean f3191Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O0000O f3192Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0000oo f3193Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ oo0oOO0 f3194Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final /* synthetic */ Function1<oo0oOO0, Unit> f3195OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ o00O0O00 f3196OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ boolean f3197OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ o0OoOoOo f3198OoooO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00OOO0(o0O0000O o0o0000o2, o0000oo o0000ooVar, oo0oOO0 oo0ooo0, boolean z, boolean z2, o00O0O00 o00o0o01, o0OoOoOo o0oooooo2, Function1<? super oo0oOO0, Unit> function1) {
        super(3);
        this.f3192Oooo0o = o0o0000o2;
        this.f3193Oooo0oO = o0000ooVar;
        this.f3194Oooo0oo = oo0ooo0;
        this.f3191Oooo = z;
        this.f3197OoooO00 = z2;
        this.f3196OoooO0 = o00o0o01;
        this.f3198OoooO0O = o0oooooo2;
        this.f3195OoooO = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final o00OOOO0 invoke(o00OOOO0 o00oooo1, oOO00O ooo00o, Integer num) {
        o00OOOO0 composed = o00oooo1;
        oOO00O ooo00o2 = ooo00o;
        num.intValue();
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        ooo00o2.OooO0o0(58482146);
        ooo00o2.OooO0o0(-492369756);
        Object objOooO0o = ooo00o2.OooO0o();
        if (objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
            objOooO0o = new o000O000();
            ooo00o2.Oooo00o(objOooO0o);
        }
        ooo00o2.Oooo0o0();
        o00OOOO0 o00oooo0OooO00o = KeyInputModifierKt.OooO00o(o00OOOO0.OooO00o.f4198Oooo0o, new o00OOO00(new o00OO(this.f3192Oooo0o, this.f3193Oooo0oO, this.f3194Oooo0oo, this.f3191Oooo, this.f3197OoooO00, (o000O000) objOooO0o, this.f3196OoooO0, this.f3198OoooO0O, this.f3195OoooO)));
        ooo00o2.Oooo0o0();
        return o00oooo0OooO00o;
    }
}
