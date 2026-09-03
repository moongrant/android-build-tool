package p650o0ooo;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p414o0Oo0oO.oO000o00;
import p415o0Oo0oO0.o00Ooo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oo0000 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO00OOOo f58756OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oo0000(oO00OOOo oo00oooo) {
        super(1);
        this.f58756OooO0Oo = oo00oooo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View setNoDoubleClickListener = view;
        Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
        oO00OOOo oo00oooo = this.f58756OooO0Oo;
        oo00oooo.OooOO0O(false);
        oO000o00 oo000o00OooO0oo = o00Ooo.OooO0oo();
        o00O00o0 o00o00o1 = oo00oooo.f58789OooOOOo;
        oo000o00OooO0oo.OooOo0O(o00o00o1.f58535OooO00o);
        oO000o00 oo000o00OooO0oo2 = o00Ooo.OooO0oo();
        int i = o00o00o1.f58536OooO0O0;
        oo000o00OooO0oo2.OooOo0o(i);
        o00Ooo.OooO0oo().OooOo(o00o00o1.f58537OooO0OO.indexOf(Integer.valueOf(i)));
        oo00oooo.OooOOO(o00o00o1);
        return Unit.INSTANCE;
    }
}
