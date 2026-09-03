package p650o0ooo;

import android.content.Context;
import android.view.View;
import com.yalla.yalla.ui.activity.store.WalletActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo00OO0 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO00OOOo f59032OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo00OO0(oO00OOOo oo00oooo) {
        super(1);
        this.f59032OooO0Oo = oo00oooo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View setNoDoubleClickListener = view;
        Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
        this.f59032OooO0Oo.OooOO0O(false);
        int i = WalletActivity.f26588OooOoOO;
        Context context = setNoDoubleClickListener.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        WalletActivity.OooO00o.OooO00o(context, false);
        return Unit.INSTANCE;
    }
}
