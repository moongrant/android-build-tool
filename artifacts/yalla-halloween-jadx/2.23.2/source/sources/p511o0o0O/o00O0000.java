package p511o0o0O;

import android.view.View;
import android.widget.LinearLayout;
import com.code.android.util.o000O;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0000 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00000OO f51027OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0000(o00000OO o00000oo2) {
        super(1);
        this.f51027OooO0Oo = o00000oo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        LinearLayout hintFirstSelectTotalGift = this.f51027OooO0Oo.OooOOo0().f44510OooOO0O;
        Intrinsics.checkNotNullExpressionValue(hintFirstSelectTotalGift, "hintFirstSelectTotalGift");
        o000O.OooO0O0(hintFirstSelectTotalGift);
        return Unit.INSTANCE;
    }
}
