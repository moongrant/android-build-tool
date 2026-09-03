package p519o0o0O0oO;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0OO00o extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO0o0000 f52874OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OO00o(oO0o0000 oo0o0000) {
        super(1);
        this.f52874OooO0Oo = oo0o0000;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View setNoDoubleClickListener = view;
        Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
        oO0o0000 oo0o0000 = this.f52874OooO0Oo;
        oo0o0000.OooOO0O(false);
        if (oo0o0000.OooOO0().f59306OooOOo.isShown()) {
            oo0o0000.OooOO0().f59306OooOOo.setVisibility(8);
        } else {
            oo0o0000.OooOO0().f59306OooOOo.setVisibility(0);
        }
        return Unit.INSTANCE;
    }
}
