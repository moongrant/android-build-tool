package p511o0o0O;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import p583o0oOoo00.o00000OO;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O0O extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00000OO f51035OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O0O(o00000OO o00000oo2) {
        super(1);
        this.f51035OooO0Oo = o00000oo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        OooO00o.OooO0O0("102067");
        o00000OO.OooOO0O oooOO0O = o00000OO.f56673OooOOOo;
        o00000OO o00000oo2 = this.f51035OooO0Oo;
        oooOO0O.observe(o00000oo2.f50959OooO0oO, new o00000OO.OooOO0O(new o00O0O0(o00000oo2)));
        return Unit.INSTANCE;
    }
}
