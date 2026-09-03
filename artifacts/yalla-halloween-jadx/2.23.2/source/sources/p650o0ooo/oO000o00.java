package p650o0ooo;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p415o0Oo0oO0.o00Ooo;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO000o00 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO00OOOo f58778OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000o00(oO00OOOo oo00oooo) {
        super(1);
        this.f58778OooO0Oo = oo00oooo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View setNoDoubleClickListener = view;
        Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
        oO00OOOo oo00oooo = this.f58778OooO0Oo;
        oo00oooo.OooOO0O(false);
        p414o0Oo0oO.oO000o00 oo000o00OooO0oo = o00Ooo.OooO0oo();
        oo000o00OooO0oo.getClass();
        oo000o00OooO0oo.OooO0o("isGift" + o0O00oO0.OooOOo0().getValue(), true);
        oo00oooo.OooOOOo();
        return Unit.INSTANCE;
    }
}
