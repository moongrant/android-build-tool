package p519o0o0O0oO;

import android.content.Context;
import android.view.View;
import com.yalla.yalla.ui.activity.store.WalletActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ooo0o extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO0o0000 f53038OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooo0o(oO0o0000 oo0o0000) {
        super(1);
        this.f53038OooO0Oo = oo0o0000;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View setNoDoubleClickListener = view;
        Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
        this.f53038OooO0Oo.OooOO0O(false);
        int i = WalletActivity.f27054OooOoOO;
        Context context = setNoDoubleClickListener.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        WalletActivity.OooO00o.OooO00o(context, false);
        return Unit.INSTANCE;
    }
}
