package p520o0o0O0oo;

import android.view.View;
import android.widget.LinearLayout;
import com.code.android.util.o000OO00;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class g8 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ x6 f53284OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8(x6 x6Var) {
        super(1);
        this.f53284OooO0Oo = x6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        LinearLayout linearLayout = this.f53284OooO0Oo.OooOOo().f58225OooOO0;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "mBinding.hintFirstSelectAllUser");
        o000OO00.OooO0O0(linearLayout);
        return Unit.INSTANCE;
    }
}
