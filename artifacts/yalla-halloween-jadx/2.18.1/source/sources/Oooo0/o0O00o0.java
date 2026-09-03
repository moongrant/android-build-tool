package Oooo0;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final class o0O00o0 extends Lambda implements Function3<p048OoooooO.o00OOOO0, p100o000oOoO.oOO00O, Integer, p048OoooooO.o00OOOO0> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ p025Oooo0O0.o000000O f702Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f703Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0oOOo f704Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ boolean f705Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ boolean f706OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00o0(boolean z, o0oOOo o0oooo2, boolean z2, p025Oooo0O0.o000000O o000000o2, boolean z3) {
        super(3);
        this.f703Oooo0o = z;
        this.f704Oooo0oO = o0oooo2;
        this.f705Oooo0oo = z2;
        this.f702Oooo = o000000o2;
        this.f706OoooO00 = z3;
    }

    @Override // kotlin.jvm.functions.Function3
    public final p048OoooooO.o00OOOO0 invoke(p048OoooooO.o00OOOO0 o00oooo1, p100o000oOoO.oOO00O ooo00o, Integer num) {
        p048OoooooO.o00OOOO0 composed = o00oooo1;
        p100o000oOoO.oOO00O ooo00o2 = ooo00o;
        num.intValue();
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        ooo00o2.OooO0o0(1478351300);
        oo0oOO0 oo0ooo0OooO00o = p025Oooo0O0.o0000OO0.OooO00o(ooo00o2);
        ooo00o2.OooO0o0(773894976);
        ooo00o2.OooO0o0(-492369756);
        Object objOooO0o = ooo00o2.OooO0o();
        if (objOooO0o == o000oOoO.oOO00O.OooO00o.f29689OooO0O0) {
            objOooO0o = Oooo000.o00oO0o.OooO0OO(p100o000oOoO.o00Oo00.OooO0oo(EmptyCoroutineContext.INSTANCE, ooo00o2), ooo00o2);
        }
        ooo00o2.Oooo0o0();
        CoroutineScope coroutineScope = ((p100o000oOoO.o00OO0OO) objOooO0o).f29498Oooo0o;
        ooo00o2.Oooo0o0();
        OoooooO.o00OOOO0.OooO00o oooO00o = OoooooO.o00OOOO0.OooO00o.f4198Oooo0o;
        p048OoooooO.o00OOOO0 o00oooo0OooO00o = SemanticsModifierKt.OooO00o(oooO00o, false, new o0oOO(this.f706OoooO00, this.f703Oooo0o, this.f705Oooo0oo, this.f704Oooo0oO, coroutineScope));
        boolean z = this.f703Oooo0o;
        Orientation orientation = z ? Orientation.Vertical : Orientation.Horizontal;
        boolean z2 = !this.f706OoooO00;
        boolean z3 = (!(ooo00o2.OooOO0o(androidx.compose.ui.platform.o000.f6360OooOO0O) == LayoutDirection.Rtl) || z) ? z2 : !z2;
        o0oOOo o0oooo2 = this.f704Oooo0oO;
        p048OoooooO.o00OOOO0 o00oooo0OooOOoo = o00O.OooO00o(o00000O0.OooO00o(o00oooo0OooO00o, orientation), oo0ooo0OooO00o).OooOOoo(ScrollableKt.OooO0O0(oooO00o, o0oooo2, orientation, oo0ooo0OooO00o, this.f705Oooo0oo, z3, this.f702Oooo, o0oooo2.f761OooO0O0)).OooOOoo(new o0O0o(this.f704Oooo0oO, this.f706OoooO00, this.f703Oooo0o, oo0ooo0OooO00o));
        ooo00o2.Oooo0o0();
        return o00oooo0OooOOoo;
    }
}
