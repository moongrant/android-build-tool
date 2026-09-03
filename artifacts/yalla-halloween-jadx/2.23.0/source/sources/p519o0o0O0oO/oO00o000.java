package p519o0o0O0oO;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o000000O;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00o000 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO0o0000 f52857OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00o000(oO0o0000 oo0o0000) {
        super(1);
        this.f52857OooO0Oo = oo0o0000;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View setNoDoubleClickListener = view;
        Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
        oO0o0000 oo0o0000 = this.f52857OooO0Oo;
        oo0o0000.OooOO0O(false);
        o000000O o000000oOooO0oo = o00Oo0.OooO0oo();
        o0O000O o0o000o = oo0o0000.f52889OooOOOo;
        o000000oOooO0oo.OooOo0O(o0o000o.f52626OooO00o);
        o000000O o000000oOooO0oo2 = o00Oo0.OooO0oo();
        int i = o0o000o.f52627OooO0O0;
        o000000oOooO0oo2.OooOo0o(i);
        o00Oo0.OooO0oo().OooOo(o0o000o.f52628OooO0OO.indexOf(Integer.valueOf(i)));
        oo0o0000.OooOOO(o0o000o);
        return Unit.INSTANCE;
    }
}
