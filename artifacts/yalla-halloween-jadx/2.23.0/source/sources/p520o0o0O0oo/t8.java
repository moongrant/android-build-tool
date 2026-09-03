package p520o0o0O0oo;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p402o0Oo0OOO.o00O000o;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class t8 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ x6 f53342OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8(x6 x6Var) {
        super(1);
        this.f53342OooO0Oo = x6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        o0OO000.OooO00o("102067");
        o00O000o.OooOO0O oooOO0O = o00O000o.f44504OooOOOo;
        x6 x6Var = this.f53342OooO0Oo;
        oooOO0O.observe(x6Var.f53375OooO0oO, new x6.OooOO0O(new s8(x6Var)));
        return Unit.INSTANCE;
    }
}
