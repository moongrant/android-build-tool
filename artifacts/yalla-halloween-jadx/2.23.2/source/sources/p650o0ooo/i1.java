package p650o0ooo;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class i1 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ k1 f58270OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(k1 k1Var) {
        super(1);
        this.f58270OooO0Oo = k1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View setNoDoubleClickListener = view;
        Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
        k1 k1Var = this.f58270OooO0Oo;
        k1Var.getClass();
        k1Var.OooO0O0();
        return Unit.INSTANCE;
    }
}
