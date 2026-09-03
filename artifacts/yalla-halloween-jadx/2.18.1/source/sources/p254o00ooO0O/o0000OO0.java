package p254o00ooO0O;

import Oooo0.o00O0000;
import Oooo0.o00Oo0;
import Oooo0.o0OO00O;
import Oooo000.o0000O00;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00oOoo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import o00000O0.OooOO0O;
import p026Oooo0OO.o000;
import p048OoooooO.o00OOO0O;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;

/* JADX INFO: loaded from: classes.dex */
public final class o0000OO0 extends Lambda implements Function3<o00OOOO0, oOO00O, Integer, o00OOOO0> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f34272Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f34273Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f34274Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ String f34275Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final /* synthetic */ long f34276OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f34277OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f34278OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ boolean f34279OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f34280OoooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000OO0(boolean z, boolean z2, String str, OooOO0O oooOO0O, Function0<Unit> function0, Function0<Unit> function1, boolean z3, long j, Function0<Unit> function2) {
        super(3);
        this.f34273Oooo0o = z;
        this.f34274Oooo0oO = z2;
        this.f34275Oooo0oo = str;
        this.f34272Oooo = oooOO0O;
        this.f34278OoooO00 = function0;
        this.f34277OoooO0 = function1;
        this.f34279OoooO0O = z3;
        this.f34276OoooO = j;
        this.f34280OoooOO0 = function2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final o00OOOO0 invoke(o00OOOO0 o00oooo1, oOO00O ooo00o, Integer num) {
        o00OOOO0 combinedClickable = o00oooo1;
        oOO00O ooo00o2 = ooo00o;
        o0000O00.OooO00o(num, combinedClickable, "$this$composed", ooo00o2, -146647568);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        Ref.LongRef longRef = new Ref.LongRef();
        ooo00o2.OooO0o0(-492369756);
        Object objOooO0o = ooo00o2.OooO0o();
        oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
        if (objOooO0o == c0323OooO00o) {
            objOooO0o = 0L;
            ooo00o2.Oooo00o(objOooO0o);
        }
        ooo00o2.Oooo0o0();
        longRef.element = ((Number) objOooO0o).longValue();
        ooo00o2.OooO0o0(433529248);
        o00O0000 o00o0001 = this.f34273Oooo0o ? (o00O0000) ooo00o2.OooOO0o(IndicationKt.f5595OooO00o) : null;
        ooo00o2.Oooo0o0();
        ooo00o2.OooO0o0(-492369756);
        Object objOooO0o2 = ooo00o2.OooO0o();
        if (objOooO0o2 == c0323OooO00o) {
            objOooO0o2 = o00Oo0.OooO00o(ooo00o2);
        }
        ooo00o2.Oooo0o0();
        o000 interactionSource = (o000) objOooO0o2;
        boolean z = this.f34274Oooo0oO;
        String str = this.f34275Oooo0oo;
        OooOO0O oooOO0O = this.f34272Oooo;
        Function0<Unit> function0 = this.f34278OoooO00;
        Function0<Unit> function1 = this.f34277OoooO0;
        o0000O onClick = new o0000O(this.f34279OoooO0O, this.f34276OoooO, this.f34280OoooOO0, longRef);
        Intrinsics.checkNotNullParameter(combinedClickable, "$this$combinedClickable");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        o00OOOO0 o00oooo0OooO00o = o00OOO0O.OooO00o(combinedClickable, o00oOoo.f6560OooO00o, new o0OO00O(onClick, function0, function1, z, interactionSource, o00o0001, str, oooOO0O, null));
        ooo00o2.Oooo0o0();
        return o00oooo0OooO00o;
    }
}
