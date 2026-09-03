package p501o0o00o;

import android.view.View;
import android.widget.LinearLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class oOO00O extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000 f41530Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO00O(o000 o000Var) {
        super(1);
        this.f41530Oooo0o = o000Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        LinearLayout linearLayout = this.f41530Oooo0o.OooOo00().f50844OooOOO;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "mBinding.hintFirstSelectTotalGift");
        p254o00ooO0O.oOO00O.OooO00o(linearLayout);
        return Unit.INSTANCE;
    }
}
